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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListAlertUserGroupResponse;
import com.aliyuncs.emr.model.v20160408.ListAlertUserGroupResponse.Group;
import com.aliyuncs.emr.model.v20160408.ListAlertUserGroupResponse.Group.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlertUserGroupResponseUnmarshaller {

	public static ListAlertUserGroupResponse unmarshall(ListAlertUserGroupResponse listAlertUserGroupResponse, UnmarshallerContext context) {
		

		List<Group> alertUserGroupList = new ArrayList<Group>();
		for (int i = 0; i < context.lengthValue("ListAlertUserGroupResponse.AlertUserGroupList.Length"); i++) {
			Group group = new Group();
			group.setId(context.longValue("ListAlertUserGroupResponse.AlertUserGroupList["+ i +"].Id"));
			group.setGmtCreate(context.stringValue("ListAlertUserGroupResponse.AlertUserGroupList["+ i +"].GmtCreate"));
			group.setGmtModified(context.stringValue("ListAlertUserGroupResponse.AlertUserGroupList["+ i +"].GmtModified"));
			group.setBizId(context.stringValue("ListAlertUserGroupResponse.AlertUserGroupList["+ i +"].BizId"));
			group.setName(context.stringValue("ListAlertUserGroupResponse.AlertUserGroupList["+ i +"].Name"));
			group.setDescription(context.stringValue("ListAlertUserGroupResponse.AlertUserGroupList["+ i +"].Description"));

			List<UserInfo> userList = new ArrayList<UserInfo>();
			for (int j = 0; j < context.lengthValue("ListAlertUserGroupResponse.AlertUserGroupList["+ i +"].UserList.Length"); j++) {
				UserInfo userInfo = new UserInfo();
				userInfo.setUserId(context.stringValue("ListAlertUserGroupResponse.AlertUserGroupList["+ i +"].UserList["+ j +"].UserId"));
				userInfo.setUserName(context.stringValue("ListAlertUserGroupResponse.AlertUserGroupList["+ i +"].UserList["+ j +"].UserName"));
				userInfo.setEnableSMS(context.booleanValue("ListAlertUserGroupResponse.AlertUserGroupList["+ i +"].UserList["+ j +"].EnableSMS"));
				userInfo.setEnableEmail(context.booleanValue("ListAlertUserGroupResponse.AlertUserGroupList["+ i +"].UserList["+ j +"].EnableEmail"));

				userList.add(userInfo);
			}
			group.setUserList(userList);

			alertUserGroupList.add(group);
		}
		listAlertUserGroupResponse.setAlertUserGroupList(alertUserGroupList);
	 
	 	return listAlertUserGroupResponse;
	}
}