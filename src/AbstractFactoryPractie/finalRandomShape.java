package AbstractFactoryPractie;

import java.awt.*;

public class finalRandomShape extends absshape {


    @Override
    public shape getShape(String input) {
        if (input.equals("circle")){
            return new circle();
        } else if (input.equals("Rectangle")) {
            return new Rectangle();

        } else if (input.equals("square")) {
            return new square();

        }
        else{
            return null;
        }

    }
}
