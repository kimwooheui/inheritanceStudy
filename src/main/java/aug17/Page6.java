package aug17;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


class IamKing{
	String name;
	IamKing(String name){
		this.name = name;		//this.name은 String name을 의미함.
	}
}
class IamSon extends IamKing{
	IamSon(){
		super("아무런 문자"); //---> IamKing(String name);//
	}
}

@WebServlet("/Page6")
public class Page6 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IamSon s1 = new IamSon();
		IamKing k1 = new IamKing("a");
		IamKing k2 = new IamKing("korea");
		IamKing k3 = new IamKing("홍길동");
	}
	
	private static final long serialVersionUID = 1L;
       
   
    public Page6() {
        super();//HttpServlet();
        
    }

	
	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * }
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
