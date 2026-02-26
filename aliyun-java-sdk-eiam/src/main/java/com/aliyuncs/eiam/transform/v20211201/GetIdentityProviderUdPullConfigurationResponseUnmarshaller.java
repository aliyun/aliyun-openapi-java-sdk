/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderUdPullConfigurationResponse;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.LdapUdPullConfig;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.PeriodicSyncConfig;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.PullProtectedRule;
import com.aliyuncs.eiam.model.v20211201.GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.UdSyncScopeConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIdentityProviderUdPullConfigurationResponseUnmarshaller {

	public static GetIdentityProviderUdPullConfigurationResponse unmarshall(GetIdentityProviderUdPullConfigurationResponse getIdentityProviderUdPullConfigurationResponse, UnmarshallerContext _ctx) {
		
		getIdentityProviderUdPullConfigurationResponse.setRequestId(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.RequestId"));

		UdPullConfiguration udPullConfiguration = new UdPullConfiguration();
		udPullConfiguration.setInstanceId(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.InstanceId"));
		udPullConfiguration.setIdentityProviderId(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.IdentityProviderId"));
		udPullConfiguration.setIncrementalCallbackStatus(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.IncrementalCallbackStatus"));
		udPullConfiguration.setPeriodicSyncStatus(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.PeriodicSyncStatus"));
		udPullConfiguration.setGroupSyncStatus(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.GroupSyncStatus"));

		UdSyncScopeConfig udSyncScopeConfig = new UdSyncScopeConfig();
		udSyncScopeConfig.setTargetScope(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.UdSyncScopeConfig.TargetScope"));

		List<String> sourceScopes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.UdSyncScopeConfig.SourceScopes.Length"); i++) {
			sourceScopes.add(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.UdSyncScopeConfig.SourceScopes["+ i +"]"));
		}
		udSyncScopeConfig.setSourceScopes(sourceScopes);
		udPullConfiguration.setUdSyncScopeConfig(udSyncScopeConfig);

		PullProtectedRule pullProtectedRule = new PullProtectedRule();
		pullProtectedRule.setUserDeletedThreshold(_ctx.integerValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.PullProtectedRule.UserDeletedThreshold"));
		pullProtectedRule.setOrganizationalUnitDeletedThreshold(_ctx.integerValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.PullProtectedRule.OrganizationalUnitDeletedThreshold"));
		pullProtectedRule.setGroupDeletedThreshold(_ctx.integerValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.PullProtectedRule.GroupDeletedThreshold"));
		udPullConfiguration.setPullProtectedRule(pullProtectedRule);

		LdapUdPullConfig ldapUdPullConfig = new LdapUdPullConfig();
		ldapUdPullConfig.setUserObjectClass(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.LdapUdPullConfig.UserObjectClass"));
		ldapUdPullConfig.setOrganizationUnitObjectClass(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.LdapUdPullConfig.OrganizationUnitObjectClass"));
		ldapUdPullConfig.setUserObjectClassCustomFilter(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.LdapUdPullConfig.UserObjectClassCustomFilter"));
		ldapUdPullConfig.setGroupObjectClass(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.LdapUdPullConfig.GroupObjectClass"));
		ldapUdPullConfig.setGroupMemberAttributeName(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.LdapUdPullConfig.GroupMemberAttributeName"));
		ldapUdPullConfig.setGroupObjectClassCustomFilter(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.LdapUdPullConfig.GroupObjectClassCustomFilter"));
		udPullConfiguration.setLdapUdPullConfig(ldapUdPullConfig);

		PeriodicSyncConfig periodicSyncConfig = new PeriodicSyncConfig();
		periodicSyncConfig.setPeriodicSyncType(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.PeriodicSyncConfig.PeriodicSyncType"));
		periodicSyncConfig.setPeriodicSyncCron(_ctx.stringValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.PeriodicSyncConfig.PeriodicSyncCron"));
		periodicSyncConfig.setPeriodicSyncTimes(_ctx.integerValue("GetIdentityProviderUdPullConfigurationResponse.UdPullConfiguration.PeriodicSyncConfig.PeriodicSyncTimes"));
		udPullConfiguration.setPeriodicSyncConfig(periodicSyncConfig);
		getIdentityProviderUdPullConfigurationResponse.setUdPullConfiguration(udPullConfiguration);
	 
	 	return getIdentityProviderUdPullConfigurationResponse;
	}
}