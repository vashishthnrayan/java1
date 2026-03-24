public class string{
    public static void main(String[] args) {
        
        String str = "Hello, World!";

        String substr= str.substring(7);

        String str2 = "Hello, World!";

        String substr2= str2.substring(7,12);

        String str3 = "Hello, World!";

        String substr3= str3.toLowerCase();

        String str4 = "Hello, World!";

        String substr4= str4.toUpperCase();

        System.out.println(" " + str.trim());

        boolean endsWithWorld = str.endsWith("Earth!");//true


        boolean containsWorld = str.contains("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum");//true
    }
}