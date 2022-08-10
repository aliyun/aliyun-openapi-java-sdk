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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeUsersPasswordResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeUsersPasswordResponse.DesktopUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUsersPasswordResponseUnmarshaller {

	public static DescribeUsersPasswordResponse unmarshall(DescribeUsersPasswordResponse describeUsersPasswordResponse, UnmarshallerContext _ctx) {
		
		describeUsersPasswordResponse.setRequestId(_ctx.stringValue("DescribeUsersPasswordResponse.RequestId"));

		List<DesktopUser> desktopUsers = new ArrayList<DesktopUser>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUsersPasswordResponse.DesktopUsers.Length"); i++) {
			DesktopUser desktopUser = new DesktopUser();
			desktopUser.setDisplayName(_ctx.stringValue("DescribeUsersPasswordResponse.DesktopUsers["+ i +"].DisplayName"));
			desktopUser.setPassword(_ctx.stringValue("DescribeUsersPasswordResponse.DesktopUsers["+ i +"].Password"));
			desktopUser.setEndUserId(_ctx.stringValue("DescribeUsersPasswordResponse.DesktopUsers["+ i +"].EndUserId"));

			desktopUsers.add(desktopUser);
		}
		describeUsersPasswordResponse.setDesktopUsers(desktopUsers);
	 
	 	return describeUsersPasswordResponse;
	}
}