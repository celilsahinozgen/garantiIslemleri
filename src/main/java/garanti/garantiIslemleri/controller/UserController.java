package garanti.garantiIslemleri.controller;

import garanti.garantiIslemleri.entity.User;
import garanti.garantiIslemleri.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/user")
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody User user) {
        if (user.getId() != null) {
            return ResponseEntity.badRequest().build();
        }
        userService.save(user);
        return ResponseEntity.ok().build();
    }
    @PutMapping("/update")
    public ResponseEntity<User> update(@RequestBody User user){
        if (user.getId() == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(userService.update(user));

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        try {
            userService.delete(id);
            return ResponseEntity.noContent().build();
        }catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/findbyid/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        Optional<User> optionalUser;
        try {
            optionalUser = userService.findById(id);
        } catch (RuntimeException e) {
          return   ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optionalUser.get());
    }
    @GetMapping("/findall")
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }
}
