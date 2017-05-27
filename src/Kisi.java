/**
 * Created by Şeyma Yılmaz on 27.5.2017.
 */
public class Kisi {

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){

        if(age >= 0){
            this.age = age;
        }

    }
}
