package br.com.controllerservices;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import br.com.controllerservices.resources.TutorialResource;

@Component
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		register(TutorialResource.class);
	}

}
