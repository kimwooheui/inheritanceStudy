package aug24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//������ǰ ���忡�� ������(220v)�� �����(110v)�� �����Ѵ�.

class Product{
	Voltage v;
	void useVotage(){
		v.useVoltage();
	}
}//��ǰ

interface Voltage{
	void useVoltage();
}//������ ������ ����
class ForKorea implements Voltage{
	public void useVoltage() {
		System.out.println("220v");
	}
}
class ForUSA implements Voltage{
	public void useVoltage() {
		System.out.println("110v");		
	}
}
class ProductForKorea extends Product{
	ProductForKorea(){
		v= new ForKorea();
	}
}
class ProductForUSA extends Product{
	ProductForUSA(){
		v= new ForUSA();
	}
}
@WebServlet("/Aug24Study3")
public class Aug24Study3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductForKorea p1 = new ProductForKorea();
		ProductForKorea p2 = new ProductForKorea();
		p1.useVotage(); p2.useVotage();
		ProductForUSA p3 = new ProductForUSA();
		p3.useVotage();
	}
		private static final long serialVersionUID = 1L;
       

    public Aug24Study3() {
        super();
      
    }





	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
