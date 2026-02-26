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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.GetAutoScalingConfigurationResponse;
import com.aliyuncs.alikafka.model.v20190916.GetAutoScalingConfigurationResponse.Data;
import com.aliyuncs.alikafka.model.v20190916.GetAutoScalingConfigurationResponse.Data.ScheduledScalingRulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoScalingConfigurationResponseUnmarshaller {

	public static GetAutoScalingConfigurationResponse unmarshall(GetAutoScalingConfigurationResponse getAutoScalingConfigurationResponse, UnmarshallerContext _ctx) {
		
		getAutoScalingConfigurationResponse.setRequestId(_ctx.stringValue("GetAutoScalingConfigurationResponse.RequestId"));
		getAutoScalingConfigurationResponse.setSuccess(_ctx.booleanValue("GetAutoScalingConfigurationResponse.Success"));
		getAutoScalingConfigurationResponse.setCode(_ctx.longValue("GetAutoScalingConfigurationResponse.Code"));
		getAutoScalingConfigurationResponse.setMessage(_ctx.stringValue("GetAutoScalingConfigurationResponse.Message"));

		Data data = new Data();

		List<ScheduledScalingRulesItem> scheduledScalingRules = new ArrayList<ScheduledScalingRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules.Length"); i++) {
			ScheduledScalingRulesItem scheduledScalingRulesItem = new ScheduledScalingRulesItem();
			scheduledScalingRulesItem.setDurationMinutes(_ctx.longValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].DurationMinutes"));
			scheduledScalingRulesItem.setEnable(_ctx.booleanValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].Enable"));
			scheduledScalingRulesItem.setEstimatedElasticScalingDownTimeSecs(_ctx.longValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].EstimatedElasticScalingDownTimeSecs"));
			scheduledScalingRulesItem.setEstimatedElasticScalingUpTimeSecs(_ctx.longValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].EstimatedElasticScalingUpTimeSecs"));
			scheduledScalingRulesItem.setFirstScheduledTime(_ctx.longValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].FirstScheduledTime"));
			scheduledScalingRulesItem.setRepeatType(_ctx.stringValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].RepeatType"));
			scheduledScalingRulesItem.setReservedPubFlow(_ctx.longValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].ReservedPubFlow"));
			scheduledScalingRulesItem.setReservedSubFlow(_ctx.longValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].ReservedSubFlow"));
			scheduledScalingRulesItem.setRuleId(_ctx.longValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].RuleId"));
			scheduledScalingRulesItem.setRuleName(_ctx.stringValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].RuleName"));
			scheduledScalingRulesItem.setScheduleType(_ctx.stringValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].ScheduleType"));
			scheduledScalingRulesItem.setTimeZone(_ctx.stringValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].TimeZone"));

			List<String> weeklyTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].WeeklyTypes.Length"); j++) {
				weeklyTypes.add(_ctx.stringValue("GetAutoScalingConfigurationResponse.Data.ScheduledScalingRules["+ i +"].WeeklyTypes["+ j +"]"));
			}
			scheduledScalingRulesItem.setWeeklyTypes(weeklyTypes);

			scheduledScalingRules.add(scheduledScalingRulesItem);
		}
		data.setScheduledScalingRules(scheduledScalingRules);
		getAutoScalingConfigurationResponse.setData(data);
	 
	 	return getAutoScalingConfigurationResponse;
	}
}