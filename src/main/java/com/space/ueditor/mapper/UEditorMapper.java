package com.space.ueditor.mapper;

import com.space.ueditor.bo.UEditorBO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author zhuzhe
 * @date 2018/5/28 11:23
 * @email 1529949535@qq.com
 */
@Component
@Mapper
public interface UEditorMapper {

    /**
     * save  并返回 id
     * @param uEditorBO
     * @return
     */
    Long save(UEditorBO uEditorBO);
}
