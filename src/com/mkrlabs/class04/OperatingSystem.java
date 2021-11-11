package com.mkrlabs.class04;

public class OperatingSystem {


    String osName;
    String version;
    String releaseDate;


    public OperatingSystem(String osName, String version, String releaseDate) {
        this.osName = osName;
        this.version = version;
        this.releaseDate = releaseDate;
    }



    public void displayOS(){
        System.out.println("------------Parent Class -------------");
        System.out.println("Name "+ osName);
        System.out.println("Version "+ version);
        System.out.println("Release "+ releaseDate);
    }
}
