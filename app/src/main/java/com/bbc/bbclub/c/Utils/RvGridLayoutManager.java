package com.bbc.bbclub.c.Utils;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;

/**
 * //防止滑动卡顿
 */

public class RvGridLayoutManager extends GridLayoutManager {
    public RvGridLayoutManager(Context context, int spanCount) {
        super(context, spanCount);
    }

    @Override
    public boolean canScrollVertically() {
        return false;
    }
}
