package com.example.listviewdactrung;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterTruyen extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Truyen> ListTruyen;

    public AdapterTruyen(Context context, int layout, List<Truyen> listTruyen) {
        this.context = context;
        this.layout = layout;
        ListTruyen = listTruyen;
    }

    @Override
    public int getCount() {
        return ListTruyen.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
        TextView textTen = (TextView) view.findViewById(R.id.textviewTen);
        TextView textMoTa = (TextView) view.findViewById(R.id.textviewMoTa);

        Truyen truyen = ListTruyen.get(i);
        imgHinh.setImageResource(truyen.getHinh());
        textTen.setText(truyen.getTen());
        textMoTa.setText(textMoTa.getText()+truyen.getChuong());

        return view;
    }

}
