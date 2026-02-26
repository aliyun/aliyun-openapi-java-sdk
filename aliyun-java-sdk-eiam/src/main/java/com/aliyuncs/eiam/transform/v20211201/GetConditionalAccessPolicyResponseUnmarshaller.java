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

import com.aliyuncs.eiam.model.v20211201.GetConditionalAccessPolicyResponse;
import com.aliyuncs.eiam.model.v20211201.GetConditionalAccessPolicyResponse.ConditionalAccessPolicy;
import com.aliyuncs.eiam.model.v20211201.GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig;
import com.aliyuncs.eiam.model.v20211201.GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Applications;
import com.aliyuncs.eiam.model.v20211201.GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.NetworkZones;
import com.aliyuncs.eiam.model.v20211201.GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users;
import com.aliyuncs.eiam.model.v20211201.GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.DecisionConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConditionalAccessPolicyResponseUnmarshaller {

	public static GetConditionalAccessPolicyResponse unmarshall(GetConditionalAccessPolicyResponse getConditionalAccessPolicyResponse, UnmarshallerContext _ctx) {
		
		getConditionalAccessPolicyResponse.setRequestId(_ctx.stringValue("GetConditionalAccessPolicyResponse.RequestId"));

		ConditionalAccessPolicy conditionalAccessPolicy = new ConditionalAccessPolicy();
		conditionalAccessPolicy.setInstanceId(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.InstanceId"));
		conditionalAccessPolicy.setConditionalAccessPolicyId(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionalAccessPolicyId"));
		conditionalAccessPolicy.setConditionalAccessPolicyName(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionalAccessPolicyName"));
		conditionalAccessPolicy.setDescription(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.Description"));
		conditionalAccessPolicy.setConditionalAccessPolicyType(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionalAccessPolicyType"));
		conditionalAccessPolicy.setStatus(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.Status"));
		conditionalAccessPolicy.setDecisionType(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.DecisionType"));
		conditionalAccessPolicy.setEvaluateAt(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.EvaluateAt"));
		conditionalAccessPolicy.setPriority(_ctx.integerValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.Priority"));
		conditionalAccessPolicy.setCreateTime(_ctx.longValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.CreateTime"));
		conditionalAccessPolicy.setLastUpdatedTime(_ctx.longValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.LastUpdatedTime"));

		DecisionConfig decisionConfig = new DecisionConfig();
		decisionConfig.setEffect(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.DecisionConfig.Effect"));
		decisionConfig.setMfaType(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.DecisionConfig.MfaType"));
		decisionConfig.setMfaAuthenticationIntervalSeconds(_ctx.longValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.DecisionConfig.MfaAuthenticationIntervalSeconds"));
		decisionConfig.setActiveSessionReuseStatus(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.DecisionConfig.ActiveSessionReuseStatus"));

		List<String> mfaAuthenticationMethods = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.DecisionConfig.MfaAuthenticationMethods.Length"); i++) {
			mfaAuthenticationMethods.add(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.DecisionConfig.MfaAuthenticationMethods["+ i +"]"));
		}
		decisionConfig.setMfaAuthenticationMethods(mfaAuthenticationMethods);
		conditionalAccessPolicy.setDecisionConfig(decisionConfig);

		ConditionsConfig conditionsConfig = new ConditionsConfig();

		Applications applications = new Applications();

		List<String> includeApplications = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Applications.IncludeApplications.Length"); i++) {
			includeApplications.add(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Applications.IncludeApplications["+ i +"]"));
		}
		applications.setIncludeApplications(includeApplications);

		List<String> excludeApplications = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Applications.ExcludeApplications.Length"); i++) {
			excludeApplications.add(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Applications.ExcludeApplications["+ i +"]"));
		}
		applications.setExcludeApplications(excludeApplications);
		conditionsConfig.setApplications(applications);

		Users users = new Users();

		List<String> includeUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.IncludeUsers.Length"); i++) {
			includeUsers.add(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.IncludeUsers["+ i +"]"));
		}
		users.setIncludeUsers(includeUsers);

		List<String> excludeUsers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.ExcludeUsers.Length"); i++) {
			excludeUsers.add(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.ExcludeUsers["+ i +"]"));
		}
		users.setExcludeUsers(excludeUsers);

		List<String> includeGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.IncludeGroups.Length"); i++) {
			includeGroups.add(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.IncludeGroups["+ i +"]"));
		}
		users.setIncludeGroups(includeGroups);

		List<String> excludeGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.ExcludeGroups.Length"); i++) {
			excludeGroups.add(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.ExcludeGroups["+ i +"]"));
		}
		users.setExcludeGroups(excludeGroups);

		List<String> includeOrganizationalUnits = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.IncludeOrganizationalUnits.Length"); i++) {
			includeOrganizationalUnits.add(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.IncludeOrganizationalUnits["+ i +"]"));
		}
		users.setIncludeOrganizationalUnits(includeOrganizationalUnits);

		List<String> excludeOrganizationalUnits = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.ExcludeOrganizationalUnits.Length"); i++) {
			excludeOrganizationalUnits.add(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.Users.ExcludeOrganizationalUnits["+ i +"]"));
		}
		users.setExcludeOrganizationalUnits(excludeOrganizationalUnits);
		conditionsConfig.setUsers(users);

		NetworkZones networkZones = new NetworkZones();

		List<String> includeNetworkZones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.NetworkZones.IncludeNetworkZones.Length"); i++) {
			includeNetworkZones.add(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.NetworkZones.IncludeNetworkZones["+ i +"]"));
		}
		networkZones.setIncludeNetworkZones(includeNetworkZones);

		List<String> excludeNetworkZones = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.NetworkZones.ExcludeNetworkZones.Length"); i++) {
			excludeNetworkZones.add(_ctx.stringValue("GetConditionalAccessPolicyResponse.ConditionalAccessPolicy.ConditionsConfig.NetworkZones.ExcludeNetworkZones["+ i +"]"));
		}
		networkZones.setExcludeNetworkZones(excludeNetworkZones);
		conditionsConfig.setNetworkZones(networkZones);
		conditionalAccessPolicy.setConditionsConfig(conditionsConfig);
		getConditionalAccessPolicyResponse.setConditionalAccessPolicy(conditionalAccessPolicy);
	 
	 	return getConditionalAccessPolicyResponse;
	}
}