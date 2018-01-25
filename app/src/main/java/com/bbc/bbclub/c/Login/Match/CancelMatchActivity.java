package com.bbc.bbclub.c.Login.Match;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bbc.bbclub.c.Login.Club.UpSuccessActivity;
import com.bbc.bbclub.c.Login.MainActivity;
import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class CancelMatchActivity extends BaseActivity {
    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_cancel_match;
    }
    @Override
    protected void initView() {
        super.initView();
        top_view_title.setText(getString(R.string.cancel_match));
    }
    @OnClick({R.id.top_view_back,R.id.btn_next})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_next:
                StartActivityUtil.skipAnotherActivity(this,CancelSuccessActivity.class);
                break;
            case R.id.top_view_back:
                finish();
                break;

        }
    }
}
