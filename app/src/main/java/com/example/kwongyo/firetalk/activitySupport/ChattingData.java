package com.example.kwongyo.firetalk.activitySupport;

/**
 * Created by kwongyo on 2016-08-29.
 */
public class ChattingData {
    public int anotherProfileImage;
    public String anotherName;
    public String anotherTextMessage;
    public boolean isSamePerson;
    public ChattingData(int anotherProfileImage , String anotherName , String anotherTextMessage , boolean isSamePerson) {
        this.anotherProfileImage = anotherProfileImage;
        this.anotherTextMessage = anotherTextMessage;
        this.anotherName=anotherName;
        this.isSamePerson = isSamePerson;
    }
}