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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeDiagnosisTasksResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDiagnosisTasksResponse.SqlTasks;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDiagnosisTasksResponseUnmarshaller {

	public static DescribeDiagnosisTasksResponse unmarshall(DescribeDiagnosisTasksResponse describeDiagnosisTasksResponse, UnmarshallerContext _ctx) {
		
		describeDiagnosisTasksResponse.setRequestId(_ctx.stringValue("DescribeDiagnosisTasksResponse.RequestId"));
		describeDiagnosisTasksResponse.setTotalCount(_ctx.integerValue("DescribeDiagnosisTasksResponse.TotalCount"));

		List<SqlTasks> taskList = new ArrayList<SqlTasks>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDiagnosisTasksResponse.TaskList.Length"); i++) {
			SqlTasks sqlTasks = new SqlTasks();
			sqlTasks.setScanCost(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].ScanCost"));
			sqlTasks.setOutputDataSize(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].OutputDataSize"));
			sqlTasks.setInputDataSize(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].InputDataSize"));
			sqlTasks.setState(_ctx.stringValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].State"));
			sqlTasks.setOperatorCost(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].OperatorCost"));
			sqlTasks.setOutputRows(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].OutputRows"));
			sqlTasks.setScanDataSize(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].ScanDataSize"));
			sqlTasks.setElapsedTime(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].ElapsedTime"));
			sqlTasks.setScanRows(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].ScanRows"));
			sqlTasks.setPeakMemory(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].PeakMemory"));
			sqlTasks.setTaskId(_ctx.stringValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].TaskId"));
			sqlTasks.setInputRows(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].InputRows"));
			sqlTasks.setTaskCreateTime(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].TaskCreateTime"));
			sqlTasks.setTaskEndTime(_ctx.longValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].TaskEndTime"));
			sqlTasks.setTaskHost(_ctx.stringValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].TaskHost"));
			sqlTasks.setDrivers(_ctx.stringValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].Drivers"));
			sqlTasks.setQueuedTime(_ctx.stringValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].QueuedTime"));
			sqlTasks.setComputeTimeRatio(_ctx.stringValue("DescribeDiagnosisTasksResponse.TaskList["+ i +"].ComputeTimeRatio"));

			taskList.add(sqlTasks);
		}
		describeDiagnosisTasksResponse.setTaskList(taskList);
	 
	 	return describeDiagnosisTasksResponse;
	}
}