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
		System.out.println("��Ÿ�ÿ� ����.");
	}
	
}
class IamChild extends IamParents{
	@Override //�ҽ��޴�-�߰��� �������̵� Ŭ��
	void callMe() {
		System.out.println("���� �ڽ�.");
	}

	IamChild(){}
	int money = 100;
	//void callMe() {System.out.println("���� �ڽ�.");}
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
			c.show();//���ϵ��� show�� �ҷ���
			c.callMe();//�������̵� ������ �θ��� �Լ� ���빰�� �׾ �� �ҷ���.
		
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
