package com.bbc.bbclub.c.Login.Index;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class NextMatchActivity extends BaseActivity {
    @BindView(R.id.top_view_title)
    TextView top_view_title;
    @Override
    protected int setLayoutId() {
        return R.layout.activity_next_match;
    }

    @Override
    protected void initView() {
        super.initView();
        top_view_title.setText(getString(R.string.next_match_title));
    }
    @OnClick({R.id.top_view_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.top_view_back:
                finish();
                break;
        }
    }
}
