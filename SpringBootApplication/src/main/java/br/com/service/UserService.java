package br.com.service;

import br.com.shared.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDto createUser(UserDto userDto);

}
