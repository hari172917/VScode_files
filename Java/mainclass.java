class mainclass {
    void show1(){
        System.out.println("This is show one");
    }
    void show2(){
        System.out.println("This is show two");
        show1();
    }

    public static void main(String[] args) {
        mainclass s1=new mainclass();
        s1.show2();
    }
}