
package Controller;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class m extends Thread {
    
  public  boolean state[];
  public   int hours[];
  public   int minuts[];
  public   int seconds[];
  public  JLabel Timer[];
    public m(int size,JLabel...x) {
        state=new boolean[size];
        hours=new int[size];
        minuts=new int[size];
        seconds=new int[size];
        Timer=x;
    }
  @Override
    public void  run()
    {
        try {
          for (;;) {
              for (int i = 0; i < state.length; i++) {
                  if(state[i])
                  {
                      if (seconds[i]>= 60) {
                          seconds[i]= 0;
                          minuts[i] ++;
                      }
                      if (minuts[i]>= 60) {
                          minuts[i] = 0;
                          hours[i]++;
                      }
                      seconds[i]++;
                      
                      Timer[i].setText(hours[i] + ":" + minuts[i] + ":" +(seconds[i]-1));
                  }
              }
              try {
                  sleep(950);
              } catch (InterruptedException ex) {
                  Logger.getLogger(m.class.getName()).log(Level.SEVERE, null, ex);
              }
              
          }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
                  
    }
}
