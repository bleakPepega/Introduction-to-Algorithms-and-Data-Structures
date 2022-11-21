package zadanie_12.prak_6;

import java.lang.StringBuilder;
import java.util.ArrayList;

public class MyStringBuilder {
    private StringBuilder stringBuilder;
    private ArrayList<String> list;

    MyStringBuilder(){
        stringBuilder = new StringBuilder();
        list = new ArrayList<>();
        list.add("MyStringBuilder()");
    }

    public StringBuilder getStringBuilder() {
        list.add("getStringBuilder()");
        return stringBuilder;
    }

    public void setStringBuilder(StringBuilder stringBuilder) {
        list.add("setStringBuilder()");
        this.stringBuilder = stringBuilder;
    }

    public ArrayList<String> getList() {
        list.add("getList()");
        return list;
    }

}
