package rytangle.fibosdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by root on 6/10/17.
 */
//
//public class fibomain {
//}
//public class fibomain extends Activity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }
//}
//

public class fibomain extends LinearLayout {


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//    }

    public fibomain(Context context) {
        super(context);
        initialize(context);
    }

    public fibomain(Context context, AttributeSet attrs) {

        super(context, attrs);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.fibomain, this);
    }

    public void start(View view) {
        Log.i("log","start");
    }
}