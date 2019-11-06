class Count {
    public static void main(String[] args) {
        /*
        * Count the number of times a letter appears in a word
        * */

        String str = "shannon";
        StringBuilder build = new StringBuilder();
        String[] stringList = str.split("", str.length());
        for (int i = 0; i <= str.length()-1; i++){
            if(stringList[i].equals("n")){
                build.append(stringList[i]);
            } else{
                continue;
            }
        }

        System.out.printf("The letter 'n' appears in the word '%s' %d times.", str, build.length());
    }
}
