Observer Pattern

Scenario: Use Observer Design Pattern to notify all subscribers of a YouTube channel when a new video is uploaded.

In YouTubeChannel class two fields are being initialized, subscriberList and videoTitles, and there are three essential methods.
-attachSubscriber(), attach subscriber to this YouTube channel by hoarding subscriber objects references into list of subscribers,
-addVideo(), update the data of videoTitles field, and also this method calls the broadcasting method that will broadcast to all previously attached subscribers,
-broadcastToSubscribers(), loop through the list of individual subscribers and calls the intended methods of the subscribers.
In Subscriber interface is the method getUpdate(), which is implemented by all the subscribing concrete classes.
In Subscriber class, on the constructor I'm sending YouTube object as parameter and the subscriber name and then I'm attaching the subscriber to the Youtube channel
In Main, after creating one YoutubeChannel object, I pass the YouTube object to all Subscribers constructors,
then whenever I'm adding new video to the YouTube channel all the subscribers get notified.

Advantages:
Subscribers can be added/removed at any point in time.
Disadvantages:
The observer method has a risk to implement. If it is not implemented carefully, it will be the cause of large complexity code.