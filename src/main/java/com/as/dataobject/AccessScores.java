package com.as.dataobject;

public class AccessScores {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessscores.id
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessscores.date
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    private String date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessscores.score
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    private Integer score;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessscores.Sid
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessscores.isdelete
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    private Integer isdelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessscores.id
     *
     * @return the value of accessscores.id
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessscores.id
     *
     * @param id the value for accessscores.id
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessscores.date
     *
     * @return the value of accessscores.date
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    public String getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessscores.date
     *
     * @param date the value for accessscores.date
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessscores.score
     *
     * @return the value of accessscores.score
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessscores.score
     *
     * @param score the value for accessscores.score
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessscores.Sid
     *
     * @return the value of accessscores.Sid
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessscores.Sid
     *
     * @param sid the value for accessscores.Sid
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessscores.isdelete
     *
     * @return the value of accessscores.isdelete
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    public Integer getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessscores.isdelete
     *
     * @param isdelete the value for accessscores.isdelete
     *
     * @mbg.generated Wed Apr 15 16:10:35 CST 2020
     */
    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }
}