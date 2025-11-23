package com.recetas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RecetasBackendApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RecetasBackendApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(RecetasBackendApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**")
                        .allowedOrigins("http://localhost:3000")
                        .allowedMethods("GET", "POST", "PUT", "DELETE");
            }
        };
    }
}

/*
 * By:
 *   ░█████╗░░█████╗░██████╗░██╗░░░░░░█████╗░░██████╗░░░░░░░░░█████╗░░█████╗░██████╗░███████╗░░░
 *   ██╔══██╗██╔══██╗██╔══██╗██║░░░░░██╔══██╗██╔════╝░░░░░░░░██╔══██╗██╔══██╗██╔══██╗██╔════╝░░░
 *   ██║░░╚═╝███████║██████╔╝██║░░░░░██║░░██║╚█████╗░░░░░░░░░██║░░╚═╝██║░░██║██║░░██║█████╗░░░░░
 *   ██║░░██╗██╔══██║██╔══██╗██║░░░░░██║░░██║░╚═══██╗░░░░░░░░██║░░██╗██║░░██║██║░░██║██╔══╝░░░░░
 *   ╚█████╔╝██║░░██║██║░░██║███████╗╚█████╔╝██████╔╝░░░░░░░░╚█████╔╝╚█████╔╝██████╔╝███████╗██╗
 *   ░╚════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚══════╝░╚════╝░╚═════╝░░░░░░░░░░╚════╝░░╚════╝░╚═════╝░╚══════╝╚═╝
 *
 * ⚡ Powered by: Spring Boot & React
 * License: MIT - Compartir es vivir!
 */