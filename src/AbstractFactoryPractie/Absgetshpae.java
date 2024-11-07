package AbstractFactoryPractie;

public class Absgetshpae {
    public absshape getfinalshape(String input){
        switch (input){
            case "finalRandomShape":
                return new finalRandomShape();

            case "finalTringle":
                return new finalTringle();

        }

        return null;
    }
}
