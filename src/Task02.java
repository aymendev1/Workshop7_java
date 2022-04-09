abstract class Animal{
    String NameAzougar56473;
 int ageAzougar56473,weightAzougar56473;

    public Animal(int age) {
        this.ageAzougar56473=age;
    }

    public void eatAzougar56473(String meal){};
 abstract void getVoiceAzougar56473();
 public Animal(){
     ageAzougar56473 = weightAzougar56473=0;
     NameAzougar56473="None";
 }
 public Animal(String name,int age , int weight){
     this.NameAzougar56473=name;
     this.ageAzougar56473=age;
     this.weightAzougar56473=weight;
 }
    public String getnameAzougar56473(){return this.NameAzougar56473;};
    public void setNameAzougar56473(String w){this.NameAzougar56473=w;};
    public int getAgeAzougar56473(){return this.ageAzougar56473;};
    public void setAgeAzougar56473(int w){this.ageAzougar56473=w;};
    public int getweightAzougar56473(){return this.weightAzougar56473;};
    public void setweightAzougar56473(int w){this.weightAzougar56473=w;};
}

class Mammal extends Animal{
    private String orderAzougar56473;
    public Mammal(){
    super();
    orderAzougar56473=" ";
     }
    public Mammal(String name,int age , int weight , String order){
       super(name,age,weight);
       this.orderAzougar56473=order;
    }
    public Mammal(int age , String order){
        super(age);
        this.orderAzougar56473=order;
    }

    public void SleepAzougar56473(){System.out.println("zzz");}

    @Override
    void getVoiceAzougar56473() {
System.out.println("I am Making Sound !@#%$$#@#");
    }
    @Override
    public void eatAzougar56473(String meal) {
        System.out.println("Mamal is eating a "+ meal);
    }
    public String getOrderAzougar56473(){return this.orderAzougar56473;};
    public void setOrderAzougar56473(String w){this.orderAzougar56473=w;};
    public String ToStringAzougar56473(){
        return "Mammal :\n "+"Order : "+orderAzougar56473;
    }
}

class Bird extends Animal{
    private String Type_BirdAzougar56473;
    public Bird(){
        super();
        Type_BirdAzougar56473=" ";
    }
    public Bird(String name,int age , int weight , String Type_of_Bird){
        super(name,age,weight);
        this.Type_BirdAzougar56473=Type_of_Bird;
    }
    public Bird(int age , String Type_of_Bird){
        super(age);
        this.Type_BirdAzougar56473=Type_of_Bird;
    }

    public void Fly(){System.out.println("im flying ");}

    @Override
    void getVoiceAzougar56473() {
        System.out.println("Quack Quack Quack");
    }
    @Override
    public void eatAzougar56473(String meal) {
        System.out.println("Bird is eating a "+ meal);
    }
    public String getTypeAzougar56473(){return this.Type_BirdAzougar56473;};
    public void setTypeAzougar56473(String w){this.Type_BirdAzougar56473=w;};
    public String ToString(){
        return "Bird :\n "+"Type of Bird : "+Type_BirdAzougar56473;
    }
}
 class Fish extends Animal{
    //There are jawless fishes, cartilaginous (cart uhl AJ uh nuhs) fishes, and bony fishes.
     private String General_typeAzougar56473;
     public Fish(){
         super();
         General_typeAzougar56473=" ";
     }
     public Fish(String name,int age , int weight , String General_type){
         super(name,age,weight);
         this.General_typeAzougar56473=General_type;
     }
     public Fish(int age , String General_type){
         super(age);
         this.General_typeAzougar56473=General_type;
     }

     public void Search_For_Food(){System.out.println("im looking for food ");}

     @Override
     void getVoiceAzougar56473() {
         System.out.println("Blu Blu BLu");
     }
     @Override
     public void eatAzougar56473(String meal) {
         System.out.println("Fish is eating a "+ meal);
     }
     public String getGTypeAzougar56473(){return this.General_typeAzougar56473;};
     public void setGTypeAzougar56473(String w){this.General_typeAzougar56473=w;};
     public String ToString(){
         return "Fish :\n "+"General Type of Fish : "+General_typeAzougar56473;
     }
 }
