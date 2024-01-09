package easy.condominium.api.controller;

import easy.condominium.api.address.Address;
import easy.condominium.api.address.AddressRepository;
import easy.condominium.api.user.User;
import easy.condominium.api.user.UserRegistrationData;
import easy.condominium.api.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;

    @PostMapping
    public void register(@RequestBody UserRegistrationData data) {
        User user =  new User(data);
        Address address =  new Address(data.address());

        user.addAddress(address);

        userRepository.save(user);
        addressRepository.save(address);
    }

}
