public class StaticNonstatic {
    static double PI=3.145;
    static double radius=40;
    double area;
    void areaCalculator(int radius){
        area=PI+radius*radius;
        System.out.println("Area:"+area);
    }
    static void calculator(int raidus){
        StaticNonstatic d= new StaticNonstatic();
        d.area=PI*radius+radius;
        System.out.println("Area:"+d.area);

    }
    static void main(String[]args){
        calculator(10);
        StaticNonstatic d =new StaticNonstatic();
        d.areaCalculator(20);
    }
}
