package com.NoCountry.Patrickscoin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {
    
    @Bean
    public OpenAPI openApi(){
        return new OpenAPI()
            .info(new Info()
                .title("Patrick Coins API")
                .version("1.0")
                .description("Api para el proyecto de Patrick Coin, una plataforma de compra y venta de criptomonedas.")
                .termsOfService("http://swagger.io/terms/")
                .license(new License().name("Apache 2.0").url("https://springdoc.org/"))
            );
    }

}
