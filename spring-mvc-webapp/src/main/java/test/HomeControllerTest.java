package test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spittr.web.HomeController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * @author yp
 * @description
 * @date 2017/12/12 13:31
 */

public class HomeControllerTest {
    @Test
    public void testHomePage() throws Exception {
        HomeController homeController = new HomeController();
//        Assert.assertEquals("home",homeController.home());
        //搭建MockMvc
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();
        mockMvc.perform(get("/homepage")). //对"/"执行get请求
                andExpect(view().name("home")); //预期得到home页面
    }
}
