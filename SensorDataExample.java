

import java.util.Random;
import java.util.Timer; 
import java.util.TimerTask; 

public class SensorDataExample { 
    public static void main(String[] args) { 
        // The KITCHEN MANAGER who sets up the schedule
        Timer timer = new Timer(); 

        // Manager says: "Check temperature every 1 second"
        timer.schedule(new TimerTask() { 
            @Override 
            public void run() { 
                // 1. READ the thermometer
                double data = readSensor(); 

                // 2. REACT to the reading
                handleEvent(data); 
            } 
        }, 0, 1000); // Start now (0ms delay), repeat every 1000ms (1 second)
    } 

    // The THERMOMETER that gives temperature readings
    public static double readSensor() { 
        Random random = new Random(); 
        return 20.0 + (30.0 - 20.0) * random.nextDouble(); 
    } 

    // The CHEF who reacts to temperature changes
    public static void handleEvent(double data) { 
        System.out.printf("Temperature: %.2f°C%n", data); 
    } 
}
