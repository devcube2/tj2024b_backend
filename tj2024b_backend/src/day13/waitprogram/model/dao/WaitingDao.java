package day13.waitprogram.model.dao;

import day13.waitprogram.model.dto.WaitingDto;

public class WaitingDao {
	private WaitingDao() {}
	private static WaitingDao waitingDao = new WaitingDao();
	public static WaitingDao getInstance() {
		return waitingDao;
	}
	
	private WaitingDto[] reservedList = new WaitingDto[100];
	
	public boolean register(WaitingDto waitingDto) {
		for (int index = 0; index < reservedList.length; index++) {
			if (reservedList[index] == null) {
				reservedList[index] = waitingDto;
				return true;
			}
		}
		return false;
	}
	
	public WaitingDto[] getReservedList() {
		return reservedList;
	}
}
