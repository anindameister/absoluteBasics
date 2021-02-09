package com.anindamaulik.memento;


import java.util.ArrayList;

public class Editor {

    private String content;

    public String getContent() {


        return content;
    }

    public void setContent(String content) {

        this.content= content;

    }


    public void undo(String content) {
        System.out.println("your "+content+" has been removed");
    }
}
