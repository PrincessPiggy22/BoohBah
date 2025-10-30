
public class Boohbah {

    private String name;
    private String danceMove;

    Boohbah(){ // made this because DanceRoutine wouldn't extend w/o it
        this.name = "Zing Zing Zingba";
        this.danceMove = "The Worm";
    }

    Boohbah(String name, String danceMove){
        this.name = name;
        this.danceMove = danceMove;
    }

    public String getName(){
        return name;
    }

    public String getDance(){
        return danceMove;
    }

    String performMove(){
        return this.name + " performs " + this.danceMove;
    }


}
