package com.example.sprintboot.controller;

import com.example.sprintboot.entity.NocvData;
import com.example.sprintboot.servie.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class IndexController {
    @Autowired
    private IndexService indexService;

    @RequestMapping("/query")
    public List<NocvData> queryData(){
        List<NocvData> list = indexService.list();
        return list;
    }
}
