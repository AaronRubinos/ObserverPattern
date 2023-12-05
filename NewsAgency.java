package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

// NewsAgency (Subject)
class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String breakingNews) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(breakingNews);
        }
    }
}
