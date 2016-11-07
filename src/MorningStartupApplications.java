/*
 * Based on the code from: 
 * http://www.programmingsimplified.com/java/source-code/java-program-open-notepad
 */
import java.util.*;
import java.io.*;
 
class MorningStartupApplications {
  public static void main(String[] args) {
    Runtime rs = Runtime.getRuntime();
 
    try {
      rs.exec("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
    }
    catch (IOException e) {
      System.out.println(e);
    }   
  }
}