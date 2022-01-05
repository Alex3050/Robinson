package com.mobiledistillery.celsius;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public abstract class CelsiusMIDlet extends MIDlet {

   public CelsiusMIDlet() {
      Display.getDisplay(this);
   }

   public void startApp() {}

   public void pauseApp() {}

   public void destroyApp(boolean var1) {
      this.notifyDestroyed();
   }
}
