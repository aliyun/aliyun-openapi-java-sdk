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

import com.aliyuncs.ahas_openapi.model.v20190901.EnableHotParamRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.EnableHotParamRuleResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.EnableHotParamRuleResponse.Data.ParamFlowItemListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableHotParamRuleResponseUnmarshaller {

	public static EnableHotParamRuleResponse unmarshall(EnableHotParamRuleResponse enableHotParamRuleResponse, UnmarshallerContext _ctx) {
		
		enableHotParamRuleResponse.setRequestId(_ctx.stringValue("EnableHotParamRuleResponse.RequestId"));
		enableHotParamRuleResponse.setCode(_ctx.stringValue("EnableHotParamRuleResponse.Code"));
		enableHotParamRuleResponse.setMessage(_ctx.stringValue("EnableHotParamRuleResponse.Message"));
		enableHotParamRuleResponse.setSuccess(_ctx.booleanValue("EnableHotParamRuleResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("EnableHotParamRuleResponse.Data.AppName"));
		data.setBurstCount(_ctx.integerValue("EnableHotParamRuleResponse.Data.BurstCount"));
		data.setControlBehavior(_ctx.integerValue("EnableHotParamRuleResponse.Data.ControlBehavior"));
		data.setEnable(_ctx.booleanValue("EnableHotParamRuleResponse.Data.Enable"));
		data.setMaxQueueingTimeMs(_ctx.integerValue("EnableHotParamRuleResponse.Data.MaxQueueingTimeMs"));
		data.setMetricType(_ctx.integerValue("EnableHotParamRuleResponse.Data.MetricType"));
		data.setNamespace(_ctx.stringValue("EnableHotParamRuleResponse.Data.Namespace"));
		data.setParamIdx(_ctx.integerValue("EnableHotParamRuleResponse.Data.ParamIdx"));
		data.setResource(_ctx.stringValue("EnableHotParamRuleResponse.Data.Resource"));
		data.setRuleId(_ctx.longValue("EnableHotParamRuleResponse.Data.RuleId"));
		data.setStatDurationSec(_ctx.longValue("EnableHotParamRuleResponse.Data.StatDurationSec"));
		data.setThreshold(_ctx.floatValue("EnableHotParamRuleResponse.Data.Threshold"));

		List<ParamFlowItemListItem> paramFlowItemList = new ArrayList<ParamFlowItemListItem>();
		for (int i = 0; i < _ctx.lengthValue("EnableHotParamRuleResponse.Data.ParamFlowItemList.Length"); i++) {
			ParamFlowItemListItem paramFlowItemListItem = new ParamFlowItemListItem();
			paramFlowItemListItem.setItemType(_ctx.stringValue("EnableHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].ItemType"));
			paramFlowItemListItem.setItemValue(_ctx.stringValue("EnableHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].ItemValue"));
			paramFlowItemListItem.setThreshold(_ctx.floatValue("EnableHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].Threshold"));

			paramFlowItemList.add(paramFlowItemListItem);
		}
		data.setParamFlowItemList(paramFlowItemList);
		enableHotParamRuleResponse.setData(data);
	 
	 	return enableHotParamRuleResponse;
	}
}