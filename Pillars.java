public class Pillars {
    int my;
    int by;
    void setmyby (int xy, int hy) {
        my=xy;
        by=hy;
    }
}
class b extends Pillars {
static int total;
void sum ();
public static void main (String args [ ] ) {
    b subOb= new b ( );
    subOb. setmyby (11, 13);
    subOb. sum ( ) ;
    System.out.println(total = + subOb. total);
}
}
