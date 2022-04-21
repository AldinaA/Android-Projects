package com.example.RetrofitJSONExample;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    // creating variables for our textview,
    // imageview,cardview and progressbar.
    private TextView courseNameTV, courseTracksTV, courseBatchTV;
    private ImageView courseIV;
    private ProgressBar loadingPB;
    private CardView courseCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing our variables.
        loadingPB = findViewById(R.id.idLoadingPB);
        courseCV = findViewById(R.id.idCVCourse);
        courseNameTV = findViewById(R.id.idTVCourseName);
        courseTracksTV = findViewById(R.id.idTVTracks);
        courseBatchTV = findViewById(R.id.idTVBatch);
        courseIV = findViewById(R.id.idIVCourse);
        getCourse();
    }

    private void getCourse() {

        // on below line we are creating a retrofit
        // builder and passing our base url
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonkeeper.com/b/")
                // on below line we are calling add Converter
                // factory as GSON converter factory.
                .addConverterFactory(GsonConverterFactory.create())
                // at last we are building our retrofit builder.
                .build();
        // below line is to create an instance for our retrofit api class.
        RetrofitAPI retrofitAPI = retrofit.create(RetrofitAPI.class);
        Call<RecyclerData> call = retrofitAPI.getCourse();
        call.enqueue(new Callback<RecyclerData>() {
            @Override
            public void onResponse(Call<RecyclerData> call, Response<RecyclerData> response) {
                if (response.isSuccessful()) {
                    // inside the on response method.
                    // we are hiding our progress bar.
                    loadingPB.setVisibility(View.GONE);
                    // in below line we are making our card
                    // view visible after we get all the data.
                    courseCV.setVisibility(View.VISIBLE);
                    RecyclerData modal = response.body();
                    // after extracting all the data we are
                    // setting that data to all our views.
                    courseNameTV.setText(modal.getCourseName());
                    courseTracksTV.setText(modal.getCourseTracks());
                    courseBatchTV.setText(modal.getCourseMode());
                    // we are using picasso to load the image from url.
                    Picasso.get().load(modal.getCourseimg()).into(courseIV);
                }
            }

            @Override
            public void onFailure(Call<RecyclerData> call, Throwable t) {
                // displaying an error message in toast
                Toast.makeText(MainActivity.this, "Fail to get the data..", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
