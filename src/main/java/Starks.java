import javax.inject.Inject;

public class Starks implements House {

    //Constructor injection
    @Inject
    public Starks(){
        //do something..
    }

    @Override
    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void reportForWar() {
        System.out.println(this.getClass().getSimpleName()+" reporting victory..");
    }
}
