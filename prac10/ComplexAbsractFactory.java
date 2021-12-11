package prac10;

public interface ComplexAbsractFactory {
     default Complex  createComplex(){
        Complex l = new Complex(11, 22);
        return l;
    }
     default Complex  CreateComplex(int real, int image) {
        Complex l = new Complex(real,image);
        return l;
    }
}


