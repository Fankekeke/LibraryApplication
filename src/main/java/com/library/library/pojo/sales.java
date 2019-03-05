package com.library.library.pojo;

import java.util.Date;

/**
 * 图书借阅表
 */
public class sales {
    //借阅id
    private Integer saleId;
    //用户id
    private Integer userId;
    //借阅时间
    private Date ordDate;
    //支付方式
    private String payyterms;
    //图书编号
    private String titleId;
    //归还时间
    private Date returnDate;

    private Integer ups;

    private usersn usersn;

    private doubanbookInfo doubanbookInfo;

    public Integer getUps() {
        return ups;
    }

    public void setUps(Integer ups) {
        this.ups = ups;
    }

    public usersn getUsersn() {
        return usersn;
    }

    public void setUsersn(usersn usersn) {
        this.usersn = usersn;
    }

    public doubanbookInfo getDoubanbookInfo() {
        return doubanbookInfo;
    }

    public void setDoubanbookInfo(doubanbookInfo doubanbookInfo) {
        this.doubanbookInfo = doubanbookInfo;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(Date ordDate) {
        this.ordDate = ordDate;
    }

    public String getPayyterms() {
        return payyterms;
    }

    public void setPayyterms(String payyterms) {
        this.payyterms = payyterms;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * 有参构造
     * @param userId
     * @param ordDate
     * @param payyterms
     * @param titleId
     * @param returnDate
     */
    public sales(Integer userId, Date ordDate, String payyterms, String titleId, Date returnDate) {
        this.userId = userId;
        this.ordDate = ordDate;
        this.payyterms = payyterms;
        this.titleId = titleId;
        this.returnDate = returnDate;
    }

    /**
     * 无参构造
     */
    public sales(){}

    @Override
    public String toString() {
        return "sales{" +
                "saleId=" + saleId +
                ", userId=" + userId +
                ", ordDate=" + ordDate +
                ", payyterms='" + payyterms + '\'' +
                ", titleId=" + titleId +
                ", returnDate=" + returnDate +
                '}';
    }
}
