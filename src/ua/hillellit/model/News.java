package ua.hillellit.model;

import java.util.ArrayList;
import java.util.List;

public class News implements Observable{
  private List<Observer> observers = new ArrayList<>();
  private String message;

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) observer.update(message);
  }

   public void publicNews(String message){
    this.message = message;
     notifyObservers();
   }

}
