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

	public static DescribeFlowProjectClusterSettingResponse unmarshall(DescribeFlowProjectClusterSettingResponse describeFlowProjectClusterSettingResponse, UnmarshallerContext _ctx) {
		
		describeFlowProjectClusterSettingResponse.setRequestId(_ctx.stringValue("DescribeFlowProjectClusterSettingResponse.RequestId"));
		describeFlowProjectClusterSettingResponse.setGmtCreate(_ctx.longValue("DescribeFlowProjectClusterSettingResponse.GmtCreate"));
		describeFlowProjectClusterSettingResponse.setGmtModified(_ctx.longValue("DescribeFlowProjectClusterSettingResponse.GmtModified"));
		describeFlowProjectClusterSettingResponse.setProjectId(_ctx.stringValue("DescribeFlowProjectClusterSettingResponse.ProjectId"));
		describeFlowProjectClusterSettingResponse.setClusterId(_ctx.stringValue("DescribeFlowProjectClusterSettingResponse.ClusterId"));
		describeFlowProjectClusterSettingResponse.setK8sClusterId(_ctx.stringValue("DescribeFlowProjectClusterSettingResponse.K8sClusterId"));
		describeFlowProjectClusterSettingResponse.setDefaultUser(_ctx.stringValue("DescribeFlowProjectClusterSettingResponse.DefaultUser"));
		describeFlowProjectClusterSettingResponse.setDefaultQueue(_ctx.stringValue("DescribeFlowProjectClusterSettingResponse.DefaultQueue"));

		List<String> userList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowProjectClusterSettingResponse.UserList.Length"); i++) {
			userList.add(_ctx.stringValue("DescribeFlowProjectClusterSettingResponse.UserList["+ i +"]"));
		}
		describeFlowProjectClusterSettingResponse.setUserList(userList);

		List<String> queueList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowProjectClusterSettingResponse.QueueList.Length"); i++) {
			queueList.add(_ctx.stringValue("DescribeFlowProjectClusterSettingResponse.QueueList["+ i +"]"));
		}
		describeFlowProjectClusterSettingResponse.setQueueList(queueList);

		List<String> hostList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowProjectClusterSettingResponse.HostList.Length"); i++) {
			hostList.add(_ctx.stringValue("DescribeFlowProjectClusterSettingResponse.HostList["+ i +"]"));
		}
		describeFlowProjectClusterSettingResponse.setHostList(hostList);
	 
	 	return describeFlowProjectClusterSettingResponse;
	}
}