package com.daqi.bo;

import com.daqi.dao.PerfumeDAO;
import com.daqi.entity.Perfume;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PerfumeBO {
    PerfumeDAO dao=new PerfumeDAO();

    //返回一条数据
    public Perfume findById(int id){
        return dao.findById(id);
    }

    //返回全部数据
    public List<Perfume> getAll(){
        return dao.getAll();
    }

    //添加操作
    public int insert(int id,String name,String brand,float price){
        return dao.insert(id,name,brand,price);
    }

    //修改操作
    public int update(String name,String brand,float price){
        return dao.update(name,brand,price);
    }

    //删除数据
    public int delete(int id){
        return dao.delete(id);
    }
}
