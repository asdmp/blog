package com.xiejiahao.asdmp;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiejiahao on 2021/7/18 22:13
 */
public class MyBatisPlusCode {
    public static void main(String[] args) {
        //项目根目录
        String property = System.getProperty("user.dir");
        //1、全局配置：输出目录、作者、是否打开资源管理器、是否覆盖原有同名文件、去除service前缀I、开启swagger2注解、主键id策略、日期类类型
        GlobalConfig gc = new GlobalConfig()
                .setOutputDir(property + "/src/main/java")
                .setAuthor("XieJiaHao")
                .setOpen(false)
                .setFileOverride(true)
                .setServiceName("%sService")
                .setSwagger2(true)
                .setIdType(IdType.AUTO)
                .setDateType(DateType.TIME_PACK);

        // 2、数据源配置
        DataSourceConfig dsc = new DataSourceConfig()
                .setUrl("jdbc:mysql://xiejiahao.com:3306/blog?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8")
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUsername("root")
                .setPassword("DMdrVdm4mx_2021")
                .setDbType(DbType.MYSQL);

        //3、包配置
        PackageConfig pc = new PackageConfig()
                .setParent("com.xiejiahao")
                .setEntity("entity")
                .setMapper("mapper")
                .setService("service")
                .setController("controller");

        //4、策略配置：映射的表（可变参数）、表名前缀忽略、逻辑删除字段名、表名字转驼峰、列名字转驼峰、lombok配置、链式set、RestController、自动填充
        TableFill tableFill = new TableFill("create_time", FieldFill.INSERT);
        TableFill tableFill2 = new TableFill("update_time", FieldFill.INSERT_UPDATE);
        List<TableFill> arr = new ArrayList();
        arr.add(tableFill);
        arr.add(tableFill2);
        StrategyConfig strategy = new StrategyConfig()
                .setInclude("user","article","article_tag")
                //.setTablePrefix("t_")
                .setLogicDeleteFieldName("delete_flag")
                .setNaming(NamingStrategy.underline_to_camel)
                .setColumnNaming(NamingStrategy.underline_to_camel)
                .setEntityLombokModel(true)
                .setChainModel(true)
                .setRestControllerStyle(true)
                .setTableFillList(arr);

        //代码生成器
        AutoGenerator mpg = new AutoGenerator()
                .setGlobalConfig(gc)
                .setDataSource(dsc)
                .setPackageInfo(pc)
                .setStrategy(strategy);
        //执行生成
        mpg.execute();
    }

}
