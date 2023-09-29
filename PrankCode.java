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