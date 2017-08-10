package com.example.android.christmasmoviequizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.christmasmoviequizapp.R.string.test_result_score;

public class MainActivity extends AppCompatActivity {

    /**
     * The number of correct answers
     */
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the end test button is clicked.
     */
    public void endTest(View view) {
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        //Called question checking methods
        onCheckedQuestion1();
        onCheckedQuestion2();
        onCheckedQuestion3();
        onCheckedQuestion4();
        onCheckedQuestion5();
        onCheckedQuestion6();
        onCheckedQuestion7();
        onCheckedQuestion8();
        onCheckedQuestion9();
        onCheckedQuestion10();

        // Display the test result on the screen
        String test_result = createTestResult(name, score);
        displayResult(test_result);
        Toast.makeText(getApplicationContext(), test_result, Toast.LENGTH_LONG).show();

        // Disabled "End Test" button after clicking on it.
        Button endTestButton = (Button) findViewById(R.id.end_test_button);
        endTestButton.setEnabled(false);
    }

    /**
     * Create summary of the test result.
     *
     * @param name of the passing the test
     * @param score of the counting of right answers
     * @return text of the test result
     */
    private String createTestResult(String name, int score) {
        String test_result = getString(R.string.test_result_name) + name;
        test_result += "\n" + getString(test_result_score) + score;
        return test_result;
    }

