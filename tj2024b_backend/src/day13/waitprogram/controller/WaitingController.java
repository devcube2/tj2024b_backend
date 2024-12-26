package day13.waitprogram.controller;

import day13.waitprogram.model.dao.WaitingDao;
import day13.waitprogram.model.dto.WaitingDto;

public class WaitingController {
	private WaitingController() {}
	private static WaitingController waitController = new WaitingController();
	public static WaitingController getInstance() {
		return waitController;
	}
	
	public boolean register(WaitingDto waitingDto) {
		return WaitingDao.getInstance().register(waitingDto);
	}
	
	public WaitingDto[] getReservedList() {
		return WaitingDao.getInstance().getReservedList();
	}
}
