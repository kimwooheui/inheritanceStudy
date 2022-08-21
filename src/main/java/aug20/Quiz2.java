package aug20;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*자바백화점이 있습니다.
자바백화점에 가방이 있습니다. 가방의 가격은 난수(5~10)
자바백화점에 신발이 있습니다. 신발의 가격은 난수(5~10)
자바백화점에 시계가 있습니다. 시계의 가격은 난수(5~10)
자바백화점에 요시다 판매원이 있습니다.
요시다가 가방을 팔았습니다.
요시다가 신발을 팔았습니다.
요시다가 시계를 팔았습니다.
요시다가 판매한 모든 물품의 합을 출력합니다.*/

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
			System.out.println("가방"+mul.price);
		y.sell(mul);
			System.out.println("가격합계"+y.sum);
			
		mul = new Shose();
			System.out.println("신발"+mul.price);
		y.sell(mul);
			System.out.println("가격합계"+y.sum);
	
		mul = new Clock();
			System.out.println("시계"+mul.price);
		y.sell(mul);
			System.out.println("가격합계"+y.sum);
		
	
		
	}
	private static final long serialVersionUID = 1L;
       
 
    public Quiz2() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