    /**
     * This method counter correct answers in question 1
     */
    public void onCheckedQuestion1() {
        // Figure out if the user chose "Donner" answer
        CheckBox DonnerCheckBox = (CheckBox) findViewById(R.id.donner_checkbox);
        boolean hasDonner = DonnerCheckBox.isChecked();

        if (hasDonner) {
            increment_score();
        }

        // Figure out if the user chose "Vixon" answer
        CheckBox VixonCheckBox = (CheckBox) findViewById(R.id.vixon_checkbox);
        boolean hasVixon = VixonCheckBox.isChecked();

        if (hasVixon) {
            increment_score();
        }

        // Figure out if the user chose "Dixon" answer
        CheckBox DixonCheckBox = (CheckBox) findViewById(R.id.dixon_checkbox);
        boolean hasDixon = DixonCheckBox.isChecked();

        if (hasDixon) {
            increment_score();
        }

        // Figure out if the user chose "Dasher" answer
        CheckBox DasherCheckBox = (CheckBox) findViewById(R.id.dasher_checkbox);
        boolean hasDasher = DasherCheckBox.isChecked();

        if (hasDasher) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 2
     */
    public void onCheckedQuestion2() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_2);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.tim_burton_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.tim_burton_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.alfred_hitchcock_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.martin_scorsene_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.steven_speiberg_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 3
     */
    public void onCheckedQuestion3() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_3);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.hocus_pocus_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.hocus_pocus_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.rabbit_claus_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.little_grinch_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.scut_farkus_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 4
     */
    public void onCheckedQuestion4() {
        // Figure out if the user chose "Mike" answer
        CheckBox MikeCheckBox = (CheckBox) findViewById(R.id.mike_checkbox);
        boolean hasMike = MikeCheckBox.isChecked();

        if (hasMike) {
            increment_score();
        }

        // Figure out if the user chose "Clarence" answer
        CheckBox ClarenceCheckBox = (CheckBox) findViewById(R.id.clarence_checkbox);
        boolean hasClarence = ClarenceCheckBox.isChecked();

        if (hasClarence) {
            increment_score();
        }

        // Figure out if the user chose "Robert" answer
        CheckBox RobertCheckBox = (CheckBox) findViewById(R.id.robert_checkbox);
        boolean hasRobert = RobertCheckBox.isChecked();

        if (hasRobert) {
            increment_score();
        }

        // Figure out if the user chose "Jim" answer
        CheckBox JimCheckBox = (CheckBox) findViewById(R.id.jim_checkbox);
        boolean hasJim = JimCheckBox.isChecked();

        if (hasJim) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 5
     */
    public void onCheckedQuestion5() {
        // Figure out if the user chose "A Remote Controlled Car" answer
        CheckBox Ques_5_Answer_a_CheckBox = (CheckBox) findViewById(R.id.ques_5_answer_a_checkbox);
        boolean hasQues_5_Answer_a_CheckBox = Ques_5_Answer_a_CheckBox.isChecked();

        if (hasQues_5_Answer_a_CheckBox) {
            increment_score();
        }

        // Figure out if the user chose "A BB Gun" answer
        CheckBox Ques_5_Answer_b_CheckBox = (CheckBox) findViewById(R.id.ques_5_answer_b_checkbox);
        boolean hasQues_5_Answer_b_CheckBox = Ques_5_Answer_b_CheckBox.isChecked();

        if (hasQues_5_Answer_b_CheckBox) {
            increment_score();
        }

        // Figure out if the user chose "A Bow and Arrow" answer
        CheckBox Ques_5_Answer_c_CheckBox = (CheckBox) findViewById(R.id.ques_5_answer_c_checkbox);
        boolean hasQues_5_Answer_c_CheckBox = Ques_5_Answer_c_CheckBox.isChecked();

        if (hasQues_5_Answer_c_CheckBox) {
            increment_score();
        }

        // Figure out if the user chose "A Playstation" answer
        CheckBox Ques_5_Answer_d_CheckBox = (CheckBox) findViewById(R.id.ques_5_answer_d_checkbox);
        boolean hasQues_5_Answer_d_CheckBox = Ques_5_Answer_d_CheckBox.isChecked();

        if (hasQues_5_Answer_d_CheckBox) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 6
     */
    public void onCheckedQuestion6() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_6);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.ebenezer_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.ebenezer_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.martin_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.bruce_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.maxwell_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 7
     */
    public void onCheckedQuestion7() {
        RadioButton answerRadio;
        RadioGroup answers = (RadioGroup) findViewById(R.id.question_7);
        switch (answers.getCheckedRadioButtonId()) {
            case R.id.small_heart_radiobutton:
                answerRadio = (RadioButton) findViewById(R.id.small_heart_radiobutton);
                increment_score();
                break;
            default:
                answerRadio = (RadioButton) findViewById(R.id.small_brain_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.broken_leg_radiobutton);
                answerRadio = (RadioButton) findViewById(R.id.crooked_knee_radiobutton);
        }
    }

    /**
     * This method counter correct answers in question 8
     */
    public void onCheckedQuestion8() {
        // Figure out if the user chose "New Jersey" answer
        CheckBox NewJerseyCheckBox = (CheckBox) findViewById(R.id.new_jersey_checkbox);
        boolean hasNewJerseyCheckBox = NewJerseyCheckBox.isChecked();

        if (hasNewJerseyCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "New Orleans" answer
        CheckBox NewOrleansCheckBox = (CheckBox) findViewById(R.id.new_orleans_checkbox);
        boolean hasNewOrleansCheckBox = NewOrleansCheckBox.isChecked();

        if (hasNewOrleansCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "New York" answer
        CheckBox NewYorkCheckBox = (CheckBox) findViewById(R.id.new_york_checkbox);
        boolean hasNewYorkCheckBox = NewYorkCheckBox.isChecked();

        if (hasNewYorkCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Boston" answer
        CheckBox BostonCheckBox = (CheckBox) findViewById(R.id.boston_checkbox);
        boolean hasBostonCheckBox = BostonCheckBox.isChecked();

        if (hasBostonCheckBox) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 9
     */
    public void onCheckedQuestion9() {
        // Figure out if the user chose "A Trumphet" answer
        CheckBox ATrumphetCheckBox = (CheckBox) findViewById(R.id.a_trumpet_checkbox);
        boolean hasATrumphetCheckBox = ATrumphetCheckBox.isChecked();

        if (hasATrumphetCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Wings" answer
        CheckBox WingsCheckBox = (CheckBox) findViewById(R.id.wings_checkbox);
        boolean hasWingsCheckBox = WingsCheckBox.isChecked();

        if (hasWingsCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "A Halo" answer
        CheckBox AHaloCheckBox = (CheckBox) findViewById(R.id.a_halo_checkbox);
        boolean hasAHaloCheckBox = AHaloCheckBox.isChecked();

        if (hasAHaloCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "A Crown" answer
        CheckBox ACrownCheckBox = (CheckBox) findViewById(R.id.a_crown_checkbox);
        boolean hasACrownCheckBox = ACrownCheckBox.isChecked();

        if (hasACrownCheckBox) {
            increment_score();
        }
    }

    /**
     * This method counter correct answers in question 10
     */
    public void onCheckedQuestion10() {
        // Figure out if the user chose "The Break In" answer
        CheckBox TheBreakInCheckBox = (CheckBox) findViewById(R.id.the_break_in_checkbox);
        boolean hasTheBreakInCheckBox = TheBreakInCheckBox.isChecked();

        if (hasTheBreakInCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Christmas Trouble" answer
        CheckBox ChristmasTroubleCheckBox = (CheckBox) findViewById(R.id.christmas_trouble_checkbox);
        boolean hasChristmasTroubleCheckBox = ChristmasTroubleCheckBox.isChecked();

        if (hasChristmasTroubleCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Home Alone" answer
        CheckBox HomeAloneCheckBox = (CheckBox) findViewById(R.id.home_alone_checkbox);
        boolean hasHomeAloneCheckBox = HomeAloneCheckBox.isChecked();

        if (hasHomeAloneCheckBox) {
            increment_score();
        }

        // Figure out if the user chose "Two Men" answer
        CheckBox TwoMenCheckBox = (CheckBox) findViewById(R.id.two_men_checkbox);
        boolean hasTwoMenCheckBox = TwoMenCheckBox.isChecked();

        if (hasTwoMenCheckBox) {
            increment_score();
        }
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayResult(String result) {
        TextView testResultTextView = (TextView) findViewById(R.id.test_result_text_view);
        testResultTextView.setText(result);
    }

    /**
     * This method is called when user selected the correct answer.
     * Added +1 to score for each correct answer
     */
    private int increment_score() {
        score = ++score;
        return score;
    }
}

