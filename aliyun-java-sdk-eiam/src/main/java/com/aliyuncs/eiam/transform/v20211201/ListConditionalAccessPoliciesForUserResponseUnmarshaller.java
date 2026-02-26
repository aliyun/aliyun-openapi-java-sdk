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

import com.aliyuncs.eiam.model.v20211201.ListConditionalAccessPoliciesForUserResponse;
import com.aliyuncs.eiam.model.v20211201.ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicy;
import com.aliyuncs.eiam.model.v20211201.ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicy.ConditionsConfig;
import com.aliyuncs.eiam.model.v20211201.ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicy.ConditionsConfig.Applications;
import com.aliyuncs.eiam.model.v20211201.ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicy.ConditionsConfig.NetworkZones;
import com.aliyuncs.eiam.model.v20211201.ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicy.ConditionsConfig.Users;
import com.aliyuncs.eiam.model.v20211201.ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicy.DecisionConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConditionalAccessPoliciesForUserResponseUnmarshaller {

	public static ListConditionalAccessPoliciesForUserResponse unmarshall(ListConditionalAccessPoliciesForUserResponse listConditionalAccessPoliciesForUserResponse, UnmarshallerContext _ctx) {
		
		listConditionalAccessPoliciesForUserResponse.setRequestId(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.RequestId"));

		List<ConditionalAccessPolicy> conditionalAccessPolicies = new ArrayList<ConditionalAccessPolicy>();
		for (int i = 0; i < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies.Length"); i++) {
			ConditionalAccessPolicy conditionalAccessPolicy = new ConditionalAccessPolicy();
			conditionalAccessPolicy.setInstanceId(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].InstanceId"));
			conditionalAccessPolicy.setConditionalAccessPolicyId(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionalAccessPolicyId"));
			conditionalAccessPolicy.setConditionalAccessPolicyName(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionalAccessPolicyName"));
			conditionalAccessPolicy.setDescription(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].Description"));
			conditionalAccessPolicy.setConditionalAccessPolicyType(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionalAccessPolicyType"));
			conditionalAccessPolicy.setStatus(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].Status"));
			conditionalAccessPolicy.setDecisionType(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].DecisionType"));
			conditionalAccessPolicy.setEvaluateAt(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].EvaluateAt"));
			conditionalAccessPolicy.setPriority(_ctx.integerValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].Priority"));
			conditionalAccessPolicy.setCreateTime(_ctx.longValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].CreateTime"));
			conditionalAccessPolicy.setLastUpdatedTime(_ctx.longValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].LastUpdatedTime"));

			DecisionConfig decisionConfig = new DecisionConfig();
			decisionConfig.setEffect(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].DecisionConfig.Effect"));
			decisionConfig.setMfaType(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].DecisionConfig.MfaType"));
			decisionConfig.setMfaAuthenticationIntervalSeconds(_ctx.longValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].DecisionConfig.MfaAuthenticationIntervalSeconds"));
			decisionConfig.setActiveSessionReuseStatus(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].DecisionConfig.ActiveSessionReuseStatus"));

			List<String> mfaAuthenticationMethods = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].DecisionConfig.MfaAuthenticationMethods.Length"); j++) {
				mfaAuthenticationMethods.add(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].DecisionConfig.MfaAuthenticationMethods["+ j +"]"));
			}
			decisionConfig.setMfaAuthenticationMethods(mfaAuthenticationMethods);
			conditionalAccessPolicy.setDecisionConfig(decisionConfig);

			ConditionsConfig conditionsConfig = new ConditionsConfig();

			Applications applications = new Applications();

			List<String> includeApplications = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Applications.IncludeApplications.Length"); j++) {
				includeApplications.add(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Applications.IncludeApplications["+ j +"]"));
			}
			applications.setIncludeApplications(includeApplications);

			List<String> excludeApplications = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Applications.ExcludeApplications.Length"); j++) {
				excludeApplications.add(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Applications.ExcludeApplications["+ j +"]"));
			}
			applications.setExcludeApplications(excludeApplications);
			conditionsConfig.setApplications(applications);

			Users users = new Users();

			List<String> includeUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.IncludeUsers.Length"); j++) {
				includeUsers.add(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.IncludeUsers["+ j +"]"));
			}
			users.setIncludeUsers(includeUsers);

			List<String> excludeUsers = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.ExcludeUsers.Length"); j++) {
				excludeUsers.add(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.ExcludeUsers["+ j +"]"));
			}
			users.setExcludeUsers(excludeUsers);

			List<String> includeGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.IncludeGroups.Length"); j++) {
				includeGroups.add(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.IncludeGroups["+ j +"]"));
			}
			users.setIncludeGroups(includeGroups);

			List<String> excludeGroups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.ExcludeGroups.Length"); j++) {
				excludeGroups.add(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.ExcludeGroups["+ j +"]"));
			}
			users.setExcludeGroups(excludeGroups);

			List<String> includeOrganizationalUnits = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.IncludeOrganizationalUnits.Length"); j++) {
				includeOrganizationalUnits.add(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.IncludeOrganizationalUnits["+ j +"]"));
			}
			users.setIncludeOrganizationalUnits(includeOrganizationalUnits);

			List<String> excludeOrganizationalUnits = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.ExcludeOrganizationalUnits.Length"); j++) {
				excludeOrganizationalUnits.add(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.Users.ExcludeOrganizationalUnits["+ j +"]"));
			}
			users.setExcludeOrganizationalUnits(excludeOrganizationalUnits);
			conditionsConfig.setUsers(users);

			NetworkZones networkZones = new NetworkZones();

			List<String> includeNetworkZones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.NetworkZones.IncludeNetworkZones.Length"); j++) {
				includeNetworkZones.add(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.NetworkZones.IncludeNetworkZones["+ j +"]"));
			}
			networkZones.setIncludeNetworkZones(includeNetworkZones);

			List<String> excludeNetworkZones = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.NetworkZones.ExcludeNetworkZones.Length"); j++) {
				excludeNetworkZones.add(_ctx.stringValue("ListConditionalAccessPoliciesForUserResponse.ConditionalAccessPolicies["+ i +"].ConditionsConfig.NetworkZones.ExcludeNetworkZones["+ j +"]"));
			}
			networkZones.setExcludeNetworkZones(excludeNetworkZones);
			conditionsConfig.setNetworkZones(networkZones);
			conditionalAccessPolicy.setConditionsConfig(conditionsConfig);

			conditionalAccessPolicies.add(conditionalAccessPolicy);
		}
		listConditionalAccessPoliciesForUserResponse.setConditionalAccessPolicies(conditionalAccessPolicies);
	 
	 	return listConditionalAccessPoliciesForUserResponse;
	}
}