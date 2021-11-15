public class SnakeNlader4 {
    int dice() {
        return dice;
    }

    int option() {
        int option=(int)(Math.random()*10%3+1);
        return option;

    }

    public static void main(String[] args) {
        int position=0;
        SnakeNlader4 rv=new SnakeNlader4();
        System.out.println("Welcome To Snake And Ladder Game");
        System.out.println("Player 1 is at position "+position);
        System.out.println("Player 1 rolls the dice and got");
        while(position<100){
            //System.out.println(rv.dice());
            int option=rv.option();
            switch (option) {
                case 1:
                    System.out.println("NO PLAYs");
                    break;
                case 2  :
                    System.out.println("LADDER ");
                    position=position+rv.dice();
                    if(position>100){
                        position=position-rv.dice();
                    }
                    break;

                case 3:
                    System.out.println("Snake");
                    if(position>0) {
                        position=position-rv.dice();
                    }
                    else if(position<0){
                        break;
                    }
                    break;

            }

        }
        System.out.println("Player 1 Win is at position "+position);
    }


}



