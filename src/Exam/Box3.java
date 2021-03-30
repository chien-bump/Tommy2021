package Exam;

public class Box3 extends Box {
    public Box3(){
        length = 10;
        width = 10;
        height = 10;

    }

    @Override
    public String getName() {
        return "Box3";
    }

    @Override
    public int getPrice() {
        return 60;
    }
}
