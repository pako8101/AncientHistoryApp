package AncientHistoryApp.model.service;

import AncientHistoryApp.model.entity.Function;
import AncientHistoryApp.model.entity.enums.PeriodEnum;

import java.util.Set;

public class UserServiceModel {
    private Long id;
    private String username;
    private String fullName;

    private String password;

    private String email;

    private Integer age;

    private Set<Function> functions;

    private PeriodEnum periods;
}
