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

import com.aliyuncs.emr.model.v20160408.ListFlowProjectClusterSettingResponse;
import com.aliyuncs.emr.model.v20160408.ListFlowProjectClusterSettingResponse.ClusterSetting;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowProjectClusterSettingResponseUnmarshaller {

	public static ListFlowProjectClusterSettingResponse unmarshall(ListFlowProjectClusterSettingResponse listFlowProjectClusterSettingResponse, UnmarshallerContext context) {
		
		listFlowProjectClusterSettingResponse.setRequestId(context.stringValue("ListFlowProjectClusterSettingResponse.RequestId"));
		listFlowProjectClusterSettingResponse.setPageNumber(context.integerValue("ListFlowProjectClusterSettingResponse.PageNumber"));
		listFlowProjectClusterSettingResponse.setPageSize(context.integerValue("ListFlowProjectClusterSettingResponse.PageSize"));
		listFlowProjectClusterSettingResponse.setTotal(context.integerValue("ListFlowProjectClusterSettingResponse.Total"));

		List<ClusterSetting> clusterSettings = new ArrayList<ClusterSetting>();
		for (int i = 0; i < context.lengthValue("ListFlowProjectClusterSettingResponse.ClusterSettings.Length"); i++) {
			ClusterSetting clusterSetting = new ClusterSetting();
			clusterSetting.setGmtCreate(context.longValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].GmtCreate"));
			clusterSetting.setGmtModified(context.longValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].GmtModified"));
			clusterSetting.setProjectId(context.stringValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].ProjectId"));
			clusterSetting.setClusterId(context.stringValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].ClusterId"));
			clusterSetting.setClusterName(context.stringValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].ClusterName"));
			clusterSetting.setDefaultUser(context.stringValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].DefaultUser"));
			clusterSetting.setDefaultQueue(context.stringValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].DefaultQueue"));

			List<String> userList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].UserList.Length"); j++) {
				userList.add(context.stringValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].UserList["+ j +"]"));
			}
			clusterSetting.setUserList(userList);

			List<String> queueList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].QueueList.Length"); j++) {
				queueList.add(context.stringValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].QueueList["+ j +"]"));
			}
			clusterSetting.setQueueList(queueList);

			List<String> hostList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].HostList.Length"); j++) {
				hostList.add(context.stringValue("ListFlowProjectClusterSettingResponse.ClusterSettings["+ i +"].HostList["+ j +"]"));
			}
			clusterSetting.setHostList(hostList);

			clusterSettings.add(clusterSetting);
		}
		listFlowProjectClusterSettingResponse.setClusterSettings(clusterSettings);
	 
	 	return listFlowProjectClusterSettingResponse;
	}
}