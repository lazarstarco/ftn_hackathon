package rs.ftn.edu.hackatonbackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {

    private Timestamp timestamp;

    @JsonProperty("status_code")
    private int statusCode;

    private String message;

    private String path;
}
