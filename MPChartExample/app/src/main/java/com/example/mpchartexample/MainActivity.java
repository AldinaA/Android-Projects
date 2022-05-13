package com.example.mpchartexample;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList barArraylist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BarChart barChart = findViewById(R.id.barchart);
        getData();
        BarDataSet barDataSet = new BarDataSet(barArraylist, "Cambo Tutorial");
        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);

        //color bar data set
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        //text color
        barDataSet.setValueTextColor(Color.BLACK);

        //settting text size
        barDataSet.setValueTextSize(16f);
        barChart.getDescription().setEnabled(true);
    }


    private void getData() {
        barArraylist = new ArrayList();
        barArraylist.add(new BarEntry(2f, 10));
        barArraylist.add(new BarEntry(3f, 20));
        barArraylist.add(new BarEntry(4f, 30));
        barArraylist.add(new BarEntry(5f, 40));
        barArraylist.add(new BarEntry(6f, 50));
    }
}