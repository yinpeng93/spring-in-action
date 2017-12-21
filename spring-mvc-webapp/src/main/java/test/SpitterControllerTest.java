package test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import spittr.web.SpitterController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * @author yp
 * @description
 * @date 2017/12/21 21:22
 */

public class SpitterControllerTest {
    @Test
    public void shouldShowRegistration() throws Exception {
        SpitterController controller = new SpitterController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/spitter/register")).andExpect(view().name("registerForm"));
    }


}
