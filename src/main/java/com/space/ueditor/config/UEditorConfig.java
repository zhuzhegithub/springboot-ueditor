package com.space.ueditor.config;

import com.space.ueditor.baidu.ueditor.ActionEnter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zhuzhe
 * @date 2018/5/22 10:19
 * @email 1529949535@qq.com
 */
@Controller
public class UEditorConfig {

    /**
     * ueditor配置文件名称
     */
    @Value("${uEditorConfig.fileName}")
    private String configFileName;

    /**
     * 读取配置
     * @param request
     * @param response
     */
    @RequestMapping(value="/ueditor-config")
    public void config(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json");
        String rootPath = request.getSession().getServletContext().getRealPath("/");
        try {
            String exec = new ActionEnter(request, rootPath,configFileName).exec();
            PrintWriter writer = response.getWriter();
            writer.write(exec);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
