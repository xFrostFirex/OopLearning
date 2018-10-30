public class Monster{
    private int health;
    private boolean alive;
    private int defense;
    private int movementSpeed;
    private int attackStat;

    public Monster(int health, int defense, int movement, int attack){
        this.alive = true;
        this.setHealth(health);
        this.setDefense(defense);
        this.setMovementSpeed(movement);
        this.setAttackStat(attack);
    }
    
    public int getHealth() {
        return health;
    }

  
    protected int getAttackStat() {
        return attackStat;
    }

   
    public void setAttackStat(int attackStat) {
        this.attackStat = attackStat;
    }

  
    public int getMovementSpeed() {
        return movementSpeed;
    }

   
    public void setMovementSpeed(int movementSpeed) {
        if(movementSpeed > 0){
            this.movementSpeed = movementSpeed;
        }
        else{
            this.movementSpeed = 1;
        }
    }

    
    public int getDefense() {
        return defense;
    }

 
    public void setDefense(int defense) {

        if(defense > 0){
            this.defense = defense;
        }
        else
        {
            this.defense = 1;
        }
    }


    public boolean isAlive() {
        return alive;
    }

    public void setHealth(int health) {
        if(health > 0){
            this.health = health;
            this.alive = true;
        }
        else{
            this.health = 0;
            this.alive = false;
            
        }
    }


}