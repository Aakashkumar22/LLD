package AbstractFactoryPractie;

public class finalTringle extends  absshape {


    @Override
    public shape getShape(String input) {
        if (input.equals("sambahu")){
            return new sambahu();
        } else if (input.equals("sandiubahu")) {
            return new sandiubahu();

        }
        else{
            return null;
        }
    }
}
