package cn.fly.AutoGenerator.config;

import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import lombok.Data;

@Data
public class StrategyConfig {
    /*
    方法	说明	示例
enableCapitalMode	开启大写命名	默认值: false
enableSkipView	开启跳过视图	默认值: false
disableSqlFilter	禁用 SQL 过滤	默认值: true，如果 SQL 过滤不支持，可以关闭此选项
enableSchema	启用 schema	默认值: false，多 schema 场景时启用
likeTable(LikeTable)	模糊表匹配(SQL 过滤)	与 notLikeTable 互斥，只能配置一项
notLikeTable(LikeTable)	模糊表排除(SQL 过滤)	与 likeTable 互斥，只能配置一项
addInclude(String…)	增加表匹配(内存过滤)	与 addExclude 互斥，只能配置一项，支持正则匹配，如 ^t_.* 匹配所有以 t_ 开头的表名
addExclude(String…)	增加表排除匹配(内存过滤)	与 addInclude 互斥，只能配置一项，支持正则匹配，如 .*st$ 匹配所有以 st 结尾的表名
addTablePrefix(String…)	增加过滤表前缀
addTableSuffix(String…)	增加过滤表后缀
addFieldPrefix(String…)	增加过滤字段前缀
addFieldSuffix(String…)	增加过滤字段后缀
outputFile	内置模板输出文件处理	参考测试用例 H2CodeGeneratorTest.testOutputFile
entityBuilder	实体策略配置
controllerBuilder	Controller 策略配置
mapperBuilder	Mapper 策略配置
serviceBuilder	Service 策略配置
     */
    private boolean enableCapitalMode =  false;
    private boolean enableSkipView =  false;
    private boolean disableSqlFilter =  true;
    private boolean enableSchema =  false;
    private LikeTable likeTable;
    private LikeTable notLikeTable;
    private String[] addInclude;
    private String[] addExclude;
    private String[] addTablePrefix;
    private String[] addTableSuffix;
    private String[] addFieldPrefix;
    private String[] addFieldSuffix;
    private String outputFile;
}
