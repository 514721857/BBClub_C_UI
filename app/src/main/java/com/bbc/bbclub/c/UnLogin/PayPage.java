package com.bbc.bbclub.c.UnLogin;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.bbc.bbclub.c.R;
import com.bbc.bbclub.c.Utils.StartActivityUtil;
import com.bbc.bbclub.c.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;
import cn.yhq.dialog.core.DialogBuilder;

public class PayPage extends BaseActivity {
    @BindView(R.id.top_view_back)
    ImageView top_view_back;

    @BindView(R.id.top_view_title)
    TextView top_view_title;

    @BindView(R.id.question_img)
    ImageView question_img;

    @BindView(R.id.btn_next)
    Button btn_next;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_pay_page;
    }

    protected void initView() {
        top_view_title.setText(getString(R.string.pay_detail));
    }

    @OnClick({R.id.top_view_back,R.id.question_img,R.id.btn_next})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_next:
                StartActivityUtil.skipAnotherActivity(PayPage.this,PaySuccessActivity.class);
                break;
            case R.id.top_view_back:
                finish();
                break;
            case R.id.question_img:
                View customView =
                        View.inflate(PayPage.this, R.layout.question_custom, null);
                        /*TextView textView = (TextView) customView.findViewById(android.R.id.text1);
                        textView.setText("自定义视图");*/
                DialogBuilder.otherDialog(PayPage.this)
                        .setContentView(customView,
                                new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT))
                        .show();
                break;
        }
    }
}
