package aug20;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*�ڹٹ�ȭ���� �ֽ��ϴ�.
�ڹٹ�ȭ���� ������ �ֽ��ϴ�. ������ ������ ����(5~10)
�ڹٹ�ȭ���� �Ź��� �ֽ��ϴ�. �Ź��� ������ ����(5~10)
�ڹٹ�ȭ���� �ð谡 �ֽ��ϴ�. �ð��� ������ ����(5~10)
�ڹٹ�ȭ���� ��ô� �Ǹſ��� �ֽ��ϴ�.
��ôٰ� ������ �Ⱦҽ��ϴ�.
��ôٰ� �Ź��� �Ⱦҽ��ϴ�.
��ôٰ� �ð踦 �Ⱦҽ��ϴ�.
��ôٰ� �Ǹ��� ��� ��ǰ�� ���� ����մϴ�.*/

class M{
	int price = (int) (Math.random()*9)+5;
}
class Yoshida{
	int sum = 0;
	void sell(M m) {
		sum += m.price;
	}
}
class Bag extends M {
	Bag(){}
}
class Shose extends M {
	Shose(){}
}
class Clock extends M {
	Clock(){}
}


@WebServlet("/Quiz2")
public class Quiz2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Yoshida y = new Yoshida();
		M mul = new Bag();
			System.out.println("����"+mul.price);
		y.sell(mul);
			System.out.println("�����հ�"+y.sum);
			
		mul = new Shose();
			System.out.println("�Ź�"+mul.price);
		y.sell(mul);
			System.out.println("�����հ�"+y.sum);
	
		mul = new Clock();
			System.out.println("�ð�"+mul.price);
		y.sell(mul);
			System.out.println("�����հ�"+y.sum);
		
	
		
	}
	private static final long serialVersionUID = 1L;
       
 
    public Quiz2() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
