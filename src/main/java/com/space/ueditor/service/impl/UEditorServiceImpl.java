package com.space.ueditor.service.impl;

import com.space.ueditor.bo.UEditorBO;
import com.space.ueditor.mapper.UEditorMapper;
import com.space.ueditor.service.UEditorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhuzhe
 * @date 2018/5/28 13:44
 * @email 1529949535@qq.com
 */
@Service
@Transactional(readOnly = true)
public class UEditorServiceImpl implements UEditorService {

    @Autowired
    private UEditorMapper uEditorMapper;

    /**
     * 返回id
     * @return
     */
    @Transactional
    public int save(UEditorBO uEditorBO){
        return uEditorMapper.save(uEditorBO);
    }
}
