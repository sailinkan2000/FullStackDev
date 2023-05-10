
class TableSyn{  
    synchronized void printTable(int n){
      for(int i=1;i<=5;i++){  
        System.out.println(n*i);  
        try{  
         Thread.sleep(400);  
        }catch(Exception e){System.out.println(e);}  
      }  
     
    }  
} 
class TestSynchronization3{  
    public static void main(String args[]){  
        final TableSyn obj = new TableSyn();
        Thread t1=new Thread(){  
            public void run(){  
                obj.printTable(5);  
            }  
        };  
        Thread t2=new Thread(){  
            public void run(){  
                obj.printTable(100);  
            }  
        };  
        t1.start();  
        t2.start();  
    }  
}  