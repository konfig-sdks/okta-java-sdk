package com.konfigthis.client;

import com.konfigthis.client.api.ApplicationApi;
import com.konfigthis.client.api.AuthenticatorApi;
import com.konfigthis.client.api.AuthorizationServerApi;
import com.konfigthis.client.api.BrandApi;
import com.konfigthis.client.api.DomainApi;
import com.konfigthis.client.api.EventHookApi;
import com.konfigthis.client.api.FeatureApi;
import com.konfigthis.client.api.GroupApi;
import com.konfigthis.client.api.GroupSchemaApi;
import com.konfigthis.client.api.IdentityProviderApi;
import com.konfigthis.client.api.InlineHookApi;
import com.konfigthis.client.api.LinkedObjectApi;
import com.konfigthis.client.api.LogApi;
import com.konfigthis.client.api.NetworkZoneApi;
import com.konfigthis.client.api.OrgApi;
import com.konfigthis.client.api.PolicyApi;
import com.konfigthis.client.api.ProfileMappingApi;
import com.konfigthis.client.api.SessionApi;
import com.konfigthis.client.api.SubscriptionApi;
import com.konfigthis.client.api.TemplateApi;
import com.konfigthis.client.api.ThreatInsightApi;
import com.konfigthis.client.api.TrustedOriginApi;
import com.konfigthis.client.api.UserApi;
import com.konfigthis.client.api.UserFactorApi;
import com.konfigthis.client.api.UserSchemaApi;
import com.konfigthis.client.api.UserTypeApi;

public class Okta {
    private ApiClient apiClient;
    public final ApplicationApi application;
    public final AuthenticatorApi authenticator;
    public final AuthorizationServerApi authorizationServer;
    public final BrandApi brand;
    public final DomainApi domain;
    public final EventHookApi eventHook;
    public final FeatureApi feature;
    public final GroupApi group;
    public final GroupSchemaApi groupSchema;
    public final IdentityProviderApi identityProvider;
    public final InlineHookApi inlineHook;
    public final LinkedObjectApi linkedObject;
    public final LogApi log;
    public final NetworkZoneApi networkZone;
    public final OrgApi org;
    public final PolicyApi policy;
    public final ProfileMappingApi profileMapping;
    public final SessionApi session;
    public final SubscriptionApi subscription;
    public final TemplateApi template;
    public final ThreatInsightApi threatInsight;
    public final TrustedOriginApi trustedOrigin;
    public final UserApi user;
    public final UserFactorApi userFactor;
    public final UserSchemaApi userSchema;
    public final UserTypeApi userType;

    public Okta() {
        this(null);
    }

    public Okta(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.application = new ApplicationApi(this.apiClient);
        this.authenticator = new AuthenticatorApi(this.apiClient);
        this.authorizationServer = new AuthorizationServerApi(this.apiClient);
        this.brand = new BrandApi(this.apiClient);
        this.domain = new DomainApi(this.apiClient);
        this.eventHook = new EventHookApi(this.apiClient);
        this.feature = new FeatureApi(this.apiClient);
        this.group = new GroupApi(this.apiClient);
        this.groupSchema = new GroupSchemaApi(this.apiClient);
        this.identityProvider = new IdentityProviderApi(this.apiClient);
        this.inlineHook = new InlineHookApi(this.apiClient);
        this.linkedObject = new LinkedObjectApi(this.apiClient);
        this.log = new LogApi(this.apiClient);
        this.networkZone = new NetworkZoneApi(this.apiClient);
        this.org = new OrgApi(this.apiClient);
        this.policy = new PolicyApi(this.apiClient);
        this.profileMapping = new ProfileMappingApi(this.apiClient);
        this.session = new SessionApi(this.apiClient);
        this.subscription = new SubscriptionApi(this.apiClient);
        this.template = new TemplateApi(this.apiClient);
        this.threatInsight = new ThreatInsightApi(this.apiClient);
        this.trustedOrigin = new TrustedOriginApi(this.apiClient);
        this.user = new UserApi(this.apiClient);
        this.userFactor = new UserFactorApi(this.apiClient);
        this.userSchema = new UserSchemaApi(this.apiClient);
        this.userType = new UserTypeApi(this.apiClient);
    }

}
