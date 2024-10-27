package com.yupi.yuapiinterface.entity;

import lombok.Data;

@Data
public class ImageResponse {

    private String code;
    private String msg;

    private Image data;
}
