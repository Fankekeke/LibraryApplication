package com.library.library.pojo;

import java.util.Date;

/**
 * 公告类
 */
public class messing {

    //公告id
    private Integer mesId;
    //公告时间
    private Date mesTime;
    //创作人
    private String MesBy;
    //内容
    private String mesContent;
    //标题
    private String mesTitle;

    public Integer getMesId() {
        return mesId;
    }

    public void setMesId(Integer mesId) {
        this.mesId = mesId;
    }

    public Date getMesTime() {
        return mesTime;
    }

    public void setMesTime(Date mesTime) {
        this.mesTime = mesTime;
    }

    public String getMesBy() {
        return MesBy;
    }

    public void setMesBy(String mesBy) {
        MesBy = mesBy;
    }

    public String getMesContent() {
        return mesContent;
    }

    public void setMesContent(String mesContent) {
        this.mesContent = mesContent;
    }

    public String getMesTitle() {
        return mesTitle;
    }

    public void setMesTitle(String mesTitle) {
        this.mesTitle = mesTitle;
    }

    public messing(Date mesTime, String mesBy, String mesContent, String mesTitle) {
        this.mesTime = mesTime;
        MesBy = mesBy;
        this.mesContent = mesContent;
        this.mesTitle = mesTitle;
    }

    public messing(){}

    @Override
    public String toString() {
        return "messing{" +
                "mesIdl=" + mesId +
                ", mesTime=" + mesTime +
                ", MesBy='" + MesBy + '\'' +
                ", mesContent='" + mesContent + '\'' +
                ", mesTitle='" + mesTitle + '\'' +
                '}';
    }
}
