package Klasur_Fragen;

public class dateiname{
    public static int ersetze(char[] name){
        int count = 0;
        for(int i = 0; i < name.length-4; i++){
            if(name[i] == '.'){
                name[i]= '_';
                count++;

            }
        }
        return count++;
    }
    public static void main(String[] args){
        String datei = "Graphik.Ini.Datei.ini";
        char[] namee = datei.toCharArray();
        int anzahl = ersetze(namee); //yazilma sirasina göre olaylar gerceklesiyor

        System.out.println("Neu Dateiname:" +new String(namee)); //burada iste aslinda neue namee yi Stringe cevirerek veriyor.
        System.out.println(anzahl);
    }
}