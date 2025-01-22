package cn.fly.AutoGenerator.config;

public class PackageConfig {
    /*
    方法	说明	示例
parent(String)	设置父包名	默认值: com.baomidou
moduleName(String)	设置父包模块名	默认值: 无
entity(String)	设置 Entity 包名	默认值: entity
service(String)	设置 Service 包名	默认值: service
serviceImpl(String)	设置 Service Impl 包名	默认值: service.impl
mapper(String)	设置 Mapper 包名	默认值: mapper
xml(String)	设置 Mapper XML 包名	默认值: mapper.xml
controller(String)	设置 Controller 包名	默认值: controller
pathInfo(Map<OutputFile, String>)	设置路径配置信息	Collections.singletonMap(OutputFile.mapperXml, "D://")
     */
    private String parent;
    private String moduleName;
    private String entity;
    private String service;
    private String serviceImpl;
    private String mapper;
    private String xml;
    private String controller;
    private String pathInfo;
}
