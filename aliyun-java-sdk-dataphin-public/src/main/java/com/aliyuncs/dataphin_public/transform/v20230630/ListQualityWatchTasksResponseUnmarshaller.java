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

import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchTasksResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchTasksResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchTasksResponse.PageResult.QualityWatchTask;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchTasksResponse.PageResult.QualityWatchTask.RuleCountInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchTasksResponse.PageResult.QualityWatchTask.RuleCountInfo.StrongRuleCount;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchTasksResponse.PageResult.QualityWatchTask.RuleCountInfo.ValidateRuleCount;
import com.aliyuncs.dataphin_public.model.v20230630.ListQualityWatchTasksResponse.PageResult.QualityWatchTask.RuleCountInfo.WeakRuleCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQualityWatchTasksResponseUnmarshaller {

	public static ListQualityWatchTasksResponse unmarshall(ListQualityWatchTasksResponse listQualityWatchTasksResponse, UnmarshallerContext _ctx) {
		
		listQualityWatchTasksResponse.setRequestId(_ctx.stringValue("ListQualityWatchTasksResponse.RequestId"));
		listQualityWatchTasksResponse.setSuccess(_ctx.booleanValue("ListQualityWatchTasksResponse.Success"));
		listQualityWatchTasksResponse.setHttpStatusCode(_ctx.integerValue("ListQualityWatchTasksResponse.HttpStatusCode"));
		listQualityWatchTasksResponse.setCode(_ctx.stringValue("ListQualityWatchTasksResponse.Code"));
		listQualityWatchTasksResponse.setMessage(_ctx.stringValue("ListQualityWatchTasksResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.TotalCount"));

		List<QualityWatchTask> qualityWatchTaskList = new ArrayList<QualityWatchTask>();
		for (int i = 0; i < _ctx.lengthValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList.Length"); i++) {
			QualityWatchTask qualityWatchTask = new QualityWatchTask();
			qualityWatchTask.setId(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].Id"));
			qualityWatchTask.setWatchId(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].WatchId"));
			qualityWatchTask.setStartTime(_ctx.stringValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].StartTime"));
			qualityWatchTask.setEndTime(_ctx.stringValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].EndTime"));
			qualityWatchTask.setQualityOwner(_ctx.stringValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].QualityOwner"));
			qualityWatchTask.setQualityOwnerName(_ctx.stringValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].QualityOwnerName"));
			qualityWatchTask.setStatus(_ctx.stringValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].Status"));
			qualityWatchTask.setBizDate(_ctx.stringValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].BizDate"));
			qualityWatchTask.setBizDateFormat(_ctx.stringValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].BizDateFormat"));
			qualityWatchTask.setCreator(_ctx.stringValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].Creator"));
			qualityWatchTask.setCreateTime(_ctx.stringValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].CreateTime"));
			qualityWatchTask.setModifyTime(_ctx.stringValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].ModifyTime"));
			qualityWatchTask.setModifier(_ctx.stringValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].Modifier"));

			List<Long> ruleIdList = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleIdList.Length"); j++) {
				ruleIdList.add(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleIdList["+ j +"]"));
			}
			qualityWatchTask.setRuleIdList(ruleIdList);

			RuleCountInfo ruleCountInfo = new RuleCountInfo();

			ValidateRuleCount validateRuleCount = new ValidateRuleCount();
			validateRuleCount.setTotalRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.ValidateRuleCount.TotalRuleCount"));
			validateRuleCount.setFinishedRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.ValidateRuleCount.FinishedRuleCount"));
			validateRuleCount.setErrorRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.ValidateRuleCount.ErrorRuleCount"));
			validateRuleCount.setSuccessRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.ValidateRuleCount.SuccessRuleCount"));
			ruleCountInfo.setValidateRuleCount(validateRuleCount);

			StrongRuleCount strongRuleCount = new StrongRuleCount();
			strongRuleCount.setTotalRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.StrongRuleCount.TotalRuleCount"));
			strongRuleCount.setFinishedRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.StrongRuleCount.FinishedRuleCount"));
			strongRuleCount.setErrorRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.StrongRuleCount.ErrorRuleCount"));
			strongRuleCount.setSuccessRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.StrongRuleCount.SuccessRuleCount"));
			ruleCountInfo.setStrongRuleCount(strongRuleCount);

			WeakRuleCount weakRuleCount = new WeakRuleCount();
			weakRuleCount.setTotalRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.WeakRuleCount.TotalRuleCount"));
			weakRuleCount.setFinishedRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.WeakRuleCount.FinishedRuleCount"));
			weakRuleCount.setErrorRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.WeakRuleCount.ErrorRuleCount"));
			weakRuleCount.setSuccessRuleCount(_ctx.longValue("ListQualityWatchTasksResponse.PageResult.QualityWatchTaskList["+ i +"].RuleCountInfo.WeakRuleCount.SuccessRuleCount"));
			ruleCountInfo.setWeakRuleCount(weakRuleCount);
			qualityWatchTask.setRuleCountInfo(ruleCountInfo);

			qualityWatchTaskList.add(qualityWatchTask);
		}
		pageResult.setQualityWatchTaskList(qualityWatchTaskList);
		listQualityWatchTasksResponse.setPageResult(pageResult);
	 
	 	return listQualityWatchTasksResponse;
	}
}