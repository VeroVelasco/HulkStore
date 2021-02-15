package com.ec.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec.core.entity.RestResponse;
import com.ec.core.entity.User;
import com.ec.core.service.IUserService;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/userManagement")
@ApiResponses(value = { @ApiResponse(code = 200, message = "true"),
		@ApiResponse(code = 404, message = "The resource not found") })
public class UserManagementController {

	private final IUserService userService;

	@Autowired
	public UserManagementController(IUserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/getUserByUserNameAndPassword/{userName}/{password}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public RestResponse getUserByUserNameAndPassword(@PathVariable("userName") String userName,@PathVariable("password") String password ) {
		User user = null;
		try {
			user = this.userService.getActiveUserByUserNameAndPassword(userName, password);
		} catch (Exception e) {
			return new RestResponse(null, true, "Error obtaining user: " + e.getMessage());
		}
		return new RestResponse(user, false, null);
	}

}
