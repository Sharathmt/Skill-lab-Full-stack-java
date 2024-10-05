class object {
    private String ModelName;
    private String owner;
    private int regNumber;
     
     public object (String ModelName,String owner,int regNumber){
         this.ModelName=ModelName;
         this.owner=owner;
         this.regNumber=regNumber;
     }
         public void startcar(){
               System.out.println("car start by key..");
         }
         public void accelerate(){
             System.out.println("car can be accelerate.. ");
         }
         public void stop(){
              System.out.println("car can stop..");
         }
         public void showcarinfo(){
             System.out.println("the car is owned by "+ owner);
             System.out.println("the car model is "+ ModelName);
             System.out.println("the regnumber is " + regNumber);
         }
         public static void main(String[] args) {
             object mycar= new object("rolls royce","rakesh kumar",7777);
             mycar.startcar();
             mycar.accelerate();
             mycar.stop();
             mycar.showcarinfo();
         }
 }
