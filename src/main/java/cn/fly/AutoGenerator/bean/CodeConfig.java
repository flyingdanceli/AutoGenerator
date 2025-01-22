package cn.fly.AutoGenerator.bean;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Builder
@ToString
public class CodeConfig {
    private String key;

    private String databaseURL;
    private String databaseUserName;
    private String databasePassword;

    private String packageName;
    private String modelName;
    private String path;




    private List<Table> tables;
}
