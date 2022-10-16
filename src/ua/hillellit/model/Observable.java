package ua.hillellit.model;

public interface Observable {
  void registerObserver(Observer o);
  void removeObserver(Observer o);
  void notifyObservers();
}
