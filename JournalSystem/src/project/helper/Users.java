package project.helper;

public class Users {
	
	private int id;
	private String last_name;
	private String first_name;
	private String email;
	private String user_type;
	private String username;
	private String password;
	
	
	public Users(int id, String last_name, String first_name, String email, String user_type, String username, String password) {
		super();
		this.id = id;
		this.last_name = last_name;
		this.first_name = first_name;
		this.email = email;
		this.user_type = user_type;
		this.username = username;
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUser_type() {
		return user_type;
	}


	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return String
				.format("User [id=%s, last_name=%s, first_name=%s, email=%s, user_type=%s, username=%s, password=%s]", id, last_name, first_name, email, user_type, username, password);
	}
	
	
	
	
}
