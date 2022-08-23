package aug23;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//페가수스 객체설계(날개가 있는 말: 새특징 + 말특징)
//새의 특징과 말의 특징을 각각 interface로 설계
interface Birdd{
	void fly();//새의 비행 메서드(추상)
}//새의 특징을 가진 객체(인터페이스)상수랬지?
class Sparrow implements Birdd{
	@Override
	public void fly() {
		System.out.println("날개를 빨리 움직여 난다");
	}
}
class Eagle implements Birdd{
	@Override
	public void fly() {
		System.out.println("천천히 멋있게 난다");
	}
}

interface Horse{
	void run();//말의 주행 메서드(추상) 그런데 어디서 상속받냐.페가수스가 오버라이드한다?
}//말의 특징을 가진 객체

@WebServlet("/Aug23Study2")
public class Aug23Study2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private static final long serialVersionUID = 1L;
       

    public Aug23Study2() {
        super();
      
    }

	


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
