package com.giuseppeliguori.fontentireapplicationandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by GiuseppeLiguori on 12/10/16.
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Create layout
        LinearLayout layout = new LinearLayout(this);

        //Configuration layout
        int padding = (int) (16 * getResources().getDisplayMetrics().density);
        layout.setPadding(padding, padding, padding, padding);
        layout.setOrientation(LinearLayout.VERTICAL);

        //Create textview Title
        TextView title = new TextView(this);
        title.setText(this.getResources().getString(R.string.Title));
        title.setTextSize(22);
        title.setGravity(Gravity.CENTER);

        //Create textview Description
        TextView description = new TextView(this);
        description.setText(this.getResources().getString(R.string.Description));
        description.setTextSize(16);

        //Create scrollview
        ScrollView scrollView = new ScrollView(this) ;

        //Add description to scrollview
        scrollView.addView(description);

        //Add objects to layout
        layout.addView(title);
        layout.addView(scrollView);

        //Show layout
        setContentView(layout);
    }
}
