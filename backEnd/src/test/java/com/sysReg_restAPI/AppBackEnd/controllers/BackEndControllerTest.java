package com.sysReg_restAPI.AppBackEnd.controllers;

import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import com.sysReg_restAPI.AppBackEnd.SpringBootVuejsApplication;
import com.sysReg_restAPI.AppBackEnd.controllers.BackEndController;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
	@SpringBootTest(
			classes = SpringBootVuejsApplication.class,
			webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
	)
	public class BackEndControllerTest {
	 
		@LocalServerPort
		private int port;
	 
		@Test
		public void saysHello() {
			when()
				.get("http://localhost:" + port + "/api/hello")
			.then()
				.statusCode(HttpStatus.SC_OK)
				.assertThat()
					.body(is(equalTo(BackEndController.HELLO_TEXT)));
		}
	}
	
