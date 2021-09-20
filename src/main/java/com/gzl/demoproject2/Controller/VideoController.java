package com.gzl.demoproject2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @RequestMapping("list")
    public Object list(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","语文");
        map.put("2","数学");
        map.put("3","英语");

        return map;
    }
}
