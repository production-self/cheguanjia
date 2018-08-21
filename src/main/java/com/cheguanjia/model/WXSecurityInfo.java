package com.cheguanjia.model;

import com.alibaba.fastjson.annotation.JSONField;

public class WXSecurityInfo {
    @JSONField(name="open_id")
    private String openId;
    @JSONField(name="session_key")
    private String sessionKey;
    @JSONField(name="unionid")
    private String unionId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }
}
