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
		super(munja);//�����ε�
		
	}
	Nugu(int a){
		super(a);//�����ε��̶�� �Ѵ�.
		
	}

}

@WebServlet("/Page6_2")
public class Page6_2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Nugu ng1 = new Nugu("���ڻ���");
			Nugu ng2 = new Nugu(999);
			Naya ny1 = new Naya("����� ���� ��");
			Naya ny2 = new Naya(4567);
			System.out.println("ny1���: "+ny1.amugona+", ng1���: "+ng1.amugona+" ����"+", ng2���: "+ng2.amugona2+" ����");
															//amugona1 , amugona2 ���� �� ��������;;;;
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
