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

import com.aliyuncs.emr.model.v20160408.ListClusterOperationHostTaskResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterOperationHostTaskResponse.ClusterOperationHostTask;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterOperationHostTaskResponseUnmarshaller {

	public static ListClusterOperationHostTaskResponse unmarshall(ListClusterOperationHostTaskResponse listClusterOperationHostTaskResponse, UnmarshallerContext context) {
		
		listClusterOperationHostTaskResponse.setRequestId(context.stringValue("ListClusterOperationHostTaskResponse.RequestId"));
		listClusterOperationHostTaskResponse.setTotalCount(context.integerValue("ListClusterOperationHostTaskResponse.TotalCount"));
		listClusterOperationHostTaskResponse.setPageNumber(context.integerValue("ListClusterOperationHostTaskResponse.PageNumber"));
		listClusterOperationHostTaskResponse.setPageSize(context.integerValue("ListClusterOperationHostTaskResponse.PageSize"));

		List<ClusterOperationHostTask> clusterOperationHostTaskList = new ArrayList<ClusterOperationHostTask>();
		for (int i = 0; i < context.lengthValue("ListClusterOperationHostTaskResponse.ClusterOperationHostTaskList.Length"); i++) {
			ClusterOperationHostTask clusterOperationHostTask = new ClusterOperationHostTask();
			clusterOperationHostTask.setTaskId(context.stringValue("ListClusterOperationHostTaskResponse.ClusterOperationHostTaskList["+ i +"].TaskId"));
			clusterOperationHostTask.setTaskName(context.stringValue("ListClusterOperationHostTaskResponse.ClusterOperationHostTaskList["+ i +"].TaskName"));
			clusterOperationHostTask.setStatus(context.stringValue("ListClusterOperationHostTaskResponse.ClusterOperationHostTaskList["+ i +"].Status"));
			clusterOperationHostTask.setPercentage(context.stringValue("ListClusterOperationHostTaskResponse.ClusterOperationHostTaskList["+ i +"].Percentage"));

			clusterOperationHostTaskList.add(clusterOperationHostTask);
		}
		listClusterOperationHostTaskResponse.setClusterOperationHostTaskList(clusterOperationHostTaskList);
	 
	 	return listClusterOperationHostTaskResponse;
	}
}