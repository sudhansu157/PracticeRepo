package pack1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;




public class Contact {
private String name;
private String company;
private String title;
private String mobile;
private String alternateMobile;
private String email;
private Date dateCreated;

public static void main(String args[])throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter contact 1 detail:");
	String data=sc.nextLine();
	String a[]= data.split(",");
	Contact contact1 = new Contact(a[0],a[1],a[2],a[3],a[4],a[5],sdf.parse(a[6]));
	
	System.out.println("Enter contact 2 detail:");
	 data=sc.nextLine();
	 a= data.split(",");
	Contact contact2 = new Contact(a[0],a[1],a[2],a[3],a[4],a[5],sdf.parse(a[6]));
	
	
	System.out.println("Contact 1:"); 
	System.out.println(contact1);
	System.out.println("Contact 2:"); 
	System.out.println(contact2);
	if(contact1.equals(contact2))
		System.out.println("Contact 1 is same as Contact 2");
	else
		System.out.println("Contact 1 and contact 2 are different");
}


public boolean equals(Contact obj) {

	return this.name.equalsIgnoreCase(obj.name)&&
			this.mobile.equalsIgnoreCase(obj.mobile) &&
			this.email.equalsIgnoreCase(obj.email);
}
@Override
public String toString() {
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	return "Name:"+name+"\nCompany:"+company+"\nTitle:"+title+"\nMobile:"+mobile+"\nAlternateMobile:"
+alternateMobile+"\nEmail:"+email+"\nDateCreated:"+sdf.format(dateCreated);
}
public Contact() {
	super();
}
public Contact(String name, String company, String title, String mobile, String alternateMobile, String email,
		Date dateCreated) {
	super();
	this.name = name;
	this.company = company;
	this.title = title;
	this.mobile = mobile;
	this.alternateMobile = alternateMobile;
	this.email = email;
	this.dateCreated = dateCreated;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAlternateMobile() {
	return alternateMobile;
}
public void setAlternateMobile(String alternateMobile) {
	this.alternateMobile = alternateMobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getDateCreated() {
	return dateCreated;
}
public void setDateCreated(Date dateCreated) {
	this.dateCreated = dateCreated;
}


}
