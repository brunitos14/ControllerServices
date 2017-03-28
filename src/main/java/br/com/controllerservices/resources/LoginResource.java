package br.com.controllerservices.resources;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import br.com.controllerservices.models.Rule;
import br.com.controllerservices.models.User;
import br.com.controllerservices.services.LoginService;

@Component
@Path("/account")
public class LoginResource {
	
	@Inject
	private LoginService loginService;

//	@Path("/{user}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLogin() {
		final User tutorials = loginService.getUser("teste");
		
		List<Rule> listRule = tutorials.getRules();
		tutorials.setRules(listRule);
		Rule rule = new Rule();
		rule.setIdRuleType(1);
		rule.setName("ADMIN_GROUP");
		
		tutorials.getRules().add(rule);
		

		return Response.ok(tutorials).build();
	}
	
}
