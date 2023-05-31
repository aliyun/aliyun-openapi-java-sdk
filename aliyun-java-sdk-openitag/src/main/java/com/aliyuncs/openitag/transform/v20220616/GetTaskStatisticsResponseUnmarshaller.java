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

package com.aliyuncs.openitag.transform.v20220616;

import com.aliyuncs.openitag.model.v20220616.GetTaskStatisticsResponse;
import com.aliyuncs.openitag.model.v20220616.GetTaskStatisticsResponse.TaskStatistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskStatisticsResponseUnmarshaller {

	public static GetTaskStatisticsResponse unmarshall(GetTaskStatisticsResponse getTaskStatisticsResponse, UnmarshallerContext _ctx) {
		
		getTaskStatisticsResponse.setRequestId(_ctx.stringValue("GetTaskStatisticsResponse.RequestId"));
		getTaskStatisticsResponse.setCode(_ctx.integerValue("GetTaskStatisticsResponse.Code"));
		getTaskStatisticsResponse.setMessage(_ctx.stringValue("GetTaskStatisticsResponse.Message"));
		getTaskStatisticsResponse.setDetails(_ctx.stringValue("GetTaskStatisticsResponse.Details"));
		getTaskStatisticsResponse.setSuccess(_ctx.booleanValue("GetTaskStatisticsResponse.Success"));
		getTaskStatisticsResponse.setErrorCode(_ctx.stringValue("GetTaskStatisticsResponse.ErrorCode"));

		TaskStatistics taskStatistics = new TaskStatistics();
		taskStatistics.setTotalItemCount(_ctx.longValue("GetTaskStatisticsResponse.TaskStatistics.TotalItemCount"));
		taskStatistics.setTotalSubtaskCount(_ctx.longValue("GetTaskStatisticsResponse.TaskStatistics.TotalSubtaskCount"));
		taskStatistics.setFinishedItemCount(_ctx.longValue("GetTaskStatisticsResponse.TaskStatistics.FinishedItemCount"));
		taskStatistics.setFinishedSubtaskCount(_ctx.longValue("GetTaskStatisticsResponse.TaskStatistics.FinishedSubtaskCount"));
		taskStatistics.setFinalAbandonCount(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.FinalAbandonCount"));
		taskStatistics.setPreMarkFixedCount(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.PreMarkFixedCount"));
		taskStatistics.setAcceptItemCount(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.AcceptItemCount"));
		taskStatistics.setTotalCheckedCount(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.TotalCheckedCount"));
		taskStatistics.setCheckedError(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.CheckedError"));
		taskStatistics.setCheckAbandon(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.CheckAbandon"));
		taskStatistics.setCheckedAccuracy(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.CheckedAccuracy"));
		taskStatistics.setCheckedRejectCount(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.CheckedRejectCount"));
		taskStatistics.setTotalSampledCount(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.TotalSampledCount"));
		taskStatistics.setSampledErrorCount(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.SampledErrorCount"));
		taskStatistics.setSampledRejectCount(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.SampledRejectCount"));
		taskStatistics.setSampledAccuracy(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.SampledAccuracy"));
		taskStatistics.setTotalSamplingCount(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.TotalSamplingCount"));
		taskStatistics.setTotalCheckCount(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.TotalCheckCount"));
		taskStatistics.setTotalWorkTime(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.TotalWorkTime"));
		taskStatistics.setTotalMarkTime(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.TotalMarkTime"));
		taskStatistics.setMarkEfficiency(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.MarkEfficiency"));
		taskStatistics.setTotalCheckTime(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.TotalCheckTime"));
		taskStatistics.setCheckEfficiency(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.CheckEfficiency"));
		taskStatistics.setSamplingAccuracy(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.SamplingAccuracy"));
		taskStatistics.setCheckAccuracy(_ctx.floatValue("GetTaskStatisticsResponse.TaskStatistics.CheckAccuracy"));
		getTaskStatisticsResponse.setTaskStatistics(taskStatistics);
	 
	 	return getTaskStatisticsResponse;
	}
}