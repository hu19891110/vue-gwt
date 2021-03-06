package com.axellience.vuegwtexamples.client.examples.exclamation;

import com.axellience.vuegwt.client.component.VueComponent;
import com.axellience.vuegwt.jsr69.component.annotations.Component;
import jsinterop.annotations.JsProperty;

@Component
public class ExclamationComponent extends VueComponent
{
    @JsProperty String message = "Hello Vue GWT!";

    public void addExclamationMark()
    {
        this.message += "!";
    }
}