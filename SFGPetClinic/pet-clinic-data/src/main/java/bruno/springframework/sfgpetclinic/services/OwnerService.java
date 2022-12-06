package bruno.springframework.sfgpetclinic.services;

import bruno.springframework.sfgpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
