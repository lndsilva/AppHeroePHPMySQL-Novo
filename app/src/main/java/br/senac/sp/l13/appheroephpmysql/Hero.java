package br.senac.sp.l13.appheroephpmysql;

public class Hero {
    private int id;
    private String name, realname;
    private int rating;
    private String teamaffiliation;

    public Hero() {
    }

    public Hero(int id, String name, String realname, int rating, String teamaffiliation) {
        this.id = id;
        this.name = name;
        this.realname = realname;
        this.rating = rating;
        this.teamaffiliation = teamaffiliation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTeamaffiliation() {
        return teamaffiliation;
    }

    public void setTeamaffiliation(String teamaffiliation) {
        this.teamaffiliation = teamaffiliation;
    }
}
