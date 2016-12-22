package org.springframework.roo.petclinic.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.ws.annotations.jaxb.RooJaxbEntity;

/**
 * = AbstractPerson
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJavaBean
@RooToString
@RooJpaEntity
@RooJaxbEntity
public abstract class AbstractPerson {

    /**
     * TODO Auto-generated field documentation
     *
     */
    @Size(min = 3, max = 30)
    private String firstName;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Size(min = 3, max = 30)
    private String lastName;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Size(min = 1, max = 50)
    private String address;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Size(max = 30)
    private String city;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    private String telephone;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @Size(max = 30)
    private String homePage;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @Size(min = 6, max = 30)
    private String email;

    /**
     * TODO Auto-generated field documentation
     *
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date birthDay;
}
