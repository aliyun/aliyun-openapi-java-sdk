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

import com.aliyuncs.ahas_openapi.model.v20190901.DisableHotParamRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.DisableHotParamRuleResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.DisableHotParamRuleResponse.Data.ParamFlowItemListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableHotParamRuleResponseUnmarshaller {

	public static DisableHotParamRuleResponse unmarshall(DisableHotParamRuleResponse disableHotParamRuleResponse, UnmarshallerContext _ctx) {
		
		disableHotParamRuleResponse.setRequestId(_ctx.stringValue("DisableHotParamRuleResponse.RequestId"));
		disableHotParamRuleResponse.setCode(_ctx.stringValue("DisableHotParamRuleResponse.Code"));
		disableHotParamRuleResponse.setMessage(_ctx.stringValue("DisableHotParamRuleResponse.Message"));
		disableHotParamRuleResponse.setSuccess(_ctx.booleanValue("DisableHotParamRuleResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("DisableHotParamRuleResponse.Data.AppName"));
		data.setBurstCount(_ctx.integerValue("DisableHotParamRuleResponse.Data.BurstCount"));
		data.setControlBehavior(_ctx.integerValue("DisableHotParamRuleResponse.Data.ControlBehavior"));
		data.setEnable(_ctx.booleanValue("DisableHotParamRuleResponse.Data.Enable"));
		data.setMaxQueueingTimeMs(_ctx.integerValue("DisableHotParamRuleResponse.Data.MaxQueueingTimeMs"));
		data.setMetricType(_ctx.integerValue("DisableHotParamRuleResponse.Data.MetricType"));
		data.setNamespace(_ctx.stringValue("DisableHotParamRuleResponse.Data.Namespace"));
		data.setParamIdx(_ctx.integerValue("DisableHotParamRuleResponse.Data.ParamIdx"));
		data.setResource(_ctx.stringValue("DisableHotParamRuleResponse.Data.Resource"));
		data.setRuleId(_ctx.longValue("DisableHotParamRuleResponse.Data.RuleId"));
		data.setStatDurationSec(_ctx.longValue("DisableHotParamRuleResponse.Data.StatDurationSec"));
		data.setThreshold(_ctx.floatValue("DisableHotParamRuleResponse.Data.Threshold"));

		List<ParamFlowItemListItem> paramFlowItemList = new ArrayList<ParamFlowItemListItem>();
		for (int i = 0; i < _ctx.lengthValue("DisableHotParamRuleResponse.Data.ParamFlowItemList.Length"); i++) {
			ParamFlowItemListItem paramFlowItemListItem = new ParamFlowItemListItem();
			paramFlowItemListItem.setItemType(_ctx.stringValue("DisableHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].ItemType"));
			paramFlowItemListItem.setItemValue(_ctx.stringValue("DisableHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].ItemValue"));
			paramFlowItemListItem.setThreshold(_ctx.floatValue("DisableHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].Threshold"));

			paramFlowItemList.add(paramFlowItemListItem);
		}
		data.setParamFlowItemList(paramFlowItemList);
		disableHotParamRuleResponse.setData(data);
	 
	 	return disableHotParamRuleResponse;
	}
}