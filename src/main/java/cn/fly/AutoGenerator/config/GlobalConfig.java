package cn.fly.AutoGenerator.config;

import com.baomidou.mybatisplus.generator.config.rules.DateType;
import lombok.Data;

@Data
public class GlobalConfig {
    /*
    方法	说明	示例
disableOpenDir()	禁止自动打开输出目录	默认值: true
outputDir(String)	指定代码生成的输出目录	/opt/baomidou 默认值: Windows: D:// Linux/Mac: /tmp
author(String)	设置作者名	baomidou 默认值: 配置文件中的作者名
enableKotlin()	开启 Kotlin 模式	默认值: false
enableSwagger()	开启 Swagger 模式	默认值: false
dateType(DateType)	设置时间类型策略	DateType.ONLY_DATE 默认值: DateType.TIME_PACK
commentDate(String)	设置注释日期格式	默认值: yyyy-MM-dd

     */
    private String author;
    private String outputDir;
    private Boolean disableOpenDir;
    private Boolean enableKotlin;
    private Boolean enableSwagger;
    private DateType dateType;
    private String commentDate;

}
