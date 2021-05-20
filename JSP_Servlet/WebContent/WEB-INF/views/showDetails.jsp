<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/class_works?useSSL=false";
String userid = "root";
String password = "123qwe";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>

<h1>BIDDING INFORMATION</h1>
<table border="1">
<tr>
<td>User ID</td>
<td>Item Name</td>
<td>User Name</td>
<td>Amount</td>
<td>Email</td>
<td>AUTO INCCREASE BIDDING AMOUNT?</td>
</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl, userid, password);
statement=connection.createStatement();
String sql ="SELECT * FROM bidding";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("USER_ID") %></td>
<td><%=resultSet.getString("ITEM_NAME") %></td>
<td><%=resultSet.getString("USER_NAME") %></td>
<td><%=resultSet.getString("AMOUNT") %></td>
<td><%=resultSet.getString("EMAIL") %></td>
<td><%=resultSet.getBoolean("AUTO_INC")?"YES":"NO" %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>