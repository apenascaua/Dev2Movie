package br.com.dev2me.controller;

import br.com.dev2me.entity.Movie;
import br.com.dev2me.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public List<Movie> getAll(){
        System.out.println("Get test");
        return movieRepository.findAll();
    }

    @PostMapping("/movies")
    public Movie create(@RequestBody Movie movie){
        System.out.println("Post test");
        return movieRepository.save(movie);
    }

    @PutMapping("/movies/{id}")
    public void update(@PathVariable(value = "id") Long movieId, @RequestBody Movie movieDetails){
        movieRepository.save(movieDetails);
    }

    @GetMapping("/movies/{id}")
    public Movie getById(@PathVariable(value = "id") Long movieId) {
        Movie movie = movieRepository.findById(movieId).get();
        return movie;
    }

    @DeleteMapping("/movies/delete/{id}")
    public void delete(@PathVariable(value = "id") Long movieId){
        System.out.println("Delete test");
        movieRepository.deleteById(movieId);
    }
}
