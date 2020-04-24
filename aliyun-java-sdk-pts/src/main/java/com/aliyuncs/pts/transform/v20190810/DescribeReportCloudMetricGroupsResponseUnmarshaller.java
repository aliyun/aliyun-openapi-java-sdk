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

package com.aliyuncs.pts.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pts.model.v20190810.DescribeReportCloudMetricGroupsResponse;
import com.aliyuncs.pts.model.v20190810.DescribeReportCloudMetricGroupsResponse.GroupInfo;
import com.aliyuncs.pts.model.v20190810.DescribeReportCloudMetricGroupsResponse.GroupInfo.InstanceAndPort;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReportCloudMetricGroupsResponseUnmarshaller {

	public static DescribeReportCloudMetricGroupsResponse unmarshall(DescribeReportCloudMetricGroupsResponse describeReportCloudMetricGroupsResponse, UnmarshallerContext _ctx) {
		
		describeReportCloudMetricGroupsResponse.setRequestId(_ctx.stringValue("DescribeReportCloudMetricGroupsResponse.RequestId"));
		describeReportCloudMetricGroupsResponse.setSceneId(_ctx.stringValue("DescribeReportCloudMetricGroupsResponse.SceneId"));
		describeReportCloudMetricGroupsResponse.setCode(_ctx.stringValue("DescribeReportCloudMetricGroupsResponse.Code"));
		describeReportCloudMetricGroupsResponse.setSuccess(_ctx.booleanValue("DescribeReportCloudMetricGroupsResponse.Success"));
		describeReportCloudMetricGroupsResponse.setMessage(_ctx.stringValue("DescribeReportCloudMetricGroupsResponse.Message"));
		describeReportCloudMetricGroupsResponse.setHttpStatusCode(_ctx.integerValue("DescribeReportCloudMetricGroupsResponse.HttpStatusCode"));

		List<GroupInfo> groupInfoList = new ArrayList<GroupInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReportCloudMetricGroupsResponse.GroupInfoList.Length"); i++) {
			GroupInfo groupInfo = new GroupInfo();
			groupInfo.setGroupName(_ctx.stringValue("DescribeReportCloudMetricGroupsResponse.GroupInfoList["+ i +"].GroupName"));
			groupInfo.setGroupId(_ctx.longValue("DescribeReportCloudMetricGroupsResponse.GroupInfoList["+ i +"].GroupId"));
			groupInfo.setType(_ctx.stringValue("DescribeReportCloudMetricGroupsResponse.GroupInfoList["+ i +"].Type"));

			List<InstanceAndPort> instanceAndPortList = new ArrayList<InstanceAndPort>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReportCloudMetricGroupsResponse.GroupInfoList["+ i +"].InstanceAndPortList.Length"); j++) {
				InstanceAndPort instanceAndPort = new InstanceAndPort();
				instanceAndPort.setInstanceId(_ctx.stringValue("DescribeReportCloudMetricGroupsResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceId"));
				instanceAndPort.setAddressPort(_ctx.stringValue("DescribeReportCloudMetricGroupsResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].AddressPort"));
				instanceAndPort.setAddress(_ctx.stringValue("DescribeReportCloudMetricGroupsResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].Address"));
				instanceAndPort.setInstanceName(_ctx.stringValue("DescribeReportCloudMetricGroupsResponse.GroupInfoList["+ i +"].InstanceAndPortList["+ j +"].InstanceName"));

				instanceAndPortList.add(instanceAndPort);
			}
			groupInfo.setInstanceAndPortList(instanceAndPortList);

			groupInfoList.add(groupInfo);
		}
		describeReportCloudMetricGroupsResponse.setGroupInfoList(groupInfoList);
	 
	 	return describeReportCloudMetricGroupsResponse;
	}
}