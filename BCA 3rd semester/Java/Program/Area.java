public class Area {
    double pi;
    double r;

    Area (){
        pi = Math.PI;
        r=7.5;
    }
    Area(double radius){
        this.r=radius;
    }
    void Area() {
        System.out.println(pi*(r*r));
    }
    public static void main(String[] args){
        Area ar=new Area(9.5);
        ar.Area();
        Area arc=new Area();
        arc.Area();
    }
}
