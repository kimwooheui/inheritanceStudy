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
		System.out.println("고구려 민속놀이");
	}
}
class Shilla extends Goguryo{
	Shilla(){}
	int coal = 100;
	void shillaPlay() {
		System.out.println("신라 민속놀이");
	}
}
class Chosun extends Shilla {
	Chosun(){}
	int silver = 200;
	void chosunPlay() {
		System.out.println("신라 민속놀이");
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
		System.out.println(super.money);//조부모의 머니
		
	}
}
class Child extends Parents {
	Child(){}
	int money = 50;
	void display() {
		System.out.println(money);//차일드의 머니
		System.out.println(this.money);//자신을 의미. 차일드의 머니
		System.out.println(super.money);//부모의 머니(조부모 불가)
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
		c.display();//이름이 겹치면 자신의 변수가 우선 됨.
		c.show();//조부모 출력하고 싶으면 부모에서 설정해야 함
		
		
		/*
		 * Korea k = new Korea(); System.out.println(k.coal); k.shillaPlay();
		 */
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
