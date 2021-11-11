package com.mkrlabs.class04;

public class Android extends OperatingSystem{


   boolean videoCall;

    public Android(String osName, String version, String releaseDate ,boolean videoCall) {

        super(osName, version, releaseDate);
        this.videoCall =videoCall;

    }


    @Override
    public void displayOS() {
        super.displayOS();
        System.out.println("-----------Child Class---------- "  );
        System.out.println("Video Call "+this.videoCall  );

    }

   /* public  void  info(){
        System.out.println("-----------Child Class---------- "  );
        System.out.println("OS Name "+super.version  );
    }*/




}
