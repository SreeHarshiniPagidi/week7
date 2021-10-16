public abstract class PersonalGrooming {
    int age;
    SizeAdapter age;

    abstract void setAge(int age);

    public int calculateBill(int units){
        return units*age;
    }
}


