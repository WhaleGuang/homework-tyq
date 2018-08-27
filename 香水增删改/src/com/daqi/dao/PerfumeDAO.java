package com.daqi.dao;

import com.daqi.entity.Perfume;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PerfumeDAO {
    //返回一条数据
    public Perfume findById(int id){
        return null;
    }

    //返回全部数据
    public List<Perfume> getAll(){
        String sql="select * from Perfume";
        ResultSet rs= com.dao.DBUtil.executeQuery(sql);
        List<Perfume> modeList=new ArrayList<>();
        Perfume p=null;
        try {
            while (rs.next()){
                p=new Perfume(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("brand"),
                        rs.getFloat("price")
                );
                modeList.add(p);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return modeList;
    }

    //添加操作
    public int insert(int id,String name,String brand,float price){
        String sql="insert into Perfume values(?,?,?)";
        Object[] in={id,name,brand,price};
        return com.dao.DBUtil.executeUpdate(sql,in);
    }

    //修改操作
    public int update(String name,String brand,float price){
        String sql="update Perfume set name=?,brand=?,price=? where id=?";
        Object[] in={name,brand,price};
        return com.dao.DBUtil.executeUpdate(sql,in);
    }

    //删除数据
    public int delete(int id){
        String sql="delete Perfume where id=?";
        Object[] in={id};
        return com.dao.DBUtil.executeUpdate(sql,in);
    }
}
