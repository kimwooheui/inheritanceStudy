package aug18;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//TV, 컴퓨터, 냉장고가 있습니다. 가격이 있습니다.
//스즈키가 용돈을 백만원 갖고 있다.
//스즈키가 용돈으로 TV, 컴, 냉장고(10만, 30만, 20만)를 구매함
//스즈키의 남은 용돈 잔액을 출력합니다.(40만원 출력)
//구매: 스즈키의 용돈 - 상품의 가격

class Suzuki{
	void buy(TV a) {
		pocketMoney -= a.price;
	}
	void buy(Computer b) {
		pocketMoney -= b.price;
	}
	void buy(Ref c)  {
		pocketMoney -= c.price;
	}
	int pocketMoney = 1000000;
	Suzuki(){}
}
class Item{
	int price;
	Item(){}
}
class TV extends Item{
	TV(){
		int price = 100000; 		
	}
}
class Computer extends Item{
	Computer(){
		int price = 300000; 		
	}
}
class Ref extends Item{
	Ref(){
		int price = 200000; 		
	}
}



@WebServlet("/Aug18Study2")
public class Aug18Study2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			TV tv = new TV();
			Computer com = new Computer();
			Ref rf = new Ref();
			Suzuki su = new Suzuki();
			System.out.println("스즈키 용돈: "+su.pocketMoney+"(구매 전)");
			su.buy(tv);
			su.buy(com);
			su.buy(rf);
			System.out.println("스즈키 용돈: "+su.pocketMoney+"(구매 후)");
	
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
