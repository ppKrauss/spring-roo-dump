package com.springsource.petclinic;
import org.springframework.roo.addon.dbre.RooDbManaged;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooJpaActiveRecord(versionField = "", table = "t1", schema = "test")
@RooDbManaged(automaticallyDelete = true)
@RooToString(excludeFields = { "t2s" })
public class T1 {
}
