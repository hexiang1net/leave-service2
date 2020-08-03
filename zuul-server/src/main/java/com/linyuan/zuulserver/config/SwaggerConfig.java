package com.linyuan.zuulserver.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
//@EnableSwagger2
//@EnableOpenApi
public class SwaggerConfig {

//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("分布式购物系统")
//                .description("购物系统接口文档说明")
//                .termsOfServiceUrl("http://localhost:8081")
//                .contact(new Contact("林塬", "", "765371578@qq.com"))
//                .version("1.0")
//                .build();
//    }

@Bean
public Docket createRestApi() {
return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any()).build();}
 
        private ApiInfo apiInfo() {
    return new ApiInfoBuilder().title("Swagger3接口文档")
            .description("更多请咨询服务开发者Ray。")
            .contact(new Contact("Ray。", "http://www.ruiyeclub.cn", "ruiyeclub@foxmail.com"))
            .version("1.0").build();}
}
