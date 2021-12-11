package prac10;
public class ConcreteFactory implements ComplexAbsractFactory {

    public Complex createComplex(){
        Complex l = new Complex(11, 22);
        return l;
    }

    public Complex CreateComplex(int real, int image){
        Complex l = new Complex(real, image);
        return l;
    }

    public static void main(String[] args) {
        int num = 2;
        int image = 3;
        ConcreteFactory test = new ConcreteFactory();
        System.out.println(test.CreateComplex(num, image));
        System.out.println(test.createComplex());
    }
}
