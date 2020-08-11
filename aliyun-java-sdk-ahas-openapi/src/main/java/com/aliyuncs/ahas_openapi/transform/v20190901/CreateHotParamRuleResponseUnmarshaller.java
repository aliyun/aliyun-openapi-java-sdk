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

import com.aliyuncs.ahas_openapi.model.v20190901.CreateHotParamRuleResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.CreateHotParamRuleResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.CreateHotParamRuleResponse.Data.ParamFlowItemListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHotParamRuleResponseUnmarshaller {

	public static CreateHotParamRuleResponse unmarshall(CreateHotParamRuleResponse createHotParamRuleResponse, UnmarshallerContext _ctx) {
		
		createHotParamRuleResponse.setRequestId(_ctx.stringValue("CreateHotParamRuleResponse.RequestId"));
		createHotParamRuleResponse.setCode(_ctx.stringValue("CreateHotParamRuleResponse.Code"));
		createHotParamRuleResponse.setMessage(_ctx.stringValue("CreateHotParamRuleResponse.Message"));
		createHotParamRuleResponse.setSuccess(_ctx.booleanValue("CreateHotParamRuleResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("CreateHotParamRuleResponse.Data.AppName"));
		data.setBurstCount(_ctx.integerValue("CreateHotParamRuleResponse.Data.BurstCount"));
		data.setControlBehavior(_ctx.integerValue("CreateHotParamRuleResponse.Data.ControlBehavior"));
		data.setThreshold(_ctx.floatValue("CreateHotParamRuleResponse.Data.Threshold"));
		data.setStatDurationSec(_ctx.longValue("CreateHotParamRuleResponse.Data.StatDurationSec"));
		data.setEnable(_ctx.booleanValue("CreateHotParamRuleResponse.Data.Enable"));
		data.setMetricType(_ctx.integerValue("CreateHotParamRuleResponse.Data.MetricType"));
		data.setRuleId(_ctx.longValue("CreateHotParamRuleResponse.Data.RuleId"));
		data.setMaxQueueingTimeMs(_ctx.integerValue("CreateHotParamRuleResponse.Data.MaxQueueingTimeMs"));
		data.setNamespace(_ctx.stringValue("CreateHotParamRuleResponse.Data.Namespace"));
		data.setParamIdx(_ctx.integerValue("CreateHotParamRuleResponse.Data.ParamIdx"));
		data.setResource(_ctx.stringValue("CreateHotParamRuleResponse.Data.Resource"));

		List<ParamFlowItemListItem> paramFlowItemList = new ArrayList<ParamFlowItemListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateHotParamRuleResponse.Data.ParamFlowItemList.Length"); i++) {
			ParamFlowItemListItem paramFlowItemListItem = new ParamFlowItemListItem();
			paramFlowItemListItem.setItemType(_ctx.stringValue("CreateHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].ItemType"));
			paramFlowItemListItem.setThreshold(_ctx.floatValue("CreateHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].Threshold"));
			paramFlowItemListItem.setItemValue(_ctx.stringValue("CreateHotParamRuleResponse.Data.ParamFlowItemList["+ i +"].ItemValue"));

			paramFlowItemList.add(paramFlowItemListItem);
		}
		data.setParamFlowItemList(paramFlowItemList);
		createHotParamRuleResponse.setData(data);
	 
	 	return createHotParamRuleResponse;
	}
}