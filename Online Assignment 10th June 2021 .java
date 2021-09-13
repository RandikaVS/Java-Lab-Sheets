/*Name :V S Randika
Registration number : IT20662196
*/
package assignment.pkg2021.june;
import java.util.Scanner;
import java.util.Random;

//create a Board class
class Board {
    private String dot;
    private Hunter hunter;
    private Soldier soldier[];
    private int numberOfDots,superDots; //implememt class attributes
    
    //implement overloaded constructor for Board class
    public Board(String dt,Hunter h,Soldier s[]){
        this.dot=dt;
        this.hunter=h;
        this.soldier=s;
        this.numberOfDots=97;
        this.superDots=3;
        initial(); //call initial method in Board class
    }
    //implement setter for dot count
    public void setNumberOfDots(){
        --this.numberOfDots;
    }
    //implement setter for supper dot count
    public void setSuperDots(){
        --this.superDots;
    }
    //implement getter for get dot type
    public String getDoyType(){
        return this.dot;
    }
    //implement getter for get dot count
    public int getNumberOfDots(){
        return this.numberOfDots;
    }
    //implement getter for get dot count
    public int getsuperDots(){
        return this.superDots;
    }
    //implement initial method for assign default values for player and soldiers 
    public void initial(){
        hunter.xAxis=0;
        hunter.yAxis=0;
        //randomly place the soldiers in initial 
        for(int i=0;i<3;i++){
            this.soldier[i].move();
        }
        System.out.println("Board is ready and three soldiers and the hunter is positioned in the board ");
    }
    
}


//create a Hunter class
class Hunter {
    protected String hColor;
    protected String hName;
    protected int xAxis,yAxis;//implememt class attributes
    
    //implement overloaded constructor for Hunter class
    public Hunter(String hColor,String hName){
        this.hColor=hColor;
        this.hName=hName;
        this.xAxis=0;
        this.yAxis=0;
    }
    //implement setter for set player X position
    public void setXPos(int x){
        try{
            if(x>250||x<0){ //check the if player X position reached the border 
                throw new SoundException("Öh oo!!"); //throw the SoundException method when player reach the border in X axis
            }
            else
                this.xAxis=x; //assign player X position
        }catch(SoundException sExcep){ //create object in catch
            System.out.println(sExcep.getMessage());//get message from exception class using sExcep object
        }
        
    }
    //implement setter for set player Y position
    public void setYPos(int y){
        try{
            if(y>360||y<0){ //check the if player Y position reached the border 
                throw new SoundException("Öh oo!!"); //throw the SoundException method when player reach the border in Y axis
            }
            else
                this.yAxis=y;//assign player Y position
        }catch(SoundException sExcep){
            System.out.println(sExcep.getMessage());//get message from exception class using sExcep object
        }
    }
    //implement Player movement method to display player movement
    public void move(Hunter h){
        System.out.println("Hunter is moving, "+"X :"+h.xAxis+" Y :"+h.yAxis);
    }
    //implement the hunt method for the player to hunt the dots in Board
    public void hunt(Board b){
        if(b.getNumberOfDots()==0&&b.getsuperDots()==0){//check the dot count for to check if player win the game
            
            System.out.println("You Win!!");//display winning message
            System.exit(0);//terminate system
        }
        else if(b.getDoyType()=="superDot"){//check the dot type which is player moving
            b.setNumberOfDots();//reduce the super dot count
            System.out.println("Hunting Super Dots");//display the current hunting dot type
        }
        else if(b.getDoyType()!="superDot"){//check the dot type which is player moving
            b.setSuperDots();//reduce the normal dot count
            System.out.println("Hunting Normal Dots");//display the current hunting dot type
        }
    }
}

//create a Soldier class
class Soldier {
    protected int xAxis;
    protected int yAxis;
    protected String killMethod;
    protected String sColor;//implememt class attributes
    
    //default constructor for Soldier class
    public Soldier(){}
    
    //implement the hunt method for the Soldier to kill the Hunter
    public void Hunt(){
        System.out.println("Killed Using "+this.killMethod+"\n"+"Game Over...");//display the soldier killing method and game over
        System.exit(0);
    }
    
    //implement the move method for move the soldier randomly
    public void move(){
    Random rand=new Random();//create a random object using random library
    this.xAxis=rand.nextInt(251);//assign the soldier X position randomly and border of X position
    this.yAxis=rand.nextInt(361);//assign the soldier Y position randomly and border of Y position
    }
}

//create a child class BlueSildier extends from Soldier class
class BlueSoldier extends Soldier { 
    public BlueSoldier(){
        //assign Soldier color
        super.sColor="Blue";  
        //assign soldier killing type
        super.killMethod="a Gun"; 
    }
}
//create a child class BlueSildier extends from Soldier class
class GreenSoldier extends Soldier {
    public GreenSoldier(){
        //assign Soldier color
        super.sColor="Green";
        //assign soldier killing type
        super.killMethod="a Knife";
    }
}
//create a child class RedSoldier extends from Soldier class
class RedSoldier extends Soldier {
    public RedSoldier(){
        //assign Soldier color
        super.sColor="Red";
        //assign soldier killing type
        super.killMethod="by Hand";
    }
}

// implement the  custom exception called “SoundException”
class SoundException extends Exception{
    
    SoundException(String msg){//create constructor for Sound Exception class
        super(msg);//pass the message for super class
    }
    
}
public class IT20662196 {

    public static void main(String[] args) { //implement main method
            Scanner sc=new Scanner(System.in);
            Hunter myhunter=new Hunter("Maha Deva","Brown");
            Soldier threeSoldier[]={new RedSoldier(),new RedSoldier(),new GreenSoldier()};
            Board myboard=new Board("superDot",myhunter,threeSoldier);
            
            System.out.println("Use the keyboard up,down,left,right arrow keys to move the hunter");
            myhunter.setXPos(sc.nextInt());
            myhunter.setYPos(sc.nextInt());
            myhunter.move(myhunter);
            myhunter.hunt(myboard);
            threeSoldier[2].Hunt();
    }
    
}
