public class ExtraClass {
    public static void main(String[] args) {
        house h = new house();
        
        System.out.println(h.mainDoor);
        System.out.println(h.cupboard);

        h.showDiary();

    }
}

class house{
    public String mainDoor = "Red Color Main Door";
    protected  String cupboard = "Wooden Cupboard";
    private String Diary = "My Secret Diary";

    public void showDiary(){
        System.out.println(Diary);
    }
}