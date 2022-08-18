package aug18;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Human{
	int money =10000;
	void whoAmI() {
		System.out.println("나는 인간이다");	}
	
	void whoAreYou() {
		System.out.println("너는 누구냐?");}
}
class Gobayasi extends Human{
	int money = 6000; int euro = 100;
	void doIt() {System.out.println("나는 일을 해요");
	}
	void whoAreYou() {System.out.println("당신은 누구죠");}
}
class Danaka extends Human{
	int money = 5000; int dollar = 100;
	void doIt() {System.out.println("나는 일을 합니다");}
	void whoAmI() {System.out.println("나는 다나카다.");}
	
}




@WebServlet("/Page4")
public class Page4 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Human h = new Gobayasi();
		System.out.println(h.money);//10000
		//System.out.println(h.euro); //에러 보장
		h.whoAmI(); //조상
		h.whoAreYou();//오버라이드
		//h.doIt(); 에러 보장
		Human u = new Danaka();
		System.out.println(u.money);
		u.whoAmI();
		u.whoAreYou();
	}
	private static final long serialVersionUID = 1L;
       
    
    public Page4() {
        super();
 
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
