interface ATM {
    void withdraw();
}

class SBI implements ATM {
    public void withdraw() {
        System.out.println("Withdrawal from SBI ATM");
    }
}

class HDFC implements ATM {
    public void withdraw() {
        System.out.println("Withdrawal from HDFC ATM");
    }
}

class Main {
    public static void main(String[] args) {
        ATM a = new SBI();
        a.withdraw();

        a = new HDFC();
        a.withdraw();
    }
}