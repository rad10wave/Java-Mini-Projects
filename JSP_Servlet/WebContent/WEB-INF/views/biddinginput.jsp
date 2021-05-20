<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to JP auction, enter your bid</h2>
      <form method="POST" action="<%= request.getContextPath()%>/bidding">
	      <label>Item ID</label>
	      <input type="text" value=""></input><br><br>
	      <label>Item Name</label>
	      <input type="text" name="ItemName" value=""></input><br><br>
	      <label>Your Name</label>
	      <input type="text"  value="" name="UserName"></input><br><br>
	      <label>Your Email Address</label>
	      <input type="text" name="Email" value=""></input><br><br>
	      <label>Amount Bid</label>
	      <input type="text" name="Amount" value=""></input><br><br>
	      <label>Auto Increment bid to match other bidders</label>
	      <input type="checkbox" name="CheckBidding" value="CheckBidding"></input><br><br>
	      <input type="submit" value="Submit"></input>
      </form>
    
</body>
</html>