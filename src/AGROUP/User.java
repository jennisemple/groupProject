package AGROUP;

import java.util.Scanner;

public class User {
    //instance variables
    private static int numberOfRooms = 0;
    private static int roomNumber;
    private static int numOfprojectors;
    private static int numOfwhiteboards;
    private static int numOfDisabledAccess;
    private int numberOfSeats;
    private boolean projector;
    private boolean whiteboard;
    private boolean disabledAccess;

    public User() {
        numberOfRooms++;
    }//Default constructor

    public User(int inputroomNo, int inputnoOfProjectors, int inputnoOfWhiteboards, int inputnoOfDisabledAccess, int inputnoOfSeats) {
        roomNumber = inputroomNo;
        numOfprojectors = inputnoOfProjectors;
        numOfwhiteboards = inputnoOfWhiteboards;
        numOfDisabledAccess = inputnoOfDisabledAccess;
        numberOfSeats = inputnoOfSeats;
        numberOfRooms++;
    }//Alternative Constructor

    public static int getNumberOfRooms() {
        return numberOfRooms;
    }//getNumberOfRooms
    public int getRoomNumber() {
        return roomNumber;
    }//getRoomNumber
    public int getNumOfProjectors() {
        return numOfprojectors;
    }//getNumOfProjectors
    public int getNumOfwhiteboards() {
        return numOfwhiteboards;
    }//getNumOfwhiteboards
    public static int getNumOfDisabledAccess() {
        return numOfDisabledAccess;
    }//getNumOfDisabledAccess

    public static void setRoomNumber(int roomNumber) {
        User.roomNumber = roomNumber;
    }//
    public static void setNumOfprojectors(int numOfprojectors) {
        User.numOfprojectors = numOfprojectors;
    }
    public static void setNumOfwhiteboards(int numOfwhiteboards) {
        User.numOfwhiteboards = numOfwhiteboards;
    }
    public static void setNumOfDisabledAccess(int numOfDisabledAccess) {
        User.numOfDisabledAccess = numOfDisabledAccess;
    }
    public boolean isDisabledAccess() {
        return disabledAccess;
    }
    public boolean isProjector() {
        return projector;
    }
    public boolean isWhiteboard() {
        return whiteboard;
    }
}


