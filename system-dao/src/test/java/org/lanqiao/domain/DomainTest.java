package org.lanqiao.domain;


import org.junit.Test;

public class DomainTest {
    @Test
    public void showInfoTest(){
       User user = new User();
        user.showInfo("张三","123456");
    }
    @Test
    public void showInfoTest2(){
        User user = new User(001,"china","123456");
        user.Show(user);
    }
}
