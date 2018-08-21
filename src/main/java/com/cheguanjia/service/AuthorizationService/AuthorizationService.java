package com.cheguanjia.service.AuthorizationService;

import com.cheguanjia.model.WXSecurityInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthorizationService{
    @Autowired
    private RestTemplate restTemplate;
    @Value("${wx.appid}")
    private String appid;
    @Value("${wx.secret}")
    private String secret;


    public WXSecurityInfo getWXSecurityInfo(String jsCode){
        Map<String,String> parameters = new HashMap<String,String>();
        parameters.put("appid",appid);
        parameters.put("secret",secret);
        parameters.put("js_code",jsCode);
        parameters.put("grant_type","authorization_code");
        ResponseEntity<WXSecurityInfo> responseEntity = restTemplate.getForEntity("https://api.weixin.qq.com/sns",
                WXSecurityInfo.class,parameters);
        return (WXSecurityInfo)responseEntity.getBody() ;
    }
}
