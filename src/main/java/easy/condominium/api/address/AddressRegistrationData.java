package easy.condominium.api.address;

public record AddressRegistrationData(
        String country,
        String state,
        String city,
        String zip_code,
        String neighborhood,
        String road,
        String house_number,
        String complement
) {
}
