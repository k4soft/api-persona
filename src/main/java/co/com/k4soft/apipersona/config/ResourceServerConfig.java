package co.com.k4soft.apipersona.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;


@Configuration
public class ResourceServerConfig {





    @Bean
    public CorsConfigurationSource getCorsConfigurationSource() {
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", config);
        return source;
    }


    @Bean
    public FilterRegistrationBean<CorsFilter> getCorsFilter(){
        FilterRegistrationBean<CorsFilter> beanFilter = new FilterRegistrationBean<CorsFilter>(new CorsFilter(getCorsConfigurationSource()));
        // prioridad alta
        beanFilter.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return beanFilter;
    }


}
