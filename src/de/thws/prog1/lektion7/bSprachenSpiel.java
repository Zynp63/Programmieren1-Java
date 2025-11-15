package de.thws.prog1.lektion7;

public class bSprachenSpiel {
 public static void main(String[] args){
        String zeichenfolge = "spiel mit mir";
        char[] zeichenArray = zeichenfolge.toCharArray();
        System.out.println(wandeln(zeichenArray));

    }
    public static String wandeln(char[] zeichenArray) {
        int vokale = 0;  //Ünlü sayisini buluyoruz
        for(int i = 0; i < zeichenArray.length; i++){
            if(zeichenArray[i] == 'a' || zeichenArray[i] == 'e' || zeichenArray[i] == 'i' || zeichenArray[i]== 'o'|| zeichenArray[i]== 'u'){
                vokale++;
            }
        }
        char[] neuchar = new char[zeichenArray.length + vokale * 2];

        int stelle = 0;

        for(int i = 0; i < zeichenArray.length; i++){
            char x = zeichenArray[i];
            if(x == 'a' || x == 'e' || x == 'i' || x== 'o'|| x == 'u'){

               neuchar[stelle] = x;
               neuchar[stelle + 1] = 'b';
               neuchar[stelle + 2] = x;
               stelle += 3;

            }else {
                neuchar[stelle] = x;
                stelle++;
            }
        }
        return String.valueOf(neuchar);
    }
}
