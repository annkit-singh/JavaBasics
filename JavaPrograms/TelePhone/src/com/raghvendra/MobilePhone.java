package com.raghvendra;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void poweOn() {
        isOn = true;
        System.out.println("Mobilephone is powered up.");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobilephone.");
        } else {
            System.out.println("phone is switched off.");
        }
    }

    @Override
    public void answer() {
        if(isRinging) {
            System.out.println("Answering the mobilephone.");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody Ring!");
        } else {
            isRinging = false;
            System.out.println("Phone number is not correct or the mobilephone is switched off");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
