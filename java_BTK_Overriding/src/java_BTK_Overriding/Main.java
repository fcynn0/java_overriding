package java_BTK_Overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManager=new BaseKrediManager[] {new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
		
		for (BaseKrediManager baseKrediManager2 : baseKrediManager) {
			System.out.println(baseKrediManager2.hesapla(100));
			
			
		}
		

	}

}
