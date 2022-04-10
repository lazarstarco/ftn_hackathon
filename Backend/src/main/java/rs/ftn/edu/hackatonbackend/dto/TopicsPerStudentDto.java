package rs.ftn.edu.hackatonbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopicsPerStudentDto {

    private int studentId;

    private List<Integer> topicIds;
}
