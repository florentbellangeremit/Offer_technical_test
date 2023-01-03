package com.bellanger.technical_test.mapper;

import com.bellanger.technical_test.dao.entity.User;
import com.bellanger.technical_test.dto.request.UserRequest;
import com.bellanger.technical_test.dto.response.UserResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-01-03T10:34:49+0100",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 19.0.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse userToUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        return userResponse;
    }

    @Override
    public User userRequestToUser(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        User user = new User();

        return user;
    }
}
