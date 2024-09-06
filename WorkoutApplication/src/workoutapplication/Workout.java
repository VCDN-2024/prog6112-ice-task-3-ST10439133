/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package workoutapplication;

/**
 *
 * @author camryn naidoo
 */
import javax.swing.JOptionPane;
abstract class Workout 
{
    
    private String exercises;
    private int timeTaken; //  in minutes
    private int intensity;
    
    // Constructor
    public Workout(String exercises, int duration, int intensityL) 
    {
        this.exercises = exercises;
        this.timeTaken = duration;
        this.intensity = intensity;
    }
    
    // Get methods
    public String getExercises() {
        return exercises;
    }
    
    public int getDuration() {
        return timeTaken;
    }
    
    public int getIntensityLevel() {
        return intensity;
    }
}


interface IWorkout {
    void printWorkout();
}

 class ProcessWorkout extends Workout implements IWorkout
{
    // Constructor
    public ProcessWorkout(String exercises, int duration, int intensityLevel) {
        super(exercises, duration, intensityLevel);
    }
   public void printWorkout() {
        String workoutDetails = "Exercises: " + getExercises() + "\n" +
                                "Duration: " + getDuration() + " minutes\n" +
                                "Intensity Level: " + getIntensityLevel();
        JOptionPane.showMessageDialog(null, workoutDetails, "Workout Details", JOptionPane.INFORMATION_MESSAGE);
    
   }
 }


