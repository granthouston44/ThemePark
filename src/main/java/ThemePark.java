
import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

   private ArrayList<Attraction> attractions;
   private ArrayList<Stall> stalls;

   public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls){
    this.attractions = attractions;
    this.stalls = stalls;
   }

    public ArrayList<IReviewed> getAllReviewed(){
       ArrayList<IReviewed> reviewed = new ArrayList<>();
        for (int i = 0; i < attractions.size(); i++){
            IReviewed currentAttraction = attractions.get(i);
            reviewed.add(currentAttraction);
        }

        for ( int i = 0; i < stalls.size(); i++) {
            IReviewed currentStall = stalls.get(i);
            reviewed.add(currentStall);
        }

        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
       int attractionCount = attraction.getVisitCount();
       attraction.setVisitCount(attractionCount + 1);

       visitor.getVisitedAttractions().add(attraction);
    }




}
