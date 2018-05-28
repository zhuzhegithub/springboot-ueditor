package com.space.ueditor.controller;

import com.space.ueditor.bo.UEditorBO;
import com.space.ueditor.service.UEditorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhuzhe
 * @date 2018/5/22 9:59
 * @email 1529949535@qq.com
 */
@Slf4j
@RestController
public class SaveController {

    private String getDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = dateFormat.format(new Date());
        return format;
    }

    @Autowired
    private UEditorService uEditorService;

    @RequestMapping("/save")
    public Long save(UEditorBO uEditorBO){
        uEditorBO.setCreateDate(getDate());
        uEditorBO.setUpdateDate(getDate());
        uEditorService.save(uEditorBO);
        return uEditorBO.getId();
    }
}
