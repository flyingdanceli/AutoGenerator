package cn.fly.AutoGenerator.controller;

import cn.fly.AutoGenerator.bean.CodeConfig;
import cn.fly.AutoGenerator.bean.Table;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.builder.Entity;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Types;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@Log4j2
public class CodeController {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private Environment environment;


    // http://127.0.0.1:8080/code?tables=lisi
    @RequestMapping("/code")
    @ResponseBody
    public String code(@RequestBody CodeConfig config) {

        log.info("config:{}",config);

        // 获取当前类包名
        String packageName = this.getClass().getPackage().getName();
        System.out.println("包名: " + packageName);

        // 获取磁盘路径（Spring Boot 应用启动路径）
        String path = config.getPath();


        String url = config.getDatabaseURL();
        String username = config.getDatabaseUserName();
        String password = config.getDatabasePassword();



        String parentPkg = this.getClass().getPackage().getName();
        parentPkg = parentPkg.substring(0,parentPkg.lastIndexOf('.')) ;
        System.out.println(parentPkg);


        List<Table> tables = config.getTables();
        List<String> tableNames = new ArrayList<>(tables.size());
        tables.forEach(table -> {
            tableNames.add(table.getTableName());
        });

        String finalParentPkg = parentPkg;
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("fly") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .outputDir(path+"\\java"); // 指定输出目录
                })
                .dataSourceConfig(builder ->
                        builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                            int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                            if (typeCode == Types.SMALLINT) {
                                // 自定义类型转换
                                return DbColumnType.INTEGER;
                            }
                            if(typeCode == Types.NUMERIC){
                                return DbColumnType.BIG_DECIMAL;
                            }
                            return typeRegistry.getColumnType(metaInfo);
                        })
                )
                .packageConfig(builder ->
                        builder.parent(finalParentPkg) // 设置父包名
                                //.moduleName("entity") // 设置父包模块名
                                .pathInfo(Collections.singletonMap(OutputFile.xml, path+"\\resources\\mappers")) // 设置mapperXml生成路径
                )

                .strategyConfig(builder ->{
                        builder.addInclude(tableNames) // 设置需要生成的表名
                                .addTablePrefix("t_", "c_"); // 设置过滤表前缀

        // 配置实体类生成逻辑
                            Entity.Builder entityBuilder = builder.entityBuilder();
        if (config.isOverwriteFiles()) {
            entityBuilder.enableFileOverride(); // 根据配置启用文件覆盖
        }
        if (config.isEnableLombok()) {
            entityBuilder.enableLombok(); // 根据配置启用 Lombok
        }

        // 配置 Controller 是否生成
                            com.baomidou.mybatisplus.generator.config.builder.Controller.Builder controllerBuilder = builder.controllerBuilder();
        if (!config.isGenerateController()) {
            controllerBuilder.disable(); // 禁用 Controller 生成
        }



                                /*.entityBuilder().enableFileOverride().enableLombok()
                                .controllerBuilder().disable()*/
                        }

                )
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();




        return "生成成功：" + tables;
    }

}
