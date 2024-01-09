package com.pblgllgs.loans.audit;
/*
 *
 * @author pblgl
 * Created on 08-01-2024
 *
 */

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("LOANS_MS");
    }
}
