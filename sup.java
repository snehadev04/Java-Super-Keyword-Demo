class A
{
    int a = 10;
    void show()
    {
        System.out.println("hello java");
    }
}
class B extends A
{
    int a = 20;
    void show()
    {
        super.show();
        System.out.println(a);
        System.out.println(super.a);
    }
}
 class test
 {
    public static void main(String[] args) 
    {
        B obj = new B();
        obj.show();
    }
    
 }