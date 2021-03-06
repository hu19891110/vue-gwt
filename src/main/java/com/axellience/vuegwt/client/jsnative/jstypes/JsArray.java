package com.axellience.vuegwt.client.jsnative.jstypes;

import com.axellience.vuegwt.client.jsnative.jstypes.arrayfunctions.JsComparator;
import com.axellience.vuegwt.client.jsnative.jstypes.arrayfunctions.JsEach;
import com.axellience.vuegwt.client.jsnative.jstypes.arrayfunctions.JsMap;
import com.axellience.vuegwt.client.jsnative.jstypes.arrayfunctions.JsPredicate;
import com.axellience.vuegwt.client.jsnative.jstypes.arrayfunctions.JsPredicateWithIndex;
import com.axellience.vuegwt.client.jsnative.jstypes.arrayfunctions.JsPredicateWithIndexAndArray;
import com.axellience.vuegwt.client.jsnative.jstypes.arrayfunctions.JsReduce;
import com.axellience.vuegwt.client.jsnative.jstypes.arrayfunctions.JsReduceWithIndex;
import com.axellience.vuegwt.client.jsnative.jstypes.arrayfunctions.JsReduceWithIndexAndArray;
import com.axellience.vuegwt.client.tools.JsTools;
import com.axellience.vuegwt.client.tools.VueGWTTools;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/**
 * Original Source: https://github.com/ltearno/angular2-gwt/
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Array")
public class JsArray<T>
{
    public int length;

    @JsOverlay
    @SafeVarargs
    public static <T> JsArray<T> of(T... array)
    {
        JsArray<T> result = new JsArray<>();
        for (T item : array)
            result.push(item);
        return result;
    }

    @JsOverlay
    public static <T> JsArray<T> from(Collection<T> collection)
    {
        return VueGWTTools.javaArrayToJsArray(collection.toArray());
    }

    @JsOverlay
    public static <K, V> JsArray<V> from(Map<K, V> map)
    {
        return VueGWTTools.javaArrayToJsArray(map.values().toArray());
    }

    @JsOverlay
    public static <T> JsArray<T> from(JsArray<T> jsArray)
    {
        return jsArray;
    }

    @JsOverlay
    public static <T> JsArray<T> empty()
    {
        return new JsArray<>();
    }

    @JsMethod
    public native T pop();

    @JsMethod
    public native void push(T item);

    @JsMethod
    public native JsArray<T> reverse();

    @JsMethod
    public native T shift();

    @JsMethod
    public native JsArray<T> sort(JsComparator<T> comparator);

    @JsMethod
    public native void splice(int start, int length);

    @JsMethod
    public native void unshift(T item);

    @JsMethod
    public native JsArray<T> concat(JsArray<T> array);

    @JsMethod
    public native int indexOf(T item);

    @JsMethod
    public native String join();

    @JsMethod
    public native String join(String joiner);

    @JsMethod
    public native int lastIndexOf(Object item);

    @JsMethod
    public native int lastIndexOf(Object item, int fromIndex);

    @JsMethod
    public native boolean every(JsPredicate<T> every);

    @JsMethod
    public native boolean every(JsPredicateWithIndex<T> every);

    @JsMethod
    public native boolean every(JsPredicateWithIndexAndArray<T> every);

    @JsMethod
    public native JsArray<T> filter(JsPredicate<T> predicate);

    @JsMethod
    public native JsArray<T> filter(JsPredicateWithIndex<T> predicate);

    @JsMethod
    public native JsArray<T> filter(JsPredicateWithIndexAndArray<T> predicate);

    @JsMethod
    public native T find(JsPredicate<T> predicate);

    @JsMethod
    public native T find(JsPredicateWithIndex<T> predicate);

    @JsMethod
    public native T find(JsPredicateWithIndexAndArray<T> predicate);

    @JsMethod
    public native void forEach(JsEach<T> each);

    @JsMethod
    public native <T2> JsArray<T2> map(JsMap<T, T2> map);

    @JsMethod
    public native <T2> T2 reduce(JsReduce<T, T2> reduce);

    @JsMethod
    public native <T2> T2 reduce(JsReduce<T, T2> reduce, T2 initialValue);

    @JsMethod
    public native <T2> T2 reduceRight(JsReduce<T, T2> reduce);

    @JsMethod
    public native <T2> T2 reduceRight(JsReduce<T, T2> reduce, T2 initialValue);

    @JsMethod
    public native <T2> T2 reduce(JsReduceWithIndex<T, T2> reduce);

    @JsMethod
    public native <T2> T2 reduce(JsReduceWithIndex<T, T2> reduce, T2 initialValue);

    @JsMethod
    public native <T2> T2 reduceRight(JsReduceWithIndex<T, T2> reduce);

    @JsMethod
    public native <T2> T2 reduceRight(JsReduceWithIndex<T, T2> reduce, T2 initialValue);

    @JsMethod
    public native <T2> T2 reduce(JsReduceWithIndexAndArray<T, T2> reduce);

    @JsMethod
    public native <T2> T2 reduce(JsReduceWithIndexAndArray<T, T2> reduce, T2 initialValue);

    @JsMethod
    public native <T2> T2 reduceRight(JsReduceWithIndexAndArray<T, T2> reduce);

    @JsMethod
    public native <T2> T2 reduceRight(JsReduceWithIndexAndArray<T, T2> reduce, T2 initialValue);

    @JsMethod
    public native boolean some(JsPredicate<T> every);

    @JsMethod
    public native boolean some(JsPredicateWithIndex<T> every);

    @JsMethod
    public native boolean some(JsPredicateWithIndexAndArray<T> every);

    @JsMethod
    public native JsArray<T> slice(int start, int end);

    @JsMethod
    public native JsArray<T> slice(int start);

    @JsProperty
    public native int getLength();

    @JsProperty
    public native void setLength(int length);

    @JsOverlay
    public final T get(int index)
    {
        return JsTools.get(this, index);
    }

    @JsOverlay
    public final void set(int index, T value)
    {
        JsTools.set(this, index, value);
    }

    @JsOverlay
    public final Iterable<T> iterate()
    {
        return () -> new Iterator<T>()
        {
            int index = 0;
            boolean hasCalledNext;

            @Override
            public boolean hasNext()
            {
                return index < getLength();
            }

            @Override
            public T next()
            {
                T result = get(index);
                index++;
                hasCalledNext = true;
                return result;
            }

            @Override
            public void remove()
            {
                if (!hasCalledNext)
                    throw new IllegalStateException();

                hasCalledNext = false;
                splice(index - 1, 1);
            }
        };
    }
}
