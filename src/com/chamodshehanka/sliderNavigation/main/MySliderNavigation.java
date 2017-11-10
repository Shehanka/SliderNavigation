package com.chamodshehanka.sliderNavigation.main;

import com.chamodshehanka.sliderNavigation.ui.SliderForm;
import slidernavigation.SliderObservable;

/**
 * @author chamodshehanka on 11/10/2017
 * @project SliderNavigation
 **/

public class MySliderNavigation {
    public static void main(String[] args) {
        SliderObservable sliderObservable = new SliderObservable();
        sliderObservable.addSliderObserever(new SliderForm(sliderObservable,"One"));
        sliderObservable.addSliderObserever(new SliderForm(sliderObservable,"Two"));
        sliderObservable.addSliderObserever(new SliderForm(sliderObservable,"Three"));
    }
}
