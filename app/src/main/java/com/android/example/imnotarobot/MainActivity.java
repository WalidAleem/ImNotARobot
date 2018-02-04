package com.android.example.imnotarobot;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity{

    int score = 0;
    String rightAnswer = "truth";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * this method display the grade of the text inserted in text question
     */



     public void submitAnswer  (View view) {


         RadioButton radioButtonPage1  = (RadioButton) findViewById(R.id.rb_2_page_1);
         boolean radioBton1 = radioButtonPage1.isChecked();

         RadioButton radioButtonPage2  = (RadioButton) findViewById(R.id.rb_4_page_2);
         boolean radioBton2 = radioButtonPage2.isChecked();

         RadioButton radioButtonPage3  = (RadioButton) findViewById(R.id.rb_3_page_3);
         boolean radioBton3 = radioButtonPage3.isChecked();


         RadioButton radioButtonPage4  = (RadioButton) findViewById(R.id.rb_1_page_4);
         boolean radioBton4 = radioButtonPage4.isChecked();

         RadioButton radioButtonPage5  = (RadioButton) findViewById(R.id.rb_2_page_5);
         boolean radioBton5 = radioButtonPage5.isChecked();


         CheckBox rightPageSelected1 = (CheckBox) findViewById(R.id.checkbox_1);
         boolean pageSelected1 = rightPageSelected1.isChecked();

         CheckBox rightPageSelected2 = (CheckBox) findViewById(R.id.checkbox_2);
         boolean pageSelected2 = rightPageSelected2.isChecked();

         int finalScore = calculateScore(radioBton1, radioBton2,radioBton3,radioBton4,radioBton5,pageSelected1, pageSelected2 );


         Toast.makeText(MainActivity.this, "Max. grade is 7 and your score is " + score,  Toast.LENGTH_SHORT).show();
        String reportSummary = createResultReport();

         score=0;



         Intent intent  = new Intent(Intent.ACTION_SENDTO);
         intent.setData(Uri.parse("mailto")); // email app handle this
         intent.putExtra(Intent.EXTRA_SUBJECT,"I'm not a robot quiz report");
         intent.putExtra(Intent.EXTRA_TEXT,reportSummary);
                 if (intent.resolveActivity(getPackageManager()) !=null) {
                     startActivity(intent);



                 }

     }



    /** this method to display result report
     *
     */
private String createResultReport (){


    String resultReport = ("thank you for using I'm Not A robot Quiz");
     resultReport += "\n your final score is" + score;

     return resultReport;
}


/** this method is called to calculate score
 *
 */
    private int calculateScore (boolean radioBtn1, boolean radioBtn2, boolean radioBtn3, boolean radioBtn4,
                                boolean radioBtn5, boolean checkBox1, boolean checkBox2 ){


        if (radioBtn1 == true) {
            increaseScore(score);
        }

        if (radioBtn2 == true) {
            increaseScore(score);
        }

        if (radioBtn3 == true) {
            increaseScore(score);
        }
        if (radioBtn4 == true) {
            increaseScore(score);
        }
        if (radioBtn5 == true) {
            increaseScore(score);
        }
        if (checkBox1==true){
        }
        if (checkBox2==true){
            increaseScore(score);
        }

        EditText inputText = (EditText) findViewById(R.id.edit_text);
        if (inputText.getText().toString().equalsIgnoreCase(rightAnswer)) {
        increaseScore(score);
   }
          return score;
  }

    /** this method called to increase score when select or input right answer is done
     *
     */
public void increaseScore (int numbe) {
    if (score == 7) {
    }
    score=score +1;
    showScore(score);
}

    /**
     * this method display the score
     */

    private void showScore(int number) {

        TextView sScore = (TextView) findViewById(R.id.score_text_view);
        sScore.setText(String.valueOf(number));
    }


    //the following methods are for switching between pages


    /** this method is  called when resume button is clicked
     *
     */

    public void unCheckSelected (View view){
        RadioGroup radioButtonGroup1 = (RadioGroup) findViewById(R.id.radio_group_1);
        radioButtonGroup1.clearCheck();

        RadioGroup radioButtonGroup2 = (RadioGroup) findViewById(R.id.radio_group_2);
        radioButtonGroup2.clearCheck();

        RadioGroup radioButtonGroup3 = (RadioGroup) findViewById(R.id.radio_group_3);
        radioButtonGroup3.clearCheck();

        RadioGroup radioButtonGroup4 = (RadioGroup) findViewById(R.id.radio_group_4);
        radioButtonGroup4.clearCheck();

        RadioGroup radioButtonGroup5 = (RadioGroup) findViewById(R.id.radio_group_5);
        radioButtonGroup5.clearCheck();

        CheckBox rightPageSelected1 = (CheckBox) findViewById(R.id.checkbox_1);
        rightPageSelected1.setChecked(false);

        CheckBox rightPageSelected2 = (CheckBox) findViewById(R.id.checkbox_2);
        rightPageSelected2.setChecked(false);

        View backToPage1 = (View) findViewById(R.id.page_1 );
        backToPage1.bringToFront();

        hideQuestion1(view);
        hideQuestion2(view);
        hideQuestion3(view);
        hideQuestion4(view);
        hideQuestion5(view);

        EditText inputText = (EditText) findViewById(R.id.edit_text);
        inputText.setText(R.string.word_field);

        score = 0;
        showScore(score);

    }

    /**
     * the following methods are called when the Back button is Clicked
     */
    public void onClickBackButtonPage2(View view) {
        View backToPage1 = (View) findViewById(R.id.page_1);
        backToPage1.bringToFront();

    }

    public void onClickBackButtonPage3(View view) {
        View backToPage2 = (View) findViewById(R.id.page_2);
        backToPage2.bringToFront();
    }

    public void onClickBackButtonPage4(View view) {
        View backToPage3 = (View) findViewById(R.id.page_3);
        backToPage3.bringToFront();
    }

    public void onClickBackButtonPage5(View view) {
        View backToPage4 = (View) findViewById(R.id.page_4);
        backToPage4.bringToFront();
    }


    /**
     * this method is called when the next Button is clicked
     */
    public void onClickNextButtonPage1(View view) {
        View showPage2 = (View) findViewById(R.id.page_2);
        showPage2.bringToFront();

    }

    public void onClickNextButtonPage2(View view) {
        View showPage3 = (View) findViewById(R.id.page_3);
        showPage3.bringToFront();

    }

    public void onClickNextButtonPage3(View view) {
        View showPage4 = (View) findViewById(R.id.page_4);
        showPage4.bringToFront();
    }

    public void onClickNextButtonPage4(View view) {
        View showPage5 = (View) findViewById(R.id.page_5);
        showPage5.bringToFront();
    }

    public void onClickNextButtonPage5(View view) {
        View showPage6 = (View) findViewById(R.id.page_6);
        showPage6.bringToFront();
    }


//the following is  a method to change the button background

    public void showQuestion1(View image) {
        Button question1 = (Button) findViewById(R.id.button_question_1);
        question1.setVisibility(View.INVISIBLE);
    }

    public void showQuestion2(View image) {
        Button question2 = (Button) findViewById(R.id.button_question_2);
        question2.setVisibility(View.INVISIBLE);

    }

    public void showQuestion3(View image) {
        Button question3 = (Button) findViewById(R.id.button_question_3);
        question3.setVisibility(View.INVISIBLE);
    }


    public void showQuestion4(View image) {
        Button question4 = (Button) findViewById(R.id.button_question_4);
        question4.setVisibility(View.INVISIBLE);

    }

    public void showQuestion5(View image) {
        Button question5 = (Button) findViewById(R.id.button_question_5);
        question5.setVisibility(View.INVISIBLE);


    }
    public void hideQuestion1(View image) {
        Button question1 = (Button) findViewById(R.id.button_question_1);
        question1.setVisibility(View.VISIBLE);
    }
    public void hideQuestion2(View image) {
        Button question2 = (Button) findViewById(R.id.button_question_2);
        question2.setVisibility(View.VISIBLE);

    }

    public void hideQuestion3(View image) {
        Button question3 = (Button) findViewById(R.id.button_question_3);
        question3.setVisibility(View.VISIBLE);
    }


    public void hideQuestion4(View image) {
        Button question4 = (Button) findViewById(R.id.button_question_4);
        question4.setVisibility(View.VISIBLE);

    }

    public void hideQuestion5(View image) {
        Button question5 = (Button) findViewById(R.id.button_question_5);
        question5.setVisibility(View.VISIBLE);

    }
}