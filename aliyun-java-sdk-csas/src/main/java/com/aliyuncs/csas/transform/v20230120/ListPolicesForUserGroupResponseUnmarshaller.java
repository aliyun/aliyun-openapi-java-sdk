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

import com.aliyuncs.csas.model.v20230120.ListPolicesForUserGroupResponse;
import com.aliyuncs.csas.model.v20230120.ListPolicesForUserGroupResponse.UserGroup;
import com.aliyuncs.csas.model.v20230120.ListPolicesForUserGroupResponse.UserGroup.Policy;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPolicesForUserGroupResponseUnmarshaller {

	public static ListPolicesForUserGroupResponse unmarshall(ListPolicesForUserGroupResponse listPolicesForUserGroupResponse, UnmarshallerContext _ctx) {
		
		listPolicesForUserGroupResponse.setRequestId(_ctx.stringValue("ListPolicesForUserGroupResponse.RequestId"));

		List<UserGroup> userGroups = new ArrayList<UserGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListPolicesForUserGroupResponse.UserGroups.Length"); i++) {
			UserGroup userGroup = new UserGroup();
			userGroup.setUserGroupId(_ctx.stringValue("ListPolicesForUserGroupResponse.UserGroups["+ i +"].UserGroupId"));

			List<Policy> polices = new ArrayList<Policy>();
			for (int j = 0; j < _ctx.lengthValue("ListPolicesForUserGroupResponse.UserGroups["+ i +"].Polices.Length"); j++) {
				Policy policy = new Policy();
				policy.setPolicyId(_ctx.stringValue("ListPolicesForUserGroupResponse.UserGroups["+ i +"].Polices["+ j +"].PolicyId"));
				policy.setPolicyType(_ctx.stringValue("ListPolicesForUserGroupResponse.UserGroups["+ i +"].Polices["+ j +"].PolicyType"));
				policy.setName(_ctx.stringValue("ListPolicesForUserGroupResponse.UserGroups["+ i +"].Polices["+ j +"].Name"));

				polices.add(policy);
			}
			userGroup.setPolices(polices);

			userGroups.add(userGroup);
		}
		listPolicesForUserGroupResponse.setUserGroups(userGroups);
	 
	 	return listPolicesForUserGroupResponse;
	}
}