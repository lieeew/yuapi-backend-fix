package com.yupi.project.model.enums;

/**
 *接口状态枚举
 */
public enum InterfaceInfoStateEnum {

    ONLINE("发布", (byte)1),
    OFFLINE("下线", (byte)0);

    private final String text;

    private final Byte value;

    InterfaceInfoStateEnum(String text, Byte value) {
        this.text = text;
        this.value = value;
    }



    public byte getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
