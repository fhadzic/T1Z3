package ba.unsa.etf.rpr.predavanje03;

public class Sat {

    int sati, minute, sekunde;

    public Sat(int h, int min, int sec) { setSat(h, min, sec); }

    public void setSat(int h, int min, int sec) {
        sati = h;
        minute = min;
        sekunde = sec;
    }

    public void setSljedeci(){
        sekunde++;
        if(sekunde==60) { sekunde = 0; minute++;}
        if(minute==60) { minute=0; sati++;}
        if(sati==24) sati=0;
    }

    public void setPrethodni(){
        sekunde--;
        if(sekunde==-1) { sekunde = 59; minute--;}
        if(minute==-1) { minute=59; sati--;}
        if(sati==-1) sati=23;
    }

    public void setPomjeriZa(int pomak){
        if( pomak>0 ) for(int i=0; i< pomak; i++) setSljedeci();
        else for(int i=0; i< -pomak; i++) setPrethodni();
    }

    final public int getSate() { return sati; }

    final public  int getMinute() { return minute; }

    final public int getSekunde() { return sekunde; }

    final public void ispisi()  {
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }

}
