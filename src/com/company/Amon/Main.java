/*
Benton Amon
Exercise 2
1/31/2021
Determines what days of the week it will likely snow based on the temperature and precipitation chance.
 */

package com.company.Amon;

public class Main {

    public static void main(String[] args) {
        // Declare arrays
        String dayOfWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int temp[] = {45, 29, 10, 22, 41, 28, 33};
        int precip[] = {95, 60, 25, 5, 0, 75, 90};

        // Loop for what days it is snowing
        for(int i=0; i<=6; i++){
            if(temp[i]<=32 && precip[i]>50) {
                System.out.println("It is most likely snowing on " + dayOfWeek[i] + " because the temperature is "
                + temp[i] + " and the precipitation is " + precip[i] + ".");
            }
        }
    }
}
