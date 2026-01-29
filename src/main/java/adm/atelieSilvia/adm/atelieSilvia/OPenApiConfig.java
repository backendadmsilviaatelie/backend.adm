package adm.atelieSilvia.adm.atelieSilvia;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OPenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API do Ateliê Silvia")
                        .version("1.0")
                        .description("Documentação da API para o sistema de administração do Ateliê Silvia."));
    }
}
