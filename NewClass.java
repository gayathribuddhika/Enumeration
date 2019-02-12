
package enumaration;


public enum NewClass {
    Tom("chubby", "22"),
    Mary("Cutie", "12"),
    Julia("pretty", "18");
    
    private final String desc;
    private final String year;
    
    NewClass(String description, String age){
        desc = description;
        year = age;
    }
    public String getDesc(){
        return desc;
    }
    public String getYear(){
        return year;
    }

}
