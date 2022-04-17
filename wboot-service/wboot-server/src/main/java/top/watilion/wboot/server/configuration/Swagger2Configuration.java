package top.watilion.wboot.server.configuration;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.RequestParameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.ApiSelector;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author watilion
 * @date 2021/5/3 00:09
 */
@Configuration
@EnableOpenApi
public class Swagger2Configuration {

    @Bean
    public Docket api() {
        RequestParameterBuilder tokenParams = new RequestParameterBuilder();
        List<RequestParameter> params = new ArrayList<>();
        tokenParams.name("Authorization").description("身份验证token")
                .in("header").required(false).build();
        params.add(tokenParams.build());
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .globalRequestParameters(params)
                .select()
                .apis(getBasePackages())
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("wboot api文档").description("wboot api说明文档").version("v1").build();

    }

    /**
     * 配置swagger 扫描的包路径，支持扫描多个包路径
     * @return swagger 识别路径
     */
    private Predicate<RequestHandler> getBasePackages() {
        Predicate<RequestHandler> requestHandlerSelector = ApiSelector.DEFAULT.getRequestHandlerSelector();
        Predicate<RequestHandler> predicates = requestHandlerSelector.and(RequestHandlerSelectors.basePackage("top.watilion.wboot.system.controller"));
        predicates = predicates.and(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class));
        return predicates;
    }
}
