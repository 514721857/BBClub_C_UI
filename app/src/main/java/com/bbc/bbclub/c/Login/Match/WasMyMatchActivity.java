package com.bbc.bbclub.c.Login.Match;

import android.view.View;
import android.widget.TextView;

import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class WasMyMatchActivity extends BaseActivity {
    @BindView(R.id.top_view_title)
    TextView top_view_title;
    @Override
    protected int setLayoutId() {
        return R.layout.activity_was_my_match;
    }

    @Override
    protected void initView() {
        super.initView();
        top_view_title.setText("珠江赛区");
    }
    @OnClick({R.id.top_view_back,R.id.image_right,R.id.comfirm_del})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();

        }
    }
}
