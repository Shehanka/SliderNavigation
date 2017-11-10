package com.chamodshehanka.sliderNavigation.controller;

import java.util.ArrayList;

/**
 * @author chamodshehanka on 11/10/2017
 * @project SliderNavigation
 **/
public class SliderObservable {
    private ArrayList<SliderObserver> observerArrayList = new ArrayList<>();

    public void addSliderObserver(SliderObserver sliderObserver){
        observerArrayList.add(sliderObserver);
    }

    public void removeObserver(SliderObserver sliderObserver){
        observerArrayList.add(sliderObserver);
    }

    public void notifyObservers(int value){
        for (SliderObserver sliderObserver:
             observerArrayList) {
            sliderObserver.update(value);
        }
    }
}
