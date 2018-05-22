package com.space.ueditor.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuzhe
 * @date 2018/5/22 9:59
 * @email 1529949535@qq.com
 */
@Slf4j
@RestController
public class SaveController {

    @RequestMapping("/save")
    public String save(@RequestParam("content") String content){
        log.info(content);
        return content;
    }
}
