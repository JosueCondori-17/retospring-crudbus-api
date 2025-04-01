package com.murillo.retobusapicrud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permite solicitudes desde localhost:5173 (ajusta el puerto si es diferente)
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173")  // Permitir solo desde localhost:5173
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Métodos HTTP permitidos
                .allowedHeaders("*")  // Permitir todos los encabezados
                .allowCredentials(true); // Permite que se envíen credenciales si es necesario
    }
}
