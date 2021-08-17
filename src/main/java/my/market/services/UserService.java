package my.market.services;

import my.market.entities.User;

public interface UserService  {
    User findByUserName(String userName);
}
