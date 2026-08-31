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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetComputeClusterResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetComputeClusterResponse.ClusterConfig;
import com.aliyuncs.dataphin_public.model.v20230630.GetComputeClusterResponse.ClusterConfig.ClusterSafetyControl;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetComputeClusterResponseUnmarshaller {

	public static GetComputeClusterResponse unmarshall(GetComputeClusterResponse getComputeClusterResponse, UnmarshallerContext _ctx) {
		
		getComputeClusterResponse.setRequestId(_ctx.stringValue("GetComputeClusterResponse.RequestId"));
		getComputeClusterResponse.setMessage(_ctx.stringValue("GetComputeClusterResponse.Message"));
		getComputeClusterResponse.setHttpStatusCode(_ctx.integerValue("GetComputeClusterResponse.HttpStatusCode"));
		getComputeClusterResponse.setCode(_ctx.stringValue("GetComputeClusterResponse.Code"));
		getComputeClusterResponse.setSuccess(_ctx.booleanValue("GetComputeClusterResponse.Success"));

		ClusterConfig clusterConfig = new ClusterConfig();
		clusterConfig.setOwner(_ctx.stringValue("GetComputeClusterResponse.ClusterConfig.Owner"));
		clusterConfig.setGmtCreate(_ctx.stringValue("GetComputeClusterResponse.ClusterConfig.GmtCreate"));
		clusterConfig.setDes(_ctx.stringValue("GetComputeClusterResponse.ClusterConfig.Des"));
		clusterConfig.setTypeVersion(_ctx.stringValue("GetComputeClusterResponse.ClusterConfig.TypeVersion"));
		clusterConfig.setGmtModified(_ctx.stringValue("GetComputeClusterResponse.ClusterConfig.GmtModified"));
		clusterConfig.setId(_ctx.longValue("GetComputeClusterResponse.ClusterConfig.Id"));
		clusterConfig.setName(_ctx.stringValue("GetComputeClusterResponse.ClusterConfig.Name"));

		ClusterSafetyControl clusterSafetyControl = new ClusterSafetyControl();
		clusterSafetyControl.setClusterSafetyAuthType(_ctx.stringValue("GetComputeClusterResponse.ClusterConfig.ClusterSafetyControl.ClusterSafetyAuthType"));

		List<String> userGroupIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetComputeClusterResponse.ClusterConfig.ClusterSafetyControl.UserGroupIds.Length"); i++) {
			userGroupIds.add(_ctx.stringValue("GetComputeClusterResponse.ClusterConfig.ClusterSafetyControl.UserGroupIds["+ i +"]"));
		}
		clusterSafetyControl.setUserGroupIds(userGroupIds);

		List<String> userNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetComputeClusterResponse.ClusterConfig.ClusterSafetyControl.UserNames.Length"); i++) {
			userNames.add(_ctx.stringValue("GetComputeClusterResponse.ClusterConfig.ClusterSafetyControl.UserNames["+ i +"]"));
		}
		clusterSafetyControl.setUserNames(userNames);

		List<String> userGroupNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetComputeClusterResponse.ClusterConfig.ClusterSafetyControl.UserGroupNames.Length"); i++) {
			userGroupNames.add(_ctx.stringValue("GetComputeClusterResponse.ClusterConfig.ClusterSafetyControl.UserGroupNames["+ i +"]"));
		}
		clusterSafetyControl.setUserGroupNames(userGroupNames);

		List<String> userIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetComputeClusterResponse.ClusterConfig.ClusterSafetyControl.UserIds.Length"); i++) {
			userIds.add(_ctx.stringValue("GetComputeClusterResponse.ClusterConfig.ClusterSafetyControl.UserIds["+ i +"]"));
		}
		clusterSafetyControl.setUserIds(userIds);
		clusterConfig.setClusterSafetyControl(clusterSafetyControl);
		getComputeClusterResponse.setClusterConfig(clusterConfig);
	 
	 	return getComputeClusterResponse;
	}
}