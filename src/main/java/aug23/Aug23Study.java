package aug23;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



class Tiger{
	Tiger(){	}
	int age = 10;
	void doIt() {
		System.out.println("Tiger");
	}
}
class Lion{
	Lion(){}
	static int age = 10;
	static void doIt() {
		System.out.println("Lion");
	}
	
}
interface Bird{
	int SPEED = 100;// static과 final이 생략돼있다.
	void fly();//인터페이스(=상속전용) 몸통안붙이고 추상메서드만.
}
interface Fish{
	int SPEED = 50;
	void whim();
}
interface Animal extends Bird,Fish{
	
}

class Somebody implements Bird,Fish{

	@Override
	public void whim() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}

class Cat{
	final int SPEED = 100;
}
@WebServlet("/Aug23Study")
public class Aug23Study extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int x= Bird.SPEED;
		
		Tiger t = new Tiger();//인스턴스 생성
		int a = t.age;	t.doIt();
		Tiger t2 = new Tiger();//인스턴스 생성
		Tiger t3 = new Tiger();//인스턴스 생성
		
		
		int b = Lion.age;	Lion.doIt();
		
	
	}
	private static final long serialVersionUID = 1L;
       

    public Aug23Study() {
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
