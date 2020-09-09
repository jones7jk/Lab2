
class Main {
  public static void main(String[] args) {
    System.out.println( "M&M Color Counts");
    int total; 
    double blue, yellow, red, orange, brown, green;
    total= 55*10;
    blue= total * .24;
    brown= total* .13;
    yellow= total * .14;
    red= total * .13;
    orange= total* .20; 
    green= total * .16;
    System.out.println("blue : " + blue);
    System.out.println("yellow : " + yellow);
    System.out.println("red : " + red);
    System.out.println("orange : " + orange);
    System.out.println("brown : " + brown);
    System.out.println("green : " + green);
    double sum;
    sum = blue + yellow + green + brown + orange + red;
    System.out.println("sum : " + sum);
  
    

   if (blue > brown && green > orange) {
    System.out.println("Blue over Brown and Green over Orange");
    }
    if (brown<=red) {
    System.out.println("Brown is less than or equal to Red");
    }
    if (sum==total){
    System.out.println("Numbers match");
    }
    
    
  


  }
}