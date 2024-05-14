package in.nk.tech.pg.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;

@RestController
public class MonitoringRestController {

	
	@Timed(value = "greetings.timer", description = "Time taken to process my API Endpoint")
	@GetMapping("/greet")
	public String msg() {
		return "Hi, welcome to Prometheus and Grafana Monitoring Course";
	}

	@GetMapping("/welcome")
	public String welcome() {
	
		return "Hi, welcome to Prometheus Metrics Types - Counter, Gauge, Summary, Histogram";
	}
}
