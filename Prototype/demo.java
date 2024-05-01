package Prototype;

public class demo {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs = new BookShop();
		bs.setShopName("MajumderShop");
		bs.loadData();
		
		
		
		BookShop bs1 = bs.clone();
		bs.getBooks().remove(2);
		bs1.setShopName("MajumderShop 2");
		
		
		BookShop bs2 = bs.clone();
		//bs.getBooks().remove(2);
		bs2.setShopName("MajumderShop 3");
		
		
		System.out.println(bs);
		System.out.println(bs1);
		System.out.println(bs2);
		
	}

}
