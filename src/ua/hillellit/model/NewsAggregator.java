package ua.hillellit.model;

public class NewsAggregator implements Observer {

  public NewsAggregator(News news) {
    news.registerObserver(this);
  }

  @Override
  public void update(String message) {
    display(message);
  }

  public void display(String str) {
    System.out.printf("News from a news aggregator: " + str);
  }
}
