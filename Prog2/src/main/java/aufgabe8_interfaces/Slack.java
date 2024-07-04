package aufgabe8_interfaces;

import java.util.ArrayList;
import java.util.List;

public class Slack implements Publisher{

    private List<Listener> listeners; // (speichert alle "Abonnenten"; kann gerne auch eine Liste sein)
    private int nrOfMessages; // speichert die aktuelle Nummer einer veröffentlichten Nachricht die Nachrichten, die veröffentlicht werden, sollen fortlaufend nummeriert werden)

    public Slack(){
        this.listeners = new ArrayList<>();
        this.nrOfMessages = 0;
    }

    @Override
    public boolean register(Listener listener) {
        if(listeners.contains(listener)) {
            return false;
        }
        else
            listeners.add(listener);
            return true;
    }

    @Override
    public boolean unregister(Listener listener) {
        if(!listeners.contains(listener)) {
            return false;
        }
        else
            listeners.remove(listener);
        return true;
    }

    @Override
    public void notifyListeners() {
        for(Listener listener : listeners){
            listener.update();
        }
    }

    @Override
    public String getUpdate(Listener listener) {
        return "Breaking News " + this.nrOfMessages;
    }

    public void publishNews(){
        this.nrOfMessages++;
        this.notifyListeners();
    }
}
