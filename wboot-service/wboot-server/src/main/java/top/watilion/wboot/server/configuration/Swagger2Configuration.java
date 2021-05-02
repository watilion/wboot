package top.watilion.wboot.server.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author watilion
 * @date 2021/5/3 00:09
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    @Bean
    public Docket api() {
        ParameterBuilder tokenParams = new ParameterBuilder();
        List<Parameter> params = new ArrayList<>();
        tokenParams.name("Authorization").description("身份验证token")
                .modelRef(new ModelRef("string"))
                .parameterType("header").required(false).build();
        params.add(tokenParams.build());
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .globalOperationParameters(params)
                .select()
                .apis(RequestHandlerSelectors.basePackage("top.watilion.wboot.controller"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("wboot api文档").description("wboot api说明文档").version("v1").build();

    }
}
