public class Interface {
    public static void main(String[] args) {
        Queen siddhi = new Queen();
        siddhi.moves();
        
    }
    
}
interface  ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up , down,diagnol , left , right ");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down, right , left");
    }}

    class King implements ChessPlayer{
        public void moves(){
            System.out.println("up,down");
        }}

