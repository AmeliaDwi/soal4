package member;

public class Member {

    
    
 String nama;
 String team;
 String umur;
    int penampilan, suara, attitude, nilai;

    public void setNama(String nama) {

        this.nama = nama;

    }
    public void setUmur(String umur) {

        this.umur = umur;

    }
    public void setTeam(String team) {

        this.team = team;

    }
    public void setPenampilan(int penampilan) {

        this.penampilan = penampilan;

    }
    public void setSuara(int suara) {

        this.suara = suara;

    }
    public void setAttitude(int attitude) {

        this.attitude = attitude;

    }

    public String getNama() {

        return nama;

    }

    public String getUmur() {

        return umur;

    }

    

    public String getTeam() {

        return team;

    }

    

    public int getPenampilan() {

        return penampilan;
    }

    

    public int getSuara() {

        return suara;
    }

    

    public int getAttitude() {

        return attitude;
    }

    public int getNilai() {
        return (this.penampilan + this.suara + this.attitude) / 3;
    }

}