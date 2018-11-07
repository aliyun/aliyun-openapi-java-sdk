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

import com.aliyuncs.emr.model.v20160408.ListFlowProjectUserResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowProjectUserResponse.User;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowProjectUserResponseUnmarshaller {

	public static ListFlowProjectUserResponse unmarshall(ListFlowProjectUserResponse listFlowProjectUserResponse, UnmarshallerContext context) {
		
		listFlowProjectUserResponse.setRequestId(context.stringValue("ListFlowProjectUserResponse.RequestId"));
		listFlowProjectUserResponse.setPageNumber(context.integerValue("ListFlowProjectUserResponse.PageNumber"));
		listFlowProjectUserResponse.setPageSize(context.integerValue("ListFlowProjectUserResponse.PageSize"));
		listFlowProjectUserResponse.setTotal(context.integerValue("ListFlowProjectUserResponse.Total"));

		List<User> users = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("ListFlowProjectUserResponse.Users.Length"); i++) {
			User user = new User();
			user.setGmtCreate(context.longValue("ListFlowProjectUserResponse.Users["+ i +"].GmtCreate"));
			user.setGmtModified(context.longValue("ListFlowProjectUserResponse.Users["+ i +"].GmtModified"));
			user.setProjectId(context.stringValue("ListFlowProjectUserResponse.Users["+ i +"].ProjectId"));
			user.setOwnerId(context.stringValue("ListFlowProjectUserResponse.Users["+ i +"].OwnerId"));
			user.setUserName(context.stringValue("ListFlowProjectUserResponse.Users["+ i +"].UserName"));

			users.add(user);
		}
		listFlowProjectUserResponse.setUsers(users);
	 
	 	return listFlowProjectUserResponse;
	}
}