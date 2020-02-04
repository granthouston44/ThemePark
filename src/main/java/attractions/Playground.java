package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        boolean allowed = true;
        if (visitor.getAge() >= 15){
            allowed = false;
        }

        return allowed;
    }
}
