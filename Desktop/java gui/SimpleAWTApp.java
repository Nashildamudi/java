import java.awt.*;
import java.awt.event.*;

public class SimpleAWTApp {
    public static void main(String[] args) {
        // Create a Frame
        Frame frame = new Frame("Simple AWT Example");

        // Create a Button
        Button button = new Button("Click Me");

        // Set layout for the Frame
        frame.setLayout(new FlowLayout());

        // Add button to the Frame
        frame.add(button);

        // Add an ActionListener to the Button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Display a message dialog on button click
                Dialog dialog = new Dialog(frame, "Message", true);
                dialog.setLayout(new FlowLayout());
                Label message = new Label("Button Clicked!");
                dialog.add(message);
                Button close = new Button("Close");
                dialog.add(close);

                close.addActionListener(ev -> dialog.dispose());

                dialog.setSize(200, 100);
                dialog.setVisible(true);
            }
        });

        // Set Frame properties
        frame.setSize(600, 600);
        frame.setVisible(true);

        // Add a WindowListener for closing the Frame
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
