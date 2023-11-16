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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListRegistrationPoliciesForUserGroupResponse;
import com.aliyuncs.csas.model.v20230120.ListRegistrationPoliciesForUserGroupResponse.Data;
import com.aliyuncs.csas.model.v20230120.ListRegistrationPoliciesForUserGroupResponse.Data.PoliciesItem;
import com.aliyuncs.csas.model.v20230120.ListRegistrationPoliciesForUserGroupResponse.Data.PoliciesItem.LimitDetailItem;
import com.aliyuncs.csas.model.v20230120.ListRegistrationPoliciesForUserGroupResponse.Data.PoliciesItem.LimitDetailItem.LimitCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRegistrationPoliciesForUserGroupResponseUnmarshaller {

	public static ListRegistrationPoliciesForUserGroupResponse unmarshall(ListRegistrationPoliciesForUserGroupResponse listRegistrationPoliciesForUserGroupResponse, UnmarshallerContext _ctx) {
		
		listRegistrationPoliciesForUserGroupResponse.setRequestId(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.RequestId"));

		List<Data> userGroups = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups.Length"); i++) {
			Data data = new Data();
			data.setUserGroupId(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].UserGroupId"));

			List<PoliciesItem> policies = new ArrayList<PoliciesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies.Length"); j++) {
				PoliciesItem policiesItem = new PoliciesItem();
				policiesItem.setName(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].Name"));
				policiesItem.setPolicyId(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].PolicyId"));
				policiesItem.setDescription(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].Description"));
				policiesItem.setPriority(_ctx.longValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].Priority"));
				policiesItem.setStatus(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].Status"));
				policiesItem.setMatchMode(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].MatchMode"));
				policiesItem.setCreateTime(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].CreateTime"));

				List<String> whitelist = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].Whitelist.Length"); k++) {
					whitelist.add(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].Whitelist["+ k +"]"));
				}
				policiesItem.setWhitelist(whitelist);

				List<LimitDetailItem> limitDetail = new ArrayList<LimitDetailItem>();
				for (int k = 0; k < _ctx.lengthValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].LimitDetail.Length"); k++) {
					LimitDetailItem limitDetailItem = new LimitDetailItem();
					limitDetailItem.setDeviceBelong(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].LimitDetail["+ k +"].DeviceBelong"));
					limitDetailItem.setLimitType(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].LimitDetail["+ k +"].LimitType"));

					LimitCount limitCount = new LimitCount();
					limitCount.setAll(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].LimitDetail["+ k +"].LimitCount.All"));
					limitCount.setPC(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].LimitDetail["+ k +"].LimitCount.PC"));
					limitCount.setMobile(_ctx.stringValue("ListRegistrationPoliciesForUserGroupResponse.UserGroups["+ i +"].Policies["+ j +"].LimitDetail["+ k +"].LimitCount.Mobile"));
					limitDetailItem.setLimitCount(limitCount);

					limitDetail.add(limitDetailItem);
				}
				policiesItem.setLimitDetail(limitDetail);

				policies.add(policiesItem);
			}
			data.setPolicies(policies);

			userGroups.add(data);
		}
		listRegistrationPoliciesForUserGroupResponse.setUserGroups(userGroups);
	 
	 	return listRegistrationPoliciesForUserGroupResponse;
	}
}