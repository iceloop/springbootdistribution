package com.gl.springbootapi.controller;

import com.gl.springbootutils.helper.Common;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/test")
public class Testcontroller {

    @GetMapping("/date")
    public  String getdata(){
        Date d= Common.getCurDate();
        SimpleDateFormat  df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("erfefe");
   return  "当前时间"+df.format(d).toString();
    }
}
