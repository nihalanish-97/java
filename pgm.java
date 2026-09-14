class pgm{
    public void display(char c){
        System.out.println("Character: " + c);

    }
    public void display(int num){
        System.out.println("Integer: " + num);
    }
}
class Overloading{
    public static void main(String[] args) {
        pgm obj = new pgm();
        obj.display('A');
        obj.display(10);
    }
}