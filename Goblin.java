public class Goblin extends Monster {

    public Goblin(int health, int defense, int movement, int attack){
        super(health, defense, movement, attack);
    }

    public int GetAttackDamage()
    {
        return this.getAttackStat() * 12;
    }

    public int GetAttackDamage(int weaponDamage)
    {
        return this.getAttackStat() * weaponDamage;
    }


}