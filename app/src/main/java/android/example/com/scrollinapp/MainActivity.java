package android.example.com.scrollinapp;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout layout;
    TextView textview; //why red ?
    Button button;
    EditText editText;
//    Int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //method runs 1st when act loaded
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        textview = findViewById(R.id.my_layout);
//        button = (Button) findViewById(R.button);
//        editText = (EditText) findViewById(R.id.editText);
//        counter = 1;

          textView = (TextView);

        //click button and errtime click want to add things to the bottom button

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                textview.append(editText.getText());//can't pass in editText cuz it has to b a string
//
//            }
//        });
//
        //notetaking app adds notes based on when pass in
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                String myEditTextVal = editText.getText(); //doesnt work cuz not a string if want to n string .toString() .trim -> eliminates empty spaces
//                if (editText.getText().length() != 0) { //!myEditTextVal.trim().equals("") inside the if condition
//                    textview.append(String.valueOf(counter) + "." + editText.getText()
//                            //.toString().trim() - elimiantes all spaces so check if begining or end has spaces
//                             + "\n");//can't pass in editText cuz it has to b a string
//                    counter++;
//                    editText.setText("");
//                }
//            }
//        });



//        Fruit fruit = new Fruit();
//        Apple apple = new Apple();
//        apple.getColor() // apple inherits from fruit
//        Fruit apple2 = new Apple(); //static types vs dynamic types
//        //apple2 static type is Fruit - has access 2 errthing Fruit
//        apple2.getColor();
//        ((Apple) apple2).getSeeds(); //only Fruit known at compiletime, things known at runtime is Apple so it has to be instantiated
//        //cast ref stored in apple 2 as Apple co,pile time use type safety @ runtime anything goes cuz polyphormism
//        //casting making an assumption - know static definition is fruit but it is ok to treat as Apple
//
//        TextView textView = new TextView(this);
//        textView.setWidth(ConstraintLayout.LayoutParams.MATCH_PARENT);
//        textView.setHeight(ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        textView.setTextSize(50.00f);
//        textView.setTextColor(Color.BLACK);
//
//        textView.setText("t");
////        layout.addView(textView,  ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//            textview.append("\n");
//        textview.append("link");


    }


}
