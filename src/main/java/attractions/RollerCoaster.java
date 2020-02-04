package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity {

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

}
