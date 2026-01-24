package org.example;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "MEMBER_ID"))
public class Seller extends BaseEntity {
    //ID 상속
    // NAME 상속
    private String email;
}


//@Entity
//public class Seller extends BaseEntity{
//    //ID 상속
//    //NAME 상속
//    private String email;
//}
