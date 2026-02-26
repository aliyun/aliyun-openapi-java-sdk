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

import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryExperimentTaskByExperimentIdResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTaskInfo;
import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTaskInfo.Creator;
import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTaskInfo.ExtInfo;
import com.aliyuncs.ahas_openapi.model.v20190901.PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTaskInfo.ExtInfo.SchedulerConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageableQueryExperimentTaskByExperimentIdResponseUnmarshaller {

	public static PageableQueryExperimentTaskByExperimentIdResponse unmarshall(PageableQueryExperimentTaskByExperimentIdResponse pageableQueryExperimentTaskByExperimentIdResponse, UnmarshallerContext _ctx) {
		
		pageableQueryExperimentTaskByExperimentIdResponse.setRequestId(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.RequestId"));
		pageableQueryExperimentTaskByExperimentIdResponse.setPages(_ctx.integerValue("PageableQueryExperimentTaskByExperimentIdResponse.Pages"));
		pageableQueryExperimentTaskByExperimentIdResponse.setMessage(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.Message"));
		pageableQueryExperimentTaskByExperimentIdResponse.setPageSize(_ctx.integerValue("PageableQueryExperimentTaskByExperimentIdResponse.PageSize"));
		pageableQueryExperimentTaskByExperimentIdResponse.setCurrentPage(_ctx.integerValue("PageableQueryExperimentTaskByExperimentIdResponse.CurrentPage"));
		pageableQueryExperimentTaskByExperimentIdResponse.setTotal(_ctx.integerValue("PageableQueryExperimentTaskByExperimentIdResponse.Total"));
		pageableQueryExperimentTaskByExperimentIdResponse.setHttpStatusCode(_ctx.integerValue("PageableQueryExperimentTaskByExperimentIdResponse.HttpStatusCode"));
		pageableQueryExperimentTaskByExperimentIdResponse.setCode(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.Code"));
		pageableQueryExperimentTaskByExperimentIdResponse.setSuccess(_ctx.booleanValue("PageableQueryExperimentTaskByExperimentIdResponse.Success"));

		List<ExperimentTaskInfo> experimentTasks = new ArrayList<ExperimentTaskInfo>();
		for (int i = 0; i < _ctx.lengthValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks.Length"); i++) {
			ExperimentTaskInfo experimentTaskInfo = new ExperimentTaskInfo();
			experimentTaskInfo.setEndTime(_ctx.longValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].EndTime"));
			experimentTaskInfo.setStartTime(_ctx.longValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].StartTime"));
			experimentTaskInfo.setResult(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].Result"));
			experimentTaskInfo.setState(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].State"));
			experimentTaskInfo.setCurrentPhase(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].CurrentPhase"));
			experimentTaskInfo.setExperimentId(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].ExperimentId"));
			experimentTaskInfo.setMessage(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].Message"));
			experimentTaskInfo.setTaskId(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].TaskId"));
			experimentTaskInfo.setExperimentName(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].ExperimentName"));
			experimentTaskInfo.setNamespace(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].Namespace"));

			ExtInfo extInfo = new ExtInfo();

			SchedulerConfig schedulerConfig = new SchedulerConfig();
			schedulerConfig.setFixedTime(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].ExtInfo.SchedulerConfig.FixedTime"));
			schedulerConfig.setCronExpression(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].ExtInfo.SchedulerConfig.CronExpression"));
			extInfo.setSchedulerConfig(schedulerConfig);
			experimentTaskInfo.setExtInfo(extInfo);

			Creator creator = new Creator();
			creator.setSubUserId(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].Creator.SubUserId"));
			creator.setUserId(_ctx.stringValue("PageableQueryExperimentTaskByExperimentIdResponse.ExperimentTasks["+ i +"].Creator.UserId"));
			experimentTaskInfo.setCreator(creator);

			experimentTasks.add(experimentTaskInfo);
		}
		pageableQueryExperimentTaskByExperimentIdResponse.setExperimentTasks(experimentTasks);
	 
	 	return pageableQueryExperimentTaskByExperimentIdResponse;
	}
}