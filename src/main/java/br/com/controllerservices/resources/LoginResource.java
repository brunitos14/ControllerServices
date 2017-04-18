package br.com.controllerservices.resources;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.controllerservices.models.RuleType;
import br.com.controllerservices.models.User;
import br.com.controllerservices.repository.UserRepository;

@Component
@Path("/account")
public class LoginResource {

	public static final Logger logger = LoggerFactory.getLogger(LoginResource.class);

	@Autowired
    private UserRepository userRepository;

	@Path("{user}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getLogin(@PathParam("user") String email) {

		User user = userRepository.findByEmail(email);

		user.setListRules(new ArrayList<RuleType>());

		user.getListRules().add(user.getRules());

		return Response.ok(user).build();
	}



}
