import java.util.*;
import java.io.*;
class Sttack{
    public int n;
    int stack[];
    int index;
    
    int max=0;
    private int maxindex[];
    int j=0;
    Sttack(int size){
        index =-1;
        n=size;
        stack=new int[n];
        maxindex=new int[n];
        

    }
    int pop(){
        if (index<0){
            
            return -1;
        }
        else{
            int y=index;
            index= maxindex[j-1]-1;
            if(index>0){
            max=stack[index];
            }
            else{
                max=0;
              }

            j=j-1;
            int r = y-index-1;
            return r;
          
        }
    }
    void push(int x) {
        if (index ==n-1){
            System.out.println("stack is full.!!");
        }
        
        else{
            index++;
            
            stack[index]=x;
            if(x>=max){
                max= x;
                maxindex[j]= index;
                j++;
            }
        }

    }
    }
 class FabricBreakup{
    public static void main(String[] args) throws IOException{
        File sampleInputFile = new File("sampleInputFile.txt");
        Scanner sample = new Scanner(sampleInputFile);

       int k =  Integer.parseInt(sample.nextLine());    
       Sttack s1 =  new Sttack(k);
       
       for(int i=0;i<k;i++){
           String ss= sample.nextLine();
           String [] parts = ss.split(" ");
           int part1 = Integer.parseInt(parts[0]);
           int part2 = Integer.parseInt(parts[1]);
           
           if(part2==1){
               int part3 = Integer.parseInt(parts[2]);
               s1.push(part3);
           }
           else if(part2==2) {
               int b =i+1;
               System.out.print(b+" ");
                System.out.println(s1.pop());
           }
            
       }
         
    }
}