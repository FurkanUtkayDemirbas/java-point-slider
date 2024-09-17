package odev5;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class odev5 extends JFrame {
    private JSlider ortalamaslider;
    private JPanel panel;
    private JSlider vizeslider;
    private JSlider odevslider;
    private JSlider finalslider;
    private JTextField vizefield;
    private JTextField odevfield;
    private JTextField finalfield;
    private JLabel ortlabel;
    float vize,final1,odev;
    double ortalama;
    odev5()
    {
        add(panel);
        setSize(500,500);
        setTitle("Odev5");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        vizeslider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                vize=vizeslider.getValue();
                vizefield.setText(String.valueOf(vize));
                vizefield.setText(String.valueOf(vizeslider.getValue()));

                odev=odevslider.getValue();
                final1=finalslider.getValue();
                ortalama=((double) vize+odev+final1)/2;
                ortlabel.setText(Double.toString(ortalama));
                ortalamaslider.setValue((int) ortalama);
                if((int) ortalama>=60)
                {
                    ortalamaslider.setBackground(Color.GREEN);
                } else if ((int) ortalama>=55 && (int) ortalama<60) {

                    ortalamaslider.setBackground(Color.ORANGE);
                }
                else if ((int) ortalama<55) {

                    ortalamaslider.setBackground(Color.RED);
                }



            }
        });

        odevslider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                vize=vizeslider.getValue();
                odev=odevslider.getValue();
                odevfield.setText(String.valueOf(odev));
                odevfield.setText(String.valueOf(odevslider.getValue()));
                final1=finalslider.getValue();
                ortalama=((double) vize+odev+final1)/2;
                ortlabel.setText(Double.toString(ortalama));
                ortalamaslider.setValue((int) ortalama);

                if((int) ortalama>=60)
                {
                    ortalamaslider.setBackground(Color.GREEN);
                } else if ((int) ortalama>=55 && (int) ortalama<60) {

                    ortalamaslider.setBackground(Color.ORANGE);
                }
                else if ((int) ortalama<55) {

                    ortalamaslider.setBackground(Color.RED);
                }




            }
        });

        finalslider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                vize=vizeslider.getValue();
                odev=odevslider.getValue();
                final1=finalslider.getValue();
                finalfield.setText(String.valueOf(final1));
                finalfield.setText(String.valueOf(finalslider.getValue()));
                ortalama=((double) vize+odev+final1)/2;
                ortlabel.setText(Double.toString(ortalama));
                ortalamaslider.setValue((int) ortalama);

                if((int) ortalama>=60)
                {
                    ortalamaslider.setBackground(Color.GREEN);
                } else if ((int) ortalama>=55 && (int) ortalama<60) {

                    ortalamaslider.setBackground(Color.ORANGE);
                }
                else if ((int) ortalama<55) {

                    ortalamaslider.setBackground(Color.RED);
                }




            }
        });


        vizefield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(vizefield.getText());
                vizeslider.setValue(value);
            }
        });
        odevfield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(odevfield.getText());
                odevslider.setValue(value);

            }
        });
        finalfield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(finalfield.getText());
                finalslider.setValue(value);

            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                odev5 odevbes = new odev5();
                odevbes.setVisible(true);
            }
        });
    }
}
