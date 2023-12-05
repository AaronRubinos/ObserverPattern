package ObserverPattern;

public class NewsSubscriptionApp {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        Subscriber subscriber1 = new ConcreteSubscriber("Subscriber 1");
        Subscriber subscriber2 = new ConcreteSubscriber("Subscriber 2");

        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);
        newsAgency.notifySubscribers("Breaking News: Important Event!");
        newsAgency.unsubscribe(subscriber1);
        newsAgency.notifySubscribers("Breaking News: Another Event!");
    }
}
