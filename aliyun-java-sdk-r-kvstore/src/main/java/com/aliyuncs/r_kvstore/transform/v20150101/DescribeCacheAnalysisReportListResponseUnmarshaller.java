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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeCacheAnalysisReportListResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeCacheAnalysisReportListResponse.DailyTask;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeCacheAnalysisReportListResponse.DailyTask.Task;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCacheAnalysisReportListResponseUnmarshaller {

	public static DescribeCacheAnalysisReportListResponse unmarshall(DescribeCacheAnalysisReportListResponse describeCacheAnalysisReportListResponse, UnmarshallerContext context) {
		
		describeCacheAnalysisReportListResponse.setRequestId(context.stringValue("DescribeCacheAnalysisReportListResponse.RequestId"));
		describeCacheAnalysisReportListResponse.setInstanceId(context.stringValue("DescribeCacheAnalysisReportListResponse.InstanceId"));
		describeCacheAnalysisReportListResponse.setTotalRecordCount(context.integerValue("DescribeCacheAnalysisReportListResponse.TotalRecordCount"));
		describeCacheAnalysisReportListResponse.setPageNumbers(context.integerValue("DescribeCacheAnalysisReportListResponse.PageNumbers"));
		describeCacheAnalysisReportListResponse.setPageRecordCount(context.integerValue("DescribeCacheAnalysisReportListResponse.PageRecordCount"));

		List<DailyTask> dailyTasks = new ArrayList<DailyTask>();
		for (int i = 0; i < context.lengthValue("DescribeCacheAnalysisReportListResponse.DailyTasks.Length"); i++) {
			DailyTask dailyTask = new DailyTask();
			dailyTask.setDate(context.stringValue("DescribeCacheAnalysisReportListResponse.DailyTasks["+ i +"].Date"));

			List<Task> tasks = new ArrayList<Task>();
			for (int j = 0; j < context.lengthValue("DescribeCacheAnalysisReportListResponse.DailyTasks["+ i +"].Tasks.Length"); j++) {
				Task task = new Task();
				task.setTaskId(context.stringValue("DescribeCacheAnalysisReportListResponse.DailyTasks["+ i +"].Tasks["+ j +"].TaskId"));
				task.setNodeId(context.stringValue("DescribeCacheAnalysisReportListResponse.DailyTasks["+ i +"].Tasks["+ j +"].NodeId"));
				task.setStartTime(context.stringValue("DescribeCacheAnalysisReportListResponse.DailyTasks["+ i +"].Tasks["+ j +"].StartTime"));
				task.setStatus(context.stringValue("DescribeCacheAnalysisReportListResponse.DailyTasks["+ i +"].Tasks["+ j +"].Status"));

				tasks.add(task);
			}
			dailyTask.setTasks(tasks);

			dailyTasks.add(dailyTask);
		}
		describeCacheAnalysisReportListResponse.setDailyTasks(dailyTasks);
	 
	 	return describeCacheAnalysisReportListResponse;
	}
}