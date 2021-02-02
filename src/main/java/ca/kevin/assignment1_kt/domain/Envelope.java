package ca.kevin.assignment1_kt.domain;

import java.io.Serializable;

public class Envelope implements Serializable {

    private int message = 1;
    public Envelope(){

    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    @Override
    public String toString(){
    return "Envelope{" + "message=" + message +'}';
    }
}
