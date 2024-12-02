package observer1;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Subject {
    private List<Observer> observers;
    private String news;

    public NewsChannel() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    // Método para publicar noticias
    public void publishNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
