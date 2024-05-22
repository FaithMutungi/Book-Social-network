package com.PreciousCode.BookNetwork.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "precious",
                        email = "precious@gmail.com",
                        url = "https://precious.com/learning"
                ),
                description = "openApi documentation for backend",
                title = "openApi specification-precious",
                version = "1.0",
                license = @License(
                        name = "License name",
                        url = "https://some-url.com"
                ),
                termsOfService = "terms of service"

        ),
        servers ={
                @Server(
                        description = "local Env",
                        url = "http://localhost:8000/api/v1"
                ),
                @Server(
                        description = "Prod Env",
                        url = "preciouscoding.com/courses"

                )
        },
        security = {
                @SecurityRequirement(

                        name = "BearerAuth"
                )

        }

)
@SecurityScheme(
        name = "BearerAuth",
        description = "Jwt Auth Description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER


)
public class OpenApiConfig {
}
