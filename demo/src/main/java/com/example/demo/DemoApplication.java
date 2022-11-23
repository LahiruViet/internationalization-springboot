package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
@Slf4j
@Setter
@Getter
public class DemoApplication implements MessageSourceAware, CommandLineRunner {

	@Autowired
	private MessageSource messageSource;

//	@Bean
//	public LocaleResolver localeResolver() {
//
//		FixedLocaleResolver sessionLocaleResolver = new FixedLocaleResolver();
//		sessionLocaleResolver.setDefaultLocale(Locale.JAPAN);
//		return sessionLocaleResolver;
//	}

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String message = messageSource.getMessage("E001", new Object[] {"1234"}, Locale.JAPAN);
		log.error("E001 {}", message);
	}

}
