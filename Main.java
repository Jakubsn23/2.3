class Main {
  public static void main(String[] args) {
    int a,s=0;
    for(a=0; a<101; a++)
      {
        if(a%2==0)
        {
          s = s + a;
        }
      }
    System.out.println(s);
  }
}