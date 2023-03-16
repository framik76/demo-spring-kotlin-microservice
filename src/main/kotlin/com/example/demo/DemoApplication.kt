package com.example.demo

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.core.io.ClassPathResource


@SpringBootApplication
class DemoApplication

@Bean
fun placeholderConfigurer(): PropertySourcesPlaceholderConfigurer? {
	val propsConfig = PropertySourcesPlaceholderConfigurer()
	propsConfig.setLocation(ClassPathResource("git.properties"))
	propsConfig.setIgnoreResourceNotFound(true)
	propsConfig.setIgnoreUnresolvablePlaceholders(true)
	return propsConfig
}

@Bean
fun kotlinPropertyConfigurer() = PropertySourcesPlaceholderConfigurer().apply {
	setPlaceholderPrefix("%{")
	setIgnoreUnresolvablePlaceholders(true)
}

@Bean
fun defaultPropertyConfigurer() = PropertySourcesPlaceholderConfigurer()

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
