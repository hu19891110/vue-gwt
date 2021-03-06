package com.axellience.vuegwtexamples.client.examples.tree;

import com.axellience.vuegwt.client.component.VueComponent;
import com.axellience.vuegwt.jsr69.component.annotations.Component;
import jsinterop.annotations.JsProperty;

/**
 * @author Adrien Baron
 */
@Component(components = TreeFolderComponent.class)
public class TreeComponent extends VueComponent
{
    @JsProperty Folder myFolder;

    public TreeComponent()
    {
        myFolder = new Folder("Root");
        myFolder.getContent().push(new Folder("Child 1"));
        myFolder.getContent().push(new Folder("Child 2"));

        Folder child3 = new Folder("Child 3");
        myFolder.getContent().push(child3);
        child3.getContent().push(new Folder("Sub Child 1"));

        Folder subChild2 = new Folder("Sub Child 2");
        child3.getContent().push(subChild2);
        subChild2.getContent().push(new Folder("Sub Sub Child 1"));

        myFolder.getContent().push(new Folder("Child 4"));
    }
}
