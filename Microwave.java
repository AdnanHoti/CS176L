/**
 * @author adnanhoti
 * CS176L-01
 *
 */


//Microwave class

public class Microwave {

//data members time and power_level

private int time;

private int power_level;

//constructor for initial initialization of microwave object

public Microwave()

{

time =0;

power_level =1;

}

//method to increase the time of microwave by 30 seconds

public String time()

{

time += 30;
return "Time Button was pressed. Time is " + time + " seconds.";

}

//method to switch the power level of microwave between 1 and 2

public String power()

{

if(power_level == 1) {

power_level =2;

} else { 
power_level = 1; }

return "Power Button was pressed. Power level is " + power_level;

}

//method to reset the microwave

public String reset()

{

time =0;

power_level =1; 
return "Reset Button was pressed. Power level is " + power_level + ". Time is " + time + " seconds.";

}

//method to start the microwave

public String start()

{

return "Cooking for "+time+" seconds at level "+power_level;

}}