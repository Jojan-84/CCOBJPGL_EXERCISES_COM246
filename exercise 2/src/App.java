public class App {
    public static void main(String[] args) throws Exception {
        
         
        Researcher rs1 = new Researcher("john", "", 0);
        Data_Scientist ds1 = new Data_Scientist("Jane", "", 0);
        System.out.println( rs1.name + " works as a " + rs1.getWork() + " and they earn " + rs1.getSalary());
        System.out.println( ds1.name +" works as a " + ds1.getWork() + " and they earn " + ds1.getSalary());

        car mycar = new car();

        System.out.println("My car has " + mycar.cylinders + " cylinders and " + mycar.battery + " battery.");

    

    }
}