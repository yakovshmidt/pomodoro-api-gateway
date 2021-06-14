package kz.home.pomodoroapigateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class PomodoroApiGatewayApplication

fun main(args: Array<String>) {
	runApplication<PomodoroApiGatewayApplication>(*args)
}
