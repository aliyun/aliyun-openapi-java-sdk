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

package com.aliyuncs.schedulerx3.transform.v20240624;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx3.model.v20240624.GetJobExecutionProgressResponse;
import com.aliyuncs.schedulerx3.model.v20240624.GetJobExecutionProgressResponse.Data;
import com.aliyuncs.schedulerx3.model.v20240624.GetJobExecutionProgressResponse.Data.RootProgress;
import com.aliyuncs.schedulerx3.model.v20240624.GetJobExecutionProgressResponse.Data.ShardingProgressItem;
import com.aliyuncs.schedulerx3.model.v20240624.GetJobExecutionProgressResponse.Data.ShardingProgressItem.StatusType;
import com.aliyuncs.schedulerx3.model.v20240624.GetJobExecutionProgressResponse.Data.TaskProgressItem;
import com.aliyuncs.schedulerx3.model.v20240624.GetJobExecutionProgressResponse.Data.TotalProgress;
import com.aliyuncs.schedulerx3.model.v20240624.GetJobExecutionProgressResponse.Data.WorkerProgressItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobExecutionProgressResponseUnmarshaller {

	public static GetJobExecutionProgressResponse unmarshall(GetJobExecutionProgressResponse getJobExecutionProgressResponse, UnmarshallerContext _ctx) {
		
		getJobExecutionProgressResponse.setRequestId(_ctx.stringValue("GetJobExecutionProgressResponse.RequestId"));
		getJobExecutionProgressResponse.setCode(_ctx.integerValue("GetJobExecutionProgressResponse.Code"));
		getJobExecutionProgressResponse.setMessage(_ctx.stringValue("GetJobExecutionProgressResponse.Message"));
		getJobExecutionProgressResponse.setSuccess(_ctx.booleanValue("GetJobExecutionProgressResponse.Success"));

		Data data = new Data();
		data.setJobDescription(_ctx.stringValue("GetJobExecutionProgressResponse.Data.JobDescription"));
		data.setStatisticDetail(_ctx.mapValue("GetJobExecutionProgressResponse.Data.StatisticDetail"));

		TotalProgress totalProgress = new TotalProgress();
		totalProgress.setTotal(_ctx.longValue("GetJobExecutionProgressResponse.Data.TotalProgress.Total"));
		totalProgress.setFinished(_ctx.longValue("GetJobExecutionProgressResponse.Data.TotalProgress.Finished"));
		data.setTotalProgress(totalProgress);

		RootProgress rootProgress = new RootProgress();
		rootProgress.setTotal(_ctx.longValue("GetJobExecutionProgressResponse.Data.RootProgress.Total"));
		rootProgress.setFinished(_ctx.longValue("GetJobExecutionProgressResponse.Data.RootProgress.Finished"));
		data.setRootProgress(rootProgress);

		List<TaskProgressItem> taskProgress = new ArrayList<TaskProgressItem>();
		for (int i = 0; i < _ctx.lengthValue("GetJobExecutionProgressResponse.Data.TaskProgress.Length"); i++) {
			TaskProgressItem taskProgressItem = new TaskProgressItem();
			taskProgressItem.setName(_ctx.stringValue("GetJobExecutionProgressResponse.Data.TaskProgress["+ i +"].Name"));
			taskProgressItem.setTotal(_ctx.integerValue("GetJobExecutionProgressResponse.Data.TaskProgress["+ i +"].Total"));
			taskProgressItem.setPulled(_ctx.integerValue("GetJobExecutionProgressResponse.Data.TaskProgress["+ i +"].Pulled"));
			taskProgressItem.setQueue(_ctx.integerValue("GetJobExecutionProgressResponse.Data.TaskProgress["+ i +"].Queue"));
			taskProgressItem.setRunning(_ctx.integerValue("GetJobExecutionProgressResponse.Data.TaskProgress["+ i +"].Running"));
			taskProgressItem.setSuccess(_ctx.integerValue("GetJobExecutionProgressResponse.Data.TaskProgress["+ i +"].Success"));
			taskProgressItem.setFailed(_ctx.integerValue("GetJobExecutionProgressResponse.Data.TaskProgress["+ i +"].Failed"));

			taskProgress.add(taskProgressItem);
		}
		data.setTaskProgress(taskProgress);

		List<ShardingProgressItem> shardingProgress = new ArrayList<ShardingProgressItem>();
		for (int i = 0; i < _ctx.lengthValue("GetJobExecutionProgressResponse.Data.ShardingProgress.Length"); i++) {
			ShardingProgressItem shardingProgressItem = new ShardingProgressItem();
			shardingProgressItem.setId(_ctx.longValue("GetJobExecutionProgressResponse.Data.ShardingProgress["+ i +"].Id"));
			shardingProgressItem.setWorkerAddr(_ctx.stringValue("GetJobExecutionProgressResponse.Data.ShardingProgress["+ i +"].WorkerAddr"));
			shardingProgressItem.setStatus(_ctx.integerValue("GetJobExecutionProgressResponse.Data.ShardingProgress["+ i +"].Status"));
			shardingProgressItem.setJobExecutionId(_ctx.stringValue("GetJobExecutionProgressResponse.Data.ShardingProgress["+ i +"].JobExecutionId"));
			shardingProgressItem.setResult(_ctx.stringValue("GetJobExecutionProgressResponse.Data.ShardingProgress["+ i +"].Result"));

			StatusType statusType = new StatusType();
			statusType.setCode(_ctx.stringValue("GetJobExecutionProgressResponse.Data.ShardingProgress["+ i +"].StatusType.Code"));
			statusType.setName(_ctx.stringValue("GetJobExecutionProgressResponse.Data.ShardingProgress["+ i +"].StatusType.Name"));
			statusType.setTips(_ctx.mapValue("GetJobExecutionProgressResponse.Data.ShardingProgress["+ i +"].StatusType.Tips"));
			shardingProgressItem.setStatusType(statusType);

			shardingProgress.add(shardingProgressItem);
		}
		data.setShardingProgress(shardingProgress);

		List<WorkerProgressItem> workerProgress = new ArrayList<WorkerProgressItem>();
		for (int i = 0; i < _ctx.lengthValue("GetJobExecutionProgressResponse.Data.WorkerProgress.Length"); i++) {
			WorkerProgressItem workerProgressItem = new WorkerProgressItem();
			workerProgressItem.setWorkerAddr(_ctx.stringValue("GetJobExecutionProgressResponse.Data.WorkerProgress["+ i +"].WorkerAddr"));
			workerProgressItem.setTotal(_ctx.integerValue("GetJobExecutionProgressResponse.Data.WorkerProgress["+ i +"].Total"));
			workerProgressItem.setPulled(_ctx.integerValue("GetJobExecutionProgressResponse.Data.WorkerProgress["+ i +"].Pulled"));
			workerProgressItem.setQueue(_ctx.integerValue("GetJobExecutionProgressResponse.Data.WorkerProgress["+ i +"].Queue"));
			workerProgressItem.setRunning(_ctx.integerValue("GetJobExecutionProgressResponse.Data.WorkerProgress["+ i +"].Running"));
			workerProgressItem.setSuccess(_ctx.integerValue("GetJobExecutionProgressResponse.Data.WorkerProgress["+ i +"].Success"));
			workerProgressItem.setFailed(_ctx.integerValue("GetJobExecutionProgressResponse.Data.WorkerProgress["+ i +"].Failed"));
			workerProgressItem.setTraceId(_ctx.stringValue("GetJobExecutionProgressResponse.Data.WorkerProgress["+ i +"].TraceId"));

			workerProgress.add(workerProgressItem);
		}
		data.setWorkerProgress(workerProgress);
		getJobExecutionProgressResponse.setData(data);
	 
	 	return getJobExecutionProgressResponse;
	}
}