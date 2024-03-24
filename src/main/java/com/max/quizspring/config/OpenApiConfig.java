package com.max.quizspring.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(contact = @Contact(name = "Ajin Roch", email = "ajinroch007@gmail.com", url = "https://mwebsite"), title = "QuizSpring API", version = "1.0", description = "open Api document of the project", license = @License(name = "Liceence name", url = "url link")), servers = {
        @Server(description = "Local end setup", url = "http://locahost:8080"),
        @Server(description = "Prod setup", url = "https://prod-api.com") },

        //added for the secrity scheme for the entire project, after this the lock icon wil appear in Swagger.html for 
        // the entire project.
        security = {
            @SecurityRequirement(name = "bearerAuth")
        })

@SecurityScheme(name = "bearerAuth", description = "Authentication is done using JWT.", scheme = "bearer", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", in = SecuritySchemeIn.HEADER

)
public class OpenApiConfig {

}
