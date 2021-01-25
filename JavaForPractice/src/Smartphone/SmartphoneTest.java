package Smartphone;

public class SmartphoneTest {

	public static void main(String[] args) {
		
		Smartphone myphone= new Smartphone();
		IPhone iphone= new IPhone();
		Samsung sam= new Samsung();

		myphone.call(123456798);
		myphone.sendTextMassage(123455667);
		System.out.println("--------------");
		
		iphone.call(23456);
		iphone.sendTextMassage(234567);
		iphone.faceTime();
		
		System.out.println("-----------------");
		
		sam.call(134567);
		sam.sendTextMassage(1345678);
		sam.sdCard();
	}

}
