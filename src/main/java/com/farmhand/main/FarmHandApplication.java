package com.farmhand.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;

/**
* Starting point for main application.
*/
@SpringBootApplication
public class FarmHandApplication {

  @Bean
  public EmbeddedServletContainerCustomizer containerCustomizer() {
    return ((ConfigurableEmbeddedServletContainer containerCustomizer) ->  {


    });
  }

	public static void main(String[] args) {
		SpringApplication.run(FarmHandApplication.class, args);
	}
}
