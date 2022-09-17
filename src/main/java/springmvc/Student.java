package springmvc;

public class Student {

	private String firstname;
	private String	middlename;
	private String lastname;
	private String cources;
	private String phone;
	private String address;
	private String email;
	private String pass;
	
	@Override
	public String toString() {
		return "Student [firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname
				+ ", cources=" + cources + ", phone=" + phone + ", address=" + address + ", email=" + email + ", pass="
				+ pass + "]";
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCources() {
		return cources;
	}
	public void setCources(String cources) {
		this.cources = cources;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
