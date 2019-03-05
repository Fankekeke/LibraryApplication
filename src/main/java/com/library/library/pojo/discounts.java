package com.library.library.pojo;

/**
 * 折扣表
 */
public class discounts {
    //折扣标题
    private String discountType;

    private Integer storId;

    private Integer lowqty;

    private Integer highqty;
    //折扣价格
    private Integer discount;

    public String getDiscountType() {
        return discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public Integer getStorId() {
        return storId;
    }

    public void setStorId(Integer storId) {
        this.storId = storId;
    }

    public Integer getLowqty() {
        return lowqty;
    }

    public void setLowqty(Integer lowqty) {
        this.lowqty = lowqty;
    }

    public Integer getHighqty() {
        return highqty;
    }

    public void setHighqty(Integer highqty) {
        this.highqty = highqty;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    /**
     * 有参构造
     * @param discountType
     * @param storId
     * @param lowqty
     * @param highqty
     * @param discount
     */
    public discounts(String discountType, Integer storId, Integer lowqty, Integer highqty, Integer discount) {
        this.discountType = discountType;
        this.storId = storId;
        this.lowqty = lowqty;
        this.highqty = highqty;
        this.discount = discount;
    }

    /**
     * 无参构造
     */
    public discounts(){}
}
