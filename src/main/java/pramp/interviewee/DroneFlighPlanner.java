package pramp.interviewee;

import java.util.List;

/**
 * Created by makoto on 10/03/17.
 Drone Flight Planner

 You are planning the amount of fuel need to complete a drone flight.
 To fly higher, the drone burns 1 liter of fuel per feet. However, flying lower charges the drone with the amount of energy equivalent to 1 liter of fuel for every feet. Flying sideways takes no energy (only flying up and down takes/charges energy).

 Given an array of 3D coordinates named route, find the minimal amount of fuel the drone would need to fly through this route.
 Explain and code the most efficient solution possible, with the minimal number of actions and variables.

 Example:
 Completing the route [{x:0, y:2, z:10}, {x:3, y:5, z:0}, {x:9, y:20, z:6}, {x:10, y:12, z:15}, {x:10, y:10, z:8}] requires a minimum of 5 liters of fuel.
 */
public class DroneFlighPlanner {
    public static void main(String[] args) {
        String pramp = "Practice Makes Perfect";
        System.out.println(pramp);


    }

    private int findMinimumFuel(List<Route> route) {

        if (route.isEmpty() || route.size() == 1) {
            return 0;
        }

        int currentFuel = 10;
        int minimum = 0;

        for (int i = 0, j = i + 1; j < route.size(); i++, j++) {

            currentFuel = currentFuel + (route.get(i).z - route.get(j).z); // current 10 - 0

            if (currentFuel < 0) {
                minimum += Math.abs(currentFuel);
                currentFuel = 0;
            }
        }
        return minimum;

    }

    class Route {
        int x;
        int y;
        int z;
        //getter/setter
    }
}
