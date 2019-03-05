package com.library.library.pojo;

import java.util.Date;

/**
 * 用户办卡
 */
public class card {
    //卡号id
    private Integer cardId;
    //会员卡类型
    private String cardType;
    //所属用户id
    private Integer userId;
    //会员卡购买时间
    private Date buyDate;
    //会员卡到期时间
    private Date returnDate;

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * 有参构造函数
     * @param cardType
     * @param userId
     * @param buyDate
     * @param returnDate
     */
    public card(String cardType, Integer userId, Date buyDate, Date returnDate) {
        this.cardType = cardType;
        this.userId = userId;
        this.buyDate = buyDate;
        this.returnDate = returnDate;
    }

    /**
     * 无参构造函数
     */
    public card(){}

    @Override
    public String toString() {
        return "card{" +
                "cardId=" + cardId +
                ", cardType='" + cardType + '\'' +
                ", userId=" + userId +
                ", buyDate=" + buyDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
