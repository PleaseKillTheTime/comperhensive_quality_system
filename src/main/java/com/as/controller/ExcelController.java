package com.as.controller;

import com.as.dataobject.Student;
import com.as.response.CommonReturnType;
import com.as.service.StudentService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class ExcelController {
    @Autowired
    StudentService studentService;
    @RequestMapping("/importExcel")
    @ResponseBody
    public CommonReturnType importExcel(MultipartFile file) throws IOException {
        System.out.println(file.getContentType());

                Workbook workbook = null;

                Sheet sheet = null;
        if(!file.isEmpty()){
            InputStream inputStream = file.getInputStream();
                workbook = new HSSFWorkbook(inputStream);
                sheet = workbook.getSheetAt(0);
                Row rowHeader = sheet.getRow(0);
            int firstRowIndex = sheet.getFirstRowNum()+1;
            int lastRowIndex = sheet.getLastRowNum();
            int firstCellIndex = rowHeader.getFirstCellNum();
            int lastCellIndex = rowHeader.getLastCellNum();
            System.out.println("判断前"+rowHeader.getCell(0));
            System.out.println(rowHeader.getCell(0).toString());
            if(!"学号".equals(rowHeader.getCell(0).toString())){
                System.out.println("表错误");
                return CommonReturnType.creat("error","表错误");

            }
            System.out.println("循环前"+firstRowIndex+"====="+lastRowIndex);
            for(int i=firstRowIndex;i<=lastRowIndex;i++) {
                Row row = sheet.getRow(i);
                Student student = new Student();
                System.out.println("遍历行");
                for(int j=firstCellIndex;j<lastCellIndex;j++){
                    Cell cell = row.getCell(j);
                    if(j==0){
                        cell.setCellType(CellType.STRING);
                        student.setSid(cell.getStringCellValue().toString());
                    }
                    if(j==1){
                        student.setName(cell.getStringCellValue().toString());
                    }
                    if(j==2){
                        student.setMajor(cell.getStringCellValue().toString());
                    }
                    if(j==3){
                        cell.setCellType(CellType.STRING);
                        student.setClazz(cell.getStringCellValue().toString());
                    }
                    if(j==4){
                        cell.setCellType(CellType.STRING);
                        student.setPhone(cell.getStringCellValue().toString());
                    }
                    if(j==5){
                        student.setEmail(cell.getStringCellValue().toString());
                    }
                }//cell for结束
                student.setMode("student");
                student.setIsdelete(0);
                int a = studentService.insert(student);
                System.out.println(student.toString());
                System.out.println("当前第"+i+"行"+"执行"+a+"条成功");

            }//for 下一行
            System.out.println("循环结束");

        }
    return CommonReturnType.creat(null);
    }
}
