package com.pluralsight.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        TwitterStream twitterStream = new TwitterStream();
        Client client1 = new Client("John");
        Client client2 = new Client("Tim");
        twitterStream.addObserver(client1);
        twitterStream.addObserver(client2);
        twitterStream.someoneTweeted();
    }
}
