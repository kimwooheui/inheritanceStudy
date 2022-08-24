package aug24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//게임에 등장하는 영웅(왕,기사,마법사)
//왕(King/무기: Axe)

abstract class Hero{
	Weapon w;//변수임. 즉 인터페이스를 만드는 조건이 안 됨.
	void fight() {
		whoAmI();
		w.use();	}
	abstract void whoAmI();
}
class Quin extends Hero{
	Quin(){w=new Bow();}
	void whoAmI() {
		System.out.println("나는 왕비다");		
	}
}
class King extends Hero{
	King(){w = new Axe();}
//	void fight() {
//		whoAmI();
//		w.use();
//	}
	void whoAmI() {
		System.out.println("나는 왕이다");
	}
}
//기사(Knight/무기 Sword)
class Knight extends Hero{
	Knight(){
		w = new Sword();
	}
	void whoAmI() {
		System.out.println("나는 기사다");
	}
//	void fight() {
//		whoAmI();
//		w.use();		
//	}
	
}
//마법사(Magician/무기: Spear)
//영웅이 사용하는 무기(도끼(Axe), 칼(Sword),창(Spear))
class Magician extends Hero{
	Magician(){ w = new Spear();	}
	//Weapon w;
	void whoAmI() {
		System.out.println("나는 법사다");
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
		System.out.println("활을 사용");	
	}
	
}
class Axe implements Weapon{
	Axe(){}
	public void use() {
		System.out.println("도끼를 사용");
	}
}
class Sword implements Weapon{
	Sword(){}
	public void use() {
		System.out.println("칼을 사용");
	}
}
class Spear implements Weapon{
	Spear(){}
	public void use() {
		System.out.println("창을 사용");
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
