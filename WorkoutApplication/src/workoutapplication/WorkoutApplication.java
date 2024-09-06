/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workoutapplication;

/**
 *
 * @author camryn naidoo
 */
import javax.swing.JOptionPane;
public class WorkoutApplication 
{

    
    public static void main(String[] args) 
    {
         // Prompt the user for workout details using JOptionPane
        String exercises = JOptionPane.showInputDialog("Enter the exercises (e.g., running, swimming):");
        int duration = Integer.parseInt(JOptionPane.showInputDialog("Enter the duration in minutes:"));
        int intensityLevel = Integer.parseInt(JOptionPane.showInputDialog("Enter the intensity level (1-10):"));

        // Create an instance of ProcessWorkout with user inputs
        ProcessWorkout workout = new ProcessWorkout(exercises, duration, intensityLevel);

        // Call printWorkout() to display the details
        workout.printWorkout();
    }
    
}
