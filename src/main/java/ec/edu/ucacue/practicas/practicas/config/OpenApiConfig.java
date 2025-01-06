package ec.edu.ucacue.practicas.practicas.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Practicas", version = "1.0", description = "API de practicas"))
public class OpenApiConfig {

}
