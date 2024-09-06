package com.awsevents.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Address extends JpaRepository<Address, UUID> {

}
