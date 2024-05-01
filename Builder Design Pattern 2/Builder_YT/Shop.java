package Builder_YT;

public class Shop {

	public static void main(String[] args) {
		
		Phone phone = new PhoneBuilder().setOS("Apple").setBattery(10000).getPhone();
		System.out.println(phone);

	}
}
