package com;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;

public class Myrealms extends AuthenticatingRealm{
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
           {

        String username = (String) token.getPrincipal();

        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username,"123456y","huangy");
        return authenticationInfo;
    }
}
