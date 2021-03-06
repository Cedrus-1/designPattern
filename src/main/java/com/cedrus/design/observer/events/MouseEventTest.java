package com.cedrus.design.observer.events;

import com.cedrus.design.observer.events.mouseevent.Mouse;
import com.cedrus.design.observer.events.mouseevent.MouseEventCallback;
import com.cedrus.design.observer.events.mouseevent.MouseEventType;

public class MouseEventTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        //@谁？  @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        mouse.click();

        mouse.focus();


    }
}
