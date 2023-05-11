package ru.neoflex.practice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class PracticeApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Test
	public void shouldReturnNumberPlus() throws Exception {
		this.mockMvc
				.perform(get("/plus/5/9")) // perform a request that can be chained
				.andDo(print()) // we log the result
				.andExpect(content().string(containsString("14"))); // we check that the Body of the answer contains our expectation
	}
	@Test
	public void shouldReturnNumberMinus() throws Exception {
		this.mockMvc
				.perform(get("/minus/90/9")) // perform a request that can be chained
				.andDo(print()) // we log the result
				.andExpect(content().string(containsString("81"))); // we check that the Body of the answer contains our expectation
	}
	@Test
	public void shouldReturnNumberDivide() throws Exception {
		this.mockMvc
				.perform(get("/divide/90/9")) // perform a request that can be chained
				.andDo(print()) // we log the result
				.andExpect(content().string(containsString("10"))); // we check that the Body of the answer contains our expectation
	}
	@Test
	public void shouldReturnNumberMultiple() throws Exception {
		this.mockMvc
				.perform(get("/multiple/50/3")) // perform a request that can be chained
				.andDo(print()) // we log the result
				.andExpect(content().string(containsString("150"))); // we check that the Body of the answer contains our expectation
	}
}
