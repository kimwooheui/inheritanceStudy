package aug12;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Goguryo{
	Goguryo(){}
	int gold = 100;
	void goguryoPlay() {
		System.out.println("���� �μӳ���");
	}
}
class Shilla extends Goguryo{
	Shilla(){}
	int coal = 100;
	void shillaPlay() {
		System.out.println("�Ŷ� �μӳ���");
	}
}
class Chosun extends Shilla {
	Chosun(){}
	int silver = 200;
	void chosunPlay() {
		System.out.println("�Ŷ� �μӳ���");
	}
}
class Korea extends Chosun {
	Korea(){}

}
class GrandParents {
	GrandParents(){}
	int money = 5000;
}
class Parents extends GrandParents{
	Parents(){}
	int money = 1000;
	void show() {
		System.out.println(super.money);//���θ��� �Ӵ�
		
	}
}
class Child extends Parents {
	Child(){}
	int money = 50;
	void display() {
		System.out.println(money);//���ϵ��� �Ӵ�
		System.out.println(this.money);//�ڽ��� �ǹ�. ���ϵ��� �Ӵ�
		System.out.println(super.money);//�θ��� �Ӵ�(���θ� �Ұ�)
	}
}
@WebServlet("/Test1")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Test1() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Child c = new Child();
		c.display();//�̸��� ��ġ�� �ڽ��� ������ �켱 ��.
		c.show();//���θ� ����ϰ� ������ �θ𿡼� �����ؾ� ��
		
		
		/*
		 * Korea k = new Korea(); System.out.println(k.coal); k.shillaPlay();
		 */
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
