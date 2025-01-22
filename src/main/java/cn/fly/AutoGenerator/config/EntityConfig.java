package cn.fly.AutoGenerator.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.IFill;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import lombok.Data;

import java.util.List;

@Data
public class EntityConfig {
    /*
    方法	说明	示例
nameConvert(INameConvert)	名称转换实现
superClass(Class<?>)	设置父类	BaseEntity.class
superClass(String)	设置父类	com.baomidou.global.BaseEntity
disableSerialVersionUID	禁用生成 serialVersionUID	默认值: true
enableFileOverride	覆盖已生成文件	默认值: false
enableColumnConstant	开启生成字段常量	默认值: false
enableChainModel	开启链式模型	默认值: false
enableLombok	开启 Lombok 模型	默认值: false 默认只有Getter,Setter,自3.5.10后增加ToString
enableRemoveIsPrefix	开启 Boolean 类型字段移除 is 前缀	默认值: false
enableTableFieldAnnotation	开启生成实体时生成字段注解	默认值: false
enableActiveRecord	开启 ActiveRecord 模型	默认值: false
versionColumnName(String)	乐观锁字段名(数据库字段)	versionColumnName 与 versionPropertyName 二选一即可
versionPropertyName(String)	乐观锁属性名(实体)	versionColumnName 与 versionPropertyName 二选一即可
logicDeleteColumnName(String)	逻辑删除字段名(数据库字段)	logicDeleteColumnName 与 logicDeletePropertyName 二选一即可
logicDeletePropertyName(String)	逻辑删除属性名(实体)	logicDeleteColumnName 与 logicDeletePropertyName 二选一即可
naming	数据库表映射到实体的命名策略	默认下划线转驼峰命名: NamingStrategy.underline_to_camel
columnNaming	数据库表字段映射到实体的命名策略	默认为 null，未指定按照 naming 执行
addSuperEntityColumns(String…)	添加父类公共字段
addIgnoreColumns(String…)	添加忽略字段
addTableFills(IFill…)	添加表字段填充
addTableFills(List<IFill>)	添加表字段填充
idType(IdType)	全局主键类型
convertFileName(ConverterFileName)	转换文件名称
formatFileName(String)	格式化文件名称
toString(boolean)	是否生成ToString方法	默认为true, 自3.5.10开始
fieldUseJavaDoc	启用字段文档注释	默认为true, 自3.5.10开始
classAnnotations(ClassAnnotationAttributes)	添加实体类注解	自3.5.10开始
tableAnnotationHandler	表注解处理器	自3.5.10开始
tableFieldAnnotationHandler	字段注解处理器	自3.5.10开始
enableLombok(ClassAnnotationAttributes…)	开启 Lombok 模型并设置Lombok注解	自3.5.10开始. 使用@Data示例: enableLombok(new ClassAnnotationAttributes(“@Data”,“lombok.Data”))
     */

    private String superClass;
    private Boolean disableSerialVersionUID = true;
    private Boolean enableFileOverride = false;
    private Boolean enableColumnConstant = false;
    private Boolean enableChainModel = false;
    private Boolean enableLombok = false;
    private Boolean enableRemoveIsPrefix = false;
    private Boolean enableTableFieldAnnotation = false;
    private Boolean enableActiveRecord = false;
    private String versionColumnName;
    private String versionPropertyName;
    private String logicDeleteColumnName;
    private String logicDeletePropertyName;
    private NamingStrategy naming;
    private NamingStrategy columnNaming;
    private String addSuperEntityColumns;
    private String addIgnoreColumns;
    private List<IFill> addTableFills;

}
