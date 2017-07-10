package com.axellience.vuegwtexamples.client.examples.counterwithevent;

import com.axellience.vuegwt.client.VueComponent;
import com.axellience.vuegwt.jsr69.component.annotations.Component;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;

/**
 * @author Adrien Baron
 */
@Component(components = ButtonCounterComponent.class)
public class CounterWithEventComponent extends VueComponent
{
    @JsProperty
    protected int total;

    @Override
    public void created()
    {
        this.total = 0;
    }

    @JsMethod
    protected void incrementTotal() {
        this.total++;
    }
}