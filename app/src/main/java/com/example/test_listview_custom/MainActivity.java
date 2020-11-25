package com.example.test_listview_custom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvDanhSachSanPham;
    private SanPhamAdapter sanPhamAdapter;
    private ArrayList<SanPham> dsSp = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DuLieu();
        linkViews();
    }

    private void linkViews() {
        lvDanhSachSanPham = findViewById(R.id.lvDanhSachSP);
        sanPhamAdapter = new SanPhamAdapter(this, dsSp);
        lvDanhSachSanPham.setAdapter(sanPhamAdapter);
    }
    private void DuLieu() {
        //Tạo sản phẩm
        SanPham sp1 = new SanPham("Pepsi", 9.5, R.drawable.anh1);
        //Thêm sản phẩm vào danh sách
        dsSp.add(sp1);
        SanPham sp2 = new SanPham("Pepsi", 9.5, R.drawable.anh1);
        //Thêm sản phẩm vào danh sách
        dsSp.add(sp2);
        SanPham sp3 = new SanPham("Pepsi", 9.5, R.drawable.anh1);
        //Thêm sản phẩm vào danh sách
        dsSp.add(sp3);
        SanPham sp4 = new SanPham("Pepsi", 9.5, R.drawable.anh1);
        //Thêm sản phẩm vào danh sách
        dsSp.add(sp4);
    }
}