package aug22;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�ڹ� ��ȭ���� �ֽ��ϴ�. ��������� ���ϸ����� �ֽ��ϴ�.
class JavaDepartmentStore {
	JavaDepartmentStore(){
		em = new ElectroMart();
		fm = new FruitMart();
		}
	Mart em;	//���� ElectroMart em;
	Mart fm;	//���� FruitMart fm;
	
	
	}
abstract class Mart{
	Product item1;
	Product item2;
}
class ElectroMart extends Mart{
	ElectroMart(){
		item1 = new TV(300000, "Ƽ��");
		item2 = new Ref();
	}
	//Product tv; //TV tv; ���µ� ��Ӵ��� ���δ�Ʈ�� �ٲ� �� ����^^
	//Product ref;//�� ���δ�Ʈ�� ��Ʈ Ŭ������ ��������
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
	//int price; ���ֵ� ��^^
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
//�������忡 TV, ����� �ֽ��ϴ�.
//���ϸ��忡 ����� �ٳ����� �ֽ��ϴ�.
//����Ű�� �ֽ��ϴ�. 100������ ������ �ֽ��ϴ�.
class Suzuki{
	Suzuki(){
		
	}
	int pocketMoney = 1000000;
	void buy(Product a) {//a ������ ��� ���� ���� ��ǰ�� �ڷ����� ���δ�Ʈ��(�� ���� �Ҹ�)
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
//����Ű ���� tv�� ������ ����� �ٳ����� ����ϴ�.
//�� 4���� [���]�� �Լ��� ����� �ȴ� �̰���
//���� �뵷�� ����Ѵ�.

@WebServlet("/Aug22Study")
public class Aug22Study extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final int a = 200; //���, ���� �ٲ� �� ����.
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
