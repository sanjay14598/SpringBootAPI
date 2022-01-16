package com.andoridrest.Springboot.app.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
public class SwaggerConfig {

    @Bean
   public Docket docket(){
      return new Docket(DocumentationType.SWAGGER_2).select()
              .apis(RequestHandlerSelectors.any())
              .paths(Predicates.not(PathSelectors.regex("/error")))
              .build()
              .apiInfo(metadata());


   }


    private ApiInfo metadata() {
        return new ApiInfoBuilder()//
                .title("RestApi")//
                .description("Rest Api Documentation")//
                .version("V-1.0.0")//
                .license("MIT License").licenseUrl("http:sanjay.co.in")//
                .contact(new Contact("Techniti Software Solution Pvt. Ltd.", "techniti.co.in", "dev@techniti.co.in"))//
                .build();
    }
}
