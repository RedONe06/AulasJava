package Ex1;

public class Operation {
    private double n1, n2, n3, n4, n5, sum, product, average;

    public void setN1(double n1) {
        this.n1 = n1;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public void setN3(double n3) {
        this.n3 = n3;
    }
    public void setN4(double n4) {
        this.n4 = n4;
    }
    public void setN5(double n5) {
        this.n5 = n5;
    }
    
    public double sum(){
        sum = this.n1+this.n2+this.n3+this.n4+this.n5;
        return sum;
    }
    public double product(){
        product = this.n1*this.n2*this.n3*this.n4*this.n5;
        return product;
    }
    public double average(){
        average = (this.n1+this.n2+this.n3+this.n4+this.n5)/5;
        return average;
    }
}
