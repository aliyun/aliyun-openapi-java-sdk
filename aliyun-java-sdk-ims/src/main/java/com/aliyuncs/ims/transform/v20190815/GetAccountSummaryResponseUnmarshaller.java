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

package com.aliyuncs.ims.transform.v20190815;

import com.aliyuncs.ims.model.v20190815.GetAccountSummaryResponse;
import com.aliyuncs.ims.model.v20190815.GetAccountSummaryResponse.SummaryMap;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountSummaryResponseUnmarshaller {

	public static GetAccountSummaryResponse unmarshall(GetAccountSummaryResponse getAccountSummaryResponse, UnmarshallerContext _ctx) {
		
		getAccountSummaryResponse.setRequestId(_ctx.stringValue("GetAccountSummaryResponse.RequestId"));

		SummaryMap summaryMap = new SummaryMap();
		summaryMap.setMFADevices(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.MFADevices"));
		summaryMap.setAccessKeysPerUserQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.AccessKeysPerUserQuota"));
		summaryMap.setAttachedPoliciesPerGroupQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.AttachedPoliciesPerGroupQuota"));
		summaryMap.setAttachedSystemPoliciesPerRoleQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.AttachedSystemPoliciesPerRoleQuota"));
		summaryMap.setAttachedPoliciesPerRoleQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.AttachedPoliciesPerRoleQuota"));
		summaryMap.setGroupsPerUserQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.GroupsPerUserQuota"));
		summaryMap.setRoles(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.Roles"));
		summaryMap.setPolicySizeQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.PolicySizeQuota"));
		summaryMap.setAttachedSystemPoliciesPerGroupQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.AttachedSystemPoliciesPerGroupQuota"));
		summaryMap.setAttachedSystemPoliciesPerUserQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.AttachedSystemPoliciesPerUserQuota"));
		summaryMap.setAttachedPoliciesPerUserQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.AttachedPoliciesPerUserQuota"));
		summaryMap.setGroupsQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.GroupsQuota"));
		summaryMap.setGroups(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.Groups"));
		summaryMap.setPoliciesQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.PoliciesQuota"));
		summaryMap.setVirtualMFADevicesQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.VirtualMFADevicesQuota"));
		summaryMap.setVersionsPerPolicyQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.VersionsPerPolicyQuota"));
		summaryMap.setRolesQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.RolesQuota"));
		summaryMap.setUsersQuota(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.UsersQuota"));
		summaryMap.setPolicies(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.Policies"));
		summaryMap.setUsers(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.Users"));
		summaryMap.setMFADevicesInUse(_ctx.integerValue("GetAccountSummaryResponse.SummaryMap.MFADevicesInUse"));
		getAccountSummaryResponse.setSummaryMap(summaryMap);
	 
	 	return getAccountSummaryResponse;
	}
}