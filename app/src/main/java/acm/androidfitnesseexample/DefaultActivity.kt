package acm.androidfitnesseexample

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class DefaultActivity : Activity(), MessageInterface {

    private var mMessage: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_default)
        mMessage = findViewById(R.id.message)
    }

    override fun showMessage(text: String) {
        mMessage!!.text = text
    }
}