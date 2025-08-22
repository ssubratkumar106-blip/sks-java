class IfElseTest {
    public static void main(String[] args) {
        int n[] = {50,55,66,80,76,98,33,95};
        int even = 0, odd = 0;
        for(int i =0; i < n.length; i++) {
            if((n[i] % 2 ) == 0) {
                even+=1;
            
        } else {
            odd += 1;
        }
    }
        System.out.println("Even Numbers : " + even + " Odd Numbers : " + odd);
}
}