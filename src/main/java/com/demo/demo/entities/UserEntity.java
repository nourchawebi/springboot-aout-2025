package com.demo.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="users")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="firstname", length = 10,nullable=true)
    @Size(max=10, message=" le nom ne doit pas depasser 10 caracteres")
    private  String firstname;
    private String lastname;
    @Column(unique = true, nullable = false,length = 100)
    private String email;
    private String password ;
    private String address;
    private String username;
    private String confirmPassword;
@ManyToMany
@JoinTable(name="userrole",joinColumns = @JoinColumn(name="id"),inverseJoinColumns = @JoinColumn(name = "idrole"))
    private Set<Role> role = new HashSet<>();
@OneToMany
    private List<Post> posts;
@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Comment> comments;
@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="likeId", referencedColumnName = "idlikes")
    private Likes likes;
}
