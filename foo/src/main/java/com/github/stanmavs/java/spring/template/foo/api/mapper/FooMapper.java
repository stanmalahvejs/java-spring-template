package com.github.stanmavs.java.spring.template.foo.api.mapper;

import com.github.stanmavs.java.spring.template.foo.api.dto.FooDto;
import com.github.stanmavs.java.spring.template.foo.model.Foo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FooMapper {

  FooDto mapToDto(Foo model);
}
