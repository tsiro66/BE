package com.masterDetail.BE;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

@SpringBootTest
class BeApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	public void testConnection() {
		try (Connection connection = dataSource.getConnection()) {
			System.out.println("Connected to the database!");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Failed to connect to the database!");
		}
	}
}