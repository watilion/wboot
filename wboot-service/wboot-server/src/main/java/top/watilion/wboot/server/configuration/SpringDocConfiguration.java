package top.watilion.wboot.server.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author watilion
 * @date 2021/5/3 00:09
 */
@Configuration
public class SpringDocConfiguration {

    @Bean
    public OpenAPI springDoc(){
        return new OpenAPI()
                .info(new Info().title("wboot")
                        .description("wboot api文档")
                        .version("v1.0.0"));
    }

/*    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("open-api")
                .pathsToMatch("/open-api/**")
                .build();
    }

    @Bean
    public GroupedOpenApi systemApi() {
        return GroupedOpenApi.builder()
                .group("system")
                .pathsToMatch("/system/**")
                .build();
    }*/
}
