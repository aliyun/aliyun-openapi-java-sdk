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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDataExportTasksResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDataExportTasksResponse.DataExportTask;
import com.aliyuncs.drds.model.v20190123.DescribeDataExportTasksResponse.DataExportTask.JingweiProgress;
import com.aliyuncs.drds.model.v20190123.DescribeDataExportTasksResponse.DataExportTask.JingweiProgress.Full;
import com.aliyuncs.drds.model.v20190123.DescribeDataExportTasksResponse.DataExportTask.JingweiProgress.Increment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataExportTasksResponseUnmarshaller {

	public static DescribeDataExportTasksResponse unmarshall(DescribeDataExportTasksResponse describeDataExportTasksResponse, UnmarshallerContext _ctx) {
		
		describeDataExportTasksResponse.setRequestId(_ctx.stringValue("DescribeDataExportTasksResponse.RequestId"));
		describeDataExportTasksResponse.setSuccess(_ctx.booleanValue("DescribeDataExportTasksResponse.Success"));
		describeDataExportTasksResponse.setPageNumber(_ctx.integerValue("DescribeDataExportTasksResponse.PageNumber"));
		describeDataExportTasksResponse.setPageSize(_ctx.integerValue("DescribeDataExportTasksResponse.PageSize"));
		describeDataExportTasksResponse.setTotal(_ctx.integerValue("DescribeDataExportTasksResponse.Total"));

		List<DataExportTask> data = new ArrayList<DataExportTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataExportTasksResponse.Data.Length"); i++) {
			DataExportTask dataExportTask = new DataExportTask();
			dataExportTask.setId(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].Id"));
			dataExportTask.setTaskName(_ctx.stringValue("DescribeDataExportTasksResponse.Data["+ i +"].TaskName"));
			dataExportTask.setGmtCreate(_ctx.stringValue("DescribeDataExportTasksResponse.Data["+ i +"].GmtCreate"));
			dataExportTask.setGmtModified(_ctx.stringValue("DescribeDataExportTasksResponse.Data["+ i +"].GmtModified"));
			dataExportTask.setType(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].Type"));
			dataExportTask.setStatus(_ctx.stringValue("DescribeDataExportTasksResponse.Data["+ i +"].Status"));
			dataExportTask.setStage(_ctx.stringValue("DescribeDataExportTasksResponse.Data["+ i +"].Stage"));
			dataExportTask.setSrcInstId(_ctx.stringValue("DescribeDataExportTasksResponse.Data["+ i +"].SrcInstId"));
			dataExportTask.setSrcDbName(_ctx.stringValue("DescribeDataExportTasksResponse.Data["+ i +"].SrcDbName"));
			dataExportTask.setDstInstId(_ctx.stringValue("DescribeDataExportTasksResponse.Data["+ i +"].DstInstId"));
			dataExportTask.setDstDbName(_ctx.stringValue("DescribeDataExportTasksResponse.Data["+ i +"].DstDbName"));
			dataExportTask.setEvaluateTaskId(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].EvaluateTaskId"));
			dataExportTask.setBatchEvaluateTaskId(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].BatchEvaluateTaskId"));
			dataExportTask.setCreateDbProgress(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].CreateDbProgress"));
			dataExportTask.setCreateTablesProgress(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].CreateTablesProgress"));
			dataExportTask.setProgress(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].Progress"));

			JingweiProgress jingweiProgress = new JingweiProgress();
			jingweiProgress.setFullRunning(_ctx.booleanValue("DescribeDataExportTasksResponse.Data["+ i +"].JingweiProgress.FullRunning"));
			jingweiProgress.setIncrementRunning(_ctx.booleanValue("DescribeDataExportTasksResponse.Data["+ i +"].JingweiProgress.IncrementRunning"));

			Full full = new Full();
			full.setProgress(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].JingweiProgress.Full.Progress"));
			full.setTps(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].JingweiProgress.Full.Tps"));
			full.setNeedTime(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].JingweiProgress.Full.NeedTime"));
			full.setTransferCount(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].JingweiProgress.Full.TransferCount"));
			jingweiProgress.setFull(full);

			Increment increment = new Increment();
			increment.setDelay(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].JingweiProgress.Increment.Delay"));
			increment.setTps(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].JingweiProgress.Increment.Tps"));
			increment.setTransferCount(_ctx.integerValue("DescribeDataExportTasksResponse.Data["+ i +"].JingweiProgress.Increment.TransferCount"));
			jingweiProgress.setIncrement(increment);
			dataExportTask.setJingweiProgress(jingweiProgress);

			data.add(dataExportTask);
		}
		describeDataExportTasksResponse.setData(data);
	 
	 	return describeDataExportTasksResponse;
	}
}