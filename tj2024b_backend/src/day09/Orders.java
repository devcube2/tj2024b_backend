package day09;

public class Orders {
	Order[] orders;
	int maxCount;
	int count;

	Orders(int 최대주문갯수) {
		count = 0;
		orders = new Order[최대주문갯수];
		maxCount = 최대주문갯수;
	}

	String addOrder(String 전화번호, int 인원수) {
		if (count >= maxCount) {
			return "예약이 가득 찼습니다. 예약 실패입니다.";
		}
		Order order = new Order();
		order.전화번호 = 전화번호;
		order.인원수 = 인원수;
		orders[count] = order;
		count++;
		return "예약되었습니다.";
	}

	void printOrder() {
		for (int i = 0; i < maxCount; i++) {
			if (orders[i] != null) {
				System.out.printf("전화번호 : %s 인원수 : %d\n", orders[i].전화번호, orders[i].인원수);
			}
		}
	}
}