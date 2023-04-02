package org.example.bob;

public class Bob {
    public static int enough(int cap, int on, int wait){
        int peopleWaiting = 0;
        if (wait+on >= cap) {
            peopleWaiting = (wait+on)-cap;
        }
        return peopleWaiting;
    }
}