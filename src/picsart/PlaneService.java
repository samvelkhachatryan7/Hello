package picsart;

public class PlaneService {
    public static void main(String[] args) {
        printPlaneInfo();
        printParameter();
        printNewerPlane();
        printBiggerWingspan();
        printSmallestSeatsCount();
        printMinimalWeight();

    }

    static Plane plane = new Plane("Boeing", "Armenia", 2010, 8000, false, 40000, 30, 900, 100, 200.5);
    static Plane plane2 = new Plane("Boeing777","UK",2008,5000,true,30000,20,850,80,250.6);
    static Plane plane3 = new Plane("Boeing888","USA",2007,4000,true,20000,25,800,85,350.6);
//Task 1. (score 5)
//Create function:
//Parameter one Plane
//Result: print all information of the plane
    public static void printPlaneInfo() {

        System.out.println(plane.getModel() + " " + plane.getCountry() + " " + plane.getYear() + " " + plane.getHours() + " " + plane.isMilitary() + " " +
                plane.getWeight() + " " + plane.getWingspan() + " " + plane.getTopSpeed() + " " + plane.getSeats() + " " + plane.getCost());
    }
//Task 2. (score 5)
//Create function:
//Parameter one Plane
//Result: print cost and topSpeed if the plane is military otherwise print model and country
    public static void printParameter() {
        if (plane.isMilitary()) {
            System.out.println(plane.getCost() + " " + plane.getTopSpeed());
        } else {
            System.out.println(plane.getModel() + " " + plane.getCountry());
        }

    }
    //Task 3. (score 7)
    //Create function:
    //Parameter two Planes
    //Result: return the plane which one is newer (if they have the same age return first one).
    public static void printNewerPlane(){
        if (plane.getYear() >=plane2.getYear()){
            System.out.println(plane.getModel());
        }
        else {
            System.out.println(plane2.getModel());
        }
    }
    //Task 4. (score 7)
    //Create function:
    //Parameter two Planes
    //Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).
    public static void printBiggerWingspan(){
        if(plane2.getWingspan() >= plane.getWingspan()){
            System.out.println(plane2.getModel());
        }
        else{
            System.out.println(plane.getModel());
        }
    }
    //Task 5. (score 7)
    //Create function:
    //Parameter three Planes
    //Result: print country of the plane with smallest seats count (if they have the same - print first).
    public static void printSmallestSeatsCount(){
        if(plane.getSeats() <= plane2.getSeats() && plane.getSeats() <= plane3.getSeats()){
            System.out.println( plane.getCountry());
        }
       else if(plane2.getSeats() < plane.getSeats() && plane2.getSeats() < plane3.getSeats()){
            System.out.println(plane2.getCountry());
        }
        else {
            System.out.println(plane3.getCountry());
        }
    }
    //Task 8. (score 10)
    //Create function:
    //Parameter array of Planes
    //Result: return the plane with minimal weight (if there are some of them return last one).
    public static Plane[] printMinimalWeight(){
        Plane[] planes = {plane,plane2,plane3 };
        int temp = 0;
        for (int i = 0; i < planes.length; i++) {
            if(i+1 < planes.length){
                if( planes[i].getWeight() >  planes[i+1].getWeight()){
                    temp =  planes[i].getWeight();
                }
            }

        }
        System.out.println(temp);
        return planes;

    }

}
