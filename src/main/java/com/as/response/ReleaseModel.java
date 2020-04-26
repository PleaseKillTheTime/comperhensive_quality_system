package com.as.response;

public class ReleaseModel {
    private String major;
    private String clazz;
    private String date;
    private String qid;

    @Override
    public String toString() {
        return "ReleaseModel{" +
                "major='" + major + '\'' +
                ", clazz='" + clazz + '\'' +
                ", date='" + date + '\'' +
                ", qid='" + qid + '\'' +
                '}';
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQid() {
        return qid;
    }

    public void setQid(String qid) {
        this.qid = qid;
    }
}