class Dog extends Mammal{
    private String FavColorAzougar56473;
    Dog(){
        super();
        FavColorAzougar56473="Blue";
    }
    public Dog(String name,int age , int weight , String order, String favColor){
        super(name,age,weight,order);
        this.FavColorAzougar56473=favColor;
    }
    public Dog(int age , String order, String favColor){
        super(age,order);
        this.FavColorAzougar56473=favColor;
    }
    public void WakeUp(){System.out.println("I Just Woke Up *_*");}

    @Override
    public void SleepAzougar56473() {
        System.out.println("The Dog Is Slepping");
    }

    @Override
    void getVoiceAzougar56473() {
        System.out.println("Haw Haw");
    }

    @Override
    public void eatAzougar56473(String meal) {
        System.out.println("I am Eating my Crochets");
    }
    public String getFavColorAzougar56473(){return this.FavColorAzougar56473;};
    public void setFavColorAzougar56473(String w){this.FavColorAzougar56473=w;};
    public String ToString(){
        return "Dog :\n "+"Favorite Color : "+FavColorAzougar56473;
    }
}
class BlowFish extends Fish{
    private String TypeAzougar56473;
    BlowFish(){
        super();
        TypeAzougar56473="Tetraodontidae ";
    }
    public BlowFish(String name,int age , int weight , String order, String Type){
        super(name,age,weight,order);
        this.TypeAzougar56473=Type;
    }
    public BlowFish(int age , String order, String Type){
        super(age,order);
        this.TypeAzougar56473=Type;
    }
    public void travel(){System.out.println("Im going  *_*");}

    @Override
    public void Search_For_Food() {
        System.out.println("The Blowfish is looking for something to eat ");
    }

    @Override
    void getVoiceAzougar56473() {
        System.out.println("Blu Blu BLu");
    }

    @Override
    public void eatAzougar56473(String meal) {
        System.out.println("I am Eating "+meal);
    }
    public String getType(){return this.TypeAzougar56473;};
    public void setType(String w){this.TypeAzougar56473=w;};
    public String ToString(){
        return "BlowFish :\n "+"Type : "+TypeAzougar56473;
    }
}
class Pigeon extends Bird{
    private int NO_Species;
    Pigeon(){
        super();
        NO_Species=351;
    }
    public Pigeon(String name,int age , int weight , String order, int NO_Species){
        super(name,age,weight,order);
        this.NO_Species=NO_Species;
    }
    public Pigeon(int age , String order, int NO_Species){
        super(age,order);
        this.NO_Species=NO_Species;
    }
    public void dance(){System.out.println("Im dacing  *_*");}

    @Override
    public void Fly(){System.out.println("The Pigeon is flying ");}

    @Override
    void getVoiceAzougar56473() {
        System.out.println("PAC PAC PAC");
    }

    @Override
    public void eatAzougar56473(String meal) {
        System.out.println("I am Eating "+meal);
    }
    public int getNoSpecies(){return this.NO_Species;};
    public void setNoSpecies(int w){this.NO_Species=w;};
    public String ToString(){
        return "Pigeon :\n "+"Number of Species : "+NO_Species;
    }
}
public class Task02 {
public static void main(String[]args){
    Animal animal[]= new Animal[6];
    animal[0]= new Mammal("My Mammal",9,15,"Security");
    animal[1]= new Dog("Rok",15,35,"Poland","Black");
    animal[2]= new Bird("Hab",5,10,"Parrots");
    animal[3]= new Fish("Gold Fish",3,15,"Jawless");
    animal[4]= new BlowFish("Blow Fish",6,50,"GRECCE","Blow");
    animal[5]= new Pigeon("MyPigeon",60,30,"Atlantic",351);


    // Bird
    animal[1].getVoiceAzougar56473();
    animal[2].getVoiceAzougar56473();



}
}
