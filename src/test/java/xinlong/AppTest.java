package xinlong;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class AppTest {
    @Test
    public void testGenerator() {
        //1.全局配置config.setActiveRecort
        GlobalConfig config=new GlobalConfig();
        config.setAuthor("wangxinlong")
                .setOutputDir("D:\\idea\\weixin\\ssm\\??\\src\\main\\java")
                .setFileOverride(true)
                .setIdType(IdType.AUTO)
                .setServiceName("%sService")
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setEnableCache(false);/*关闭二级缓存*/


        //2.数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.jdbc.Driver")
                .setUsername("root")
                .setPassword("123456")
                .setUrl("jdbc:mysql://localhost:3306/??");
        //3.策略配置
        StrategyConfig strategyConfig=new StrategyConfig();
        strategyConfig.setCapitalMode(true)
                .setControllerMappingHyphenStyle(true)/*驼峰转连字符*/
                .setRestControllerStyle(true)/*生成 @RestController 控制器*/
                .setNaming(NamingStrategy.underline_to_camel)
                .setTablePrefix("t_") //生成实体时去掉表前缀
                .setInclude("t_bis_wallet");//数据库表
        //4.包名策略配置
        PackageConfig packageConfig=new PackageConfig();
        packageConfig.setParent("com.xinlong")
                .setMapper("dao")
                .setService("service")
                .setEntity("bean")
                .setXml("dao")
                .setController("controller");
        //5.整合配置
        AutoGenerator autoGenerator=new AutoGenerator();
        autoGenerator.setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig);
        autoGenerator.execute();

    }

    }




