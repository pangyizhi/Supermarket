package com.icss.Supermarket.Customer_Login.domain;

public class Customer {
private String UserID;
private String UserName;
private String Password;
private String Sex;
private String Phone;
private String Address;
private String position;
    

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}


public Customer(String userID, String userName, String password, String sex, String phone, String address,
		String position) {
	super();
	UserID = userID;
	UserName = userName;
	Password = password;
	Sex = sex;
	Phone = phone;
	Address = address;
	this.position = position;
}


public String getUserID() {
	return UserID;
}


public void setUserID(String userID) {
	UserID = userID;
}


public String getUserName() {
	return UserName;
}


public void setUserName(String userName) {
	UserName = userName;
}


public String getPassword() {
	return Password;
}


public void setPassword(String password) {
	Password = password;
}


public String getSex() {
	return Sex;
}


public void setSex(String sex) {
	Sex = sex;
}


public String getPhone() {
	return Phone;
}


public void setPhone(String phone) {
	Phone = phone;
}


public String getAddress() {
	return Address;
}


public void setAddress(String address) {
	Address = address;
}


public String getPosition() {
	return position;
}


public void setPosition(String position) {
	this.position = position;
}


@Override
public String toString() {
	return "Customer [UserID=" + UserID + ", UserName=" + UserName + ", Password=" + Password + ", Sex=" + Sex
			+ ", Phone=" + Phone + ", Address=" + Address + ", position=" + position + "]";
}















}