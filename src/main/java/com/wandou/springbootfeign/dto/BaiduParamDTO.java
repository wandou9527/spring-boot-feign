package com.wandou.springbootfeign.dto;

/**
 * @author liming
 * @date 2020/11/17
 * @description
 */

public class BaiduParamDTO {

    private String wd;

    private String version;

    public BaiduParamDTO() {
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
