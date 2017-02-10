/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
/**
 *
 * @author danu
 */
public class RectangleMover {
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;
    public static void main(String[] args){
        JFrame frame = new JFrame();
        
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setTitle("an animeted rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final RectangleComponent component= new RectangleComponent();
        frame.add(component);
        
        frame.setVisible(true);
        
        class TimerListener implements ActionListener{
            public void actionPerformed(ActionEvent event){
                component.moveBy(1,1);
            }
        }
        
        ActionListener listener = new TimerListener();
        
        final int DELAY=100;
        Timer t=new Timer(DELAY,listener);
        t.start();
    }
}
