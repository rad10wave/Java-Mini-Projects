package worksheet3_2.bidding.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import worksheet3_2.bidding.model.BiddingInfo;

public class Biddingdao {
	
	    public int BiddingInput(BiddingInfo b) throws ClassNotFoundException {
	        String INSERT_USERS_SQL = "INSERT INTO bidding" +
	            "  (user_id, item_name, user_name, email, amount, auto_inc) VALUES " +
	            " (?, ?, ?, ?, ?,?);";

	        int result = 0;

	        Class.forName("com.mysql.jdbc.Driver");

	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/class_works?useSSL=false", "root", "123qwe");

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
	            preparedStatement.setInt(1, 1);
	            preparedStatement.setString(2, b.getItemName());
	            preparedStatement.setString(3, b.getUserName());
	            preparedStatement.setString(4, b.getEmail());
	            preparedStatement.setString(5, b.getAmount());
	            preparedStatement.setBoolean(6, b.isCheckBidding());
	            

	            System.out.println(preparedStatement);
	            // Step 3: Execute the query or update query
	            result = preparedStatement.executeUpdate();

	        } catch (SQLException e) {
	            // process SQL exception
	            printSQLException(e);
	        }
	        result++;
	        return result;
	    }

	 
	    

	    private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
	}

