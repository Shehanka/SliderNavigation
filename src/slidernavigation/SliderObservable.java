package slidernavigation;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 11/10/2017
 * @project SliderNavigation
 **/

public class SliderObservable {

    private ArrayList<SliderObserver> observableArrayList = new ArrayList<>();

    public void addSliderObserever(SliderObserver sliderObserver){
        observableArrayList.add(sliderObserver);
    }

    public void removeSliderObserver(SliderObserver sliderObserver){
        observableArrayList.add(sliderObserver);
    }

    public void notifyObservers(int value){
        for (SliderObserver observer:
             observableArrayList) {
            observer.update(value);
        }
    }
}
