class car {
    int year;
    String model;
    void sound(){
        System.out.println("ratatatat"+" "+year+" "+model);
    }

}

class bike{
    int year1;
    String model1;
    void soundb(){
        System.out.println("drrrrr"+" "+year1+" "+model1);
    }
}

public class bmw extends car {
    public static void main(String[] args) {
        bmw b=new bmw();
        b.year=2020;
        b.model="X5";
        b.sound();
    }
}
