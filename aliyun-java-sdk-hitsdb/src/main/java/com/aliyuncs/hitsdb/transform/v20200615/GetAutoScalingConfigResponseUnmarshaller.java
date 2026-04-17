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

import com.aliyuncs.hitsdb.model.v20200615.GetAutoScalingConfigResponse;
import com.aliyuncs.hitsdb.model.v20200615.GetAutoScalingConfigResponse.Data;
import com.aliyuncs.hitsdb.model.v20200615.GetAutoScalingConfigResponse.Data.ScaleRuleListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoScalingConfigResponseUnmarshaller {

	public static GetAutoScalingConfigResponse unmarshall(GetAutoScalingConfigResponse getAutoScalingConfigResponse, UnmarshallerContext _ctx) {
		
		getAutoScalingConfigResponse.setRequestId(_ctx.stringValue("GetAutoScalingConfigResponse.RequestId"));
		getAutoScalingConfigResponse.setDynamicCode(_ctx.stringValue("GetAutoScalingConfigResponse.DynamicCode"));
		getAutoScalingConfigResponse.setDynamicMessage(_ctx.stringValue("GetAutoScalingConfigResponse.DynamicMessage"));
		getAutoScalingConfigResponse.setAccessDeniedDetail(_ctx.stringValue("GetAutoScalingConfigResponse.AccessDeniedDetail"));
		getAutoScalingConfigResponse.setSuccess(_ctx.booleanValue("GetAutoScalingConfigResponse.Success"));
		getAutoScalingConfigResponse.setCode(_ctx.stringValue("GetAutoScalingConfigResponse.Code"));
		getAutoScalingConfigResponse.setMessage(_ctx.stringValue("GetAutoScalingConfigResponse.Message"));
		getAutoScalingConfigResponse.setHttpStatusCode(_ctx.integerValue("GetAutoScalingConfigResponse.HttpStatusCode"));

		Data data = new Data();
		data.setInstanceId(_ctx.stringValue("GetAutoScalingConfigResponse.Data.InstanceId"));
		data.setConfigId(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ConfigId"));
		data.setConfigName(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ConfigName"));
		data.setEngine(_ctx.stringValue("GetAutoScalingConfigResponse.Data.Engine"));
		data.setSpecId(_ctx.stringValue("GetAutoScalingConfigResponse.Data.SpecId"));
		data.setScaleType(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ScaleType"));
		data.setEnabled(_ctx.booleanValue("GetAutoScalingConfigResponse.Data.Enabled"));
		data.setEffectiveTimeStart(_ctx.stringValue("GetAutoScalingConfigResponse.Data.EffectiveTimeStart"));
		data.setEffectiveTimeEnd(_ctx.stringValue("GetAutoScalingConfigResponse.Data.EffectiveTimeEnd"));
		data.setNodesMin(_ctx.integerValue("GetAutoScalingConfigResponse.Data.NodesMin"));
		data.setNodesMax(_ctx.integerValue("GetAutoScalingConfigResponse.Data.NodesMax"));

		List<ScaleRuleListItem> scaleRuleList = new ArrayList<ScaleRuleListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoScalingConfigResponse.Data.ScaleRuleList.Length"); i++) {
			ScaleRuleListItem scaleRuleListItem = new ScaleRuleListItem();
			scaleRuleListItem.setInstanceId(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].InstanceId"));
			scaleRuleListItem.setConfigId(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].ConfigId"));
			scaleRuleListItem.setRuleId(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].RuleId"));
			scaleRuleListItem.setRuleName(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].RuleName"));
			scaleRuleListItem.setRuleType(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].RuleType"));
			scaleRuleListItem.setEnabled(_ctx.booleanValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].Enabled"));
			scaleRuleListItem.setOperationType(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].OperationType"));
			scaleRuleListItem.setTriggerCronExpr(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].TriggerCronExpr"));
			scaleRuleListItem.setTargetNodes(_ctx.integerValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].TargetNodes"));
			scaleRuleListItem.setTargetMetric(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].TargetMetric"));
			scaleRuleListItem.setThresholdLower(_ctx.integerValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].ThresholdLower"));
			scaleRuleListItem.setThresholdUpper(_ctx.integerValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].ThresholdUpper"));
			scaleRuleListItem.setObservationWindow(_ctx.integerValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].ObservationWindow"));
			scaleRuleListItem.setSilenceTime(_ctx.integerValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].SilenceTime"));
			scaleRuleListItem.setScaleOutStep(_ctx.integerValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].ScaleOutStep"));
			scaleRuleListItem.setScaleInStep(_ctx.integerValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].ScaleInStep"));
			scaleRuleListItem.setStartTime(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].StartTime"));
			scaleRuleListItem.setEndTime(_ctx.stringValue("GetAutoScalingConfigResponse.Data.ScaleRuleList["+ i +"].EndTime"));

			scaleRuleList.add(scaleRuleListItem);
		}
		data.setScaleRuleList(scaleRuleList);
		getAutoScalingConfigResponse.setData(data);
	 
	 	return getAutoScalingConfigResponse;
	}
}