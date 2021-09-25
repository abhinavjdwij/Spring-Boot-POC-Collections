package io.github.abhinavjdwij.poc.springbootmongo.documents;

import com.mongodb.lang.NonNull;
import io.github.abhinavjdwij.poc.springbootmongo.documents.embedded.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Person")
public class Person {
    @Id
    @NonNull
    private String id;

    @Field("name")
    @NonNull
    @Indexed(unique = true) // indexed on name
    private String name;

    @Field("age")
    private Integer age;

    @Field("dob")
    private LocalDate dob;

    @Field("address")
    private Address address;
}
