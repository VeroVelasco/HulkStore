package com.ec.core.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec.core.entity.RestResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/test")
@Api(value = "Test", description = "Rest API for Test operations", tags = "Test API")
@ApiResponses(value = { @ApiResponse(code = 200, message = "true"),
@ApiResponse(code = 404, message = "The resource not found") })
public class TestController {


	@ApiOperation(value = "Hello world")
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public RestResponse testMethod() {
		return new RestResponse("it Works!", false, null);
	}

	

}
