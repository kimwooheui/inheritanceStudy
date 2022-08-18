package aug18;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//삼각형, 사각형, 원의 면적을 계산합니다.
//클래스를 찾는다.(SRP의 원칙)
abstract class Dohyung{
	double size = 0;
	abstract void size(); //면적을 계산하는 메서드
}//모든 도형 클래스의 조상

class Triangle extends Dohyung {//가로*세로/2
	int width = 10; int height = 20;
	//double size = 0;//조상으로 올라가서 삭제함
	Triangle(){}
	void size() {
		size = width * height / 2.0;
	}//면적계산을 하는 메서드
	
}
class Rectangle extends Dohyung {//가로*세로
	int width = 5; int height = 15;
	//double size = 0;
	Rectangle(){}
	void size() {
	size = width * height;}		
}
class Circle extends Dohyung {//반지름*반지름*원주율
	int res = 8;
	//double size = 0;
	Circle(){}
	void size() {
		size = res * 3.141592;}		
}


@WebServlet("/Aug18Study")
public class Aug18Study extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dohyung s = new Triangle();//다형성
		s.size();//Triangle위 메서드
		System.out.println("삼각형 면적: "+s.size);
		s = new Circle();//다형성
		s.size();//Circle의 메서드
		System.out.println("원의 면적: "+s.size);
		s = new Rectangle();//다형성
		s.size();//Rectangle의 메서드
		System.out.println("사각형 면적: "+s.size);
		
		/*
		 * Circle c = new Circle(); c.size(); System.out.println("원의 면적: "+c.size);
		 * Rectangle r = new Rectangle(); r.size();
		 * System.out.println("사각형 면적: "+r.size); 
		 * Triangle t = new Triangle(); t.size();
		 * System.out.println("삼각형 면적: "+t.size);
		 */
	
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Aug18Study() {
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
