package acm.androidfitnesseexample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class DefaultActivity extends ActionBarActivity implements MessageInterface {

    private TextView mMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);
        mMessage = (TextView) findViewById(R.id.message);
    }

    @Override
    public void showMessage(String text) {
        mMessage.setText(text);
    }
}
