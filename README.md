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
                      
                      
                      
