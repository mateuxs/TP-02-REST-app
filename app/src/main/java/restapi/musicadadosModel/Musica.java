package restapi.musicadadosModel;

import java.util.ArrayList;

public class Musica {
    private String id;
    private Integer lang;
    private String name;
    private String text;
    private ArrayList <Traducao> translate;

    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLang() {
        return lang;
    }

    public void setLang(Integer lang) {
        this.lang = lang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ArrayList<Traducao> getTranslate() {
        return translate;
    }

    public void setTranslate(ArrayList<Traducao> translate) {
        this.translate = translate;
    }
}
