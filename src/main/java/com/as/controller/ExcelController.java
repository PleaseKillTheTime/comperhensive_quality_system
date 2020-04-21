package com.as.controller;

import com.as.dataobject.Student;
import com.as.dataobject.Teacher;
import com.as.response.CommonReturnType;
import com.as.service.StudentService;
import com.as.service.TeacherService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
    @Autowired
    TeacherService teacherService;

    //导入学生
    @RequestMapping("/importStudentExcel")
    @ResponseBody
    public CommonReturnType importStudentExcel(MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        String fileNameNow = fileName.substring(fileName.lastIndexOf(".")+1);
        System.out.println(fileNameNow);
        Workbook workbook = null;

                Sheet sheet = null;
        if(!file.isEmpty()){
            InputStream inputStream = file.getInputStream();
            if (fileNameNow.equals("xls")){
                workbook = new HSSFWorkbook(inputStream);
            }else if (fileNameNow.equals("xlsx")){
                workbook = new XSSFWorkbook(inputStream);}
            else {
                System.out.println("文件类型错误");
            }
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
                        cell.setCellType(CellType.STRING);
                        student.setName(cell.getStringCellValue().toString());
                    }
                    if(j==2){
                        cell.setCellType(CellType.STRING);
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
                        cell.setCellType(CellType.STRING);
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
    //导入教师
    @RequestMapping("/importTeacherExcel")
    @ResponseBody
    public CommonReturnType importTeacherExcel(MultipartFile file) throws IOException {

        String fileName = file.getOriginalFilename();
        String fileNameNow = fileName.substring(fileName.lastIndexOf(".")+1);
        Workbook workbook = null;

        Sheet sheet = null;
        if(!file.isEmpty()){
            InputStream inputStream = file.getInputStream();
            if (fileNameNow.equals("xls")){
                workbook = new HSSFWorkbook(inputStream);
            }else if (fileNameNow.equals("xlsx")){
                workbook = new XSSFWorkbook(inputStream);}
            else {
                System.out.println("文件类型错误");
            }
            sheet = workbook.getSheetAt(0);
            Row rowHeader = sheet.getRow(0);
            int firstRowIndex = sheet.getFirstRowNum()+1;
            int lastRowIndex = sheet.getLastRowNum();
            int firstCellIndex = rowHeader.getFirstCellNum();
            int lastCellIndex = rowHeader.getLastCellNum();
            System.out.println("判断前"+rowHeader.getCell(0));
            System.out.println(rowHeader.getCell(0).toString());
            if(!"工号".equals(rowHeader.getCell(0).toString())){
                System.out.println("表格式错误");
                return CommonReturnType.creat("error","表错误");
            }
            System.out.println("循环前"+firstRowIndex+"====="+lastRowIndex);
            for(int i=firstRowIndex;i<=lastRowIndex;i++) {
                Row row = sheet.getRow(i);
               Teacher teacher = new Teacher();
                System.out.println("遍历行");
                for(int j=firstCellIndex;j<lastCellIndex;j++){
                    Cell cell = row.getCell(j);
                    if(j==0){
                        cell.setCellType(CellType.STRING);
                        teacher.setTid(cell.getStringCellValue().toString());
                    }
                    if(j==1){
                        cell.setCellType(CellType.STRING);
                        teacher.setName(cell.getStringCellValue().toString());
                    }
                    if(j==2){
                        cell.setCellType(CellType.STRING);
                        teacher.setPhone(cell.getStringCellValue().toString());
                    }
                    if(j==3){
                        cell.setCellType(CellType.STRING);
                        teacher.setEmail(cell.getStringCellValue().toString());
                    }

                }//cell for结束
                teacher.setMode("teacher");
                teacher.setIsdelete("0");
                int a = teacherService.insert(teacher);
                System.out.println(teacher.toString());
                System.out.println("当前第"+i+"行"+"执行"+a+"条成功");

            }//for 下一行
            System.out.println("循环结束");

        }
        return CommonReturnType.creat(null);
    }
}
