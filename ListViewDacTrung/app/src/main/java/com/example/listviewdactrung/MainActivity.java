package com.example.listviewdactrung;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Truyen> ArrayTruyen;
    AdapterTruyen adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);

        ArrayTruyen = new ArrayList<>();
        ArrayTruyen.add(new Truyen( R.drawable.items1,"Trò Chơi Này Cũng Quá Chân Thật","1008"));
        ArrayTruyen.add(new Truyen( R.drawable.items2,"Bảo Tàng Thợ Săn","580"));
        ArrayTruyen.add(new Truyen( R.drawable.items3,"Vô Cùng Đơn Giản Luyện Cái Võ","245"));
        ArrayTruyen.add(new Truyen( R.drawable.items4,"Người Tại Thần Quỷ, Nhục Thân Vô Hạn Thôi Diễn","67"));
        ArrayTruyen.add(new Truyen( R.drawable.items5,"Trấn Long Đình","849"));
        adapter = new AdapterTruyen(MainActivity.this, R.layout.activity_items, ArrayTruyen);
        lv.setAdapter(adapter);
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                alertDialog.setTitle("Thông Báo!");
                alertDialog.setMessage("Bạn có chắc chắn muốn xóa Items này?");
                int so = i;
                alertDialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ArrayTruyen.remove(so);
                        adapter.notifyDataSetChanged();
                    }
                });
                alertDialog.setNegativeButton("Không", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                alertDialog.show();
                return false;
            }
        });
    }
}