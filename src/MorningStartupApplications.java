/*
 * Based on the code from: 
 * http://www.programmingsimplified.com/java/source-code/java-program-open-notepad
 */
import java.util.concurrent.TimeUnit; // Imported to use sleep function for adding delay between apps launching
import java.io.*;
 
class MorningStartupApplications {
  public static void main(String[] args) {
    Runtime rs = Runtime.getRuntime();
    // Get the users current home directory
    String currentUsersHomeDir = System.getProperty("user.home");
 
    try {
      
      // Outlook
      rs.exec("C:\\Program Files\\Microsoft Office\\root\\Office16\\OUTLOOK.exe");
      System.out.println("Launching Outlook...");
      TimeUnit.SECONDS.sleep(10);
      
      // Mattermost
      rs.exec(currentUsersHomeDir + "\\AppData\\Local\\mattermost\\app-1.3.0\\Mattermost.exe");
      System.out.println("Launching Mattermost...");
      TimeUnit.SECONDS.sleep(10);
      
      // Skype
      rs.exec("C:\\Program Files (x86)\\Skype\\Phone\\Skype.exe");
      System.out.println("Launching Skype...");
      TimeUnit.SECONDS.sleep(10);
      
      // Notepad++
      rs.exec("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
      System.out.println("Launching Notepad++...");
      TimeUnit.SECONDS.sleep(10);
      
      // Chrome
      rs.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
      System.out.println("Launching Google Chrome...");
      TimeUnit.SECONDS.sleep(10);
    }
    // Catch any exceptions
    catch (IOException e) {
      System.out.println(e);
    } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}   
  }
}