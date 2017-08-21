import java.util.*;



public class Program {
	
	
	
	  public static void main(String[] args) {
	        
	        String data;
	        String[] dat;
	        String points;
	        String[] coordinates;
	        Scanner scanner = new Scanner(System.in);
	        data = scanner.nextLine();
	        dat = data.split(" ");
	        Integer snakes = Integer.parseInt(dat[0]);
	        
	        int i = 0;
	        
	        while(i < snakes){
	        	points = scanner.nextLine();
	        	coordinates = points.split();
	        	coordinates = 
	        	
	        	
	        	
	        	i++;
	        	
	        }
	        
	        
	        
	       
	        
	        printBoard(data);
	        
	        
	        
	        
	        
	    }
	
	
	public static void printBoard(String matrix) {
        Integer width;
        Integer height;   
        String[] input;
        
        input = matrix.split(" ");
        width = Integer.parseInt(input[1]);
        height = Integer.parseInt(input[2]);
        
        for(int i = 0; i < height;i++){
            for(int j = 0; j< width; j++){
                System.out.print("0 ");
                
            }
            System.out.println();
        }
        
    }
	
}
