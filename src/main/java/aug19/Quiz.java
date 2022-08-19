package aug19;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
class M{
	int price = (int) (Math.random()*9)+1;
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

@WebServlet("/Quiz")
public class Quiz extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Yoshida y = new Yoshida();
		M mul = new Bag();
		y.sell(mul);
		//M mul = new Shose();
		y.sell(mul);
	//	M mul = new Clock();
		y.sell(mul);
		System.out.println();
		
	}
	private static final long serialVersionUID = 1L;
       

    public Quiz() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
