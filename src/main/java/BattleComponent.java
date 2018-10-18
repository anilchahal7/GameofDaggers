import dagger.Component;

@Component(modules = BraavosModule.class)
interface BattleComponent {
    War getWar();
    Cash getCash();
    Soldiers getSoldiers();
    Starks getStarks();
    Boltons getBoltons();
}