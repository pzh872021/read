package com.read.widget;

import java.util.List;


public class TxtPage {

    public TxtPage() {
    }

    public TxtPage(int position, List<String> lines) {
        this.position = position;
        this.lines = lines;
    }

    int position;
     List<String> lines;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }
}
