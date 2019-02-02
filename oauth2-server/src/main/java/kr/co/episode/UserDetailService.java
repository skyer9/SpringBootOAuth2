package kr.co.episode;

import kr.co.episode.user.model.LoginUser;
import kr.co.episode.user.model.User;
import kr.co.episode.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("UsernameNotFound [" + username + "]");
        }
        LoginUser loginUser = createUser(user);
        return loginUser;
    }

    private LoginUser createUser(User user) {
        LoginUser loginUser = new LoginUser(user);
        if (loginUser.getUserType().equals("1")) {
            loginUser.setRoles(Arrays.asList("ROLE_ADMIN"));
        } else {
            loginUser.setRoles(Arrays.asList("ROLE_USER"));
        }
        return loginUser;
    }
}
