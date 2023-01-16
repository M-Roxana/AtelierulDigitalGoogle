package Project.Observer;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel youTubeChannel = new YouTubeChannel();

        new Subscriber("Roxana", youTubeChannel);
        new Subscriber("Ionescu", youTubeChannel);
        new Subscriber("Popescu", youTubeChannel);

        youTubeChannel.addVideo("How to boil water");
        youTubeChannel.addVideo("Learn java in 1 week");
    }
}
