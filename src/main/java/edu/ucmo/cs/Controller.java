package edu.ucmo.cs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/net/crud/")
public class Controller {
    @Autowired
    private Repository repository;

    @GetMapping("/get")
    public List<Netflix> getAllNetflixMovies() {
        return repository.findAll();
    }
    @PostMapping("/post")
    public Netflix createNetflixMovie(@RequestBody Netflix netflix) {
        return repository.save(netflix);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<Netflix> updateNetflixMovie(@PathVariable String id, @RequestBody Netflix netflixDetails) {
        Netflix netflix = repository.findById(id)
                .orElseThrow(() -> new CustomException("Netflix not exist with id :" + id));
        netflix.setRelease_year(netflixDetails.getRelease_year());
        netflix.setTitle(netflixDetails.getTitle());
        Netflix updatedNetflixMovie = repository.save(netflix);
        return ResponseEntity.ok(updatedNetflixMovie);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteNetflixMovie(@PathVariable String id) {
        Netflix netflix = repository.findById(id)
                .orElseThrow(() -> new CustomException("Department not exist with id :" + id));
        repository.delete(netflix);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}