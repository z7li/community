package com.lixuan.community.config;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.jupiter.api.Test;

/**
 * @author z7
 * @version 2023/02/09/14:26
 * @description
 */
public class CodeGenerator {

    @Test
    void GenerateCode() {

        String url = "jdbc:mysql://127.0.0.1:3306/loris";
        String username = "root";
        String password = "152408dlx";
        String projectPath = System.getProperty("user.dir");

        DataSourceConfig dataSourceConfig = new DataSourceConfig.Builder(url, username, password)
                .build();

        /**
         * 全局配置
         */
        GlobalConfig globalConfig = new GlobalConfig.Builder()
                .outputDir(projectPath + "/src/main/java")
                .author("lixuan")
                .build();
        /**
         * 包配置
         */
        PackageConfig packageConfig = new PackageConfig.Builder()
                .parent("com.lixuan.community")
                .entity("pojo.entity")
                .build();

        /**
         * 策略配置
         */
        StrategyConfig strategyConfig = new StrategyConfig.Builder()
                .enableCapitalMode()
                .addTablePrefix("loris_")

                .entityBuilder()
                .enableChainModel()
                .enableLombok()
                .enableRemoveIsPrefix()
                .enableTableFieldAnnotation()
                .naming(NamingStrategy.underline_to_camel)
                .columnNaming(NamingStrategy.underline_to_camel)
                .idType(IdType.AUTO)
                .formatFileName("%s")
                .build()

                .mapperBuilder()
                .enableBaseResultMap()
                .enableBaseColumnList()
                .formatMapperFileName("%sDao")
                .formatXmlFileName("%sXml")
                .build()

                .serviceBuilder()
                .formatServiceFileName("%sService")
                .formatServiceImplFileName("%sServiceImpl")
                .build()

                .controllerBuilder()
                .formatFileName("%sController")
                .build();

        AutoGenerator generator = new AutoGenerator(dataSourceConfig);

        generator.global(globalConfig)
                .packageInfo(packageConfig)
                .strategy(strategyConfig)
                .execute();

    }

}
