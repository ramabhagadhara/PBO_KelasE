package uin.resetpass.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uin.resetpass.entity.PasswordResetToken;

import java.util.Optional;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    Optional<PasswordResetToken> findByToken(String token);
}
