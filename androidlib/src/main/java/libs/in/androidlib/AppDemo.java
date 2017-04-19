package libs.in.androidlib;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by apple on 19/04/17.
 */

public class AppDemo
{
    public static final String TAG = "AWESOME_APP";

    public static void d(String msg)
    {
        Log.d(TAG, msg);
    }

    public static void printText(Context context, String str)
    {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
