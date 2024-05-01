package Observer_design_pattern;

public interface Subject {

	void subscribe(Subscriber sub);

	void unSubscribed(Observer sub);

	void notifySubscriber();

	void upload(String title);

}