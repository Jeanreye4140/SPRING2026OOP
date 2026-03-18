/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotterygame1;
import java.util.Random;

/**
 *
 * @author administrator
 */
public class LotteryGame1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Lottery Game Example");
        
        int selectionCount = 24;
        int lotterySelection[] = new int[selectionCount];
        int selectionBound = 63;
        Random seed = new Random();
        Random rv1 = new Random(selectionBound);
        rv1.setSeed(seed.nextInt(100000));
        for(int i = 0; i < selectionCount; i++) {
            lotterySelection[i] = rv1.nextInt(selectionBound) + 1;
            System.out.print(lotterySelection[i] + " ");
        }
        System.out.println();
        
        int take3[] = new int[4];
        int take4[] = new int[5];
        int take5[] = new int[6];
        
        
        
        Random rv2 = new Random(selectionBound);
        rv2.setSeed(seed.nextInt(100000));
        
        for(int i = 0; i < 4; i++) {
            take3[i] = rv2.nextInt(selectionBound) + 1;
            System.out.print(take3[i] + " ");
        }
        System.out.println();
        
        Random rv3 = new Random(selectionBound);
        rv3.setSeed(seed.nextInt(100000));
        for(int i = 0; i < 5; i++) {
            take4[i] = rv3.nextInt(selectionBound) + 1;
            System.out.print(take4[i] + " ");
        }
        System.out.println();
        
        Random rv4 = new Random(selectionBound);
        rv4.setSeed(seed.nextInt(100000));
        for(int i = 0; i < 6; i++) {
            take5[i] = rv4.nextInt(selectionBound) + 1;
            System.out.print(take5[i] + " ");
        }
        System.out.println();
       
        
        
    }
    
}
