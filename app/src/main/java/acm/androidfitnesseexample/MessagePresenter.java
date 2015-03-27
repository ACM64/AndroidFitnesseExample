package acm.androidfitnesseexample;

/**
 * Created in February.
 */
public class MessagePresenter {

    private MessageInterface mMessageInterface;
    private String mText;

    public MessagePresenter(MessageInterface messageInterface) {

        mMessageInterface = messageInterface;
    }

    public void read(String text) {
        mText = text;
    }

    public void produceAnswer() {
        mMessageInterface.showMessage(mText);
    }
}
