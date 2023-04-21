
class program5 {
    public static String removeAllDigit(String str)
    {
        char[] charArray = str.toCharArray();
        String result = "";
        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isDigit(charArray[i])) {
                result = result + charArray[i];
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        String str = "Ля2Ля46Ля86";
        System.out.println(removeAllDigit(str));
    }
}