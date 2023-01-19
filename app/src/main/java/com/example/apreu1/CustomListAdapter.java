package com.example.apreu1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter {

    Context context;
    String listFruit[];
    int listImages[];
    int images2[];
    String heures[];
    String salles[];
    String email[];
    int add [];
    LayoutInflater inflater;

    public CustomListAdapter(Context ctx, String[] fruitList, int[] images,int[] imgs,String[] sal,String[] hr,String[] mails,int ad[]) {
        this.context = ctx;
        this.listFruit = fruitList;
        this.listImages = images;
        this.images2 = imgs;
        this.heures = hr;
        this.salles = sal;
        this.email = mails;
        this.add =ad;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listFruit.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public int[] getImages2() {
        return images2;
    }

    public void setImages2(int[] images2) {
        this.images2 = images2;
    }

    public String[] getHeures() {
        return heures;
    }

    public void setHeures(String[] heures) {
        this.heures = heures;
    }

    public String[] getSalles() {
        return salles;
    }

    public void setSalles(String[] salles) {
        this.salles = salles;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view,null);
        TextView text = convertView.findViewById(R.id.textView);
        TextView hours= convertView.findViewById(R.id.heure);
        TextView classes = convertView.findViewById(R.id.salle);
        TextView addr = convertView.findViewById(R.id.email);
        ImageView fruitImg = convertView.findViewById(R.id.imageIcon);
        ImageView del = convertView.findViewById(R.id.imageIcon1);
        ImageView plus = convertView.findViewById(R.id.imageadd);
        text.setText(listFruit[i]);
        hours.setText(salles[i]);
        classes.setText(email[i]);
        addr.setText(heures[i]);
        plus.setImageResource(add[0]);
        fruitImg.setImageResource(listImages[i]);
        del.setImageResource(images2[0]);
        return convertView;

    }
}
