/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: IT Diagnosis
 * Due: 2/09/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Chukwuebuka Onwumelu
*/
import java.util.Scanner;
public class WiFiDiagnosis {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String answer;
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		System.out.println("First step: reboot your computer\nAre you able to connect with the internet? (yes or no)");
		answer = keyboard.nextLine();
		
		if(answer.equals("yes")) {
			System.out.println("Rebooting your system seemed to work.");
			System.exit(0);
			//System.out.println(answer);
		}
		
		else {
			System.out.println("Second step: reboot your router\r\n" + "Now are you able to connect with the internet? (yes or no)");
			answer = keyboard.nextLine();
			
		}
		if(answer.equals("yes")) {
			System.out.println("Rebooting your router seemed to work.");
			System.exit(0);
		}
		else {
			
			System.out.println("Third step: make sure the cables connecting the router are firmly plugged in and your router is getting power\r\n" + "Now are you able to connect with the internet? (yes or no)");
			answer = keyboard.nextLine();
		}
		if(answer.equals("yes")) {
	
			System.out.println("Checking your router's cables seemed to work.");
			System.exit(0);
		}
		else {
			System.out.println("Fourth step: move the computer closer to the router and try to connect\r\n" + "Now are you able to connect with the internet? (yes or no)");
			answer = keyboard.nextLine();
		}
		
		if(answer.equals("yes")) {
			System.out.println("Moving your computer closer to the router seemed to work.");
			System.exit(0);
		}
		else {
			System.out.println("Contact your ISP");
		}
	}
}
