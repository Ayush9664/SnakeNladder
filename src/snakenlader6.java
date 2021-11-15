
public class snakenlader6 {
    int dice() {
        int dice=(int)(Math.random()*10%6+1);
        return dice;
    }

    int option() {
        int option=(int)(Math.random()*10%3+1);
        return option;

    }

    public static void main(String[] args) {
        int position=0;
        int diceCount=0;
        snakenlader6 rv=new snakenlader6();
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("Player 1 is at position "+position);
        while(position<100){

            int option=rv.option();
            switch (option) {
                case 1:
                    diceCount++;

                    break;
                case 2  :
                    diceCount++;
                    position=position+rv.dice();
                    if(position>100){
                        position=position-rv.dice();
                    }
                    break;

                case 3:
                    diceCount++;
                    if(position>0) {
                        position=position-rv.dice();

                    }
                    else if(position<0){
                        break;
                    }
                    break;

            }
            System.out.println("Player Position at "+diceCount+" is "+position);
        }
        System.out.println("Player 1 Win is at position "+position);
        System.out.println("Dice Count is "+diceCount);
    }


}