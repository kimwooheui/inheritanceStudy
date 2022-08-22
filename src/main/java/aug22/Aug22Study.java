package aug22;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//자바 백화점이 있습니다. 가전매장과 과일매장이 있습니다.
class JavaDepartmentStore {
	JavaDepartmentStore(){
		em = new ElectroMart();
		fm = new FruitMart();
		}
	Mart em;	//비포 ElectroMart em;
	Mart fm;	//비포 FruitMart fm;
	
	
	}
abstract class Mart{
	Product item1;
	Product item2;
}
class ElectroMart extends Mart{
	ElectroMart(){
		item1 = new TV(300000, "티비");
		item2 = new Ref();
	}
	//Product tv; //TV tv; 였는데 상속덕에 프로덕트로 바꿀 수 있음^^
	//Product ref;//는 프로덕트도 마트 클래스로 상위보냄
}
class FruitMart extends Mart{
	FruitMart(){
		item1 = new Strawberry();
		item2 = new Banana();
		}
}
abstract class Product{
	int price;
}
class Strawberry extends Product{
	Strawberry(){price = 10000;}
	//int price; 없애도 됨^^
}
class Banana extends Product{
	Banana(){price = 5000;}
	//int price;
}
class TV extends Product{
	TV(int a, String b){
		price = a;
		name = b;
	}
	//int price;
	String name;
}
class Ref extends Product{
	Ref(){price = 300000;}
	//int price;
}
//가전매장에 TV, 냉장고가 있습니다.
//과일매장에 딸기와 바나나가 있습니다.
//스즈키가 있습니다. 100만원을 가지고 있습니다.
class Suzuki{
	Suzuki(){
		
	}
	int pocketMoney = 1000000;
	void buy(Product a) {//a ㅋㅋㅋ 상속 덕에 여러 제품의 자료형을 프로덕트로(또 같은 소리)
		pocketMoney -= a.price;
	}
//	void buy(Ref a) {
//		pocketMoney -= a.price;
//	}
//	void buy(TV a) {
//		pocketMoney -= a.price;
//	}
//	void buy(Strawberry a) {
//		pocketMoney -= a.price;
//	}
//	void buy(Banana a) {
//		pocketMoney -= a.price;
//	}
	
}
//스즈키 군이 tv와 냉장고와 딸기와 바나나를 샀습니다.
//이 4개를 [샀다]는 함수를 만들면 된다 이거지
//남은 용돈을 출력한다.

@WebServlet("/Aug22Study")
public class Aug22Study extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final int a = 200; //상수, 값을 바꿀 수 없다.
		int b = 200; 
	
    public Aug22Study() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		b = 200;
		JavaDepartmentStore jds = new JavaDepartmentStore();
		Suzuki suzuki = new Suzuki();
		System.out.println(suzuki.pocketMoney);
		suzuki.buy(jds.em.item1);
		suzuki.buy(jds.fm.item2);
		suzuki.buy(jds.fm.item1);
		suzuki.buy(jds.fm.item2);
		suzuki.buy(jds.fm.item2);
		System.out.println(suzuki.pocketMoney);
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
