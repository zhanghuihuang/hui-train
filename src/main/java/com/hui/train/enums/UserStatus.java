package com.hui.train.enums;

/**
 * @author : zhanghh
 * @businessDesc :
 * @project : hui-train
 * @date : 2019/2/18 15:25
 */
public enum UserStatus {
    NORMAL(0,"NORMAL","正常"),
    LOCK(1,"LOCK","锁定"),
    DISABLED(2,"DISABLED","停用"),
    CANCELED(3,"CANCELED","注销");

    private int index;
    private String code;
    private String name;

    UserStatus(int index, String code, String name) {
        this.index = index;
        this.code = code;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
