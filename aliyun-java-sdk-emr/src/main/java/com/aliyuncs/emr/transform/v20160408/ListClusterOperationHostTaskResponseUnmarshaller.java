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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterOperationHostTaskResponseUnmarshaller {

	public static ListClusterOperationHostTaskResponse unmarshall(ListClusterOperationHostTaskResponse listClusterOperationHostTaskResponse, UnmarshallerContext _ctx) {
		
		listClusterOperationHostTaskResponse.setRequestId(_ctx.stringValue("ListClusterOperationHostTaskResponse.RequestId"));
		listClusterOperationHostTaskResponse.setTotalCount(_ctx.integerValue("ListClusterOperationHostTaskResponse.TotalCount"));
		listClusterOperationHostTaskResponse.setPageNumber(_ctx.integerValue("ListClusterOperationHostTaskResponse.PageNumber"));
		listClusterOperationHostTaskResponse.setPageSize(_ctx.integerValue("ListClusterOperationHostTaskResponse.PageSize"));

		List<ClusterOperationHostTask> clusterOperationHostTaskList = new ArrayList<ClusterOperationHostTask>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterOperationHostTaskResponse.ClusterOperationHostTaskList.Length"); i++) {
			ClusterOperationHostTask clusterOperationHostTask = new ClusterOperationHostTask();
			clusterOperationHostTask.setTaskId(_ctx.stringValue("ListClusterOperationHostTaskResponse.ClusterOperationHostTaskList["+ i +"].TaskId"));
			clusterOperationHostTask.setTaskName(_ctx.stringValue("ListClusterOperationHostTaskResponse.ClusterOperationHostTaskList["+ i +"].TaskName"));
			clusterOperationHostTask.setStatus(_ctx.stringValue("ListClusterOperationHostTaskResponse.ClusterOperationHostTaskList["+ i +"].Status"));
			clusterOperationHostTask.setPercentage(_ctx.stringValue("ListClusterOperationHostTaskResponse.ClusterOperationHostTaskList["+ i +"].Percentage"));

			clusterOperationHostTaskList.add(clusterOperationHostTask);
		}
		listClusterOperationHostTaskResponse.setClusterOperationHostTaskList(clusterOperationHostTaskList);
	 
	 	return listClusterOperationHostTaskResponse;
	}
}