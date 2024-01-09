package easy.condominium.api.user;

import easy.condominium.api.address.AddressRegistrationData;

public record UserRegistrationData(
        String name,
        String email,
        String phone,
        DocumentType document_type,
        String document,
        UserType type,
        AddressRegistrationData address,
        String google_uid
) {}
