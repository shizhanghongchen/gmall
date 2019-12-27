package com.bawei.bean;

/**
 * @ClassName AppActive_background
 * @Description TODO
 * @Author mufeng_xky
 * @Date 2019/12/27 13:43
 * @Version V1.0
 **/
public class AppActive_background {

    private String active_source;//1=upgrade,2=download(下载),3=plugin_upgrade

    public String getActive_source() {
        return active_source;
    }

    public void setActive_source(String active_source) {
        this.active_source = active_source;
    }

}
