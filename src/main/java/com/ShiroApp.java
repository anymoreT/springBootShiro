package com;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import  org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.web.util.WebUtils;
import org.apache.shiro.SecurityUtils;

/*
  * @author: huangyong
  * @date 2018/05/28
  * 测试shiro登录和退出
 */
public class ShiroApp {
    /*
    * 主函数方法
     */
    public static void main(String[] args){
        System.out.println("begin");
        DefaultSecurityManager defaultWebSecurityManager = new DefaultSecurityManager();
        defaultWebSecurityManager.setRealm(new Myrealms());
        SecurityUtils.setSecurityManager(defaultWebSecurityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("huangyong", "123456");
        try {
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        if (subject.isAuthenticated()) {
              System.out.println("登录认证通过");

        } else {
            System.out.println("登录认证通过");
        }
    }
}
