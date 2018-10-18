
public class BattleOfBastards {

    public static void main(String[] args) {

        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();

        BattleComponent component = DaggerBattleComponent.builder().
                braavosModule(new BraavosModule(cash, soldiers)).build();

        War war = component.getWar();
        war.prepare();
        war.report();

        // Using cash and soldiers
        component.getCash();
        component.getSoldiers();

        /*BattleComponent component = DaggerBattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.report();*/

        /*Starks starks = new Starks();
        Boltons boltons = new Boltons();
        War war = new War(starks, boltons);
        war.prepare();
        war.report();*/
    }
}