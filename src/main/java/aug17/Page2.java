package aug17;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



class IamParents{
	IamParents(){}
	int money = 200;
	void callMe() {
		System.out.println("와타시와 파파.");
	}
	
}
class IamChild extends IamParents{
	@Override //소스메뉴-중간쯤 오버라이드 클릭
	void callMe() {
		System.out.println("나는 자식.");
	}

	IamChild(){}
	int money = 100;
	//void callMe() {System.out.println("나는 자식.");}
	void show() {
		System.out.println(this.money+", "+super.money);
	}
	
}
class Tiger{
	
}
class Cat extends Tiger{
	
}
class Dog extends Tiger{
	
}

@WebServlet("/Page2")
public class Page2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Tiger t= new Tiger();
		Tiger _c= new Cat();
		Tiger d= new Dog();
		
		
		IamChild c = new IamChild();
			c.show();//차일드의 show를 불러옴
			c.callMe();//오버라이딩 때문에 부모의 함수 내용물은 죽어도 못 불러옴.
		
		/*
		 * // TODO Auto-generated method stub
		 * response.getWriter().append("Served at: ").append(request.getContextPath());
		 */
	}
   
	private static final long serialVersionUID = 1L;
    public Page2() {
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
