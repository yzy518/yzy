package cn.kgc.spring.bean;

public class DaGuiZi {
    private String who;
    private String words;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public DaGuiZi(String who,String words){
        this.who = who;
        this.words = words;
    }

    public void say(){
        System.out.println(who+"说:"+words);
    }
}
