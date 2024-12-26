package day13.waitprogram.model.dto;

public class WaitingDto {
	private String phoneNumber;
	private int headCount;
	
	public WaitingDto() {}
	public WaitingDto(String phoneNumber, int headCount) {
		this.phoneNumber = phoneNumber;
		this.headCount = headCount;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public int getHeadCount() {
		return headCount;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setHeadCount(int headCount) {
		this.headCount = headCount;
	}
}
