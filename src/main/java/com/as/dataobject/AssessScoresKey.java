package com.as.dataobject;

public class AssessScoresKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assessscores.date
     *
     * @mbg.generated Mon Apr 20 13:21:31 CST 2020
     */
    private String date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column assessscores.Sid
     *
     * @mbg.generated Mon Apr 20 13:21:31 CST 2020
     */
    private String sid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assessscores.date
     *
     * @return the value of assessscores.date
     *
     * @mbg.generated Mon Apr 20 13:21:31 CST 2020
     */
    public String getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assessscores.date
     *
     * @param date the value for assessscores.date
     *
     * @mbg.generated Mon Apr 20 13:21:31 CST 2020
     */
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column assessscores.Sid
     *
     * @return the value of assessscores.Sid
     *
     * @mbg.generated Mon Apr 20 13:21:31 CST 2020
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column assessscores.Sid
     *
     * @param sid the value for assessscores.Sid
     *
     * @mbg.generated Mon Apr 20 13:21:31 CST 2020
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }
}