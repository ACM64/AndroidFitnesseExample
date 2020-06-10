package fixtures

import acm.androidfitnesseexample.MessageInterface
import acm.androidfitnesseexample.MessagePresenter

class SayHelloFixture : MessageInterface {

    private var mMessage: String? = null

    private val mMessagePresenter: MessagePresenter = MessagePresenter(this)

    fun iSay(text: String?) {
        mMessagePresenter.read(text)
    }

    fun waitingForAnswer() {
        mMessagePresenter.produceAnswer()
    }

    fun answer(): String? {
        return mMessage
    }

    override fun showMessage(text: String) {
        mMessage = text
    }

}