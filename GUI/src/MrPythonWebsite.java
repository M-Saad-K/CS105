import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.MultiPixelPackedSampleModel;
import javax.swing.*;

public class MrPythonWebsite implements ActionListener {

    private JFrame MrPythonWebsite;
    private JButton OurVideosButton;

    public MrPythonWebsite() {
        makeFrame();
    }

    private void makeFrame() {

        MrPythonWebsite = new JFrame("Mr Python's Simple Teachings");
        // Here comes the components
        JLabel title = new JLabel("Mr Python's Simple Teachings");      // These are JLabels -> they are basically titles
        JLabel Subheading1 = new JLabel("Hi There!");
        JLabel Subheading2 = new JLabel("We are an Scottish Animation Channel, dedicated to teaching young about STEM in a concise and fun way");

            // Buttons
        OurVideosButton = new JButton("Our Videos");
        OurVideosButton.addActionListener(this);

        // Layout Managers
        JPanel titlePanel = new JPanel(new GridLayout(0, 1));
        titlePanel.add(title);

        JPanel subheadingPanel = new JPanel(new GridLayout(3, 1));
        subheadingPanel.add(Subheading1);
        subheadingPanel.add(Subheading2);

        JPanel buttPanel = new JPanel(new BorderLayout(5, 1));
        buttPanel.add(OurVideosButton);

        // Here comes the implementation into content pane

        Container contentPane = MrPythonWebsite.getContentPane();   // This is a container, this is when components are added

            // This is how we add labels to the content pane
        contentPane.add(titlePanel, BorderLayout.NORTH);
        contentPane.add(subheadingPanel, BorderLayout.WEST);
            // Add the button
        contentPane.add(buttPanel, BorderLayout.SOUTH);

        // This is to ensure the frame is visible
        MrPythonWebsite.pack();
        MrPythonWebsite.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == OurVideosButton){

            MrPythonWebsite.dispose();
            System.exit(0);
        }

    }
}
