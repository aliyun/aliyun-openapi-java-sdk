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

import com.aliyuncs.csas.model.v20230120.ListUserGroupsForPrivateAccessPolicyResponse;
import com.aliyuncs.csas.model.v20230120.ListUserGroupsForPrivateAccessPolicyResponse.Policy;
import com.aliyuncs.csas.model.v20230120.ListUserGroupsForPrivateAccessPolicyResponse.Policy.UserGroup;
import com.aliyuncs.csas.model.v20230120.ListUserGroupsForPrivateAccessPolicyResponse.Policy.UserGroup.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserGroupsForPrivateAccessPolicyResponseUnmarshaller {

	public static ListUserGroupsForPrivateAccessPolicyResponse unmarshall(ListUserGroupsForPrivateAccessPolicyResponse listUserGroupsForPrivateAccessPolicyResponse, UnmarshallerContext _ctx) {
		
		listUserGroupsForPrivateAccessPolicyResponse.setRequestId(_ctx.stringValue("ListUserGroupsForPrivateAccessPolicyResponse.RequestId"));

		List<Policy> polices = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices.Length"); i++) {
			Policy policy = new Policy();
			policy.setPolicyId(_ctx.stringValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices["+ i +"].PolicyId"));

			List<UserGroup> userGroups = new ArrayList<UserGroup>();
			for (int j = 0; j < _ctx.lengthValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices["+ i +"].UserGroups.Length"); j++) {
				UserGroup userGroup = new UserGroup();
				userGroup.setUserGroupId(_ctx.stringValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices["+ i +"].UserGroups["+ j +"].UserGroupId"));
				userGroup.setName(_ctx.stringValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices["+ i +"].UserGroups["+ j +"].Name"));
				userGroup.setDescription(_ctx.stringValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices["+ i +"].UserGroups["+ j +"].Description"));
				userGroup.setCreateTime(_ctx.stringValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices["+ i +"].UserGroups["+ j +"].CreateTime"));

				List<Attribute> attributes = new ArrayList<Attribute>();
				for (int k = 0; k < _ctx.lengthValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices["+ i +"].UserGroups["+ j +"].Attributes.Length"); k++) {
					Attribute attribute = new Attribute();
					attribute.setUserGroupType(_ctx.stringValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices["+ i +"].UserGroups["+ j +"].Attributes["+ k +"].UserGroupType"));
					attribute.setRelation(_ctx.stringValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices["+ i +"].UserGroups["+ j +"].Attributes["+ k +"].Relation"));
					attribute.setValue(_ctx.stringValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices["+ i +"].UserGroups["+ j +"].Attributes["+ k +"].Value"));
					attribute.setIdpId(_ctx.integerValue("ListUserGroupsForPrivateAccessPolicyResponse.Polices["+ i +"].UserGroups["+ j +"].Attributes["+ k +"].IdpId"));

					attributes.add(attribute);
				}
				userGroup.setAttributes(attributes);

				userGroups.add(userGroup);
			}
			policy.setUserGroups(userGroups);

			polices.add(policy);
		}
		listUserGroupsForPrivateAccessPolicyResponse.setPolices(polices);
	 
	 	return listUserGroupsForPrivateAccessPolicyResponse;
	}
}