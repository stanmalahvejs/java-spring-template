package com.github.stanmavs.java.spring.template.foo.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

import com.github.stanmavs.java.spring.template.foo.api.dto.FooDto;
import com.github.stanmavs.java.spring.template.foo.api.mapper.FooMapper;
import com.github.stanmavs.java.spring.template.foo.core.FooService;
import com.github.stanmavs.java.spring.template.foo.model.Foo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class FooControllerTest {

  @InjectMocks private FooController sut;

  @Mock private FooService fooServiceMock;

  @Mock private FooMapper fooMapperMock;

  @AfterEach
  public void afterEach() {
    verifyNoMoreInteractions(fooServiceMock);
    verifyNoMoreInteractions(fooMapperMock);
  }

  @Test
  public void itShouldGetFoo() {
    // arrange
    Foo modelMock = mock(Foo.class);
    when(fooServiceMock.getFoo(123)).thenReturn(modelMock);
    FooDto dtoMock = mock(FooDto.class);
    when(fooMapperMock.mapToDto(modelMock)).thenReturn(dtoMock);

    // act
    FooDto actualResult = sut.getFoo(123);

    // assert
    assertEquals(dtoMock, actualResult);
    verifyNoMoreInteractions(modelMock);
    verifyNoMoreInteractions(dtoMock);
  }
}
