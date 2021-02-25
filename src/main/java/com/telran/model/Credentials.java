package com.telran.model;

import lombok.*;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Accessors(fluent = true)
@Builder
@ToString

public class Credentials {
    String username;
    String password;

}
