package com.library.library.pojo;

/**
 * 作者表
 */
public class authors {
    //作者编号
    private Integer auId;
    //作者笔名
    private String auIname;
    //作者原名
    private String auFname;
    //英文名
    private String auUsname;
    //所属国家
    private String address;
    //出生日期
    private String auTime;
    //作者简介
    private String auMess;
    //作者头像图片
    private String auImg;
    //性别
    private Integer auSex;

    public Integer getAuSex() {
        return auSex;
    }

    public void setAuSex(Integer auSex) {
        this.auSex = auSex;
    }

    public Integer getAuId() {
        return auId;
    }

    public void setAuId(Integer auId) {
        this.auId = auId;
    }

    public String getAuIname() {
        return auIname;
    }

    public void setAuIname(String auIname) {
        this.auIname = auIname;
    }

    public String getAuFname() {
        return auFname;
    }

    public void setAuFname(String auFname) {
        this.auFname = auFname;
    }

    public String getAuUsname() {
        return auUsname;
    }

    public void setAuUsname(String auUsname) {
        this.auUsname = auUsname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAuTime() {
        return auTime;
    }

    public void setAuTime(String auTime) {
        this.auTime = auTime;
    }

    public String getAuMess() {
        return auMess;
    }

    public void setAuMess(String auMess) {
        this.auMess = auMess;
    }

    public String getAuImg() {
        return auImg;
    }

    public void setAuImg(String auImg) {
        this.auImg = auImg;
    }

    /**
     * 有参构造函数
     * @param auIname
     * @param auFname
     * @param auUsname
     * @param address
     * @param auTime
     * @param auMess
     * @param auImg
     */
    public authors(String auIname, String auFname, String auUsname, String address, String auTime, String auMess, String auImg) {
        this.auIname = auIname;
        this.auFname = auFname;
        this.auUsname = auUsname;
        this.address = address;
        this.auTime = auTime;
        this.auMess = auMess;
        this.auImg = auImg;
    }

    /**
     * 无参构造函数
     */
    public authors(){}

    @Override
    public String toString() {
        return "authors{" +
                "auId=" + auId +
                ", auIname='" + auIname + '\'' +
                ", auFname='" + auFname + '\'' +
                ", auUsname='" + auUsname + '\'' +
                ", address='" + address + '\'' +
                ", auTime='" + auTime + '\'' +
                ", auMess='" + auMess + '\'' +
                ", auImg='" + auImg + '\'' +
                '}';
    }
}
