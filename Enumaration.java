
package enumaration;


public class Enumaration {

    
    public static void main(String[] args) {
        for(NewClass people : NewClass.values()){
            System.out.printf("%s\t%s\t%s\n",people,people.getDesc(), people.getYear());
        }
    }
    
}
