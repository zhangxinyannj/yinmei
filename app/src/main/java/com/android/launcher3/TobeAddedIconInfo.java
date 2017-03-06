package com.android.launcher3;

import com.android.launcher3.compat.UserHandleCompat;

/**
 * Created by zhangxinyan.fnst on 3/1/2017.
 */

public class TobeAddedIconInfo extends ShortcutInfo {

    /**
     * 可以添加Shortcut和联系人
     */
    public static final int ADD_TYPE_MULTI = 0;

    /**
     * 只可添加联系人
     */
    public static final int ADD_TYPE_CONTACTS = 1;

    public int addType;

    public TobeAddedIconInfo() {
        addType = ADD_TYPE_MULTI;
        user = UserHandleCompat.myUserHandle();
    }
}
