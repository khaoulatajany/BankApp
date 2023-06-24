package org.sid.ebankingbackendkt.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.ebankingbackendkt.entities.BankAccount;

import javax.persistence.*;
import java.util.List;


@Data

public class CustomerDTO {
    private long id;
    private String  name;
    private String email;

}
