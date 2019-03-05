package com.library.library.pojo;

/**
 * 出版社表
 */
public class publishers {
    //出版社编号
    private Integer pubId;
    //出版社名称
    private String pubName;
    //所属国家
    private String city;
    //创建时间
    private String pubTime;
    //官方网址
    private String pubHttp;
    private pubinfo pubinfo;

    public pubinfo getPubinfo() {
        return pubinfo;
    }

    public void setPubinfo(pubinfo pubinfo) {
        this.pubinfo = pubinfo;
    }

    public Integer getPubId() {
        return pubId;
    }

    public void setPubId(Integer pubId) {
        this.pubId = pubId;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPubTime() {
        return pubTime;
    }

    public void setPubTime(String pubTime) {
        this.pubTime = pubTime;
    }

    public String getPubHttp() {
        return pubHttp;
    }

    public void setPubHttp(String pubHttp) {
        this.pubHttp = pubHttp;
    }

    /**
     * 有参构造
     * @param pubName
     * @param city
     * @param pubTime
     * @param pubHttp
     */
    public publishers(String pubName, String city, String pubTime, String pubHttp) {
        this.pubName = pubName;
        this.city = city;
        this.pubTime = pubTime;
        this.pubHttp = pubHttp;
    }

    /**
     * 无参构造
     */
    public publishers(){}

    @Override
    public String toString() {
        return "publishers{" +
                "pubId=" + pubId +
                ", pubName='" + pubName + '\'' +
                ", city='" + city + '\'' +
                ", pubTime='" + pubTime + '\'' +
                ", pubHttp='" + pubHttp + '\'' +
                '}';
    }
}
