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

import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleTaskResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetQualityRuleTaskResponse.RuleTaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQualityRuleTaskResponseUnmarshaller {

	public static GetQualityRuleTaskResponse unmarshall(GetQualityRuleTaskResponse getQualityRuleTaskResponse, UnmarshallerContext _ctx) {
		
		getQualityRuleTaskResponse.setRequestId(_ctx.stringValue("GetQualityRuleTaskResponse.RequestId"));
		getQualityRuleTaskResponse.setSuccess(_ctx.booleanValue("GetQualityRuleTaskResponse.Success"));
		getQualityRuleTaskResponse.setHttpStatusCode(_ctx.integerValue("GetQualityRuleTaskResponse.HttpStatusCode"));
		getQualityRuleTaskResponse.setCode(_ctx.stringValue("GetQualityRuleTaskResponse.Code"));
		getQualityRuleTaskResponse.setMessage(_ctx.stringValue("GetQualityRuleTaskResponse.Message"));

		RuleTaskInfo ruleTaskInfo = new RuleTaskInfo();
		ruleTaskInfo.setWatchId(_ctx.longValue("GetQualityRuleTaskResponse.RuleTaskInfo.WatchId"));
		ruleTaskInfo.setWatchTaskId(_ctx.longValue("GetQualityRuleTaskResponse.RuleTaskInfo.WatchTaskId"));
		ruleTaskInfo.setId(_ctx.longValue("GetQualityRuleTaskResponse.RuleTaskInfo.Id"));
		ruleTaskInfo.setRuleId(_ctx.longValue("GetQualityRuleTaskResponse.RuleTaskInfo.RuleId"));
		ruleTaskInfo.setTemplateId(_ctx.longValue("GetQualityRuleTaskResponse.RuleTaskInfo.TemplateId"));
		ruleTaskInfo.setStatus(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.Status"));
		ruleTaskInfo.setStartTime(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.StartTime"));
		ruleTaskInfo.setEndTime(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.EndTime"));
		ruleTaskInfo.setValidatePartition(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.ValidatePartition"));
		ruleTaskInfo.setValidateObjectType(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.ValidateObjectType"));
		ruleTaskInfo.setValidateObjectName(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.ValidateObjectName"));
		ruleTaskInfo.setValidateSuccess(_ctx.booleanValue("GetQualityRuleTaskResponse.RuleTaskInfo.ValidateSuccess"));
		ruleTaskInfo.setBizDate(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.BizDate"));
		ruleTaskInfo.setBizDateFormat(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.BizDateFormat"));
		ruleTaskInfo.setCreator(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.Creator"));
		ruleTaskInfo.setCreateTime(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.CreateTime"));
		ruleTaskInfo.setModifyTime(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.ModifyTime"));
		ruleTaskInfo.setModifier(_ctx.stringValue("GetQualityRuleTaskResponse.RuleTaskInfo.Modifier"));
		getQualityRuleTaskResponse.setRuleTaskInfo(ruleTaskInfo);
	 
	 	return getQualityRuleTaskResponse;
	}
}