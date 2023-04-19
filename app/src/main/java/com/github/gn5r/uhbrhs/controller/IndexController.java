package com.github.gn5r.uhbrhs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.gn5r.uhbrhs.service.TestService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class IndexController {

  private final TestService testService;

  @GetMapping({ "", "/" })
  public String index(Model model) {
    log.debug("access index");

    var list = testService.getAll();
    model.addAttribute("list", list);
    return "index";
  }
}
