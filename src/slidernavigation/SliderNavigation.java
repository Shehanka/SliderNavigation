/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slidernavigation;

/**
 *
 * @author student
 */
public class SliderNavigation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SliderMaster master=new SliderMaster();
        SliderObservable sliderObservable = new SliderObservable();
        sliderObservable.addSliderObserever(new SliderHorizontal());
        sliderObservable.addSliderObserever(new SliderVertical());
        sliderObservable.addSliderObserever(new SliderValue());

        master.addSliderObserver((SliderObserver) sliderObservable);

        master.setVisible(true);
    }
    
}
