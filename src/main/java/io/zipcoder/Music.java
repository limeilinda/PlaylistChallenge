package io.zipcoder;

import java.util.HashMap;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        String selectUp = playList[startIndex];
        String selectDown = playList[startIndex];
        int upIndex = startIndex;
        int downIndex = startIndex;
        int clicks = 0;
        int lastIndex = this.playList.length - 1;

        while (!selectUp.equals(selection) && !selectDown.equals(selection)) {
            upIndex = (upIndex == 0) ? lastIndex : upIndex - 1;
            downIndex = (downIndex == lastIndex) ? 0 : downIndex + 1;
            clicks++;
            selectUp = playList[upIndex];
            selectDown = playList[downIndex];
        }

        return clicks;

    }
}




