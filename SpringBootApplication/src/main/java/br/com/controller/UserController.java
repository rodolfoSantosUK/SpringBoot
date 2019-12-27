package br.com.controller;

import br.com.model.request.UserDetailRequestModel;
import br.com.model.response.UserRest;
import br.com.service.UserService;
import br.com.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public String getUser() {
        return "get user was called";
    }

    @Autowired
    public UserService userService;

    @PostMapping(value = "/createUser")
    public UserRest createUser(@RequestBody UserDetailRequestModel userDetails) {

        UserRest returnValue  = new UserRest();
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
    }



    @DeleteMapping
    public String deleteUser() {
        return "update user was called";
    }

}
