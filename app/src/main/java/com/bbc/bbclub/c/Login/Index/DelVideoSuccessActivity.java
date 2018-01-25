package com.bbc.bbclub.c.Login.Index;

import android.view.View;

import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.OnClick;

public class DelVideoSuccessActivity extends BaseActivity {
    @Override
    protected int setLayoutId() {
        return R.layout.activity_del_video_success;
    }
    @OnClick({R.id.top_view_back,R.id.finsh_comfirm})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.finsh_comfirm:
                StartActivityUtil.skipAnotherActivity(this,DelVideoFailActivity.class);
                break;
            case R.id.top_view_back:
                finish();
                break;

        }
    }

}
