package polygons;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class DrawWindow extends JFrame {

    private DrawPanel drawPanel;

    public DrawWindow(int n) {
        setTitle("Polygon Spiral");
        setSize(320, 340);
        setLocationRelativeTo(null);

        drawPanel = new DrawPanel(n);
        getContentPane().add(BorderLayout.CENTER, drawPanel);

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                if (drawPanel.next()) {
                    timer.cancel();
                    timer.purge();
                }

            }
        };
        timer.schedule(timerTask, 400, 200);
    }
}
