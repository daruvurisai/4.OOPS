//This Class takes the cost that needs to be covered per area
public class Carpet {
    private double cost;

    public Carpet(double cost){
        if(cost<0){
            cost=-0;
        }
        this.cost=cost;
    }

    public double getCost(){
        return this.cost;
    }
}
