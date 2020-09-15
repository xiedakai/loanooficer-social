package com.loanofficer.community.config;


import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfiguration {

    private static String title = "社区微服务";

    private static String description = "社区微服务api";

    private static String termsOfServiceUrl = "#";

    private static String version = "v1.0.0";

    private static String name = "后端小组";

    private static String url = "#";

    private static String email = "java@dingtalk.com";

    @Bean(value = "classApi")
    public Docket classApi() {
        //为所有的接口添加header参数
        /*
        ParameterBuilder versionNamePar = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<>();
        versionNamePar.name("VersionName")
                .description("version name eg. v4.22.1.abcd")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(true).build();
        pars.add(versionNamePar.build());
        */
        //根据每个方法名也知道当前方法在设置什么参数
        /*
        Docket docket = new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                //分组名称
                .groupName("云抢单项目-微服务组").select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
        */
        Docket docket = new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();

        //docket.globalOperationParameters(pars); //添加header参数
        return docket;
    }

    private static ApiInfo apiInfo() {
        return new ApiInfoBuilder().title(title).description(description).contact(new Contact(name, url, email)).termsOfServiceUrl(termsOfServiceUrl).version(version).build();
    }


}
