package polygons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetupWindow extends JFrame {

    private Button button;

    public SetupWindow() {
        setTitle("Polygon Spiral");
        setSize(320, 80);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSpinner spinner = new JSpinner();
        spinner.setValue(4);

        button = new Button();
        button.setLabel("Show spiral");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n = (int) spinner.getValue();
                if (n >= 3) {
                    DrawWindow drawWindow = new DrawWindow(n);
                    drawWindow.setVisible(true);
                }
            }
        });

        getContentPane().add(BorderLayout.CENTER, spinner);
        getContentPane().add(BorderLayout.SOUTH, button);

    }
}
