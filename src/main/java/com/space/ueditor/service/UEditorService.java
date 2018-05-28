package com.space.ueditor.service;

import com.space.ueditor.bo.UEditorBO;
import com.space.ueditor.mapper.UEditorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhuzhe
 * @date 2018/5/28 11:22
 * @email 1529949535@qq.com
 */
@Service
@Transactional(readOnly = true)
public class UEditorService {

    @Autowired
    private UEditorMapper uEditorMapper;

    /**
     * 返回id
     * @return
     */
    @Transactional
    public Long save(UEditorBO uEditorBO){
        return uEditorMapper.save(uEditorBO);
    }
}
