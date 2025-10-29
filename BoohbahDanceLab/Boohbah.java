
public class Boohbah {

    private String name;
    private String danceMove;

    Boohbah(String name, String danceMove){
        this.name = name;
        this.danceMove = danceMove;
    }

    void setName(String name){
        this.name = name;
    }

    void setDance(String dance){
        this.danceMove = dance;
    }

    Object performMove(){
        System.out.println(this.name + " performs " + this.danceMove);
        return null;
    }


}
