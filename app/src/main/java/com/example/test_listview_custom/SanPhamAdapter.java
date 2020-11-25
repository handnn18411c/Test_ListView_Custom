package com.example.test_listview_custom;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//Đưa dữ liệu lên giao diện
public class SanPhamAdapter extends BaseAdapter {

    //Tạo context
    private Context context;
    //Tạo danh sách dữ liệu
    private ArrayList<SanPham> dsSP;

    //Tạo constructor
    public SanPhamAdapter(Context context, ArrayList<SanPham> dsSP) {
        this.context = context;
        this.dsSP = dsSP;
    }

    //Đếm số phần tử trong danh sách
    @Override
    public int getCount() {
        return dsSP.size(); //Số phần tử trong danh sách
    }

    //Trả về sản phẩm thứ i trong danh sách
    @Override
    public Object getItem(int position) {
        return dsSP.get(position);
    }

    @Override
    public long getItemId(int position) {
        return dsSP.indexOf(position);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // map dữ liệu với giao diện của list item
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.list_item, parent, false);
        //Copy paste 2 dòng trên
        ImageView imgSanPham = v.findViewById(R.id.imgSanPham);
        TextView tvTenSanPham = v.findViewById(R.id.tvSanPham);
        TextView tvGiaTien = v.findViewById(R.id.tvGiaTien);

        imgSanPham.setImageResource(dsSP.get(position).getAnh());
        tvTenSanPham.setText(dsSP.get(position).getTenSP());
        tvGiaTien.setText(dsSP.get(position).getGiaTien()+"");
        return v;
    }
}
