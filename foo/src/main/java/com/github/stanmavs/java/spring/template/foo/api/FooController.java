package com.github.stanmavs.java.spring.template.foo.api;

import com.github.stanmavs.java.spring.template.foo.api.dto.FooDto;
import com.github.stanmavs.java.spring.template.foo.api.mapper.FooMapper;
import com.github.stanmavs.java.spring.template.foo.core.FooService;
import com.github.stanmavs.java.spring.template.foo.model.Foo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/foo")
@RequiredArgsConstructor
public class FooController {

  private final FooService fooService;
  private final FooMapper fooMapper;

  @GetMapping(path = "/{id}")
  public FooDto getFoo(@PathVariable int id) {
    Foo model = fooService.getFoo(id);
    return fooMapper.mapToDto(model);
  }
}
