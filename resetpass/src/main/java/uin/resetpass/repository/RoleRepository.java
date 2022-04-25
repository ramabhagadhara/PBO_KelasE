package uin.resetpass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uin.resetpass.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
