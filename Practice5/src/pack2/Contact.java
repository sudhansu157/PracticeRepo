package pack2;

import java.util.Date;

public class Contact {
	private String name;
	private String company;
	private String title;
	private String mobile;
	private String alternateMobile;
	private String email;
	private Date dateCreated;
	
	
	
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
