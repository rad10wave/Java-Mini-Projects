package worksheet3_2.bidding.model;

public class BiddingInfo {
private int ItemId;
private String ItemName;
private String UserName;
private String Amount;
private String Email;
private boolean CheckBidding;
	public boolean isCheckBidding() {
	return CheckBidding;
}
public void setCheckBidding(boolean checkBidding) {
	CheckBidding = checkBidding;
}
	public int getItemId() {
	return ItemId;
}
public void setItemId(int itemId) {
	ItemId = itemId;
}
public String getItemName() {
	return ItemName;
}
public void setItemName(String itemName) {
	ItemName = itemName;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getAmount() {
	return Amount;
}
public void setAmount(String amount) {
	Amount = amount;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
	

}
