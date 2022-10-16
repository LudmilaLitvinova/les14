package ua.hillellit.model;

public class Main {

  public static void main(String[] args) {
    News news = new News();
    NewsAggregator currentDisplay = new NewsAggregator(news);
    news.publicNews("Something unexpected happened. Don't miss out and be the first to know!!!!");

  }
}