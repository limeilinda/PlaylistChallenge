package io.zipcoder;

import java.util.HashMap;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

 public Integer selection(Integer startIndex, String selection) {

        String up = playList[startIndex];
        String down = playList[startIndex];
        int upIdx = startIndex;
        int downIdx = startIndex;

        int click = 0;

        while (!up.equals(selection) && !down.equals(selection)) {

        }
     return startIndex;
 }

}
