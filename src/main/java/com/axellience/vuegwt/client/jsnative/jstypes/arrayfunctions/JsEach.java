package com.axellience.vuegwt.client.jsnative.jstypes.arrayfunctions;

import jsinterop.annotations.JsFunction;

/**
 * Source: https://github.com/ltearno/angular2-gwt/
 */
@JsFunction
@FunctionalInterface
public interface JsEach<T>
{
    void execute(T value);
}