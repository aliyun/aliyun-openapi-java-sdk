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

import com.aliyuncs.emr.model.v20160408.DescribeFlowProjectClusterSettingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowProjectClusterSettingResponseUnmarshaller {

	public static DescribeFlowProjectClusterSettingResponse unmarshall(DescribeFlowProjectClusterSettingResponse describeFlowProjectClusterSettingResponse, UnmarshallerContext context) {
		
		describeFlowProjectClusterSettingResponse.setRequestId(context.stringValue("DescribeFlowProjectClusterSettingResponse.RequestId"));
		describeFlowProjectClusterSettingResponse.setGmtCreate(context.longValue("DescribeFlowProjectClusterSettingResponse.GmtCreate"));
		describeFlowProjectClusterSettingResponse.setGmtModified(context.longValue("DescribeFlowProjectClusterSettingResponse.GmtModified"));
		describeFlowProjectClusterSettingResponse.setProjectId(context.stringValue("DescribeFlowProjectClusterSettingResponse.ProjectId"));
		describeFlowProjectClusterSettingResponse.setClusterId(context.stringValue("DescribeFlowProjectClusterSettingResponse.ClusterId"));
		describeFlowProjectClusterSettingResponse.setDefaultUser(context.stringValue("DescribeFlowProjectClusterSettingResponse.DefaultUser"));
		describeFlowProjectClusterSettingResponse.setDefaultQueue(context.stringValue("DescribeFlowProjectClusterSettingResponse.DefaultQueue"));

		List<String> userList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeFlowProjectClusterSettingResponse.UserList.Length"); i++) {
			userList.add(context.stringValue("DescribeFlowProjectClusterSettingResponse.UserList["+ i +"]"));
		}
		describeFlowProjectClusterSettingResponse.setUserList(userList);

		List<String> queueList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeFlowProjectClusterSettingResponse.QueueList.Length"); i++) {
			queueList.add(context.stringValue("DescribeFlowProjectClusterSettingResponse.QueueList["+ i +"]"));
		}
		describeFlowProjectClusterSettingResponse.setQueueList(queueList);

		List<String> hostList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeFlowProjectClusterSettingResponse.HostList.Length"); i++) {
			hostList.add(context.stringValue("DescribeFlowProjectClusterSettingResponse.HostList["+ i +"]"));
		}
		describeFlowProjectClusterSettingResponse.setHostList(hostList);
	 
	 	return describeFlowProjectClusterSettingResponse;
	}
}