package com.luhuiguo.archetype.config;

import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Collections;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by luhuiguo on 2017/4/28.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

  @Bean
  ErrorViewResolver supportPathBasedLocationStrategyWithoutHashes() {
    return (HttpServletRequest request, HttpStatus status, Map<String, Object> model) -> status == HttpStatus.NOT_FOUND
      ? new ModelAndView("index.html", Collections.emptyMap(), HttpStatus.OK)
      : null;
  }


}

