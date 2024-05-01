package Observer_design_pattern;

public class Youtube {

	 public static void main(String[] args) {

	 Channel abcMusic = new Channel("abcMusic");
	 
	 Subscriber s1 = new Subscriber("Rony");
	 Subscriber s2 = new Subscriber("Bijoy");
	 Subscriber s3 = new Subscriber("Rahul");
	 Subscriber s4 = new Subscriber("Lifu");
	 Subscriber s5 = new Subscriber("Sakib");
	 
	 abcMusic.subscribe(s1);
	 abcMusic.subscribe(s2);
	 abcMusic.subscribe(s3);
	 abcMusic.subscribe(s4);
	 abcMusic.subscribe(s5);
	 
	 abcMusic.unSubscribed(s5);
	 
	 s1.subscribedChennel(abcMusic);
	 s2.subscribedChennel(abcMusic);
	 s3.subscribedChennel(abcMusic);
	 s4.subscribedChennel(abcMusic);
	 s5.subscribedChennel(abcMusic);
	 
	 
	 abcMusic.upload("The music of summer!");
	 
	 
	 }
	
}
