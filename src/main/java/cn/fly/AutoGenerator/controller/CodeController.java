package cn.fly.AutoGenerator.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import cn.fly.AutoGenerator.entity.InvEinvoiceSt;
import cn.fly.AutoGenerator.mapper.InvEinvoiceStMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Types;
import java.util.Collections;

@Controller
public class CodeController {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private Environment environment;

    @Autowired
    private InvEinvoiceStMapper invEinvoiceStMapper;


    // http://127.0.0.1:8080/code?tables=lisi
    @RequestMapping("/code")
    @ResponseBody
    public String code(@RequestParam(name = "tables") String tables) {

        // 获取当前类包名
        String packageName = this.getClass().getPackage().getName();
        System.out.println("包名: " + packageName);

        // 获取磁盘路径（Spring Boot 应用启动路径）
        String path = "D:\\workspace2\\邢台自来水\\邢台数电\\src\\main";


        String url = environment.getProperty("spring.datasource.url");
        String username = environment.getProperty("spring.datasource.username");
        String password = environment.getProperty("spring.datasource.password");

        System.out.println("DataSource URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("password: " + password);


        String parentPkg = this.getClass().getPackage().getName();
        parentPkg = parentPkg.substring(0,parentPkg.lastIndexOf('.')) ;
        System.out.println(parentPkg);


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

                .strategyConfig(builder ->
                        builder.addInclude(tables.split(",")) // 设置需要生成的表名
                                .addTablePrefix("t_", "c_") // 设置过滤表前缀
                                .entityBuilder().enableFileOverride()
                                .controllerBuilder().disable()


                )
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();




        return "生成成功：" + tables;
    }
    @RequestMapping("/test")
    @ResponseBody
    public InvEinvoiceSt test(){
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("icid","0000000422");
        InvEinvoiceSt invEinvoiceSt = invEinvoiceStMapper.selectOne(wrapper);

        return invEinvoiceSt;
    }

}
