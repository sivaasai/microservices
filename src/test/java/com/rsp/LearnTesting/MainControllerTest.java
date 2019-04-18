package com.rsp.LearnTesting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import com.rsp.controller.MainController;

@RunWith(SpringJUnit4ClassRunner.class) 
public class MainControllerTest {
	
	@InjectMocks
	private MainController mainController;
	
	private MockMvc mockMvc;
	
	@Before
	public void setUp()throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(mainController)
                .build();
	}
	
	@Test
	public void testHome() throws Exception {
		
        mockMvc.perform(get("/aws"))
        .andExpect(status().isOk())
        .andExpect(content().string("Learning AWS Application"));
        
	}
	
	@Test
	public void tyestGetToken() throws Exception {
		
        mockMvc.perform(get("/"))
        .andExpect(status().isOk())
        .andExpect(content().string("Welcome"));
        
	}

}
