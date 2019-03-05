package com.library.library.pojo;

/**
 * 出版社详细表
 */
public class pubinfo {
    //出版社编号
    private Integer pubId;
    //logo
    private String logo;
    //出版社信息
    private String prInfo;

    public Integer getPubId() {
        return pubId;
    }

    public void setPubId(Integer pubId) {
        this.pubId = pubId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPrInfo() {
        return prInfo;
    }

    public void setPrInfo(String prInfo) {
        this.prInfo = prInfo;
    }

    /**
     * 有参构造
     * @param pubId
     * @param logo
     * @param prInfo
     */
    public pubinfo(Integer pubId, String logo, String prInfo) {
        this.pubId = pubId;
        this.logo = logo;
        this.prInfo = prInfo;
    }

    /**
     * 无参构造
     */
    public pubinfo(){}

    @Override
    public String toString() {
        return "pubinfo{" +
                "pubId=" + pubId +
                ", logo='" + logo + '\'' +
                ", prInfo='" + prInfo + '\'' +
                '}';
    }
}
