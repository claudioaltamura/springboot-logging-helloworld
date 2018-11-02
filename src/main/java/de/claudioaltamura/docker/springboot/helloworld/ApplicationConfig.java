package de.claudioaltamura.docker.springboot.helloworld;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class ApplicationConfig {

  @Bean
  public CommonsRequestLoggingFilter logFilter() {
    CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();

    filter.setIncludeQueryString(true);
    filter.setIncludePayload(true);
    filter.setMaxPayloadLength(10000);
    filter.setIncludeHeaders(false);

    return filter;
  }

  @Bean
  public FilterRegistrationBean<CommonsRequestLoggingFilter> loggingFilterRegistration() {
    FilterRegistrationBean<CommonsRequestLoggingFilter> registration = new FilterRegistrationBean<CommonsRequestLoggingFilter>(logFilter());

    registration.addUrlPatterns("/helloworld");

    return registration;
  }
}
