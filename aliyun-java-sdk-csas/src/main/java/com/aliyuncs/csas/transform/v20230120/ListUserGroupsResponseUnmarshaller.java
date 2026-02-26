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

import com.aliyuncs.csas.model.v20230120.ListUserGroupsResponse;
import com.aliyuncs.csas.model.v20230120.ListUserGroupsResponse.UserGroup;
import com.aliyuncs.csas.model.v20230120.ListUserGroupsResponse.UserGroup.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserGroupsResponseUnmarshaller {

	public static ListUserGroupsResponse unmarshall(ListUserGroupsResponse listUserGroupsResponse, UnmarshallerContext _ctx) {
		
		listUserGroupsResponse.setRequestId(_ctx.stringValue("ListUserGroupsResponse.RequestId"));
		listUserGroupsResponse.setTotalNum(_ctx.integerValue("ListUserGroupsResponse.TotalNum"));

		List<UserGroup> userGroups = new ArrayList<UserGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListUserGroupsResponse.UserGroups.Length"); i++) {
			UserGroup userGroup = new UserGroup();
			userGroup.setUserGroupId(_ctx.stringValue("ListUserGroupsResponse.UserGroups["+ i +"].UserGroupId"));
			userGroup.setName(_ctx.stringValue("ListUserGroupsResponse.UserGroups["+ i +"].Name"));
			userGroup.setDescription(_ctx.stringValue("ListUserGroupsResponse.UserGroups["+ i +"].Description"));
			userGroup.setCreateTime(_ctx.stringValue("ListUserGroupsResponse.UserGroups["+ i +"].CreateTime"));

			List<Attribute> attributes = new ArrayList<Attribute>();
			for (int j = 0; j < _ctx.lengthValue("ListUserGroupsResponse.UserGroups["+ i +"].Attributes.Length"); j++) {
				Attribute attribute = new Attribute();
				attribute.setUserGroupType(_ctx.stringValue("ListUserGroupsResponse.UserGroups["+ i +"].Attributes["+ j +"].UserGroupType"));
				attribute.setRelation(_ctx.stringValue("ListUserGroupsResponse.UserGroups["+ i +"].Attributes["+ j +"].Relation"));
				attribute.setValue(_ctx.stringValue("ListUserGroupsResponse.UserGroups["+ i +"].Attributes["+ j +"].Value"));
				attribute.setIdpId(_ctx.integerValue("ListUserGroupsResponse.UserGroups["+ i +"].Attributes["+ j +"].IdpId"));

				attributes.add(attribute);
			}
			userGroup.setAttributes(attributes);

			userGroups.add(userGroup);
		}
		listUserGroupsResponse.setUserGroups(userGroups);
	 
	 	return listUserGroupsResponse;
	}
}