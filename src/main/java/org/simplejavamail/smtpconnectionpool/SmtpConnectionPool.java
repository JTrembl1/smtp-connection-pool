package org.simplejavamail.smtpconnectionpool;

import org.bbottema.clusteredobjectpool.core.ResourceClusters;

import javax.mail.Session;
import javax.mail.Transport;

public class SmtpConnectionPool extends ResourceClusters<Session, Session, Transport> {
    public SmtpConnectionPool(final SmtpClusterConfig smtpClusterConfig) {
        super(smtpClusterConfig.getConfigBuilder().build());
    }
}