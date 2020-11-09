package com.JAL.Batch;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BatchApplicationTests {

	@Autowired
	DataSource dataSource;
	
	@Test
	void contextLoads() throws SQLException {
		System.out.println("db:"+dataSource.getConnection());
	}

}
