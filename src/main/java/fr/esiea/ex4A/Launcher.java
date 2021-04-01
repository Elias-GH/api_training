package fr.esiea.ex4A;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import retrofit2.Retrofit;
import fr.esiea.ex4A.ClientHTTP.AgifyClient;

@SpringBootApplication
public class Launcher {
	
	public static void main(String[] args) 
	{
        	SpringApplication.run(Launcher.class, args);
    	}

	  @Bean
    AgifyClient ApiAgify() {
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://agify.io")
            .build();

        return retrofit.create(AgifyClient.class);
    }
  
}    
