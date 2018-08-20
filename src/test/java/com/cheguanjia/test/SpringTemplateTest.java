package com.cheguanjia.test;

import com.cheguanjia.model.AccountSeach;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTemplateTest {
    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void test() {
        AccountSeach accountSeach = new AccountSeach();
        Map params = new HashMap();//请求参数
        params.put("dtype","json");//返回数据格式：json或xml或jsonp,默认json
        params.put("callback","");//返回格式选择jsonp时，必须传递
        params.put("key","95f4ce6a6f1c2e836fed27c22cc259f7");//你申请的key
        params.put("city","SX_XA");//城市代码 *
        params.put("hphm","陕AV05K8");//号牌号码 完整7位 ,需要utf8 urlencode*
        params.put("hpzl","02");//号牌类型，默认02
        params.put("engineno","AF7M1086");//发动机号 (根据城市接口中的参数填写)
        params.put("classno","LVVDC11B77D272777");//车架号 (根据城市接口中的参数填写)
        String response = restTemplate.postForObject("http://v.juhe.cn/wz/query", params, String.class);
        System.out.println(response);
    }
}
