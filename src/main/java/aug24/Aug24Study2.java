package aug24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//악어와 개를 설계한다.
//새 문제: 모형 오리와 모형 말을 설계한다.
//대체 뭐지? 키메라몬(혼종) 인터페이스?
//문제 취지는 모형과 진짜 동물의 구분이 필요.즉 애니멀클래스의 메서드를 쓰면 안 된다.(동물용이니까)
//
class Animal{
	Eatable eatable; Seeable seeable; Sleepable sleepable;
	void eat() { eatable.eat();}
	void see() { seeable.see();}
	void sleep() { sleepable.sleep();}
}
//진짜 동물과 가짜 동물의 차이 -->인터페이스로 설계
interface Eatable{//변경가능하도록 eat메서드의 행위를 분리한다(나니?)
	void eat();
}
class RealMouth implements Eatable{
	@Override
	public void eat() {
		System.out.println("입으로 먹는다");
	}
	
}
class FakeMouth implements Eatable{
	@Override
	public void eat() {
		System.out.println("먹지 못한다");		
	}
	
}
interface Seeable{//변경 가능하도록 행위를 분리한다.
	void see();
}
class RealEye implements Seeable{
	@Override
	public void see() {
		System.out.println("눈으로 본다");
	}
	
}
class FakeEye implements Seeable{
	@Override
	public void see() {
		System.out.println("보지 못한다");
	}
}
interface Sleepable{//변경 가능하도록 행위를 분리한다.
	void sleep();
}
class RealSleep implements Sleepable{
	@Override
	public void sleep() {
		System.out.println("잔다");
	}
}
class FakeSleep implements Sleepable{
	@Override
	public void sleep() {
		System.out.println("못잔다");
	}
}
class DuckDoll extends Animal{
	DuckDoll() {
		eatable = new FakeMouth();
		seeable = new FakeEye();
		sleepable = new FakeSleep();
	}
}
class HorseDoll extends Animal{
	HorseDoll() {
		eatable = new FakeMouth();
		seeable = new FakeEye();
		sleepable = new FakeSleep();
	}
}
class Allegater extends Animal{
	Allegater() {
		eatable = new RealMouth();
		seeable = new RealEye();
		sleepable = new RealSleep();
	}
}
class Cat extends Animal{
	Cat(){
		eatable = new RealMouth();
		seeable = new RealEye();
		sleepable = new RealSleep();
	}
}
class Dog extends Animal{
	Dog(){
		eatable = new RealMouth();
		seeable = new RealEye();
		sleepable = new RealSleep();
	}	
}

@WebServlet("/Aug24Study2")
public class Aug24Study2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Allegater a =  new Allegater();
		a.eat(); a.see(); a.sleep();
		Dog d = new Dog();
		d.eat(); d.see(); d.sleep();
		Cat c = new Cat();
		c.eat(); c.see(); c.sleep();
		DuckDoll dd = new DuckDoll();
		dd.eat(); dd.see(); dd.sleep();
		HorseDoll hd = new HorseDoll();
		hd.eat(); hd.see();
	}
		private static final long serialVersionUID = 1L;
       

    public Aug24Study2() {
        super();
        
    }




	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
