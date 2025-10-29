public class DanceRoutine {

    private Boohbah[] boohbahs;

    DanceRoutine(Boohbah[] boobahs){

        this.boohbahs = boobahs;

    }

    void buildRoutine(){ // Geeks for Geeks

        StringBuilder sb = new StringBuilder();

        for (Boohbah boohbahs : this.boohbahs) {
            sb.append(boohbahs.performMove()).append("/n");
        }

        System.out.println(sb);

    }

    void modifyRoutine(){ // Geeks for Geeks

        StringBuilder sb = new StringBuilder();

        for (Boohbah boohbahs : this.boohbahs) {
            sb.append(boohbahs.performMove()).append("/n");
        }

        sb.toString().replace("performs", "dances to");

        System.out.println(sb);

    }

}
