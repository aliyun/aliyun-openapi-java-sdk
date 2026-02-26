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

package com.aliyuncs.dfs.transform.v20180620;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dfs.model.v20180620.ListUserGroupsMappingsResponse;
import com.aliyuncs.dfs.model.v20180620.ListUserGroupsMappingsResponse.UserGroupsMappingPB;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserGroupsMappingsResponseUnmarshaller {

	public static ListUserGroupsMappingsResponse unmarshall(ListUserGroupsMappingsResponse listUserGroupsMappingsResponse, UnmarshallerContext _ctx) {
		
		listUserGroupsMappingsResponse.setRequestId(_ctx.stringValue("ListUserGroupsMappingsResponse.RequestId"));
		listUserGroupsMappingsResponse.setHasMore(_ctx.booleanValue("ListUserGroupsMappingsResponse.HasMore"));
		listUserGroupsMappingsResponse.setNextToken(_ctx.stringValue("ListUserGroupsMappingsResponse.NextToken"));

		List<UserGroupsMappingPB> userGroupsMappings = new ArrayList<UserGroupsMappingPB>();
		for (int i = 0; i < _ctx.lengthValue("ListUserGroupsMappingsResponse.UserGroupsMappings.Length"); i++) {
			UserGroupsMappingPB userGroupsMappingPB = new UserGroupsMappingPB();
			userGroupsMappingPB.setUserName(_ctx.stringValue("ListUserGroupsMappingsResponse.UserGroupsMappings["+ i +"].UserName"));

			List<String> groupNames = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListUserGroupsMappingsResponse.UserGroupsMappings["+ i +"].GroupNames.Length"); j++) {
				groupNames.add(_ctx.stringValue("ListUserGroupsMappingsResponse.UserGroupsMappings["+ i +"].GroupNames["+ j +"]"));
			}
			userGroupsMappingPB.setGroupNames(groupNames);

			userGroupsMappings.add(userGroupsMappingPB);
		}
		listUserGroupsMappingsResponse.setUserGroupsMappings(userGroupsMappings);
	 
	 	return listUserGroupsMappingsResponse;
	}
}