package aug24;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�Ǿ�� ���� �����Ѵ�.
//�� ����: ���� ������ ���� ���� �����Ѵ�.
//��ü ����? Ű�޶��(ȥ��) �������̽�?
//���� ������ ������ ��¥ ������ ������ �ʿ�.�� �ִϸ�Ŭ������ �޼��带 ���� �� �ȴ�.(�������̴ϱ�)
//
class Animal{
	Eatable eatable; Seeable seeable; Sleepable sleepable;
	void eat() { eatable.eat();}
	void see() { seeable.see();}
	void sleep() { sleepable.sleep();}
}
//��¥ ������ ��¥ ������ ���� -->�������̽��� ����
interface Eatable{//���氡���ϵ��� eat�޼����� ������ �и��Ѵ�(����?)
	void eat();
}
class RealMouth implements Eatable{
	@Override
	public void eat() {
		System.out.println("������ �Դ´�");
	}
	
}
class FakeMouth implements Eatable{
	@Override
	public void eat() {
		System.out.println("���� ���Ѵ�");		
	}
	
}
interface Seeable{//���� �����ϵ��� ������ �и��Ѵ�.
	void see();
}
class RealEye implements Seeable{
	@Override
	public void see() {
		System.out.println("������ ����");
	}
	
}
class FakeEye implements Seeable{
	@Override
	public void see() {
		System.out.println("���� ���Ѵ�");
	}
}
interface Sleepable{//���� �����ϵ��� ������ �и��Ѵ�.
	void sleep();
}
class RealSleep implements Sleepable{
	@Override
	public void sleep() {
		System.out.println("�ܴ�");
	}
}
class FakeSleep implements Sleepable{
	@Override
	public void sleep() {
		System.out.println("���ܴ�");
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
