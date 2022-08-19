package aug19;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�Ӹ�,����,����� �ֽ��ϴ�. ������ 100�Դϴ�.
//������ �ϸ� ������ 1�� �پ��ϴ�.
class Medic{
	Medic(){}
	//�Ӹ��� ġ���ϸ�, �Ӹ��� ������ 100
	void recover(Unit u) {
		u.mana = 100;		
	}
//	void recover(Marine u) {
//		u.mana = 100;
//	}
//	//����� ġ���ϸ�, ������� ������ 100
//	void recover(Hydra u) {
//		u.mana = 100;
//	}
//	//������ ġ���ϸ�, ������ ������ 100
//	void recover(Zilet u) {
//		u.mana = 100;
//	}
}
class Unit {
	int mana = 100;
	void attack(Unit u) {
		u.mana -= 1;
	}
//	void attack(Hydra enemy) {
//		//��� �������. ���� -= 1;
//		enemy.mana -= 1;
//	}//��� ����� �����ϴ� �޼���
//	void attack(Marine enemy) {
//		//��� �Ӹ��� ���� -= 1;
//		enemy.mana -= 1;
//	}
//	void attack(Zilet enemy) {
//		enemy.mana -= 1;
//	}
}
class Hydra extends Unit{
	Hydra(){}
}
class Zilet extends Unit{
	Zilet(){}
}
class Marine extends Unit{
	Marine(){}
}

@WebServlet("/Aug19Study")
public class Aug19Study extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Marine m1 = new Marine();
		Hydra h1 = new Hydra();
		Zilet z1 = new Zilet();
		m1.attack(h1);//�Ӹ��� ����� ����
		m1.attack(h1);//�Ӹ��� ����� ����(�� �� ��)
		z1.attack(h1);//������ ����� ����
		h1.attack(m1);//����� �Ӹ� ����
		h1.attack(z1);//����� ���� ����
		//�Ӹ��� ����: 99
		//�����: 97
		//���� : 99
		System.out.println("���� ��");
		System.out.println("�Ӹ��� ����: "+m1.mana);
		System.out.println("������� ����: "+h1.mana);
		System.out.println("������ ����: "+z1.mana);
		Medic m = new Medic();
		m.recover(h1);
		m.recover(m1);
		m.recover(z1);
		System.out.println("\nġ�� ��");
		System.out.println("�Ӹ��� ����: "+m1.mana);
		System.out.println("������� ����: "+h1.mana);
		System.out.println("������ ����: "+z1.mana);
	}
	private static final long serialVersionUID = 1L;
       
   
    public Aug19Study() {
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
