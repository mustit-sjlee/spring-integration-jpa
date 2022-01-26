package com.example.springintegrationjpa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ImportResource

@SpringBootApplication
@ImportResource("spring-integration-context.xml")
class SpringIntegrationJpaApplication

fun main(args: Array<String>) {
	runApplication<SpringIntegrationJpaApplication>(*args)
}
