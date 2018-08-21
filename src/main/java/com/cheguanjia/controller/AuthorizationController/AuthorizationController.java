package com.cheguanjia.controller.AuthorizationController;

import com.cheguanjia.model.WXSecurityInfo;
import com.cheguanjia.service.AuthorizationService.AuthorizationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthorizationController {
    @Autowired
    private AuthorizationService authorizationService;
    @RequestMapping(name="/auth/{jsCode}",method = RequestMethod.GET)
    public WXSecurityInfo getSecurityMessage(@PathVariable(name = "jsCode") String jsCode){
        WXSecurityInfo wxSecurityInfo =null;
        if(StringUtils.isNotEmpty(jsCode)){
            wxSecurityInfo = authorizationService.getWXSecurityInfo(jsCode);
        }
        return wxSecurityInfo;
    }

}
