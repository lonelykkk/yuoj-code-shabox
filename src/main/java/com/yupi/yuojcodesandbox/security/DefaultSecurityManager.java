package com.yupi.yuojcodesandbox.security;

import java.security.Permission;

/**
 * @author lonelykkk
 * @email 2765314967@qq.com
 * @date 2024/9/9 10:39
 * @Version V1.0
 */
public class DefaultSecurityManager extends SecurityManager {

    /**
     * 检查所有权限
     * @param perm   the requested permission.
     */
    @Override
    public void checkPermission(Permission perm) {
        System.out.println("默认不做任何限制");
    }
}
