/*
 * Created by JFormDesigner on Fri Nov 10 10:34:33 IST 2017
 */

package com.chamodshehanka.sliderNavigation.ui;

import slidernavigation.SliderObservable;
import slidernavigation.SliderObserver;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 * @author unknown
 */
public class SliderForm extends JFrame implements SliderObserver{
    private SliderObservable sliderObservable;
    public SliderForm(SliderObservable sliderObservable, String title) {
        initComponents();
        setVisible(true);
        setTitle(title);
        setSize(400,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.sliderObservable = sliderObservable;
    }

    private void slider1StateChanged(ChangeEvent e) {
        sliderObservable.notifyObservers(slider1.getValue());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Chamod Shehanka
        slider1 = new JSlider();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- slider1 ----
        slider1.setOrientation(SwingConstants.VERTICAL);
        slider1.addChangeListener(e -> slider1StateChanged(e));
        contentPane.add(slider1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Chamod Shehanka
    private JSlider slider1;

    @Override
    public void update(int value) {
        slider1.setValue(value);
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
