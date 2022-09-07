package com.example.tomidea;

public class Guest {

    private String firstName;
    private String lastName;
    private boolean attending;
    private String guestID;
    private int guestCount = 0;

    public boolean setName(String gFirstName, String gLastName){
        firstName=gFirstName;
        lastName=gLastName;
        return true;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public boolean setAttending(boolean attendingStatus){
        attending = attendingStatus;
        return true;
    }

    public boolean getAttending(){
        return attending;
    }

    public boolean setNumberOfGuests(int guests){
        guestCount = guests;
        return true;
    }

    public int getNumberOfGuests(){
        return guestCount;
    }



}
