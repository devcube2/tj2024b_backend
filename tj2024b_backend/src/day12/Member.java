package day12;

public class Member {	
	private String id;
	private String password;
	private String name;
	private boolean isManager;
	
	public Member(String id, String password, String name, boolean isManager) {
		setId(id);
		setPassword(password);
		setName(name);
		setIsManager(isManager);
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setIsManager(boolean isManager) {
		this.isManager = isManager;
	}
	public boolean isManager() {
		return isManager;
	}
}