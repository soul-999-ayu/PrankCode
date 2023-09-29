# PrankCode-JAVA

This code is solely witten in JAVA by AYUSH and its free to use as long as you don't consider the code as your's.

This code is written to pretend that you hacked the computer in which this code is ran.

As soon as you shares this code or .exe to your friend and he runs it, the code will open notepad and display "You have been hacked" along with some system details in which this program is ran. After few seconds, the system will automatically type "JUST KIDDING LOL!" word by word and after 2 seconds, the code will play Rick Roll on YouTube on their default browser.

This code is solely written for fun purpose only and not related to any kind of hacking or data stealing.

Feature of the program:
* Program will do everything mentioned above automatically.
* Program will change system details based on the system the program is run on.
* You can change the code to type anything and to open any other link or video.

Check sample video (v0.1):
(Everything is happening automatically after running the program)

https://user-images.githubusercontent.com/119154806/212716967-de0e28f0-1ed0-4f7c-8b0d-c5fca2788a17.mp4

Details (About Code):
* You can change the code according to yourself.
* The code is easy to understand and its completed in only 100 lines.
* If you need any help regarding the code, contact me on telegram at @SOUL_AYU

Check the code (v0.1):

    import java.io.*;
    import java.lang.management.ManagementFactory;
    import java.net.*;
    import java.awt.*;
    import java.awt.event.KeyEvent;
    import com.sun.management.OperatingSystemMXBean;

    //Creating Class
    public class PrankCode {
    public static void main(String[] args) throws UnknownHostException, AWTException, InterruptedException, URISyntaxException {
    	
    	//Variables to get system details and to type
    	OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
    	InetAddress localhost = InetAddress.getLocalHost();
    	Robot robot = new Robot();
    	String url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstley";
    	
        try {
            // Create a new file named "HackedInfo.txt"
            File file = new File("HackedInfo.txt");
            // Create the file if it doesn't already exist
            file.createNewFile();
            // Writing text to the file
            PrintWriter writer = new PrintWriter(file);
            writer.println("***********************\nYou Have Been Hacked😈\n***********************\n\nHere's Some Details:\nCurrent User: "+System.getProperty("user.name")+"\nOperating System: "+System.getProperty("os.name")+
            		"\nTotal Physical RAM: "+osBean.getTotalPhysicalMemorySize() / (1024 * 1024) + "MB\nTotal Available RAM: "+osBean.getFreePhysicalMemorySize() / (1024 * 1024) + "MB\nLocal IP Address: "+localhost.getHostAddress());
            writer.flush();
            writer.close();
            // Open the file in notepad
            Runtime.getRuntime().exec("notepad " + file.getAbsolutePath());
            Thread.sleep(2000);
            //Moving cursor to end of text
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(100);
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(5000); 
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CAPS_LOCK);
            //Typing "JUST KIDDING LOL!" word by word
            robot.keyPress(KeyEvent.VK_J);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_U);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_S);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_T);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_SPACE);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_K);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_I);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_D);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_D);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_I);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_N);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_G);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_SPACE);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_L);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_O);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_L);
            Thread.sleep(200);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_1);
            Thread.sleep(2000);
            //Opening YouTube (Rick Roll)
            Desktop.getDesktop().browse(new URI(url));
        } catch (IOException e) {
            e.printStackTrace();
        }
      }
    }
    
Issues:
* I did not find any issue till now ̶and I'll add more functions to it in future.

--> You can download the .jar file from release section and import it in Eclipse or IntelliJ IDE.

--> .exe is also available in release section (May require JRE to run).

Thank You for reading till end, please consider checking my other repos too.
