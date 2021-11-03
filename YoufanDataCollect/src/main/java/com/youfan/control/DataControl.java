package com.youfan.control;

import com.alibaba.fastjson.JSONObject;
import com.youfan.liuLiang.log.LogParent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("collect")
public class DataControl {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "data",method = RequestMethod.POST)
    public void collectData(@RequestBody String data){
        JSONObject jsonObject = JSONObject.parseObject(data);
        String logType = jsonObject.getString("logType");
        if("PC".equals(logType)){//pc端
            kafkaTemplate.send("pc",data);
        }else if("XIAOCHENGXU".equals(logType)){//小程序你
            kafkaTemplate.send("xiaochengxu",data);
        }else if("APP".equals(logType)){//app端
            kafkaTemplate.send("app",data);
        }
    }

}
