package AncientHistoryApp.model.entity;

import AncientHistoryApp.model.entity.enums.FunctionEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "functions")
public class Function extends BaseEntity{

    @Enumerated(EnumType.STRING)
    private FunctionEnum function;

    public Function() {
    }

    public FunctionEnum getFunction() {
        return function;
    }

    public void setFunction(FunctionEnum function) {
        this.function = function;
    }
}
