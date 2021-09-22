package com.coding.test.DogControllerTest;

import com.coding.test.controller.DogController;
import com.coding.test.model.Dog;
import com.coding.test.service.DogService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@RunWith(SpringRunner.class)
@WebMvcTest(value= DogController.class)
public class DogControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DogService dogService;

    @Test
    public void GetAllTest() throws Exception {
        Dog mockdog = new Dog();
        mockdog.setWolfhound(new ArrayList<String>(Arrays.asList("irish")));



        Mockito.when(dogService.getAll()).thenReturn(mockdog);
        String URI = "/api/breeds/list/all";

        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI).accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        String outputInJson = result.getResponse().getContentAsString();
        String expectedJson = mapToJson(mockdog);

        assertThat(outputInJson).isEqualTo(expectedJson);
    }

    private String mapToJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }
}

