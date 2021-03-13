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

import com.aliyuncs.adb.model.v20190315.DescribeSQLPlanTaskResponse;
import com.aliyuncs.adb.model.v20190315.DescribeSQLPlanTaskResponse.SqlPlanTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLPlanTaskResponseUnmarshaller {

	public static DescribeSQLPlanTaskResponse unmarshall(DescribeSQLPlanTaskResponse describeSQLPlanTaskResponse, UnmarshallerContext _ctx) {
		
		describeSQLPlanTaskResponse.setRequestId(_ctx.stringValue("DescribeSQLPlanTaskResponse.RequestId"));

		List<SqlPlanTask> taskList = new ArrayList<SqlPlanTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLPlanTaskResponse.TaskList.Length"); i++) {
			SqlPlanTask sqlPlanTask = new SqlPlanTask();
			sqlPlanTask.setTaskId(_ctx.integerValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].TaskId"));
			sqlPlanTask.setState(_ctx.stringValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].State"));
			sqlPlanTask.setElapsedTime(_ctx.longValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].ElapsedTime"));
			sqlPlanTask.setPeakMemory(_ctx.longValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].PeakMemory"));
			sqlPlanTask.setOperatorCost(_ctx.longValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].OperatorCost"));
			sqlPlanTask.setInputRows(_ctx.longValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].InputRows"));
			sqlPlanTask.setInputSize(_ctx.longValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].InputSize"));
			sqlPlanTask.setOutputRows(_ctx.longValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].OutputRows"));
			sqlPlanTask.setOutputSize(_ctx.longValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].OutputSize"));
			sqlPlanTask.setScanRows(_ctx.longValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].ScanRows"));
			sqlPlanTask.setScanSize(_ctx.longValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].ScanSize"));
			sqlPlanTask.setScanCost(_ctx.longValue("DescribeSQLPlanTaskResponse.TaskList["+ i +"].ScanCost"));

			taskList.add(sqlPlanTask);
		}
		describeSQLPlanTaskResponse.setTaskList(taskList);
	 
	 	return describeSQLPlanTaskResponse;
	}
}