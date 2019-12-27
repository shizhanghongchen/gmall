package com.bawei.bean;

/**
 * @ClassName AppActive_foreground
 * @Description TODO
 * @Author mufeng_xky
 * @Date 2019/12/27 13:43
 * @Version V1.0
 **/
public class AppActive_foreground {

    private String push_id;//推送的消息的id，如果不是从推送消息打开，传空
    private String access;//1.push 2.icon 3.其他

    public String getPush_id() {
        return push_id;
    }

    public void setPush_id(String push_id) {
        this.push_id = push_id;
    }

    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

}
