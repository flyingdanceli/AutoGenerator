package cn.fly.AutoGenerator.bean;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Table {
    private String tableName;
    private Boolean controllerEnabled;
    private Boolean controllerOverrideEnabled;
    private Boolean serviceEnabled;
    private Boolean serviceOverrideEnabled;
    private Boolean serviceImplEnabled;
    private Boolean serviceImplOverrideEnabled;
    private Boolean entityEnabled;
    private Boolean entityOverrideEnabled;
}
