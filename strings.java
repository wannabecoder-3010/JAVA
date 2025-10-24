public class strings{
    public static void main(String[] args) {
        String name = "Atul";
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String string1 = "    yooo    ";
        System.out.println(string1);
        String string2 = string1.trim();
        System.out.println(string2);

        System.out.println(string1.trim());

        System.out.println(name.substring(1,3));
        System.out.println(name.replace('u','a'));

        System.out.println(name.indexOf("ul"));


    }




}