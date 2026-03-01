 class Area {
    double r;
    double area;

    Area(){
        r=60;
        area=r*r*3.1415;
   

    }
    void display(){
        System.out.println(" Area of circle " +area);
    }
}
public class Circle{
    public static void main(String[]args){
        Area a=  new Area();
        a.display();


    }
}
