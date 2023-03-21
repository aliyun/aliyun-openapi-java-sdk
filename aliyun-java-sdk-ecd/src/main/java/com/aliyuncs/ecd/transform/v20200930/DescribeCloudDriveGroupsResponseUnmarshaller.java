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

import com.aliyuncs.ecd.model.v20200930.DescribeCloudDriveGroupsResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeCloudDriveGroupsResponse.CloudDriveGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudDriveGroupsResponseUnmarshaller {

	public static DescribeCloudDriveGroupsResponse unmarshall(DescribeCloudDriveGroupsResponse describeCloudDriveGroupsResponse, UnmarshallerContext _ctx) {
		
		describeCloudDriveGroupsResponse.setRequestId(_ctx.stringValue("DescribeCloudDriveGroupsResponse.RequestId"));
		describeCloudDriveGroupsResponse.setNextToken(_ctx.stringValue("DescribeCloudDriveGroupsResponse.NextToken"));
		describeCloudDriveGroupsResponse.setCount(_ctx.longValue("DescribeCloudDriveGroupsResponse.Count"));
		describeCloudDriveGroupsResponse.setSuccess(_ctx.booleanValue("DescribeCloudDriveGroupsResponse.Success"));

		List<CloudDriveGroup> cloudDriveGroups = new ArrayList<CloudDriveGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudDriveGroupsResponse.CloudDriveGroups.Length"); i++) {
			CloudDriveGroup cloudDriveGroup = new CloudDriveGroup();
			cloudDriveGroup.setStatus(_ctx.stringValue("DescribeCloudDriveGroupsResponse.CloudDriveGroups["+ i +"].Status"));
			cloudDriveGroup.setGroupId(_ctx.stringValue("DescribeCloudDriveGroupsResponse.CloudDriveGroups["+ i +"].GroupId"));
			cloudDriveGroup.setGroupName(_ctx.stringValue("DescribeCloudDriveGroupsResponse.CloudDriveGroups["+ i +"].GroupName"));
			cloudDriveGroup.setDirectoryId(_ctx.stringValue("DescribeCloudDriveGroupsResponse.CloudDriveGroups["+ i +"].DirectoryId"));
			cloudDriveGroup.setDriveId(_ctx.stringValue("DescribeCloudDriveGroupsResponse.CloudDriveGroups["+ i +"].DriveId"));
			cloudDriveGroup.setCreateTime(_ctx.stringValue("DescribeCloudDriveGroupsResponse.CloudDriveGroups["+ i +"].CreateTime"));
			cloudDriveGroup.setTotalSize(_ctx.longValue("DescribeCloudDriveGroupsResponse.CloudDriveGroups["+ i +"].TotalSize"));
			cloudDriveGroup.setUsedSize(_ctx.stringValue("DescribeCloudDriveGroupsResponse.CloudDriveGroups["+ i +"].UsedSize"));

			cloudDriveGroups.add(cloudDriveGroup);
		}
		describeCloudDriveGroupsResponse.setCloudDriveGroups(cloudDriveGroups);
	 
	 	return describeCloudDriveGroupsResponse;
	}
}