package com.cheguanjia.model;

import org.springframework.beans.factory.annotation.Value;

import java.io.Serializable;

public class AccountSeach implements Serializable {

    private String dtype;//返回数据格式：默认:json
    @Value("${system.seach.key}")
    private String key;  //在个人中心->我的数据,接口名称上方查看
    private String city;//城市代码
    private String hphm ;//号牌号码 完整7位 ,需要utf8 urlencode*
    private String hpzl;//号牌类型，默认02:小型车，01:大型车,16:教练车
    private String engineno;//发动机号 (具体是否需要根据城市接口中的参数填写)
    private String classno;//车架号 (具体是否需要根据城市接口中的参数填写)

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHphm() {
        return hphm;
    }

    public void setHphm(String hphm) {
        this.hphm = hphm;
    }

    public String getHpzl() {
        return hpzl;
    }

    public void setHpzl(String hpzl) {
        this.hpzl = hpzl;
    }

    public String getEngineno() {
        return engineno;
    }

    public void setEngineno(String engineno) {
        this.engineno = engineno;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }
}
