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

import com.aliyuncs.ahas_openapi.model.v20190901.ListHotParamRulesOfAppResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ListHotParamRulesOfAppResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.ListHotParamRulesOfAppResponse.Data.DatasItem;
import com.aliyuncs.ahas_openapi.model.v20190901.ListHotParamRulesOfAppResponse.Data.DatasItem.ParamFlowItemListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHotParamRulesOfAppResponseUnmarshaller {

	public static ListHotParamRulesOfAppResponse unmarshall(ListHotParamRulesOfAppResponse listHotParamRulesOfAppResponse, UnmarshallerContext _ctx) {
		
		listHotParamRulesOfAppResponse.setRequestId(_ctx.stringValue("ListHotParamRulesOfAppResponse.RequestId"));
		listHotParamRulesOfAppResponse.setMessage(_ctx.stringValue("ListHotParamRulesOfAppResponse.Message"));
		listHotParamRulesOfAppResponse.setCode(_ctx.stringValue("ListHotParamRulesOfAppResponse.Code"));
		listHotParamRulesOfAppResponse.setSuccess(_ctx.booleanValue("ListHotParamRulesOfAppResponse.Success"));

		Data data = new Data();
		data.setPageIndex(_ctx.integerValue("ListHotParamRulesOfAppResponse.Data.PageIndex"));
		data.setTotalPage(_ctx.integerValue("ListHotParamRulesOfAppResponse.Data.TotalPage"));
		data.setPageSize(_ctx.integerValue("ListHotParamRulesOfAppResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListHotParamRulesOfAppResponse.Data.TotalCount"));

		List<DatasItem> datas = new ArrayList<DatasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHotParamRulesOfAppResponse.Data.Datas.Length"); i++) {
			DatasItem datasItem = new DatasItem();
			datasItem.setParamIdx(_ctx.integerValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].ParamIdx"));
			datasItem.setNamespace(_ctx.stringValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].Namespace"));
			datasItem.setStatDurationSec(_ctx.longValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].StatDurationSec"));
			datasItem.setBurstCount(_ctx.integerValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].BurstCount"));
			datasItem.setRuleId(_ctx.longValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].RuleId"));
			datasItem.setResource(_ctx.stringValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].Resource"));
			datasItem.setAppName(_ctx.stringValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].AppName"));
			datasItem.setMaxQueueingTimeMs(_ctx.integerValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].MaxQueueingTimeMs"));
			datasItem.setControlBehavior(_ctx.integerValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].ControlBehavior"));
			datasItem.setMetricType(_ctx.integerValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].MetricType"));
			datasItem.setThreshold(_ctx.floatValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].Threshold"));
			datasItem.setEnable(_ctx.booleanValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].Enable"));

			List<ParamFlowItemListItem> paramFlowItemList = new ArrayList<ParamFlowItemListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].ParamFlowItemList.Length"); j++) {
				ParamFlowItemListItem paramFlowItemListItem = new ParamFlowItemListItem();
				paramFlowItemListItem.setItemValue(_ctx.stringValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].ParamFlowItemList["+ j +"].ItemValue"));
				paramFlowItemListItem.setItemType(_ctx.stringValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].ParamFlowItemList["+ j +"].ItemType"));
				paramFlowItemListItem.setThreshold(_ctx.floatValue("ListHotParamRulesOfAppResponse.Data.Datas["+ i +"].ParamFlowItemList["+ j +"].Threshold"));

				paramFlowItemList.add(paramFlowItemListItem);
			}
			datasItem.setParamFlowItemList(paramFlowItemList);

			datas.add(datasItem);
		}
		data.setDatas(datas);
		listHotParamRulesOfAppResponse.setData(data);
	 
	 	return listHotParamRulesOfAppResponse;
	}
}