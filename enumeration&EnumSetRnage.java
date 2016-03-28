//main class

/*

import java.util.EnumSet;
import java.util.Scanner;
//import java.util.Random;
public class main {

public static void main(String[] args) 
{
for (enumeration people: enumeration.values())
	System.out.printf("%s \t %s \t %s \n", people, people.getdesc(), people.getyear());

    System.out.println("\n enum range program \n ");
    
 for (enumeration people: EnumSet.range(enumeration.bitch2, enumeration.bitch5) )
	 System.out.printf("%s \t %s \t %s \n", people, people.getdesc(), people.getyear());
 
   
}
}

*/

public enum enumeration {
    bitch("awara", "24"),
    bitch2("sheth", "24"),
    bitch3("usa", "50"),
    bitch4("italy", "34"),
    bitch5("paris", "35"),
    bitch6("rome","36");
    
    
    private final String desc;
    private final String year;
    
    enumeration(String description, String birthdate){
    	desc = description;
    	year = birthdate;
    }
    
    public String getdesc(){
    	return desc;
    }
    
    public String getyear(){
    	return year;
    }
    
    
}
