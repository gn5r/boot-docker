package com.github.gn5r.uhbrhs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.github.gn5r.uhbrhs.entity.Test;

@Mapper
public interface TestMapper {

  @Select("""
          select 1
      """)
  public int test();

  @Select("select * from test")
  public List<Test> selectAll();
}
