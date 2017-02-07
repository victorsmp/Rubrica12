package rubrica12.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import rubrica12.connection.ConnectionH2;
import rubrica12.connection.ConnectionManager;

@org.springframework.stereotype.Repository
public class Repository {
	
	protected static final String jdbcUrl = "jdbc:h2:file:./src/main/resources/test";
	ConnectionManager manager = new ConnectionH2();
	
	protected void close(PreparedStatement prepareStatement) {
		try {
			prepareStatement.close();
		}catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
		
	protected void close(ResultSet resultSet) {
		try {
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
