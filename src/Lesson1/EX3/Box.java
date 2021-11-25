package Lesson1.EX3;

import java.util.ArrayList;

public class Box<T> {

    double currentWeight = 0;
    ArrayList<T> arrayList = new ArrayList<>();

    void addFruit(T fruit) {
        arrayList.add(fruit);
        currentWeight++;
    }

    double getWeight(Fruit f) {
        return arrayList.size() * f.weight;
    }


    public boolean compare(Box box) {
        if (currentWeight == box.currentWeight)
            return true;
        return false;
    }

    public void toAnotherBox(Box<? super T> box) {
        box.arrayList.addAll(this.arrayList);
        this.arrayList.clear();
    }

}
