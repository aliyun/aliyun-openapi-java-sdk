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

import com.aliyuncs.drds.model.v20190123.DescribeDataImportTasksResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDataImportTasksResponse.DataImportTask;
import com.aliyuncs.drds.model.v20190123.DescribeDataImportTasksResponse.DataImportTask.JingweiProgress;
import com.aliyuncs.drds.model.v20190123.DescribeDataImportTasksResponse.DataImportTask.JingweiProgress.Full;
import com.aliyuncs.drds.model.v20190123.DescribeDataImportTasksResponse.DataImportTask.JingweiProgress.Increment;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataImportTasksResponseUnmarshaller {

	public static DescribeDataImportTasksResponse unmarshall(DescribeDataImportTasksResponse describeDataImportTasksResponse, UnmarshallerContext _ctx) {
		
		describeDataImportTasksResponse.setRequestId(_ctx.stringValue("DescribeDataImportTasksResponse.RequestId"));
		describeDataImportTasksResponse.setSuccess(_ctx.booleanValue("DescribeDataImportTasksResponse.Success"));
		describeDataImportTasksResponse.setPageNumber(_ctx.integerValue("DescribeDataImportTasksResponse.PageNumber"));
		describeDataImportTasksResponse.setPageSize(_ctx.integerValue("DescribeDataImportTasksResponse.PageSize"));
		describeDataImportTasksResponse.setTotal(_ctx.integerValue("DescribeDataImportTasksResponse.Total"));

		List<DataImportTask> data = new ArrayList<DataImportTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataImportTasksResponse.Data.Length"); i++) {
			DataImportTask dataImportTask = new DataImportTask();
			dataImportTask.setId(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].Id"));
			dataImportTask.setTaskName(_ctx.stringValue("DescribeDataImportTasksResponse.Data["+ i +"].TaskName"));
			dataImportTask.setGmtCreate(_ctx.stringValue("DescribeDataImportTasksResponse.Data["+ i +"].GmtCreate"));
			dataImportTask.setGmtModified(_ctx.stringValue("DescribeDataImportTasksResponse.Data["+ i +"].GmtModified"));
			dataImportTask.setType(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].Type"));
			dataImportTask.setStatus(_ctx.stringValue("DescribeDataImportTasksResponse.Data["+ i +"].Status"));
			dataImportTask.setStage(_ctx.stringValue("DescribeDataImportTasksResponse.Data["+ i +"].Stage"));
			dataImportTask.setSrcInstId(_ctx.stringValue("DescribeDataImportTasksResponse.Data["+ i +"].SrcInstId"));
			dataImportTask.setSrcDbName(_ctx.stringValue("DescribeDataImportTasksResponse.Data["+ i +"].SrcDbName"));
			dataImportTask.setDstInstId(_ctx.stringValue("DescribeDataImportTasksResponse.Data["+ i +"].DstInstId"));
			dataImportTask.setDstDbName(_ctx.stringValue("DescribeDataImportTasksResponse.Data["+ i +"].DstDbName"));
			dataImportTask.setEvaluateTaskId(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].EvaluateTaskId"));
			dataImportTask.setBatchEvaluateTaskId(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].BatchEvaluateTaskId"));
			dataImportTask.setCreateDbProgress(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].CreateDbProgress"));
			dataImportTask.setCreateTablesProgress(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].CreateTablesProgress"));
			dataImportTask.setProgress(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].Progress"));

			JingweiProgress jingweiProgress = new JingweiProgress();
			jingweiProgress.setFullRunning(_ctx.booleanValue("DescribeDataImportTasksResponse.Data["+ i +"].JingweiProgress.FullRunning"));
			jingweiProgress.setIncrementRunning(_ctx.booleanValue("DescribeDataImportTasksResponse.Data["+ i +"].JingweiProgress.IncrementRunning"));

			Full full = new Full();
			full.setProgress(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].JingweiProgress.Full.Progress"));
			full.setTps(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].JingweiProgress.Full.Tps"));
			full.setNeedTime(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].JingweiProgress.Full.NeedTime"));
			full.setTransferCount(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].JingweiProgress.Full.TransferCount"));
			jingweiProgress.setFull(full);

			Increment increment = new Increment();
			increment.setDelay(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].JingweiProgress.Increment.Delay"));
			increment.setTps(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].JingweiProgress.Increment.Tps"));
			increment.setTransferCount(_ctx.integerValue("DescribeDataImportTasksResponse.Data["+ i +"].JingweiProgress.Increment.TransferCount"));
			jingweiProgress.setIncrement(increment);
			dataImportTask.setJingweiProgress(jingweiProgress);

			data.add(dataImportTask);
		}
		describeDataImportTasksResponse.setData(data);
	 
	 	return describeDataImportTasksResponse;
	}
}