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

import com.aliyuncs.ecd.model.v20200930.DescribeCloudDriveUsersResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeCloudDriveUsersResponse.CloudDriveUser;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudDriveUsersResponseUnmarshaller {

	public static DescribeCloudDriveUsersResponse unmarshall(DescribeCloudDriveUsersResponse describeCloudDriveUsersResponse, UnmarshallerContext _ctx) {
		
		describeCloudDriveUsersResponse.setRequestId(_ctx.stringValue("DescribeCloudDriveUsersResponse.RequestId"));
		describeCloudDriveUsersResponse.setNextToken(_ctx.stringValue("DescribeCloudDriveUsersResponse.NextToken"));

		List<CloudDriveUser> cloudDriveUsers = new ArrayList<CloudDriveUser>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudDriveUsersResponse.CloudDriveUsers.Length"); i++) {
			CloudDriveUser cloudDriveUser = new CloudDriveUser();
			cloudDriveUser.setUsedSize(_ctx.longValue("DescribeCloudDriveUsersResponse.CloudDriveUsers["+ i +"].UsedSize"));
			cloudDriveUser.setStatus(_ctx.stringValue("DescribeCloudDriveUsersResponse.CloudDriveUsers["+ i +"].Status"));
			cloudDriveUser.setDriveId(_ctx.stringValue("DescribeCloudDriveUsersResponse.CloudDriveUsers["+ i +"].DriveId"));
			cloudDriveUser.setTotalSize(_ctx.longValue("DescribeCloudDriveUsersResponse.CloudDriveUsers["+ i +"].TotalSize"));
			cloudDriveUser.setUserId(_ctx.stringValue("DescribeCloudDriveUsersResponse.CloudDriveUsers["+ i +"].UserId"));
			cloudDriveUser.setUserName(_ctx.stringValue("DescribeCloudDriveUsersResponse.CloudDriveUsers["+ i +"].UserName"));
			cloudDriveUser.setEndUserId(_ctx.stringValue("DescribeCloudDriveUsersResponse.CloudDriveUsers["+ i +"].EndUserId"));

			cloudDriveUsers.add(cloudDriveUser);
		}
		describeCloudDriveUsersResponse.setCloudDriveUsers(cloudDriveUsers);
	 
	 	return describeCloudDriveUsersResponse;
	}
}