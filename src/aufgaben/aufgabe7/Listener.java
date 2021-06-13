package aufgaben.aufgabe7;

public abstract class Listener implements Publisher {
    @Override
    public boolean register(Listener listener) {
        return false;
    }

    @Override
    public boolean unregister(Listener listener) {
        return false;
    }

    @Override
    public void notifyListeners() {

    }

    @Override
    public String getUpdate(Listener listener) {
        return null;
    }

    public abstract void update();
    public abstract void setPublisher(Publisher publisher);
    public abstract void removePublisher(Publisher publisher);
}
