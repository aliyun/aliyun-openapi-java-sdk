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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRuleTasksResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRuleTasksResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityRuleTasksResponse.PageResult.QualityRuleTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQualityRuleTasksResponseUnmarshaller {

	public static ListQualityRuleTasksResponse unmarshall(ListQualityRuleTasksResponse listQualityRuleTasksResponse, UnmarshallerContext _ctx) {
		
		listQualityRuleTasksResponse.setRequestId(_ctx.stringValue("ListQualityRuleTasksResponse.RequestId"));
		listQualityRuleTasksResponse.setMessage(_ctx.stringValue("ListQualityRuleTasksResponse.Message"));
		listQualityRuleTasksResponse.setHttpStatusCode(_ctx.integerValue("ListQualityRuleTasksResponse.HttpStatusCode"));
		listQualityRuleTasksResponse.setCode(_ctx.stringValue("ListQualityRuleTasksResponse.Code"));
		listQualityRuleTasksResponse.setSuccess(_ctx.booleanValue("ListQualityRuleTasksResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListQualityRuleTasksResponse.PageResult.TotalCount"));

		List<QualityRuleTask> qualityRuleTaskList = new ArrayList<QualityRuleTask>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList.Length"); i++) {
			QualityRuleTask qualityRuleTask = new QualityRuleTask();
			qualityRuleTask.setWatchTaskId(_ctx.longValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].WatchTaskId"));
			qualityRuleTask.setStatus(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].Status"));
			qualityRuleTask.setModifyTime(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].ModifyTime"));
			qualityRuleTask.setEndTime(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].EndTime"));
			qualityRuleTask.setRuleId(_ctx.longValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].RuleId"));
			qualityRuleTask.setCreateTime(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].CreateTime"));
			qualityRuleTask.setStartTime(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].StartTime"));
			qualityRuleTask.setCreator(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].Creator"));
			qualityRuleTask.setBizDateFormat(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].BizDateFormat"));
			qualityRuleTask.setValidateObjectName(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].ValidateObjectName"));
			qualityRuleTask.setValidatePartition(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].ValidatePartition"));
			qualityRuleTask.setId(_ctx.longValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].Id"));
			qualityRuleTask.setModifier(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].Modifier"));
			qualityRuleTask.setTemplateId(_ctx.longValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].TemplateId"));
			qualityRuleTask.setValidateObjectType(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].ValidateObjectType"));
			qualityRuleTask.setValidateSuccess(_ctx.booleanValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].ValidateSuccess"));
			qualityRuleTask.setBizDate(_ctx.stringValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].BizDate"));
			qualityRuleTask.setWatchId(_ctx.longValue("ListQualityRuleTasksResponse.PageResult.QualityRuleTaskList["+ i +"].WatchId"));

			qualityRuleTaskList.add(qualityRuleTask);
		}
		pageResult.setQualityRuleTaskList(qualityRuleTaskList);
		listQualityRuleTasksResponse.setPageResult(pageResult);
	 
	 	return listQualityRuleTasksResponse;
	}
}