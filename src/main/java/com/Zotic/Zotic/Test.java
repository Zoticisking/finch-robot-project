package com.zotic.zotic;

import com.birdbrain.Finch;

public class FinchDemo {
    public static void main(String[] args) {
        Finch myFinch = new Finch();


//plays note when starts to move forward
        myFinch.playNote(60,0.5);
//Moving passed the first maze/section
        myFinch.setMove("F", 16,50);
        myFinch.setTurn("R", 90, 50);
        myFinch.setMove("F", 65,50);

        myFinch.playNote(100,0.5);
        //2nd section and moves forward until the long line before the exit
        myFinch.setTurn("L", 90, 50);
        myFinch.setMove("F", 60, 30);
         myFinch.setTurn("L", 90, 50);
         myFinch.setMove("F", 68,50);
//Turns into the long road/line of the maze
         myFinch.setTurn("R", 92, 50);
         myFinch.setMove("F", 115, 50);
         //Laslty it escapes and goes through the exit.
         myFinch.setTurn("R", 90, 50);
         myFinch.setMove("F", 20, 50);
         myFinch.setTurn("L", 90, 50);
         myFinch.setMove("F", 28, 50);
         myFinch.setTurn("L", 90, 50);
         myFinch.setMove("F", 25, 50);
    
// the bird stops moving on the end sticker
        myFinch.stopAll();
        myFinch.disconnect();
    }
}
