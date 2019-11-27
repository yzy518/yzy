package cn.kgc.spring.bean;

public class HelloSpring {
    private String words;

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public void pr(){
        System.out.println(words);
    }
}
