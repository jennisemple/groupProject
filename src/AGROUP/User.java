package AGROUP;

public class User {
    //instance variables
    private static int numberOfRooms = 0;
    private static int roomNumber;
    private static int numOfprojectors;
    private static int numOfwhiteboards;
    private static int numOfDisabledAccess;
    private int numberOfPeople;
    private boolean projector;
    private boolean whiteboard;
    private boolean disabledAccess;

    public User() {
        numberOfRooms++;
    }//Default constructor

    public User(int roomNo, int noOfProjectors, int noOfWhiteboards, int noOfDisabledAccess, int noOfPeople) {
        roomNumber = roomNo;
        numOfprojectors = noOfProjectors;
        numOfwhiteboards = noOfWhiteboards;
        numOfDisabledAccess = noOfDisabledAccess;
        numberOfPeople = noOfPeople;
        numberOfRooms++;
    }//Alternative Constructor

    //public void getNumberOfRooms()









}
