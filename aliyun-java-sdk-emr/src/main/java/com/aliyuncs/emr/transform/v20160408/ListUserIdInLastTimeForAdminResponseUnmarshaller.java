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

import com.aliyuncs.emr.model.v20160408.ListUserIdInLastTimeForAdminResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserIdInLastTimeForAdminResponseUnmarshaller {

	public static ListUserIdInLastTimeForAdminResponse unmarshall(ListUserIdInLastTimeForAdminResponse listUserIdInLastTimeForAdminResponse, UnmarshallerContext context) {
		
		listUserIdInLastTimeForAdminResponse.setRequestId(context.stringValue("ListUserIdInLastTimeForAdminResponse.RequestId"));
		listUserIdInLastTimeForAdminResponse.setPageNumber(context.integerValue("ListUserIdInLastTimeForAdminResponse.PageNumber"));
		listUserIdInLastTimeForAdminResponse.setPageSize(context.integerValue("ListUserIdInLastTimeForAdminResponse.PageSize"));
		listUserIdInLastTimeForAdminResponse.setTotalCount(context.integerValue("ListUserIdInLastTimeForAdminResponse.TotalCount"));

		List<String> userIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListUserIdInLastTimeForAdminResponse.UserIds.Length"); i++) {
			userIds.add(context.stringValue("ListUserIdInLastTimeForAdminResponse.UserIds["+ i +"]"));
		}
		listUserIdInLastTimeForAdminResponse.setUserIds(userIds);
	 
	 	return listUserIdInLastTimeForAdminResponse;
	}
}