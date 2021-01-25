
class Card{
    String color,border_style,heartwarming_words;
    Card(String heartwarming_words,String color,String border){
        this.heartwarming_words = heartwarming_words;
        this.color = color;
        this.border_style = border;
    }
    void greeting(){
        System.out.println(this.heartwarming_words);
    }
}
class BirthdayCard extends Card{
    String title;
    String recv;
    BirthdayCard(String recv,String heartwarming_words,String color,String border){
        super(heartwarming_words,color,border);
        this.title = "Happy Birthday";
        this.recv = recv;
    }
    void greeting() {
        System.out.println(this.title +" to "+this.recv);
        System.out.println("\t\t"+this.heartwarming_words);
    }
}
class Holiday extends Card{
    String title;
 
    Holiday(String title,String heartwarming_words,String color,String border){
        super(heartwarming_words,color,border);
        this.title = title;      
    }
    void greeting(){
        System.out.println(this.title);
        System.out.println("\t\t"+this.heartwarming_words);
    }
}
class EidCard extends Holiday{
    String dua;
    EidCard(String dua ,String heartwarming_words,String color,
            String border){
        super("Happy Eid",heartwarming_words,color,border);
        this.dua = dua;
    }
    void greeting(){
        System.out.println(this.title);
        System.out.println("\t\t"+this.dua);
    }
}
public class greeting_card{
    public static void main(String[] args){
        Holiday independance_day = new Holiday("Happy 14\'th of Augest",
                "Happy jassane Azzadi!! Pakistan Zindabad","Green and white",
                "Green stars");
        independance_day.greeting();
        
        EidCard eid = new EidCard("May you be blessed with peace and always "
                + "happy Eid ul fithar","Eid mubarik","blue","yellow"); 
        eid.greeting();
        
        BirthdayCard bday = new BirthdayCard("Zohaib Zafar","Happy birthday to me",
                                            "cyan","purple");
        bday.greeting();
        
    }
}