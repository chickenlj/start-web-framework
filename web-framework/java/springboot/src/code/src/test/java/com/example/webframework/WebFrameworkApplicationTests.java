package com.example.webframework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;
import org.springframework.http.HttpHeaders;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebFrameworkApplicationTests {

	@Test
	public void testWelcome() {
		Map<String, String> query = new HashMap<>();
		assertEquals(HttpStatus.OK, new WebFrameworkApplication().welcome(new HttpHeaders(), query).getStatusCode());
	}

}
