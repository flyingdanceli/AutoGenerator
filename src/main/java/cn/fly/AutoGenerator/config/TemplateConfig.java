package cn.fly.AutoGenerator.config;

import lombok.Data;

@Data
public class TemplateConfig {
    /*
    方法	说明	示例
entityBuilder()	设置实体类模板
javaTemplate(String)	设置 Java 实体模板	/templates/entity.java
disable()	禁用实体类生成
serviceBuilder()	设置 Service 层模板
disableService()	禁用 Service 层生成
serviceTemplate(String)	设置 Service 模板	/templates/service.java
serviceImplTemplate(String)	设置 ServiceImpl 模板	/templates/serviceImpl.java
     */
    private String javaTemplate;
    private boolean entityDisable;
    private String serviceTemplate;
    private boolean serviceDisable;
    private String serviceImplTemplate;

}
