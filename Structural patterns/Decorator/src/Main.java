import decorators.BorderDecorator;
import decorators.ColorDecorator;
import object.Button;
import object.Component;
import object.TextView;
import object.Window;

import javax.swing.*;

public class Main {

    private static Component window;
    private static Component textView;
    private static Component button;
    public static void main(String[] args) {

        boolean showBorder = true;

        if(showBorder){
            window = new Window();
            textView = new TextView();
            button = new Button();
        }else{
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }

        window.draw();
        textView.draw();
        button.draw();
    }
}