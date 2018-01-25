package com.bbc.bbclub.c.UnLogin;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class EditNameActivity extends BaseActivity {

    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.btn_next)
    Button btn_next;

    @Override
    protected void initImmersionBar() {
        super.initImmersionBar();
    }

    @Override
    protected void initView() {
        super.initView();
    }

    @Override
    protected int setLayoutId() {
        return R.layout.activity_edit_name;
    }

    @OnClick({R.id.top_view_back,R.id.btn_next})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
            case R.id.btn_next:
                StartActivityUtil.skipAnotherActivity(this,HomeActivity.class);
                break;
        }
    }
}
