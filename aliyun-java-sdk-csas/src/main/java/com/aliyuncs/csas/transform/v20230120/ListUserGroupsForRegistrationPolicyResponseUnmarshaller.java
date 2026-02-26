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

import com.aliyuncs.csas.model.v20230120.ListUserGroupsForRegistrationPolicyResponse;
import com.aliyuncs.csas.model.v20230120.ListUserGroupsForRegistrationPolicyResponse.Data;
import com.aliyuncs.csas.model.v20230120.ListUserGroupsForRegistrationPolicyResponse.Data.UserGroupsItem;
import com.aliyuncs.csas.model.v20230120.ListUserGroupsForRegistrationPolicyResponse.Data.UserGroupsItem.AttributesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserGroupsForRegistrationPolicyResponseUnmarshaller {

	public static ListUserGroupsForRegistrationPolicyResponse unmarshall(ListUserGroupsForRegistrationPolicyResponse listUserGroupsForRegistrationPolicyResponse, UnmarshallerContext _ctx) {
		
		listUserGroupsForRegistrationPolicyResponse.setRequestId(_ctx.stringValue("ListUserGroupsForRegistrationPolicyResponse.RequestId"));

		List<Data> policies = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListUserGroupsForRegistrationPolicyResponse.Policies.Length"); i++) {
			Data data = new Data();
			data.setPolicyId(_ctx.stringValue("ListUserGroupsForRegistrationPolicyResponse.Policies["+ i +"].PolicyId"));

			List<UserGroupsItem> userGroups = new ArrayList<UserGroupsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListUserGroupsForRegistrationPolicyResponse.Policies["+ i +"].UserGroups.Length"); j++) {
				UserGroupsItem userGroupsItem = new UserGroupsItem();
				userGroupsItem.setUserGroupId(_ctx.stringValue("ListUserGroupsForRegistrationPolicyResponse.Policies["+ i +"].UserGroups["+ j +"].UserGroupId"));
				userGroupsItem.setName(_ctx.stringValue("ListUserGroupsForRegistrationPolicyResponse.Policies["+ i +"].UserGroups["+ j +"].Name"));
				userGroupsItem.setDescription(_ctx.stringValue("ListUserGroupsForRegistrationPolicyResponse.Policies["+ i +"].UserGroups["+ j +"].Description"));
				userGroupsItem.setCreateTime(_ctx.stringValue("ListUserGroupsForRegistrationPolicyResponse.Policies["+ i +"].UserGroups["+ j +"].CreateTime"));

				List<AttributesItem> attributes = new ArrayList<AttributesItem>();
				for (int k = 0; k < _ctx.lengthValue("ListUserGroupsForRegistrationPolicyResponse.Policies["+ i +"].UserGroups["+ j +"].Attributes.Length"); k++) {
					AttributesItem attributesItem = new AttributesItem();
					attributesItem.setUserGroupType(_ctx.stringValue("ListUserGroupsForRegistrationPolicyResponse.Policies["+ i +"].UserGroups["+ j +"].Attributes["+ k +"].UserGroupType"));
					attributesItem.setRelation(_ctx.stringValue("ListUserGroupsForRegistrationPolicyResponse.Policies["+ i +"].UserGroups["+ j +"].Attributes["+ k +"].Relation"));
					attributesItem.setValue(_ctx.stringValue("ListUserGroupsForRegistrationPolicyResponse.Policies["+ i +"].UserGroups["+ j +"].Attributes["+ k +"].Value"));
					attributesItem.setIdpId(_ctx.integerValue("ListUserGroupsForRegistrationPolicyResponse.Policies["+ i +"].UserGroups["+ j +"].Attributes["+ k +"].IdpId"));

					attributes.add(attributesItem);
				}
				userGroupsItem.setAttributes(attributes);

				userGroups.add(userGroupsItem);
			}
			data.setUserGroups(userGroups);

			policies.add(data);
		}
		listUserGroupsForRegistrationPolicyResponse.setPolicies(policies);
	 
	 	return listUserGroupsForRegistrationPolicyResponse;
	}
}