public class rfectorial{
    public static void main(String[] args) {
      int n=123;
     while (n>0) {
        int r=n%10;
        n=n/10;
        System.out.print(r);
        
       
     }
     System.out.println();
    StringBuffer r=new StringBuffer("Arjun Singh");
    System.out.println(r.reverse());

    int j=5;
    int fec=1;
    for(int i=1;i<=j;i++){
        fec=fec*i;
    }
    System.out.println(fec);
    }
}