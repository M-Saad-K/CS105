import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Website implements ActionListener {

    private JFrame myWebsite;
    public Website() {makeFrame();}
    private JButton AddReview;
    private JRadioButton ShowReview;
    private JRadioButton ShowRelated;



    private void makeFrame() {

        myWebsite = new JFrame("Why Kiki's Delivery Service is Amazing");



        Container contentPane = myWebsite.getContentPane();                             // This will be my text box
        JLabel title = new JLabel("Why Kiki's Delivery Service is Amazing");       // This text will be put readied


        AddReview = new JButton("Add Your Own Opinion");                    // Making a button
        AddReview.addActionListener(this);

        ShowReview = new JRadioButton("Show Other Viewer's Opinions");
        ShowReview.addActionListener(this);

        ShowRelated = new JRadioButton("Want to look at more films directed by Hayao Miyazaki");
        ShowRelated.addActionListener(this);

        ButtonGroup otherOptionsgroup = new ButtonGroup();
        otherOptionsgroup.add(ShowReview);
        otherOptionsgroup.add(ShowRelated);

        // Layout Manager

        JPanel titleBox = new JPanel(new GridLayout(2, 1));

        titleBox.add(title);

        JPanel buttonBox = new JPanel(new GridLayout(1, 1));
        buttonBox.add(ShowReview);
        buttonBox.add(ShowRelated);

        JPanel reviewBox = new JPanel(new GridLayout(3, 1));
        reviewBox.add(AddReview);

        // Adding it to content panel

        contentPane.add(titleBox);
        contentPane.add(buttonBox, BorderLayout.NORTH);
        contentPane.add(reviewBox, BorderLayout.EAST);

        myWebsite.pack();
        myWebsite.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == AddReview){
            myWebsite.dispose();
            System.exit(0);
        } else if (e.getSource() == ShowReview){
            myWebsite.dispose();
        } else if (e.getSource() == ShowRelated){
            myWebsite.dispose();
        }
    }
}


