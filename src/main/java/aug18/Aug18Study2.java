package aug18;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//TV, ��ǻ��, ����� �ֽ��ϴ�. ������ �ֽ��ϴ�.
//����Ű�� �뵷�� �鸸�� ���� �ִ�.
//����Ű�� �뵷���� TV, ��, �����(10��, 30��, 20��)�� ������
//����Ű�� ���� �뵷 �ܾ��� ����մϴ�.(40���� ���)
//����: ����Ű�� �뵷 - ��ǰ�� ����

class Suzuki {
	int pocketMoney = 1000000;
	void buy(Item a) {
		pocketMoney = pocketMoney - a.price;
	}//�ּ����� �ξ� ����ȭ ��. �̰� �ڵ�����.
	
//	 void buy(TV a) { pocketMoney -= a.price; } 
//	 void buy(Computer a) { pocketMoney -= a.price; } 
//	 void buy(Ref a) { pocketMoney -= a.price; } 
	 Suzuki(){}
	
}

class Item {
	int price;

	Item() {
	}
}

class TV extends Item {
	TV() {
		price = 100000;
	}
}

class Computer extends Item {
	Computer() {
		price = 300000;
	}
}

class Ref extends Item {
	Ref() {
		price = 200000;
	}
}

@WebServlet("/Aug18Study2")
public class Aug18Study2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		TV tv = new TV();
		Computer com = new Computer();
		Ref rf = new Ref();
		Suzuki su = new Suzuki();
		System.out.println("����Ű �뵷: " + su.pocketMoney + "(���� ��)");
		su.buy(tv);
		su.buy(com);
		su.buy(rf);
		System.out.println("����Ű �뵷: " + su.pocketMoney + "(���� ��)");

	}

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Aug18Study2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
