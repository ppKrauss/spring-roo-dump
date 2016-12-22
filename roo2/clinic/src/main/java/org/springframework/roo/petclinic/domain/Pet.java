package org.springframework.roo.petclinic.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;
import javax.persistence.Enumerated;
import org.springframework.roo.petclinic.reference.PetType;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import org.springframework.roo.addon.jpa.annotations.entity.JpaRelationType;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaRelation;
import javax.persistence.ManyToOne;
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = Pet
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity(sequenceName = "PET_SEQ")
@RooJaxbEntity
public class Pet {

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    private boolean sendReminders;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Size(min = 1)
    private String name;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Min(0L)
    private Float weight;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Enumerated
    private PetType type;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @OneToMany(cascade = { javax.persistence.CascadeType.MERGE, javax.persistence.CascadeType.PERSIST }, fetch = FetchType.LAZY, mappedBy = "pet")
    @RooJpaRelation(type = JpaRelationType.AGGREGATION)
    private Set<Visit> visits = new HashSet<Visit>();

    /**
     * TODO Auto-generated field documentation
     *
     */
    @ManyToOne(fetch = FetchType.LAZY)
    private Owner owner;
}
