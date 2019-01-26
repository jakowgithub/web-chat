package com.infopulse.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChatUserDto {

    @NotNull(message = "Name is required")
    private String name;

    @NotNull(message = "Login is required")
    private String login;

    @NotNull(message = "Password is required")
    private String password;

    private Boolean isBanned;
}
