package easy.condominium.api.address;

import easy.condominium.api.user.User;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "addresses")
@Entity(name = "Address")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Address {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String country;
    private String state;
    private String city;
    private String zip_code;
    private String neighborhood;
    private String road;
    private String house_number;
    private String complement;

    public Address(AddressRegistrationData address) {
        this.country = address.country();
        this.state = address.state();
        this.city = address.city();
        this.zip_code = address.zip_code();
        this.neighborhood = address.neighborhood();
        this.road = address.road();
        this.house_number = address.house_number();
        this.complement = address.complement();
    }
}
