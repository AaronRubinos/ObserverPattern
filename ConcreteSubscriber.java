package ObserverPattern;

class ConcreteSubscriber implements Subscriber {
    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String breakingNews) {
        System.out.println(name + " received breaking news: " + breakingNews);
    }
}
