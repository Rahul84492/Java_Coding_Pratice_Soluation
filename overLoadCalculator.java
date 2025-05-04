public class overLoadCalculator {
    public  int add(int a,int b){
        return a+b;
    }

    public  int add(int a,int b,int c){
        return a+b+c;
    }
    public  double add(double a,double b){
        return a+b;
    }
    public static void main(String[] args) {
        overLoadCalculator calc= new overLoadCalculator();
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(96, 5));
        System.out.println(calc.add(55.5, 95.5));
    }
}
