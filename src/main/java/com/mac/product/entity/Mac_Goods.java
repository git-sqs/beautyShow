package com.mac.product.entity;

public class Mac_Goods {
    private Integer mId;

    private String mName;

    private Integer mWeight;

    private Integer mPrice;

    private String mImgUrl;

    private String mDesc;

    private String mKind;

    private Integer cId;

    private Integer tId;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public Integer getmWeight() {
        return mWeight;
    }

    public void setmWeight(Integer mWeight) {
        this.mWeight = mWeight;
    }

    public Integer getmPrice() {
        return mPrice;
    }

    public void setmPrice(Integer mPrice) {
        this.mPrice = mPrice;
    }

    public String getmImgUrl() {
        return mImgUrl;
    }

    public void setmImgUrl(String mImgUrl) {
        this.mImgUrl = mImgUrl == null ? null : mImgUrl.trim();
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc == null ? null : mDesc.trim();
    }

    public String getmKind() {
        return mKind;
    }

    public void setmKind(String mKind) {
        this.mKind = mKind == null ? null : mKind.trim();
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }
}