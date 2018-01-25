package com.bbc.bbclub.c.Login.Index;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class UpdatePersonInfoActivity extends BaseActivity {
    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_update_person_info;
    }

    @Override
    protected void initData() {
        super.initData();
    }

    @Override
    protected void initView() {
        super.initView();
        top_view_title.setText(getString(R.string.update_info));
    }
    @OnClick({R.id.top_view_back,R.id.btn_next})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.btn_next:
                StartActivityUtil.skipAnotherActivity(this,UpdateSuccessActivity.class);
                break;
        }

    }
}
