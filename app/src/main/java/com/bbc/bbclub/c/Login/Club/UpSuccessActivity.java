package com.bbc.bbclub.c.Login.Club;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.bbc.bbclub.c.Login.MainActivity;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.OnClick;

public class UpSuccessActivity extends BaseActivity {

    @Override
    protected void initView() {
        super.initView();
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_up_success;
    }
    @OnClick({R.id.top_view_back,R.id.finsh_comfirm})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.finsh_comfirm:
                StartActivityUtil.skipAnotherActivity(this,UpFailActivity.class);
                break;
            case R.id.top_view_back:
                finish();
                break;

        }
    }
}
