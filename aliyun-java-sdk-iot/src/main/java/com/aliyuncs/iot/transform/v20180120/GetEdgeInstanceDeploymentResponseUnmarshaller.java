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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.GetEdgeInstanceDeploymentResponse;
import com.aliyuncs.iot.model.v20180120.GetEdgeInstanceDeploymentResponse.Data;
import com.aliyuncs.iot.model.v20180120.GetEdgeInstanceDeploymentResponse.Data.Task;
import com.aliyuncs.iot.model.v20180120.GetEdgeInstanceDeploymentResponse.Data.Task.ResourceSnapshot;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEdgeInstanceDeploymentResponseUnmarshaller {

	public static GetEdgeInstanceDeploymentResponse unmarshall(GetEdgeInstanceDeploymentResponse getEdgeInstanceDeploymentResponse, UnmarshallerContext _ctx) {
		
		getEdgeInstanceDeploymentResponse.setRequestId(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.RequestId"));
		getEdgeInstanceDeploymentResponse.setSuccess(_ctx.booleanValue("GetEdgeInstanceDeploymentResponse.Success"));
		getEdgeInstanceDeploymentResponse.setCode(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Code"));
		getEdgeInstanceDeploymentResponse.setErrorMessage(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.ErrorMessage"));

		Data data = new Data();
		data.setGmtCreate(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.GmtModified"));
		data.setGmtCompleted(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.GmtCompleted"));
		data.setDeploymentId(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.DeploymentId"));
		data.setDescription(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.Description"));
		data.setStatus(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.Status"));
		data.setType(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.Type"));
		data.setGmtCreateTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.GmtCreateTimestamp"));
		data.setGmtModifiedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.GmtModifiedTimestamp"));
		data.setGmtCompletedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.GmtCompletedTimestamp"));

		List<Task> taskList = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("GetEdgeInstanceDeploymentResponse.Data.TaskList.Length"); i++) {
			Task task = new Task();
			task.setGmtCreate(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtCreate"));
			task.setGmtModified(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtModified"));
			task.setGmtCompleted(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtCompleted"));
			task.setGatewayId(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GatewayId"));
			task.setTaskId(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].TaskId"));
			task.setStage(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].Stage"));
			task.setStatus(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].Status"));
			task.setGmtCreateTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtCreateTimestamp"));
			task.setGmtModifiedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtModifiedTimestamp"));
			task.setGmtCompletedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtCompletedTimestamp"));

			List<ResourceSnapshot> resourceSnapshotList = new ArrayList<ResourceSnapshot>();
			for (int j = 0; j < _ctx.lengthValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList.Length"); j++) {
				ResourceSnapshot resourceSnapshot = new ResourceSnapshot();
				resourceSnapshot.setGmtCreate(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtCreate"));
				resourceSnapshot.setGmtModified(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtModified"));
				resourceSnapshot.setGmtCompleted(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtCompleted"));
				resourceSnapshot.setSnapshotId(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].SnapshotId"));
				resourceSnapshot.setResourceType(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].ResourceType"));
				resourceSnapshot.setResourceId(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].ResourceId"));
				resourceSnapshot.setResourceName(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].ResourceName"));
				resourceSnapshot.setOperateType(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].OperateType"));
				resourceSnapshot.setStage(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].Stage"));
				resourceSnapshot.setStatus(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].Status"));
				resourceSnapshot.setLog(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].Log"));
				resourceSnapshot.setGmtCreateTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtCreateTimestamp"));
				resourceSnapshot.setGmtModifiedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtModifiedTimestamp"));
				resourceSnapshot.setGmtCompletedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtCompletedTimestamp"));

				resourceSnapshotList.add(resourceSnapshot);
			}
			task.setResourceSnapshotList(resourceSnapshotList);

			taskList.add(task);
		}
		data.setTaskList(taskList);
		getEdgeInstanceDeploymentResponse.setData(data);
	 
	 	return getEdgeInstanceDeploymentResponse;
	}
}