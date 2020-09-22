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

import com.aliyuncs.emr.model.v20160408.ListClusterOperationTaskResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterOperationTaskResponse.ClusterOperationTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterOperationTaskResponseUnmarshaller {

	public static ListClusterOperationTaskResponse unmarshall(ListClusterOperationTaskResponse listClusterOperationTaskResponse, UnmarshallerContext _ctx) {
		
		listClusterOperationTaskResponse.setRequestId(_ctx.stringValue("ListClusterOperationTaskResponse.RequestId"));
		listClusterOperationTaskResponse.setTotalCount(_ctx.integerValue("ListClusterOperationTaskResponse.TotalCount"));
		listClusterOperationTaskResponse.setPageNumber(_ctx.integerValue("ListClusterOperationTaskResponse.PageNumber"));
		listClusterOperationTaskResponse.setPageSize(_ctx.integerValue("ListClusterOperationTaskResponse.PageSize"));

		List<ClusterOperationTask> clusterOperationTaskList = new ArrayList<ClusterOperationTask>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterOperationTaskResponse.ClusterOperationTaskList.Length"); i++) {
			ClusterOperationTask clusterOperationTask = new ClusterOperationTask();
			clusterOperationTask.setTaskId(_ctx.stringValue("ListClusterOperationTaskResponse.ClusterOperationTaskList["+ i +"].TaskId"));
			clusterOperationTask.setTaskName(_ctx.stringValue("ListClusterOperationTaskResponse.ClusterOperationTaskList["+ i +"].TaskName"));
			clusterOperationTask.setStatus(_ctx.stringValue("ListClusterOperationTaskResponse.ClusterOperationTaskList["+ i +"].Status"));
			clusterOperationTask.setPercentage(_ctx.stringValue("ListClusterOperationTaskResponse.ClusterOperationTaskList["+ i +"].Percentage"));

			clusterOperationTaskList.add(clusterOperationTask);
		}
		listClusterOperationTaskResponse.setClusterOperationTaskList(clusterOperationTaskList);
	 
	 	return listClusterOperationTaskResponse;
	}
}