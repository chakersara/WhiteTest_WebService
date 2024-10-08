package de.tekup.loan.invoke.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

//Sarra Chaker GLSI-B && Chaima Arfaoui GLSI-A

@Configuration
public class SoapConfig {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		
		marshaller.setPackagesToScan("de.tekup.loan.soap.api.consume.whitetest");
		return marshaller;
	}

}
