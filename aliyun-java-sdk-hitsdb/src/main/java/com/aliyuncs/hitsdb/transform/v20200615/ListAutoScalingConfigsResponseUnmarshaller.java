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

package com.aliyuncs.hitsdb.transform.v20200615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hitsdb.model.v20200615.ListAutoScalingConfigsResponse;
import com.aliyuncs.hitsdb.model.v20200615.ListAutoScalingConfigsResponse.Data;
import com.aliyuncs.hitsdb.model.v20200615.ListAutoScalingConfigsResponse.Data.ScaleConfig;
import com.aliyuncs.hitsdb.model.v20200615.ListAutoScalingConfigsResponse.Data.ScaleConfig.ScaleRuleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAutoScalingConfigsResponseUnmarshaller {

	public static ListAutoScalingConfigsResponse unmarshall(ListAutoScalingConfigsResponse listAutoScalingConfigsResponse, UnmarshallerContext _ctx) {
		
		listAutoScalingConfigsResponse.setRequestId(_ctx.stringValue("ListAutoScalingConfigsResponse.RequestId"));
		listAutoScalingConfigsResponse.setDynamicCode(_ctx.stringValue("ListAutoScalingConfigsResponse.DynamicCode"));
		listAutoScalingConfigsResponse.setDynamicMessage(_ctx.stringValue("ListAutoScalingConfigsResponse.DynamicMessage"));
		listAutoScalingConfigsResponse.setAccessDeniedDetail(_ctx.stringValue("ListAutoScalingConfigsResponse.AccessDeniedDetail"));
		listAutoScalingConfigsResponse.setSuccess(_ctx.booleanValue("ListAutoScalingConfigsResponse.Success"));
		listAutoScalingConfigsResponse.setCode(_ctx.stringValue("ListAutoScalingConfigsResponse.Code"));
		listAutoScalingConfigsResponse.setMessage(_ctx.stringValue("ListAutoScalingConfigsResponse.Message"));
		listAutoScalingConfigsResponse.setHttpStatusCode(_ctx.integerValue("ListAutoScalingConfigsResponse.HttpStatusCode"));

		Data data = new Data();

		List<ScaleConfig> scaleConfigs = new ArrayList<ScaleConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs.Length"); i++) {
			ScaleConfig scaleConfig = new ScaleConfig();
			scaleConfig.setInstanceId(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].InstanceId"));
			scaleConfig.setConfigId(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ConfigId"));
			scaleConfig.setConfigName(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ConfigName"));
			scaleConfig.setEngine(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].Engine"));
			scaleConfig.setSpecId(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].SpecId"));
			scaleConfig.setScaleType(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleType"));
			scaleConfig.setEnabled(_ctx.booleanValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].Enabled"));
			scaleConfig.setEffectiveTimeStart(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].EffectiveTimeStart"));
			scaleConfig.setEffectiveTimeEnd(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].EffectiveTimeEnd"));
			scaleConfig.setNodesMin(_ctx.integerValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].NodesMin"));
			scaleConfig.setNodesMax(_ctx.integerValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].NodesMax"));
			scaleConfig.setStorageCapacityMax(_ctx.longValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].StorageCapacityMax"));

			List<ScaleRuleListItem> scaleRuleList = new ArrayList<ScaleRuleListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList.Length"); j++) {
				ScaleRuleListItem scaleRuleListItem = new ScaleRuleListItem();
				scaleRuleListItem.setInstanceId(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].InstanceId"));
				scaleRuleListItem.setConfigId(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].ConfigId"));
				scaleRuleListItem.setRuleId(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].RuleId"));
				scaleRuleListItem.setRuleName(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].RuleName"));
				scaleRuleListItem.setRuleType(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].RuleType"));
				scaleRuleListItem.setEnabled(_ctx.booleanValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].Enabled"));
				scaleRuleListItem.setOperationType(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].OperationType"));
				scaleRuleListItem.setTriggerCronExpr(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].TriggerCronExpr"));
				scaleRuleListItem.setTargetNodes(_ctx.integerValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].TargetNodes"));
				scaleRuleListItem.setTargetMetric(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].TargetMetric"));
				scaleRuleListItem.setThresholdLower(_ctx.integerValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].ThresholdLower"));
				scaleRuleListItem.setThresholdUpper(_ctx.integerValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].ThresholdUpper"));
				scaleRuleListItem.setObservationWindow(_ctx.integerValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].ObservationWindow"));
				scaleRuleListItem.setSilenceTime(_ctx.integerValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].SilenceTime"));
				scaleRuleListItem.setScaleOutStep(_ctx.integerValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].ScaleOutStep"));
				scaleRuleListItem.setScaleInStep(_ctx.integerValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].ScaleInStep"));
				scaleRuleListItem.setStartTime(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].StartTime"));
				scaleRuleListItem.setEndTime(_ctx.stringValue("ListAutoScalingConfigsResponse.Data.ScaleConfigs["+ i +"].ScaleRuleList["+ j +"].EndTime"));

				scaleRuleList.add(scaleRuleListItem);
			}
			scaleConfig.setScaleRuleList(scaleRuleList);

			scaleConfigs.add(scaleConfig);
		}
		data.setScaleConfigs(scaleConfigs);
		listAutoScalingConfigsResponse.setData(data);
	 
	 	return listAutoScalingConfigsResponse;
	}
}