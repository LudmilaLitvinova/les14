package ua.hillellit.model;

public class NewsAggregator implements Observer{
    private String message;

  NewsAggregator(News news) {
    news.registerObserver(this);
    }

  @Override
  public void update(String message) {
      this.message = message;
  display();
  }
  public void display() {
      System.out.printf("News from a news aggregator: "+ message);
    }


}
