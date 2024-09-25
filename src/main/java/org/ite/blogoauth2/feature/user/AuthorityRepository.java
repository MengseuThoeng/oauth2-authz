package org.ite.blogoauth2.feature.user;

import org.ite.blogoauth2.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
