package com.anindamaulik.memento;


import java.util.ArrayList;

public class Editor {

    private String content;



    private ArrayList<String>previousContents=new ArrayList();

    public String getContent() {


        return content;
    }

    public void setContent(String content) {

        this.content= content;
        previousContents.add(content);

    }


    public void undo(){
        previousContents.remove(previousContents.size()-1);
        System.out.println("your current contents are "+previousContents);


    }

    //in the future, we bring up title

    private String title;

    private ArrayList<String>previousTitle=new ArrayList();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

        previousTitle.add(title);
    }

    public void undoTitle(){
        previousTitle.remove(previousContents.size());
        System.out.println("your current contents are "+previousTitle);


    }

    public ArrayList<String> getPreviousTitle() {
        return previousTitle;
    }

    public void setPreviousTitle(ArrayList<String> previousTitle) {
        this.previousTitle = previousTitle;

    }

    private String oneWordTitle;

    private ArrayList<String>previousOneWordTitle=new ArrayList();

    public String getOneWordTitle() {
        return oneWordTitle;
    }

    public void setOneWordTitle(String oneWordTitle) {
        this.oneWordTitle = oneWordTitle;
        previousOneWordTitle.add(oneWordTitle);
    }

    public void setPreviousOneWordTitle(ArrayList<String> previousOneWordTitle) {
        this.previousOneWordTitle = previousOneWordTitle;
    }

    public void undoOneWordTitle(){
        previousOneWordTitle.remove(previousOneWordTitle.size()-1);
        System.out.println("your current contents are "+previousOneWordTitle);


    }
}
