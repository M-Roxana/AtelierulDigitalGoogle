package Project.Observer;

import java.util.Arrays;
import java.util.List;

public class Subscriber implements ISubscriber{
    String name;
    YouTubeChannel youTubeChannel;

    public Subscriber(String name, YouTubeChannel youTubeChannel) {
        this.name = name;
        this.youTubeChannel = youTubeChannel;
        this.youTubeChannel.attachSubscribers(this);
    }

    @Override
    public void getUpdate() {
        List<String> videoTitles = this.youTubeChannel.getVideoTitles();
        System.out.println("Notification for " + name +" :video  "+ Arrays.toString(videoTitles.toArray()) + " is new added on the channel");
    }
}

