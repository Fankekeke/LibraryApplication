package com.library.library.enumUtil;

public enum LoginEnum {
   // UM验证失败的几种原因
    USE_YES("0", "正常使用"),
    USE_NO("1", "已拉黑");

    String code;
    String desc;

    private LoginEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
