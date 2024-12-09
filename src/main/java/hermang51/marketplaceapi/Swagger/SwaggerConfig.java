package hermang51.marketplaceapi.Swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI marketplaceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Marketplace API")
                        .description("Marketplace API documentation with Swagger")
                        .version("v1.0"));
    }
}
