package pl.kubik.itaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.kubik.itaka.repository.HotelRepository;

@SpringBootApplication
public class ItakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItakaApplication.class, args);
	}

}
