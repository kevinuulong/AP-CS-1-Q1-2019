package quiz;

public class Pretty {

    String underline(){
        String temp = "";
        for (int i = 0; i < str.length(); i++){
            temp += "-";
        }
        return str+"\n"+temp;
    }

    String box(){
        String temp = "|-";
        for (int i = 0; i < str.length(); i++){
            temp += "-";
        }
        temp += "-|";
        return temp + "\n| "+str+" |\n"+temp;
    }

    public String toString(){
        return str;
    }

    private String str;

    Pretty(String string){
        str = string;
    }
}
