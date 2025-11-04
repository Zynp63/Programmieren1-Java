package de.thws.prog1.lektion7;

public class inGroßbuchstaben {  //Bir daha bak eksik yada yanlis olabilir tam bakmadim
    public static void main(String[] args){
        String wort = "inGroßbuchtaben umwandlung";
        char[] neu = wort.toCharArray();
        System.out.println(umwandlung(neu));

    }
    public static char[] umwandlung(char[] neu){

        for(int i = 0; i < neu.length ;i++){
            if(neu[i] >= 'a' && (neu[i]) <= 'z'){
                neu[i] -=('a' - 'A');
            }
        }
        return neu;
    }
}
