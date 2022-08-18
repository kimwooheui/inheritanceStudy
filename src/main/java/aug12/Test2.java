package aug12;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


class A{ 
	A(){System.out.println("A");}
}
class B extends A{ 
	B(){System.out.println("B");}
}
class C extends B{ 
	C(){System.out.println("C");}
}
class D extends C{ 
	D(){
		super();//C();�� ���ϴ� ����. �θ� �̸� �� �θ��� �ڽ� �ó� ����;;;;;
		//super�����ڶ�� �մϴ�.
		System.out.println("D");}
}
@WebServlet("/Test2")
public class Test2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		D d = new D();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
