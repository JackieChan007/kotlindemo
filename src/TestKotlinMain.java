import deemo.kotlinExp;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: JackieChan
 * \* Date: 2019/9/16
 * \* Time: 11:12
 * \* Copyright (c) HT All Rights Reserved
 * \* Description:
 * \
 */
public class TestKotlinMain {
    public static void main(String[] args) {
        new kotlinExp().print();
        System.out.println("test");
        System.out.println(new kotlinExp().sumTwo(2, 3));
        ;
        Person p = new Person();
        p.setAge(11);
        p.setName("chen");
        p.name="zhang";
        System.out.println(p.toString());
        System.out.println(p.getAge());
        System.out.println(p.name);
        new Student().test();
    }
}

