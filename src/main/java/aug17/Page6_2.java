package aug17;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Naya{
	String amugona;
	int amugona2;
	Naya(String amugona){
		this.amugona = amugona;	}
	Naya(int amugona2){
		this.amugona2 = amugona2; }
	
}
class Nugu extends Naya{
	Nugu(String munja){
		super(munja);//오버로딩
		
	}
	Nugu(int a){
		super(a);//오버로딩이라고 한다.
		
	}

}

@WebServlet("/Page6_2")
public class Page6_2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Nugu ng1 = new Nugu("문자생성");
			Nugu ng2 = new Nugu(999);
			Naya ny1 = new Naya("깃허브 새로 팜");
			Naya ny2 = new Naya(4567);
			System.out.println("ny1출력: "+ny1.amugona+", ng1출력: "+ng1.amugona+" 성공"+", ng2출력: "+ng2.amugona2+" 성공");
															//amugona1 , amugona2 쓰는 거 귀찮은데;;;;
			response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Page6_2() {
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
