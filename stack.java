public class stack {

    int stck[]=new int[10];
    int tos;
    stack() {
        tos = -1;
    }
    void push(int item) {
        if (tos == 9)
            System.out.println("stack is full");
        else
            stck[++tos] = item;
    }
    int pop() {
        if (tos < 0) {
            System.out.println("stack underflow");
            return 0;
        } else
            return stck[tos--];
    }
}
class TestStack{
    public static void main(String[] args){
        stack mystack1=new stack();
        stack mystack2=new stack();
        for(int i=0;i<10;i++) mystack1.push(i);
        for(int i=10;i<20;i++) mystack2.push(i);
        System.out.println("stak in mystack1");
        for(int i=0;i<10;i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("stack in mystack2");
        for(int i=10;i<20;i++) {
            System.out.println(mystack2.pop());
        }

    }


