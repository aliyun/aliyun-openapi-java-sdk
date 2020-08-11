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

import com.aliyuncs.ahas_openapi.model.v20190901.CreateHotParamItemsResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.CreateHotParamItemsResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.CreateHotParamItemsResponse.Data.ParamFlowItemListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateHotParamItemsResponseUnmarshaller {

	public static CreateHotParamItemsResponse unmarshall(CreateHotParamItemsResponse createHotParamItemsResponse, UnmarshallerContext _ctx) {
		
		createHotParamItemsResponse.setRequestId(_ctx.stringValue("CreateHotParamItemsResponse.RequestId"));
		createHotParamItemsResponse.setCode(_ctx.stringValue("CreateHotParamItemsResponse.Code"));
		createHotParamItemsResponse.setMessage(_ctx.stringValue("CreateHotParamItemsResponse.Message"));
		createHotParamItemsResponse.setSuccess(_ctx.booleanValue("CreateHotParamItemsResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("CreateHotParamItemsResponse.Data.AppName"));
		data.setBurstCount(_ctx.integerValue("CreateHotParamItemsResponse.Data.BurstCount"));
		data.setControlBehavior(_ctx.integerValue("CreateHotParamItemsResponse.Data.ControlBehavior"));
		data.setEnable(_ctx.booleanValue("CreateHotParamItemsResponse.Data.Enable"));
		data.setMaxQueueingTimeMs(_ctx.integerValue("CreateHotParamItemsResponse.Data.MaxQueueingTimeMs"));
		data.setMetricType(_ctx.integerValue("CreateHotParamItemsResponse.Data.MetricType"));
		data.setNamespace(_ctx.stringValue("CreateHotParamItemsResponse.Data.Namespace"));
		data.setParamIdx(_ctx.integerValue("CreateHotParamItemsResponse.Data.ParamIdx"));
		data.setResource(_ctx.stringValue("CreateHotParamItemsResponse.Data.Resource"));
		data.setRuleId(_ctx.longValue("CreateHotParamItemsResponse.Data.RuleId"));
		data.setStatDurationSec(_ctx.longValue("CreateHotParamItemsResponse.Data.StatDurationSec"));
		data.setThreshold(_ctx.floatValue("CreateHotParamItemsResponse.Data.Threshold"));

		List<ParamFlowItemListItem> paramFlowItemList = new ArrayList<ParamFlowItemListItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateHotParamItemsResponse.Data.ParamFlowItemList.Length"); i++) {
			ParamFlowItemListItem paramFlowItemListItem = new ParamFlowItemListItem();
			paramFlowItemListItem.setItemType(_ctx.stringValue("CreateHotParamItemsResponse.Data.ParamFlowItemList["+ i +"].ItemType"));
			paramFlowItemListItem.setItemValue(_ctx.stringValue("CreateHotParamItemsResponse.Data.ParamFlowItemList["+ i +"].ItemValue"));
			paramFlowItemListItem.setThreshold(_ctx.floatValue("CreateHotParamItemsResponse.Data.ParamFlowItemList["+ i +"].Threshold"));

			paramFlowItemList.add(paramFlowItemListItem);
		}
		data.setParamFlowItemList(paramFlowItemList);
		createHotParamItemsResponse.setData(data);
	 
	 	return createHotParamItemsResponse;
	}
}