package com.bawei.bean;

/**
 * @ClassName AppErrorLog
 * @Description TODO
 * @Author mufeng_xky
 * @Date 2019/12/27 13:39
 * @Version V1.0
 **/
public class AppErrorLog {
    private String errorBrief;    //错误摘要
    private String errorDetail;   //错误详情

    public String getErrorBrief() {
        return errorBrief;
    }

    public void setErrorBrief(String errorBrief) {
        this.errorBrief = errorBrief;
    }

    public String getErrorDetail() {
        return errorDetail;
    }

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }
}
