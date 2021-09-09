package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;
// Pet
public class Pet {
    private Pettype pettype;
    private Owner owner;
    private LocalDate birthDate;

    public Pettype getPettype() {
        return this.pettype;
    }

    public void setPettype(Pettype pettype) {
        this.pettype = pettype;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    
    
}