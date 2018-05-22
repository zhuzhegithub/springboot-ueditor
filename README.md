# springboot-ueditor
springboot整合ueditor,因为ueditor本身并不适合与springboot整合，所以我在此处对ueditor源码进行了修改

#### 主要修改和添加
##### 1. ActionEnter.java
##### 2. ConfigManager.java
##### 3. UEditorConfig.java

##### 概要：在UEditorConfig中将ueditor的配置文件名注入，将其传入到ConfigManager中，读取配置文件。
##### 需要在yml文件中和UEditorConfig进行配置 ：
            uEditorConfig:
              fileName: ueditor-conf-dev.json 
                  
                  
            /**
             * ueditor配置文件名称
             */
            @Value("${uEditorConfig.fileName}")
            private String configFileName;          
                      
                      
##### 注意：
      ueditor.config.js 中的：
      // 服务器统一请求接口路径
      serverUrl: URL + "ueditor-config"
      就是 UEditorConfig.java 中的 config 方法的请求映射：
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
      
##### 关于ueditor 的详细配置，可参考 ueditor-conf-dev.json 