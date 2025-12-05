 class Student {
    private double mark;

    public double getmark(){
        return mark;
    }

    public void setmark(double mark){
        this.mark=mark;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.setmark(90);
        System.out.println("The mark is: "+obj.getmark());
    }
}
