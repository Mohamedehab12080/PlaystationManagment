
package TOOLS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class StopWatch {
    
    public  JLabel label=null;
   public boolean started=false;
    int  elapsedTime= 0;
    int hours=0;
    int  minutes=0;
    int seconds=0;
    String seconds_String=String.format("%02d",seconds);
    String minutes_String=String.format("%02d",minutes);
    String hourse_String=String.format("%02d",hours);
    
    public StopWatch(JLabel label) {
        this.label=label;
//         label.setText(hourse_String+":"+minutes_String+":"+seconds_String);
         label.setFont(new Font("Segeo UI Emoji",Font.BOLD,30));
         label.setBorder(BorderFactory.createBevelBorder(1));
         label.setOpaque(true);
         label.setForeground(new Color(201,118,36));
         label.setBackground(new Color(51,51,51));
    }
    
    Timer timer=new Timer(1000, new ActionListener(){
            @Override
           public void actionPerformed(ActionEvent e) {
              elapsedTime= elapsedTime+1000;
               hours=(elapsedTime/3600000);
              minutes=(elapsedTime/60000)%60;
               seconds=(elapsedTime/1000)%60;
              label.setText(hours+":"+minutes+":"+seconds);
           }
       });
    public void start()
    {
        timer.start();
    }
    public void stop()
    {
        timer.stop();
         elapsedTime= 0;
               hours=0;
              minutes=0;
               seconds=0;
              label.setText(hours+":"+minutes+":"+seconds);
    }
    
    
    public void StartStop()
    {
            start();
    }
    
}
