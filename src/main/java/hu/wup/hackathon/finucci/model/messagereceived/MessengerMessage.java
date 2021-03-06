package hu.wup.hackathon.finucci.model.messagereceived;

import java.util.ArrayList;
import java.util.List;

public class MessengerMessage {
    
    private String object;
    private List<Entry> entry = new ArrayList<>();

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public List<Entry> getEntry() {
        return entry;
    }

    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }
}
