package acm.androidfitnesseexample

import android.app.Application
import fitnesse.slim.JavaSlimFactory
import fitnesse.slim.SlimService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.io.IOException

class AndroidFitnesseExampleApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        launchFitnesseServer()
    }

    private fun launchFitnesseServer() {
        val options = SlimService.parseCommandLine(arrayOf("-v", "-d", "8099"))
        GlobalScope.launch {
            try {
                SlimService.startWithFactory(JavaSlimFactory.createJavaSlimFactory(options), options)
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
    }
}