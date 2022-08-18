package aug18;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�ﰢ��, �簢��, ���� ������ ����մϴ�.
//Ŭ������ ã�´�.(SRP�� ��Ģ)
abstract class Dohyung{
	double size = 0;
	abstract void size(); //������ ����ϴ� �޼���
}//��� ���� Ŭ������ ����

class Triangle extends Dohyung {//����*����/2
	int width = 10; int height = 20;
	//double size = 0;//�������� �ö󰡼� ������
	Triangle(){}
	void size() {
		size = width * height / 2.0;
	}//��������� �ϴ� �޼���
	
}
class Rectangle extends Dohyung {//����*����
	int width = 5; int height = 15;
	//double size = 0;
	Rectangle(){}
	void size() {
	size = width * height;}		
}
class Circle extends Dohyung {//������*������*������
	int res = 8;
	//double size = 0;
	Circle(){}
	void size() {
		size = res * 3.141592;}		
}


@WebServlet("/Aug18Study")
public class Aug18Study extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dohyung s = new Triangle();//������
		s.size();//Triangle�� �޼���
		System.out.println("�ﰢ�� ����: "+s.size);
		s = new Circle();//������
		s.size();//Circle�� �޼���
		System.out.println("���� ����: "+s.size);
		s = new Rectangle();//������
		s.size();//Rectangle�� �޼���
		System.out.println("�簢�� ����: "+s.size);
		
		/*
		 * Circle c = new Circle(); c.size(); System.out.println("���� ����: "+c.size);
		 * Rectangle r = new Rectangle(); r.size();
		 * System.out.println("�簢�� ����: "+r.size); 
		 * Triangle t = new Triangle(); t.size();
		 * System.out.println("�ﰢ�� ����: "+t.size);
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
