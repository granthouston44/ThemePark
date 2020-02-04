package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }


    public boolean isAllowedTo(Visitor visitor) {
        boolean allowed = true;
        if(visitor.getHeight() < 1.45 && visitor.getAge() < 12){
            allowed = false;
        }
        return allowed;
    }


    public double defaultPrice(){
     return 8.40;
    }

    public double priceFor(Visitor visitor){
        double price = 0;
        if (visitor.getHeight() > 2 ){
            price = defaultPrice() * 2;
        }
        else{
            price = defaultPrice();
        }
        return price;
    }

}
