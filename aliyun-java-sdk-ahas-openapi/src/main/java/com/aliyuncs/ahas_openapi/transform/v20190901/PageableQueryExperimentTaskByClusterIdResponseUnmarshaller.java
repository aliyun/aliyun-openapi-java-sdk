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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryExperimentTaskByClusterIdResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryExperimentTaskByClusterIdResponse.ExperimentTaskInfo;
import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryExperimentTaskByClusterIdResponse.ExperimentTaskInfo.Creator;
import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryExperimentTaskByClusterIdResponse.ExperimentTaskInfo.ExtInfo;
import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryExperimentTaskByClusterIdResponse.ExperimentTaskInfo.ExtInfo.SchedulerConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageableQueryExperimentTaskByClusterIdResponseUnmarshaller {

	public static PageableQueryExperimentTaskByClusterIdResponse unmarshall(PageableQueryExperimentTaskByClusterIdResponse pageableQueryExperimentTaskByClusterIdResponse, UnmarshallerContext _ctx) {
		
		pageableQueryExperimentTaskByClusterIdResponse.setRequestId(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.RequestId"));
		pageableQueryExperimentTaskByClusterIdResponse.setPages(_ctx.integerValue("PageableQueryExperimentTaskByClusterIdResponse.Pages"));
		pageableQueryExperimentTaskByClusterIdResponse.setMessage(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.Message"));
		pageableQueryExperimentTaskByClusterIdResponse.setPageSize(_ctx.integerValue("PageableQueryExperimentTaskByClusterIdResponse.PageSize"));
		pageableQueryExperimentTaskByClusterIdResponse.setCurrentPage(_ctx.integerValue("PageableQueryExperimentTaskByClusterIdResponse.CurrentPage"));
		pageableQueryExperimentTaskByClusterIdResponse.setTotal(_ctx.integerValue("PageableQueryExperimentTaskByClusterIdResponse.Total"));
		pageableQueryExperimentTaskByClusterIdResponse.setHttpStatusCode(_ctx.integerValue("PageableQueryExperimentTaskByClusterIdResponse.HttpStatusCode"));
		pageableQueryExperimentTaskByClusterIdResponse.setCode(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.Code"));
		pageableQueryExperimentTaskByClusterIdResponse.setSuccess(_ctx.booleanValue("PageableQueryExperimentTaskByClusterIdResponse.Success"));

		List<ExperimentTaskInfo> experimentTasks = new ArrayList<ExperimentTaskInfo>();
		for (int i = 0; i < _ctx.lengthValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks.Length"); i++) {
			ExperimentTaskInfo experimentTaskInfo = new ExperimentTaskInfo();
			experimentTaskInfo.setEndTime(_ctx.longValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].EndTime"));
			experimentTaskInfo.setStartTime(_ctx.longValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].StartTime"));
			experimentTaskInfo.setResult(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].Result"));
			experimentTaskInfo.setState(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].State"));
			experimentTaskInfo.setCurrentPhase(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].CurrentPhase"));
			experimentTaskInfo.setExperimentId(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].ExperimentId"));
			experimentTaskInfo.setMessage(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].Message"));
			experimentTaskInfo.setTaskId(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].TaskId"));
			experimentTaskInfo.setExperimentName(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].ExperimentName"));
			experimentTaskInfo.setNamespace(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].Namespace"));

			ExtInfo extInfo = new ExtInfo();

			SchedulerConfig schedulerConfig = new SchedulerConfig();
			schedulerConfig.setFixedTime(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].ExtInfo.SchedulerConfig.FixedTime"));
			schedulerConfig.setCronExpression(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].ExtInfo.SchedulerConfig.CronExpression"));
			extInfo.setSchedulerConfig(schedulerConfig);
			experimentTaskInfo.setExtInfo(extInfo);

			Creator creator = new Creator();
			creator.setSubUserId(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].Creator.SubUserId"));
			creator.setUserId(_ctx.stringValue("PageableQueryExperimentTaskByClusterIdResponse.ExperimentTasks["+ i +"].Creator.UserId"));
			experimentTaskInfo.setCreator(creator);

			experimentTasks.add(experimentTaskInfo);
		}
		pageableQueryExperimentTaskByClusterIdResponse.setExperimentTasks(experimentTasks);
	 
	 	return pageableQueryExperimentTaskByClusterIdResponse;
	}
}