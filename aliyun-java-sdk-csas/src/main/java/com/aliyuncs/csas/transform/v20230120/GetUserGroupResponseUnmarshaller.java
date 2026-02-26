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

import com.aliyuncs.csas.model.v20230120.GetUserGroupResponse;
import com.aliyuncs.csas.model.v20230120.GetUserGroupResponse.UserGroup;
import com.aliyuncs.csas.model.v20230120.GetUserGroupResponse.UserGroup.Attribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserGroupResponseUnmarshaller {

	public static GetUserGroupResponse unmarshall(GetUserGroupResponse getUserGroupResponse, UnmarshallerContext _ctx) {
		
		getUserGroupResponse.setRequestId(_ctx.stringValue("GetUserGroupResponse.RequestId"));

		UserGroup userGroup = new UserGroup();
		userGroup.setUserGroupId(_ctx.stringValue("GetUserGroupResponse.UserGroup.UserGroupId"));
		userGroup.setName(_ctx.stringValue("GetUserGroupResponse.UserGroup.Name"));
		userGroup.setDescription(_ctx.stringValue("GetUserGroupResponse.UserGroup.Description"));
		userGroup.setCreateTime(_ctx.stringValue("GetUserGroupResponse.UserGroup.CreateTime"));

		List<Attribute> attributes = new ArrayList<Attribute>();
		for (int i = 0; i < _ctx.lengthValue("GetUserGroupResponse.UserGroup.Attributes.Length"); i++) {
			Attribute attribute = new Attribute();
			attribute.setUserGroupType(_ctx.stringValue("GetUserGroupResponse.UserGroup.Attributes["+ i +"].UserGroupType"));
			attribute.setRelation(_ctx.stringValue("GetUserGroupResponse.UserGroup.Attributes["+ i +"].Relation"));
			attribute.setValue(_ctx.stringValue("GetUserGroupResponse.UserGroup.Attributes["+ i +"].Value"));
			attribute.setIdpId(_ctx.integerValue("GetUserGroupResponse.UserGroup.Attributes["+ i +"].IdpId"));

			attributes.add(attribute);
		}
		userGroup.setAttributes(attributes);
		getUserGroupResponse.setUserGroup(userGroup);
	 
	 	return getUserGroupResponse;
	}
}