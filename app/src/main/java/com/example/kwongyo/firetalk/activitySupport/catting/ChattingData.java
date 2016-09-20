package com.example.kwongyo.firetalk.activitySupport.catting;

/**
 * Created by kwongyo on 2016-08-29.
 */
public class ChattingData {
    public int anotherProfileImage;
    public String anotherName;
    public String anotherTextMessage;
    public AskPersonInfo personInfo;

    public ChattingData(int anotherProfileImage, String anotherName, String anotherTextMessage, AskPersonInfo personInfo) {
        this.anotherProfileImage = anotherProfileImage;
        this.anotherName = anotherName;
        this.anotherTextMessage = anotherTextMessage;
        this.personInfo = personInfo;
    }

    public enum AskPersonInfo{
        SAME ,
        ANOTHER,
        ME
    }
}