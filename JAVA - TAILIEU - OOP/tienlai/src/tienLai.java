public class tienLai {
    public static void main(String[] args) {
        //một tài khoản có 10.000 đô. tiền lãi được gộp hàng tháng ở mức 6% mỗi năm ( 0,5% mỗi tháng). Mỗi tháng, rút 500 đô. Hoỉ sau bao nhiêu năm thì tài khoản cạn kiệt tiền?
        double money = 10000;
        double interest_rate = 0.005;
        int month = 0;
        while (money > 500) {
            money = money + money * interest_rate - 500;
            month++;
        }
        System.out.println("Sau " + month + " tháng, tài khoản cạn kiệt tiền");

    }
}
