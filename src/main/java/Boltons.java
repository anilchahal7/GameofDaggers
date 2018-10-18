import javax.inject.Inject;

import dagger.Provides;

public class Boltons implements House {

    @Inject
    public Boltons(){
        //do something..
    }

    @Override
    public void prepareForWar() {
        System.out.println(this.getClass().getSimpleName()+" prepared for war");
    }

    @Override
    public void reportForWar() {
        System.out.println(this.getClass().getSimpleName()+" loose to Starks..");
    }
}
