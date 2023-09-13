package com.application.cvirms.dto.member;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Tenancy extends Member {


    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<TenantEntry> entries;
}
