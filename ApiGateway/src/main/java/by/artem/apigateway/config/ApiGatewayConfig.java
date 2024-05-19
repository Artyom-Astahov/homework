package by.artem.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApiGatewayConfig {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        return http.csrf(CsrfConfigurer::disable)
//                .authorizeHttpRequests(request -> request
//                        .requestMatchers("/auth/register", "/auth/token", "auth/validate")
//                        .permitAll())
//                .build();
//    }
}
