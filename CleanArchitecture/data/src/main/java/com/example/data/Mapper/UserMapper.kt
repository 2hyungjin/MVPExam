package com.example.data.Mapper

import com.example.data.model.UserResponse
import com.example.domain.model.User

class UserMapper {
    fun toUser(userResponse: UserResponse): User {
        return User(
            url = userResponse.url,
            avatarUrl = userResponse.avatar,
            login = userResponse.login
        )
    }

    fun toUsers(userResponse: List<UserResponse>): List<User> {
        return userResponse.toList().map {
            User(
                url = it.url,
                avatarUrl = it.avatar,
                login = it.login
            )
        }
    }

    fun toUserResponse(user: User): UserResponse {
        return UserResponse(
            login = user.login,
            avatar = user.avatarUrl,
            url = user.url
        )
    }
}