package com.bbc.bbclub.c.Login.Match;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class ApplyInfoActivity extends BaseActivity {
    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_apply_info;
    }

    @Override
    protected void initView() {
        super.initView();
        top_view_title.setText(getString(R.string.comfirm_title));
    }

    @OnClick({R.id.top_view_back, R.id.apply_comfirm})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.apply_comfirm:
                StartActivityUtil.skipAnotherActivity(this, ApplyFinshActivity.class);
                break;
            case R.id.top_view_back:
                finish();
                break;

        }
    }
}
