package com.example.android.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private EditText mOperandOneEditText;
    private EditText mOperandTwoEditText;
    private TextView mResultTextView;

    private Calculator mCalculator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOperandOneEditText = findViewById(R.id.operand_one_edit_text);
        mOperandTwoEditText = findViewById(R.id.operand_two_edit_text);
        mResultTextView = findViewById(R.id.operation_result_text_view);

        mCalculator = new Calculator();
    }

    public void onAdd(View view) {
        calculate(Calculator.Operator.ADD);
    }

    public void onSub(View view) {
        calculate(Calculator.Operator.SUB);
    }

    public void onDiv(View view) {
        calculate(Calculator.Operator.DIV);
    }

    public void onMul(View view) {
        calculate(Calculator.Operator.MUL);
    }

    private static Double getOperand(EditText operandEditText) {
        String operandText = operandEditText.getText().toString();
        return  Double.valueOf(operandText);
    }

    private static String getOperandText(EditText operandEditText) {
        return operandEditText.getText().toString();
    }

    private void calculate(Calculator.Operator operator) {
        double operandOne;
        double operandTwo;

        try {
            operandOne = getOperand(mOperandOneEditText);
            operandTwo = getOperand(mOperandTwoEditText);

        } catch (NumberFormatException nfe) {
            Log.e(TAG, String.valueOf(nfe));
            mResultTextView.setText(R.string.computationError);
            return;
        }

        String result = null;

        switch (operator) {
            case ADD:
                result = String.valueOf(mCalculator.add(operandOne, operandTwo));
                break;
            case SUB:
                result = String.valueOf(mCalculator.sub(operandOne, operandTwo));
                break;
            case DIV:
                result = String.valueOf(mCalculator.div(operandOne, operandTwo));
                break;
            case MUL:
                result = String.valueOf(mCalculator.mul(operandOne, operandTwo));
                break;
        }
        mResultTextView.setText(result);

    }
}