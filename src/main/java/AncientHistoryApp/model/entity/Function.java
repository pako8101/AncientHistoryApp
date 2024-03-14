package AncientHistoryApp.model.entity;

import AncientHistoryApp.model.entity.enums.FunctionNameEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "functions")
public class Function extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private FunctionNameEnum function;

    public Function() {
    }

    public FunctionNameEnum getFunction() {
        return function;
    }

    public void setFunction(FunctionNameEnum function) {
        this.function = function;
    }
}
