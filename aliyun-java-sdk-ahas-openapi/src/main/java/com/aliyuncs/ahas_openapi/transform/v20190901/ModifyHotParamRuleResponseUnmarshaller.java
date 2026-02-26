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

import com.aliyuncs.ahas_openapi.model.v20190901.ModifyHotParamRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ModifyHotParamRuleResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.ModifyHotParamRuleResponse.Data.ParamFlowItemListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyHotParamRuleResponseUnmarshaller {

	public static ModifyHotParamRuleResponse unmarshall(ModifyHotParamRuleResponse modifyHotParamRuleResponse, UnmarshallerContext _ctx) {
		
		modifyHotParamRuleResponse.setRequestId(_ctx.stringValue("ModifyHotParamRuleResponse.RequestId"));
		modifyHotParamRuleResponse.setMessage(_ctx.stringValue("ModifyHotParamRuleResponse.Message"));
		modifyHotParamRuleResponse.setCode(_ctx.stringValue("ModifyHotParamRuleResponse.Code"));
		modifyHotParamRuleResponse.setSuccess(_ctx.booleanValue("ModifyHotParamRuleResponse.Success"));

		Data data = new Data();
		data.setParamIdx(_ctx.integerValue("ModifyHotParamRuleResponse.Data.ParamIdx"));
		data.setNamespace(_ctx.stringValue("ModifyHotParamRuleResponse.Data.Namespace"));
		data.setStatDurationSec(_ctx.longValue("ModifyHotParamRuleResponse.Data.StatDurationSec"));
		data.setBurstCount(_ctx.integerValue("ModifyHotParamRuleResponse.Data.BurstCount"));
		data.setRuleId(_ctx.longValue("ModifyHotParamRuleResponse.Data.RuleId"));
		data.setResource(_ctx.stringValue("ModifyHotParamRuleResponse.Data.Resource"));
		data.setAppName(_ctx.stringValue("ModifyHotParamRuleResponse.Data.AppName"));
		data.setMaxQueueingTimeMs(_ctx.integerValue("ModifyHotParamRuleResponse.Data.MaxQueueingTimeMs"));
		data.setControlBehavior(_ctx.integerValue("ModifyHotParamRuleResponse.Data.ControlBehavior"));
		data.setMetricType(_ctx.integerValue("ModifyHotParamRuleResponse.Data.MetricType"));
		data.setThreshold(_ctx.floatValue("ModifyHotParamRuleResponse.Data.Threshold"));
		data.setEnable(_ctx.booleanValue("ModifyHotParamRuleResponse.Data.Enable"));

		List<ParamFlowItemListItem> paramFlowItemList = new ArrayList<ParamFlowItemListItem>();
		for (int i = 0; i < _ctx.lengthValue("ModifyHotParamRuleResponse.Data.ParamFlowItemList.Length"); i++) {
			ParamFlowItemListItem paramFlowItemListItem = new ParamFlowItemListItem();
			paramFlowItemListItem.setItemValue(_ctx.stringValue("ModifyHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].ItemValue"));
			paramFlowItemListItem.setItemType(_ctx.stringValue("ModifyHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].ItemType"));
			paramFlowItemListItem.setThreshold(_ctx.floatValue("ModifyHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].Threshold"));

			paramFlowItemList.add(paramFlowItemListItem);
		}
		data.setParamFlowItemList(paramFlowItemList);
		modifyHotParamRuleResponse.setData(data);
	 
	 	return modifyHotParamRuleResponse;
	}
}