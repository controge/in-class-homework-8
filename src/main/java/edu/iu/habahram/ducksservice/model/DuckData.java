package edu.iu.habahram.ducksservice.model;

public record DuckData(int id, String type) implements Comparable{

    public String toLine() {
        return String.format("%1$s,%2$s", id(), type());
    }

    public static DuckData fromLine(String line) {
        String[] tokens = line.split(",");
        return new DuckData(Integer.parseInt(tokens[0]), tokens[1]);
    }


    public int compareTo(Object object){
        DuckData newDuck = (DuckData)object;
        return(this.type.compareTo(newDuck.type));
    }

}
