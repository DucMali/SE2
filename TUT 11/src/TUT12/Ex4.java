package TUT12;


class Vehicle {
    protected String name,registrationNumber;
    protected double width,height,length,weight;
    protected int seatingCapacity;


    public Vehicle() {}

    public Vehicle(String name, double width, double height,double length, double weight, int seatingCapacity, String registrationNumber){

        this.name = name;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.seatingCapacity = seatingCapacity;
        this.registrationNumber= registrationNumber;

    }
    @Override
    public String toString() {
        return("The vehicle's name: "+ name +"\nThe vehicle's width: "+ width +"\nThe vehicle's height:"+height
                +"\nThe vehicle's length: "+length+ "\nThe vehicle's weight: "+weight+
                "\nThe vehicle's seatingCapacity: "+seatingCapacity+"\nThe vehicle's registrationNumber: "+registrationNumber);
    }

    protected boolean validateName(String name) {
        return (name != null && name.length() > 0);
    }
    protected boolean validateHeight(double height) {
        return(height >= 0);
    }
    protected boolean validateWidth(double width) {
        return(width >=0);
    }
    protected boolean validateLength(double length) {
        return(length >=0);
    }
    protected boolean validateWeight(double weight) {
        return(weight >=0);
    }
    protected boolean validateSeat(int seat) {
        return(seat >=0);
    }
    protected boolean validateRegNum(String regNum) {
        return !(regNum.length()>12);
    }

    public void travel(String pointA, String pointB, int numbPassenger) {
        String n= this.getClass().getSimpleName();
        System.out.print(n);
        System.out.print("\u047E");
        System.out.print(" : Travel from "+pointA+" to "+pointB+ " and the number of passenger: "+ numbPassenger);
    }

}
class Bus extends Vehicle {

    public void travel(String pointA, String pointB,int numPassenger) {
        super.travel(pointA, pointB, numPassenger);
    }


}
class Car extends Vehicle{
    public void travel(String pointA, String pointB,int numPassenger) {
        super.travel(pointA, pointB, numPassenger);
    }
}
public class Ex4 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.travel("Ha Noi","Ho Chi Minh", 49);
        System.out.println();
        Vehicle b = new Bus();
        b.travel("Tokyo","France",56);
        System.out.println();
        Vehicle c = new Car();
        c.travel("Ha Nam", "Nghe An", 37);

    }

}
