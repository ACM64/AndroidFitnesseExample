package acm.androidfitnesseexample

class MessagePresenter(private val mMessageInterface: MessageInterface) {
    private var mText: String? = null
    fun read(text: String?) {
        mText = text
    }

    fun produceAnswer() {
        mText?.let {
            mMessageInterface.showMessage(it)
        }
    }

}