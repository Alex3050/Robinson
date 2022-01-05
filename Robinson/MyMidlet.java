package Robinson;

import com.mobiledistillery.celsius.CelsiusMIDlet;
import data.p;
import javax.microedition.lcdui.Display;

public class MyMidlet extends CelsiusMIDlet {

   private p a = new p(this);  // 初始化主循环p


   public MyMidlet() {
      (new Thread(this.a)).start();
   }

   public final void startApp() {
      Display.getDisplay(this).setCurrent(this.a);
   }

   public final void pauseApp() {}

   public final void destroyApp(boolean var1) {
      this.notifyDestroyed();
   }
}
