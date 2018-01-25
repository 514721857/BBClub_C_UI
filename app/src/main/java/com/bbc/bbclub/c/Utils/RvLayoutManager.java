package com.bbc.bbclub.c.Utils;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

/**
 *  //防止滑动卡顿
 */

public class RvLayoutManager extends LinearLayoutManager {
    public RvLayoutManager(Context context) {
        super(context);
    }

    @Override
    public boolean canScrollVertically() {
        return false;
    }
}
