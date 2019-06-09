public class Main {
    public static void main(String[] args) {
        NumarComplex n1=new NumarComplex(5,6);
        NumarComplex n2=new NumarComplex(3,6);

        System.out.println(n1);
        System.out.println(n2);
        NumarComplex n3=n1.sum(n2);
        System.out.println(n3);
        System.out.println(n1.substract(n2));

        System.out.println(n3.isReal());



    }
}
