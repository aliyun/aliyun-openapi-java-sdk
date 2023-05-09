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
		getEdgeInstanceDeploymentResponse.setCode(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Code"));
		getEdgeInstanceDeploymentResponse.setErrorMessage(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.ErrorMessage"));
		getEdgeInstanceDeploymentResponse.setSuccess(_ctx.booleanValue("GetEdgeInstanceDeploymentResponse.Success"));

		Data data = new Data();
		data.setGmtCreateTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.GmtCreateTimestamp"));
		data.setType(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.Type"));
		data.setStatus(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.Status"));
		data.setDeploymentId(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.DeploymentId"));
		data.setDescription(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.Description"));
		data.setGmtModifiedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.GmtModifiedTimestamp"));
		data.setGmtCompleted(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.GmtCompleted"));
		data.setGmtCreate(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.GmtCreate"));
		data.setGmtCompletedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.GmtCompletedTimestamp"));
		data.setGmtModified(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.GmtModified"));

		List<Task> taskList = new ArrayList<Task>();
		for (int i = 0; i < _ctx.lengthValue("GetEdgeInstanceDeploymentResponse.Data.TaskList.Length"); i++) {
			Task task = new Task();
			task.setGmtCreateTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtCreateTimestamp"));
			task.setStatus(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].Status"));
			task.setStage(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].Stage"));
			task.setGatewayId(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GatewayId"));
			task.setGmtModifiedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtModifiedTimestamp"));
			task.setGmtCompleted(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtCompleted"));
			task.setGmtCreate(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtCreate"));
			task.setGmtCompletedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtCompletedTimestamp"));
			task.setGmtModified(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].GmtModified"));
			task.setTaskId(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].TaskId"));

			List<ResourceSnapshot> resourceSnapshotList = new ArrayList<ResourceSnapshot>();
			for (int j = 0; j < _ctx.lengthValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList.Length"); j++) {
				ResourceSnapshot resourceSnapshot = new ResourceSnapshot();
				resourceSnapshot.setStatus(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].Status"));
				resourceSnapshot.setGmtCreateTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtCreateTimestamp"));
				resourceSnapshot.setStage(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].Stage"));
				resourceSnapshot.setGmtModifiedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtModifiedTimestamp"));
				resourceSnapshot.setGmtModified(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtModified"));
				resourceSnapshot.setLog(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].Log"));
				resourceSnapshot.setOperateType(_ctx.integerValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].OperateType"));
				resourceSnapshot.setResourceType(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].ResourceType"));
				resourceSnapshot.setSnapshotId(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].SnapshotId"));
				resourceSnapshot.setGmtCompleted(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtCompleted"));
				resourceSnapshot.setGmtCreate(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtCreate"));
				resourceSnapshot.setGmtCompletedTimestamp(_ctx.longValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].GmtCompletedTimestamp"));
				resourceSnapshot.setResourceId(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].ResourceId"));
				resourceSnapshot.setResourceName(_ctx.stringValue("GetEdgeInstanceDeploymentResponse.Data.TaskList["+ i +"].ResourceSnapshotList["+ j +"].ResourceName"));

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