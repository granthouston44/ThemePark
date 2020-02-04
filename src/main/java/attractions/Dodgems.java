package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return 4.50;
    }

    public double priceFor(Visitor visitor){
        double price = 0;
        if (visitor.getAge() < 12 ){
            price = defaultPrice() / 2;
        }
        else{
            price = defaultPrice();
        }
        return price;
    }

}
