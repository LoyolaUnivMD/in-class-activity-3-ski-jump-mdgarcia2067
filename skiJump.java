
//Programmers: Maria Garcia
//Course: CS212
//Due Date: 1/31/24
//In Class Assessment
//Problem Statement: Calculate points earned in Ski Jump
//Data In: jump type, speed
//Data Out: distance, points
//Credits:

//Imports
import java.util.Scanner;
import java.lang.Math;

class skiJump {
    public static void main(String[] args) {

        //Create Scanner object
        Scanner reader = new Scanner(System.in);


        //Output purpose of program
        System.out.println("This program calculates the number of points earned in a ski jump.");

        //Prompt user for hill type
        System.out.println("Enter the hill type: ");
        //Store input in variable
        String hillType = reader.next();

        //Strip variable and convert to lowercase
        hillType = hillType.toLowerCase().strip();

        //Initialize variables
        double height=0,pointsPerMeter = 0,par=0;

        //Switch statement for different hill types
        switch(hillType){
            //When hill type is normal assign this values
            case "normal":
                height = 46;
                pointsPerMeter = 2;
                par = 90;
                break;
            //When hill type is large assign these values
            case "large":
                height = 70;
                pointsPerMeter = 1.8;
                par = 120;
                break;
        }

        //Calculate time
        double time = Math.sqrt((2*height)/9.8);

        //Prompt user for the jumper's speed
        System.out.println("What was the jumper's speed? ");
        //Store answer in variable
        double speed = reader.nextDouble();

        //Calculate distance
        double distance = speed * time;
        //Calculate points earned
        double points = 60 + (distance - par) * pointsPerMeter;

        //Output distance traveled
        System.out.println("Distance Traveled: " + distance);
        //Output points earned
        System.out.println("Points Earned: " + points);

        //Output message based on points earned
        if(points >= 61){
            System.out.println("Great job for doing better than par!");
        }
        else if(points < 10){
            System.out.println("What happened??");
        }
        else{
            System.out.println("Sorry you didn't go very far.");
        }


        
    }
}
