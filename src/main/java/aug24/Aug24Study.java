package aug24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//���ӿ� �����ϴ� ����(��,���,������)
//��(King/����: Axe)

abstract class Hero{
	Weapon w;//������. �� �������̽��� ����� ������ �� ��.
	void fight() {
		whoAmI();
		w.use();	}
	abstract void whoAmI();
}
class Quin extends Hero{
	Quin(){w=new Bow();}
	void whoAmI() {
		System.out.println("���� �պ��");		
	}
}
class King extends Hero{
	King(){w = new Axe();}
//	void fight() {
//		whoAmI();
//		w.use();
//	}
	void whoAmI() {
		System.out.println("���� ���̴�");
	}
}
//���(Knight/���� Sword)
class Knight extends Hero{
	Knight(){
		w = new Sword();
	}
	void whoAmI() {
		System.out.println("���� ����");
	}
//	void fight() {
//		whoAmI();
//		w.use();		
//	}
	
}
//������(Magician/����: Spear)
//������ ����ϴ� ����(����(Axe), Į(Sword),â(Spear))
class Magician extends Hero{
	Magician(){ w = new Spear();	}
	//Weapon w;
	void whoAmI() {
		System.out.println("���� �����");
	}
//	void fight() {
//		whoAmI();
//		w.use();
//	}
}

interface Weapon {
	void use();
}
class Bow implements Weapon{

	@Override
	public void use() {
		System.out.println("Ȱ�� ���");	
	}
	
}
class Axe implements Weapon{
	Axe(){}
	public void use() {
		System.out.println("������ ���");
	}
}
class Sword implements Weapon{
	Sword(){}
	public void use() {
		System.out.println("Į�� ���");
	}
}
class Spear implements Weapon{
	Spear(){}
	public void use() {
		System.out.println("â�� ���");
	}
}

@WebServlet("/Aug24Study")
public class Aug24Study extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		King king = new King();
		king.fight();
		Knight knight = new Knight();
		knight.fight();
		Magician magician = new Magician();
		magician.fight();
	}
	private static final long serialVersionUID = 1L;
       

    public Aug24Study() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
