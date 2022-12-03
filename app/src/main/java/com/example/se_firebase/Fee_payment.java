package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONException;
import org.json.JSONObject;

public class Fee_payment extends AppCompatActivity implements PaymentResultListener {

  private   TextInputEditText Current_sem,Payee_name,Amount,Contact_no;
  private   Button PayNow;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_payment);

          Payee_name=findViewById(R.id.edit_text_full_name);
        Current_sem = findViewById(R.id.edit_text_semester_payment);
        Amount = findViewById(R.id.edit_payment_amount);
     Contact_no=findViewById(R.id.Contact_no);

        PayNow = findViewById(R.id.pay_FEE_now);
        PayNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Sem_fee=Current_sem.getText().toString();
                String PayeeName=Payee_name.getText().toString();
                String Contact_details=Contact_no.getText().toString();
                // on below line we are getting
                // amount that is entered by user.
                String samount = Amount.getText().toString();

                // rounding off the amount.
                int amount = Math.round(Float.parseFloat(samount) * 100);

                // initialize Razorpay account.
                Checkout checkout = new Checkout();

                // set your id as below
                checkout.setKeyID("rzp_test_qvfLETsIfD7f1T");

                // set image
                checkout.setImage(R.drawable.bit);

                // initialize json object
                JSONObject object = new JSONObject();
                try {
                    // to put name
                    object.put("College name", "Birla Institute of Technology, Mesra");

                    // put description
                    object.put("description", "Semester Fee Payment");

                    // to set theme color
                    object.put("theme.color", "");

                    // put the currency
                    object.put("currency", "INR");

                    // put amount
                    object.put("amount", amount);

                    //put payeename
                    object.put("name",PayeeName);


                    //put Semester Details
                    object.put("Paying for Semester",Sem_fee);

                    // put mobile number
                    object.put("Contact No", Contact_details);

                    // put email
                    object.put("prefill.email", "chaitanyamunje@gmail.com");

                    // open razorpay to checkout activity
                    checkout.open(Fee_payment.this, object);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @Override
    public void onPaymentSuccess(String s) {
        // this method is called on payment success.
        Toast.makeText(this, "Payment is successful : " + s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        // on payment failed.
        Toast.makeText(this, "Payment Failed due to error : " + s, Toast.LENGTH_SHORT).show();
    }
        }