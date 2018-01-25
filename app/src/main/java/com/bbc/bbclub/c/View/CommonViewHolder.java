package com.bbc.bbclub.c.View;

import android.view.View;

import com.chad.library.adapter.base.BaseViewHolder;
import com.zhy.autolayout.utils.AutoUtils;

/**
 * Created by Administrator on 2017/8/25.
 */

public class CommonViewHolder extends BaseViewHolder {
    public CommonViewHolder(View view) {
        super(view);
        AutoUtils.autoSize(view);
    }

}
