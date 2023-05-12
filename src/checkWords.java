public class checkWords {


    public static void main(String[] args){
        System.out.println(booleanConverter(checkWordsContains("Ariq")));
        System.out.println(booleanConverter(checkWordsExact("EQU")));
    }
        public static boolean checkWordsContains(String words){
            return words.contains("EQU");
        }

        public static boolean checkWordsExact(String words){
            return words == "EQU";
        }

        public static String booleanConverter(Boolean obj){
            if (obj){
                return "Benar";
            }else{
                return "Salah";
            }
        }
        public static Boolean checkPermutation(String words){
            if(checkWordsExact(words)){
                return true;
            } else if (checkWordsExact(words)) {
                return true;
            } else{
                return false;
            }
        }



}
