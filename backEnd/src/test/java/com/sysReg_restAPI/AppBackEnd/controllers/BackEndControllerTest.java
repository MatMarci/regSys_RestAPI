package com.sysReg_restAPI.AppBackEnd.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.sysReg_restAPI.AppBackEnd.controllers.BackEndController;

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
	
