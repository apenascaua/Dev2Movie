package br.com.dev2me;

import br.com.dev2me.controller.MovieController;
import br.com.dev2me.entity.Movie;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static br.com.dev2me.entity.MovieType.MOVIE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MovieController.class)
public class MovieControllerTests {

    @Autowired
    MockMvc mvc;

    @MockBean
    MovieController movieController;

    @Test
    public void shouldCreateMovieInDatabase() throws Exception {
        Movie mv = new Movie();
        mv.setMovieName("Star Wars");
        mv.setMovieType(MOVIE);
        mv.setMovieYear(1977);
        mv.setLanguage("PT");
        mv.setList("Gabriel, Eliane, Luiz, Rafael");
        mv.setSynopsis("blablabla");
        mv.setTrailer("http://youtube.com/starwars");

        Gson gson = new Gson();
        
        String json = gson.toJson(mv);
        
        ResultActions test = mvc.perform(post("http://localhost:8080/api/v1/movies")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json));

        test.andExpect(status().isOk());
    }

    @Test
    public void shouldShowTheDataOnTheDatabase() throws Exception{
        ResultActions test = mvc.perform(get("http://localhost:8080/api/v1/movies"));
        test.andExpect(status().isOk());
    }

    @Test
    public void shouldUpdateTheMovieOnDatabase() throws Exception{
        Movie mv = new Movie();
        mv.setSynopsis("aliens e jedis");
        mv.setTrailer("http://youtube.com/guerranasestrelas");

        Gson gson = new Gson();

        String json = gson.toJson(mv);

        ResultActions test = mvc.perform(put("http://localhost:8080/api/v1/movies/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json));

        test.andExpect(status().isOk());
    }

    @Test
    public void shouldShowTheDataByIdOnTheDatabase() throws Exception{
        ResultActions test = mvc.perform(get("http://localhost:8080/api/v1/movies/1"));
        test.andExpect(status().isOk());
    }

    @Test
    public void shouldDeleteTheDataByIdOnTheDatabase() throws Exception{
        ResultActions test = mvc.perform(delete("http://localhost:8080/api/v1/movies/delete/1"));
        test.andExpect(status().isOk());
    }
}
