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

import com.aliyuncs.dataphin_public.model.v20230630.ListScheduleTemplatesResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListScheduleTemplatesResponse.ListScheduleTemplatesResponse1;
import com.aliyuncs.dataphin_public.model.v20230630.ListScheduleTemplatesResponse.ListScheduleTemplatesResponse1.ScheduleTemplate;
import com.aliyuncs.dataphin_public.model.v20230630.ListScheduleTemplatesResponse.ListScheduleTemplatesResponse1.ScheduleTemplate.ConditionScheduleParam;
import com.aliyuncs.dataphin_public.model.v20230630.ListScheduleTemplatesResponse.ListScheduleTemplatesResponse1.ScheduleTemplate.CustomIntervalConfig;
import com.aliyuncs.dataphin_public.model.v20230630.ListScheduleTemplatesResponse.ListScheduleTemplatesResponse1.ScheduleTemplate.CustomIntervalConfig2;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScheduleTemplatesResponseUnmarshaller {

	public static ListScheduleTemplatesResponse unmarshall(ListScheduleTemplatesResponse listScheduleTemplatesResponse, UnmarshallerContext _ctx) {
		
		listScheduleTemplatesResponse.setRequestId(_ctx.stringValue("ListScheduleTemplatesResponse.RequestId"));
		listScheduleTemplatesResponse.setMessage(_ctx.stringValue("ListScheduleTemplatesResponse.Message"));
		listScheduleTemplatesResponse.setHttpStatusCode(_ctx.integerValue("ListScheduleTemplatesResponse.HttpStatusCode"));
		listScheduleTemplatesResponse.setCode(_ctx.stringValue("ListScheduleTemplatesResponse.Code"));
		listScheduleTemplatesResponse.setSuccess(_ctx.booleanValue("ListScheduleTemplatesResponse.Success"));

		ListScheduleTemplatesResponse1 listScheduleTemplatesResponse1 = new ListScheduleTemplatesResponse1();
		listScheduleTemplatesResponse1.setCount(_ctx.integerValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.Count"));

		List<ScheduleTemplate> resultData = new ArrayList<ScheduleTemplate>();
		for (int i = 0; i < _ctx.lengthValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData.Length"); i++) {
			ScheduleTemplate scheduleTemplate = new ScheduleTemplate();
			scheduleTemplate.setScheduleTemplateId(_ctx.longValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ScheduleTemplateId"));
			scheduleTemplate.setScheduleType(_ctx.integerValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ScheduleType"));
			scheduleTemplate.setValidStartDate(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ValidStartDate"));
			scheduleTemplate.setScheduleTemplateType(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ScheduleTemplateType"));
			scheduleTemplate.setScheduleTemplateDesc(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ScheduleTemplateDesc"));
			scheduleTemplate.setUserName(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].UserName"));
			scheduleTemplate.setModifierName(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ModifierName"));
			scheduleTemplate.setCustomIntervalConfigType(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfigType"));
			scheduleTemplate.setValidEndDate(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ValidEndDate"));
			scheduleTemplate.setTenantId(_ctx.longValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].TenantId"));
			scheduleTemplate.setGmtCreate(_ctx.longValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].GmtCreate"));
			scheduleTemplate.setCustomCronExpression(_ctx.booleanValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomCronExpression"));
			scheduleTemplate.setScheduleIntervalType(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ScheduleIntervalType"));
			scheduleTemplate.setUserId(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].UserId"));
			scheduleTemplate.setGmtModify(_ctx.longValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].GmtModify"));
			scheduleTemplate.setHasReference(_ctx.booleanValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].HasReference"));
			scheduleTemplate.setScheduleTemplateName(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ScheduleTemplateName"));
			scheduleTemplate.setCronExpression(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CronExpression"));
			scheduleTemplate.setModifierId(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ModifierId"));

			CustomIntervalConfig2 customIntervalConfig2 = new CustomIntervalConfig2();
			customIntervalConfig2.setIntervalUnit(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfig.IntervalUnit"));
			customIntervalConfig2.setEndTime(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfig.EndTime"));
			customIntervalConfig2.setSchedulePeriod(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfig.SchedulePeriod"));
			customIntervalConfig2.setStartTime(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfig.StartTime"));
			customIntervalConfig2.setInterval(_ctx.integerValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfig.Interval"));
			scheduleTemplate.setCustomIntervalConfig2(customIntervalConfig2);

			List<ConditionScheduleParam> conditionScheduleParamList = new ArrayList<ConditionScheduleParam>();
			for (int j = 0; j < _ctx.lengthValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ConditionScheduleParamList.Length"); j++) {
				ConditionScheduleParam conditionScheduleParam = new ConditionScheduleParam();
				conditionScheduleParam.setScheduleTime(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ConditionScheduleParamList["+ j +"].ScheduleTime"));
				conditionScheduleParam.setEnable(_ctx.booleanValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ConditionScheduleParamList["+ j +"].Enable"));
				conditionScheduleParam.setCronExpression(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ConditionScheduleParamList["+ j +"].CronExpression"));
				conditionScheduleParam.setConditionName(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ConditionScheduleParamList["+ j +"].ConditionName"));
				conditionScheduleParam.setFollowScheduleParam(_ctx.booleanValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ConditionScheduleParamList["+ j +"].FollowScheduleParam"));
				conditionScheduleParam.setNodeStatus(_ctx.integerValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ConditionScheduleParamList["+ j +"].NodeStatus"));
				conditionScheduleParam.setScheduleConditionJson(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].ConditionScheduleParamList["+ j +"].ScheduleConditionJson"));

				conditionScheduleParamList.add(conditionScheduleParam);
			}
			scheduleTemplate.setConditionScheduleParamList(conditionScheduleParamList);

			List<CustomIntervalConfig> customIntervalConfigs = new ArrayList<CustomIntervalConfig>();
			for (int j = 0; j < _ctx.lengthValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfigs.Length"); j++) {
				CustomIntervalConfig customIntervalConfig = new CustomIntervalConfig();
				customIntervalConfig.setIntervalUnit(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfigs["+ j +"].IntervalUnit"));
				customIntervalConfig.setEndTime(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfigs["+ j +"].EndTime"));
				customIntervalConfig.setSchedulePeriod(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfigs["+ j +"].SchedulePeriod"));
				customIntervalConfig.setStartTime(_ctx.stringValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfigs["+ j +"].StartTime"));
				customIntervalConfig.setInterval(_ctx.integerValue("ListScheduleTemplatesResponse.ListScheduleTemplatesResponse.ResultData["+ i +"].CustomIntervalConfigs["+ j +"].Interval"));

				customIntervalConfigs.add(customIntervalConfig);
			}
			scheduleTemplate.setCustomIntervalConfigs(customIntervalConfigs);

			resultData.add(scheduleTemplate);
		}
		listScheduleTemplatesResponse1.setResultData(resultData);
		listScheduleTemplatesResponse.setListScheduleTemplatesResponse1(listScheduleTemplatesResponse1);
	 
	 	return listScheduleTemplatesResponse;
	}
}