import java.util.Scanner;
public class RPC
{
   public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     String ca1, ca2, ca3, ca4, ca5;
     String re1, re2, re3;
     ca1="Does he know my strategy?"+" Two stones in a row... "+
        "what are the chances?"+" Did he steal my notes?"+"Did he follow me into the archives?"
        +"No, stay the course: ROCK!";
     ca2="Fool! Here is where I make the change!"+
        "Those who stick to their strategy all the time will only head to failure."
        +"Take this! PAPER!";
     ca3="This is a game of guessing, suspecting and betraying, "+
        "filled with randomness and possibilities! "+"Only the one with pluck and braveness will achieve the final victory."+
        "Therefore, here is my gambling!"+"CROSSBLADES!";
     ca4="You have failed to adhere to the ancient traditions"+
        "of Rock, Paper, Crossblades!"+" You have lost by disqualification! Disgraceful!";
     ca5="Pathetic. You cannot hope to beat me without the passion of a thousand suns, "+
        "without the dedication of a Pleistocene glacier! I choose ";
     re1="Unbelievable! We have tied! *Eye twitches*";
     re2="As I predicted, I have won this battle. The kingdom is MINE!";
     re3="No way! What have you done? I should be unbeatable! Noooooo...!";
     String intro="Human, I challenge you to a Rock, Paper, Crossblades game!";
     System.out.println(intro);
     System.out.println(" ");
     System.out.print("You: ");
     String yourans=input.nextLine();
     System.out.println(" ");
     System.out.print("Me: ");
     boolean wordnum;
     if (yourans.length()>=50) wordnum=true;
     else wordnum=false;
     int yourchoice;
     if (yourans.length()>=4){
     if (yourans.length()<11){
       if (yourans.substring(yourans.length()-4).equalsIgnoreCase("rock")) {yourchoice=0;}
       else if (yourans.substring(yourans.length()-5).equalsIgnoreCase("paper")) {yourchoice=1;}
       else {yourchoice=3;}
    }
     else if (yourans.substring(yourans.length()-4).equalsIgnoreCase("rock")) {yourchoice=0;}
     else if (yourans.substring(yourans.length()-5).equalsIgnoreCase("paper")) {yourchoice=1;}
     else if (yourans.substring(yourans.length()-11).equalsIgnoreCase("crossblades")) {yourchoice=2;}
     else {yourchoice=3;}
    } else {yourchoice=3;}
    int comans=(int)(Math.random()*3);
    String comchoice;
     if (comans==0) comchoice=ca1;
     else if (comans==1) comchoice=ca2;
     else if (comans==2) comchoice=ca3;
     else comchoice="error";
     if (wordnum==true && yourchoice!=3){
         System.out.println(comchoice);
        } else if(wordnum==true && yourchoice==3){
            System.out.println(ca4);
        } else if(wordnum==false){
            if (yourchoice==0){
                System.out.print(ca5);
                System.out.println("PAPER");
            } else if (yourchoice==1){
                System.out.print(ca5);
                System.out.println("CROSSBLADES");
            } else if (yourchoice==2){
                System.out.print(ca5);
                System.out.println("ROCK");
            } else if (yourchoice==3){
                System.out.println(ca4);
            } else {
                System.out.println("error1");
            }
        } else {
            System.out.println("error2");
        }
        System.out.println(" ");
        System.out.print("Result: ");
     if (wordnum==true && yourchoice!=3){
         if (yourchoice==0 && comans==0){
             System.out.print(re1);
         } else if (yourchoice==0 && comans==1){
             System.out.print(re2);
         } else if (yourchoice==0 && comans==2){
             System.out.print(re3);
         } else if (yourchoice==1 && comans==0){
             System.out.print(re3);
         } else if (yourchoice==1 && comans==1){
             System.out.print(re1);
         } else if (yourchoice==1 && comans==2){
             System.out.print(re2);
         } else if (yourchoice==2 && comans==0){
             System.out.print(re2);
         } else if (yourchoice==2 && comans==1){
             System.out.print(re3);
         } else if (yourchoice==2 && comans==2){
             System.out.print(re1);
         } else {
             System.out.print("error");
         }
     } else {
         System.out.print(re2);
     }
   }
}
