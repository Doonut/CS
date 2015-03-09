package myJava;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class trayTest { //start class
  static Image image = Toolkit.getDefaultToolkit().getImage("image/bulb.gif"); //import image file
  static TrayIcon trayIcon = new TrayIcon(image, "Tester2"); //create trayIcon object
  static PopupMenu popup = new PopupMenu(); //create PopupMenu
  public static void createTray() { //start function
    if (SystemTray.isSupported()) { //if system allows systemTray
        SystemTray tray = SystemTray.getSystemTray(); //create tray
        trayIcon.setPopupMenu(popup); //set tray icon to popup menu
        trayIcon.setImageAutoSize(true); //auto size icon

        MenuItem exitItem = new MenuItem("Exit"); //create exit Item
        exitItem.addActionListener(new ActionListener() { //add listener to exit
            public void actionPerformed(ActionEvent e){ //create ActionEvent function
                System.exit(0); //exit system if Exit is pressed
            }
        }); //end addActionListener
        popup.add(exitItem); //add exitItem to popup menu

      try {
        tray.add(trayIcon); //try to add trayIcon to the tray
      } catch (AWTException e) { //if cant find icon..
        System.err.println("TrayIcon could not be added."); //handle system error
      }
    }
  } 
}