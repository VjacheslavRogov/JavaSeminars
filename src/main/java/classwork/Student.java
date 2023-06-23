package classwork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String surName;
    private Integer group;
    private Integer salary;
    private List<Integer> marks;
}
