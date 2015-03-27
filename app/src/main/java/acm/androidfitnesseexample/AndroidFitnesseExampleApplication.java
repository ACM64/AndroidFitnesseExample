package acm.androidfitnesseexample;

import android.app.Application;
import android.os.AsyncTask;

import java.io.IOException;

import fitnesse.slim.JavaSlimFactory;
import fitnesse.slim.SlimService;

/**
 * Created in February.
 */
public class AndroidFitnesseExampleApplication extends Application {

    @Override
    public void onCreate() {
        new SlimClientTask().execute();
    }


    class SlimClientTask extends AsyncTask<String, Void, Void> {

        protected Void doInBackground(String... urls) {

            SlimService.Options options = SlimService.parseCommandLine(new String[]{"-v", "-d", "8099"});
            try {
                SlimService.startWithFactory(JavaSlimFactory.createJavaSlimFactory(options), options);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
