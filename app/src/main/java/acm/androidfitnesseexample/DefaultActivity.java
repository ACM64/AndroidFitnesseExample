package acm.androidfitnesseexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DefaultActivity extends Activity implements MessageInterface {

    private TextView mMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);
        mMessage = findViewById(R.id.message);
    }

    @Override
    public void showMessage(String text) {
        mMessage.setText(text);
    }
}
