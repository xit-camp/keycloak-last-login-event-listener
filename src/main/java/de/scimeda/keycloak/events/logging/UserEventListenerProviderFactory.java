package de.scimeda.keycloak.events.logging;

import org.keycloak.Config;
import org.keycloak.events.EventListenerProviderFactory;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;


public class UserEventListenerProviderFactory implements EventListenerProviderFactory {

    @Override
    public UserEventListenerProvider create(KeycloakSession keycloakSession) {
        return new UserEventListenerProvider(keycloakSession);
    }

    @Override
    public void init(Config.Scope scope) {
        //
    }

    @Override
    public void postInit(KeycloakSessionFactory keycloakSessionFactory) {
        //
    }

    @Override
    public void close() {
        //
    }

    @Override
    public String getId() {
        return "user_events";
    }

}
