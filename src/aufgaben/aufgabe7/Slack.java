package aufgaben.aufgabe7;

import java.util.HashSet;
import java.util.Set;

public class Slack implements Publisher {
    private Set<Listener> listeners;
    private int nrOfMessages;

    public Slack() {
        this.listeners = new HashSet<>();
        this.nrOfMessages = 0;
    }

    @Override
    public boolean register(Listener listener) {
        return listeners.add(listener);
    }

    @Override
    public boolean unregister(Listener listener) {
        return listeners.remove(listener);
    }

    @Override
    public void notifyListeners() {
        for (Listener listener: listeners){
            listener.update();
        }
    }

    public void publishNews(){
        this.nrOfMessages++;
        this.notifyListeners();
    }

    @Override
    public String getUpdate(Listener listener) {
        return "Breaking News " + this.nrOfMessages;
    }
}
