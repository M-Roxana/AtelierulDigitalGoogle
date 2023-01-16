package Project.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    List<ISubscriber> subscriberList;
    List<String> videoTitles;

    public YouTubeChannel() {
        subscriberList  = new ArrayList<>();
        videoTitles = new ArrayList<>();

    }
    public void attachSubscribers(ISubscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void addVideo(String title){
        videoTitles.add(title);
        broadcastToSubscribers();
    }
    public void broadcastToSubscribers(){
        for (ISubscriber sub :
                subscriberList) {
            sub.getUpdate();
        }
    }
    public List<String> getVideoTitles(){
        return videoTitles;
    }
}
