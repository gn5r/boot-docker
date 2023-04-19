package com.github.gn5r.uhbrhs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.gn5r.uhbrhs.entity.Test;
import com.github.gn5r.uhbrhs.mapper.TestMapper;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class TestService {

  private final TestMapper testMapper;

  public List<Test> getAll() {
    return testMapper.selectAll();
  }
}
