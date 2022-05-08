package garanti.garantiIslemleri.service.impl;

import garanti.garantiIslemleri.entity.User;
import garanti.garantiIslemleri.repository.UserRepository;
import garanti.garantiIslemleri.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public boolean delete(Long id) {
        try {
            Optional<User> item=    userRepository.findById(id);
            if (item.isPresent())
                userRepository.delete(item.get());
            return true;
        }catch (Exception exception) {
            return false;
        }

    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
