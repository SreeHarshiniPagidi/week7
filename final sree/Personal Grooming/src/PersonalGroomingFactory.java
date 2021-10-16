/**
 * This class implements the factory design pattern
 */

public class PersonalGroomingFactory {
    public PersonalGrooming getItem(String gender, String age){
        if(gender == null){
            return null;
        }
        if(gender.equalsIgnoreCase("Skin")) {
            PersonalGrooming g= new Skin();
            ((Skin) g).selectSize(age);
            return g;
        }
        else if(gender.equalsIgnoreCase("Hair")){
            PersonalGrooming g= new Hair();
            ((Hair) g).selectSize(age);
            return g;
        }
        else if(gender.equalsIgnoreCase("Cleaning")) {
            PersonalGrooming g= new Cleaning();
            ((Cleaning) g).selectSize(age);
            return g;
        }
        return null;
    }
}