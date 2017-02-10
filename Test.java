Teaching Session
Looping logic 101

N = 4
   #
  ##
 ###
####

loop 3 times
loop 1 time

loop 2 times
loop 2 times

loop 1 time
loop 3 times

loop 0 times
loop 4 times

#Basic level looping logic

		for(int i=1; i<=N; i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
                }
            for(int j=1; j<=i;j++){
                System.out.print("#");
            }
            System.out.println();
        }