package toyota;

public  class Demo {
    public static void main(String[] args) {
        Toyota camry = new Toyota(4.5,  "черый",  "camry70",  2021, 25000,"mehanica");
        camry.printCarInfo();
        camry.setPrice(15000);
        System.out.println(camry.getPrice());
    }


}