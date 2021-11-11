package com.mkrlabs.class_01_02_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int num = 10;
        double value = 5.25;
        char c = 'b';

        String course = "Dive into Android";

        boolean isActive = false;

        /*Scanner scanner = new Scanner(System.in);

        String  userName = scanner.nextLine();


        String name = "My name is ";*/





      /*  String name1 = "Android";
        String name2 = "Course";
        String na = name1+name2;*/

        int num1 = 50;
        int num2 = 50;
        /*String niloy = "Asif Iqbal niloy";
        String tamim  = "Tamim Riyad";


        if( num1 > num2 ){
        // if satisfy
            System.out.println("Num 1 is greater than num2");

        }else if(num1 == num2){
            System.out.println("Num 1 & num2 are same");
        }
        else {
            // rest of work
            System.out.println("Num 2 is greater than num1");
        }


        if (niloy.length() > tamim.length()){
            System.out.println("Niloy 1 is greater than Tamim " + niloy.length());

        }else {
            System.out.println("Tamim 1 is greater than Niloy " + tamim.length());
        }*/


        //  System.out.println(name + userName);
        int day = 3;


        /*if (day == 1) {
            System.out.println("Saturday");
        } else if (day == 2) {
            System.out.println("Sunday");
        } else if (day == 3) {
            System.out.println("Monday");
        } else if (day == 4) {
            System.out.println("Tuesday");
        } else {
            System.out.println("Invalid");

        }*/

        /*switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid");

        }*/
        // 1 4 9 16 25

       /* for(int i = 1 ; i <= 5 ; i++){
            System.out.println( i*i );

        }

        int i = 0 ;
        while (i<=5){
            System.out.println( i );
            i++;
        }*/

       /* int i=0;
        do {
            System.out.println(i);
            i++;
        }while (i<=5);
*/


        int arr[] = {4,5,6,8,9,7,10};

        //System.out.println(arr.length);



        int a[] = new int[10];

        a[0] = 5;
        a[1] = 50;

        //System.out.println(a[11]);

        String language[] =new String[5];
        language[0] = "C";
        language[1] = "C++";
        language[2] = "Java";
        language[3] = "Java";
        language[4] = "Java";

        /*
        for (int i = 0; i < language.length; i++) {

            System.out.println(language[i]);

        }
        */
     /*  for(String s : language){ //for each
           System.out.println(s);
       }*/

        //printAllLanguage(language);

      // System.out.println(makeSum(4,5));


        getCourseName();

        printOutAllLanguage(language);

        final int my_value = 10 ;
       // my_value = 10+5;
        System.out.println(my_value);


    }


    // access_modifier keyword return_type methodName(){}
    public static void getCourseName(){
        System.out.println("Dive Into Android ");

       int result =  getSum(5,5);

       System.out.println(result);

    }


    public static int getSum(int a , int b){
        int ans = a+b;
        return ans;

    }

    public static  void printOutAllLanguage(String language[]){

        for ( String s : language){
            System.out.println(s);
        }

    }






}
