package com.github.stanmavs.java.spring.template.foo.core;

import com.github.stanmavs.java.spring.template.foo.model.Foo;
import org.springframework.stereotype.Component;

@Component
public class FooService {

  public Foo getFoo(int id) {
    return new Foo(id, "Foo id: " + id);
  }
}
