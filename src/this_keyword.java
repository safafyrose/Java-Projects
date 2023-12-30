public class this_keyword {
    int ID;
    String Name;
    String Email;
    int age;
    String location;

    void details(int ID, String Name, String Email, int age, String location) {
        this.ID = ID;
        this.Name = Name;
        this.Email = Email;
        this.age = age;
        this.location = location;
    }

    void display() {
        System.out.println(ID + "" + Name + "" + Email + "" + age + "" + location);
    }
public static void main(String args[]){
    this_keyword d1 = new this_keyword();
    this_keyword d2 = new this_keyword();
    d1.details(1,"Sarah","gdetd@email.com",21,"Kerala");
    d2.details(2,"Josh","josh@email.com",22,"Kerala");
         d1.display();
         d2.display();
    }
}

