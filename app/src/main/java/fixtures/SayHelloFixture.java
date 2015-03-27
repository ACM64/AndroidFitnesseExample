package fixtures;

import acm.androidfitnesseexample.MessageInterface;
import acm.androidfitnesseexample.MessagePresenter;

/**
 * Created in February.
 */
public class SayHelloFixture implements MessageInterface {

    private String mMessage;
    private final MessagePresenter mMessagePresenter;

    public SayHelloFixture() {
        mMessagePresenter = new MessagePresenter(this);
    }

    public void iSay(String text) {
        mMessagePresenter.read(text);
    }

    public void waitingForAnswer() {
        mMessagePresenter.produceAnswer();
    }

    public String answer() {
        return mMessage;
    }

    @Override
    public void showMessage(String text) {
        mMessage = text;
    }
}
