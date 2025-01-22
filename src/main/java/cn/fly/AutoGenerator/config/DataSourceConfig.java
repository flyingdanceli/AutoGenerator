package cn.fly.AutoGenerator.config;

public class DataSourceConfig {
    /*
    *属性	说明	示例
url	jdbc 路径	jdbc:mysql://127.0.0.1:3306/mybatis-plus
username	数据库账号	root
password	数据库密码	123456
*
方法	说明	示例
dbQuery(IDbQuery)	数据库查询	new MySqlQuery(),只在SQLQuery下生效
schema(String)	数据库 schema(部分数据库适用)	mybatis-plus
typeConvert(ITypeConvert)	数据库类型转换器	new MySqlTypeConvert(),只在SQLQuery下生效
keyWordsHandler(IKeyWordsHandler)	数据库关键字处理器	new MySqlKeyWordsHandler()
typeConvertHandler(ITypeConvertHandler)	类型转换器(默认)	自定义实现ITypeConvertHandler,只在DefaultQuery下生效
databaseQueryClass(AbstractDatabaseQuery)	数据库查询方式	默认DefaultQuery.class(通用元数据), SQLQuery.class(SQL查询)
    * */
    private String url;
    private String username;
    private String password;



}
