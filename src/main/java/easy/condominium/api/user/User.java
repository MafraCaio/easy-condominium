package easy.condominium.api.user;

import easy.condominium.api.address.Address;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Table(name = "users")
@Entity(name = "User")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String email;

    private String phone;

    @Enumerated(EnumType.STRING)
    private DocumentType document_type;

    private String document;

    @Enumerated(EnumType.STRING)
    private UserType type;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> addresses =  new ArrayList<>();

    private String google_uid;

    public void addAddress(Address address) {
        addresses.add(address);
        address.setUser(this);
    }

    public User(UserRegistrationData data) {
        this.name = data.name();
        this.email = data.email();
        this.phone = data.phone();
        this.document_type = data.document_type();
        this.document = data.document();
        this.type = data.type();
        this.google_uid = data.google_uid();
    }
}