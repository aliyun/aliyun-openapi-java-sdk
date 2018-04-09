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

import com.aliyuncs.emr.model.v20160408.ListClusterOperationHostTaskForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterOperationHostTaskForAdminResponse.ClusterOperationHostTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterOperationHostTaskForAdminResponseUnmarshaller {

	public static ListClusterOperationHostTaskForAdminResponse unmarshall(ListClusterOperationHostTaskForAdminResponse listClusterOperationHostTaskForAdminResponse, UnmarshallerContext context) {
		
		listClusterOperationHostTaskForAdminResponse.setRequestId(context.stringValue("ListClusterOperationHostTaskForAdminResponse.RequestId"));
		listClusterOperationHostTaskForAdminResponse.setTotalCount(context.integerValue("ListClusterOperationHostTaskForAdminResponse.TotalCount"));
		listClusterOperationHostTaskForAdminResponse.setPageNumber(context.integerValue("ListClusterOperationHostTaskForAdminResponse.PageNumber"));
		listClusterOperationHostTaskForAdminResponse.setPageSize(context.integerValue("ListClusterOperationHostTaskForAdminResponse.PageSize"));

		List<ClusterOperationHostTask> clusterOperationHostTaskList = new ArrayList<ClusterOperationHostTask>();
		for (int i = 0; i < context.lengthValue("ListClusterOperationHostTaskForAdminResponse.ClusterOperationHostTaskList.Length"); i++) {
			ClusterOperationHostTask clusterOperationHostTask = new ClusterOperationHostTask();
			clusterOperationHostTask.setTaskId(context.stringValue("ListClusterOperationHostTaskForAdminResponse.ClusterOperationHostTaskList["+ i +"].TaskId"));
			clusterOperationHostTask.setTaskName(context.stringValue("ListClusterOperationHostTaskForAdminResponse.ClusterOperationHostTaskList["+ i +"].TaskName"));
			clusterOperationHostTask.setStatus(context.stringValue("ListClusterOperationHostTaskForAdminResponse.ClusterOperationHostTaskList["+ i +"].Status"));
			clusterOperationHostTask.setPercentage(context.stringValue("ListClusterOperationHostTaskForAdminResponse.ClusterOperationHostTaskList["+ i +"].Percentage"));

			clusterOperationHostTaskList.add(clusterOperationHostTask);
		}
		listClusterOperationHostTaskForAdminResponse.setClusterOperationHostTaskList(clusterOperationHostTaskList);
	 
	 	return listClusterOperationHostTaskForAdminResponse;
	}
}