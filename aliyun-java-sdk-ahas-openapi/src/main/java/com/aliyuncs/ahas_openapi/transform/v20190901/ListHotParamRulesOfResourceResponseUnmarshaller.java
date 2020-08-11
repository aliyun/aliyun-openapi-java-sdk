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

import com.aliyuncs.ahas_openapi.model.v20190901.ListHotParamRulesOfResourceResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ListHotParamRulesOfResourceResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.ListHotParamRulesOfResourceResponse.Data.DatasItem;
import com.aliyuncs.ahas_openapi.model.v20190901.ListHotParamRulesOfResourceResponse.Data.DatasItem.ParamFlowItemListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHotParamRulesOfResourceResponseUnmarshaller {

	public static ListHotParamRulesOfResourceResponse unmarshall(ListHotParamRulesOfResourceResponse listHotParamRulesOfResourceResponse, UnmarshallerContext _ctx) {
		
		listHotParamRulesOfResourceResponse.setRequestId(_ctx.stringValue("ListHotParamRulesOfResourceResponse.RequestId"));
		listHotParamRulesOfResourceResponse.setCode(_ctx.stringValue("ListHotParamRulesOfResourceResponse.Code"));
		listHotParamRulesOfResourceResponse.setMessage(_ctx.stringValue("ListHotParamRulesOfResourceResponse.Message"));
		listHotParamRulesOfResourceResponse.setSuccess(_ctx.booleanValue("ListHotParamRulesOfResourceResponse.Success"));

		Data data = new Data();
		data.setPageIndex(_ctx.integerValue("ListHotParamRulesOfResourceResponse.Data.PageIndex"));
		data.setPageSize(_ctx.integerValue("ListHotParamRulesOfResourceResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListHotParamRulesOfResourceResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("ListHotParamRulesOfResourceResponse.Data.TotalPage"));

		List<DatasItem> datas = new ArrayList<DatasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListHotParamRulesOfResourceResponse.Data.Datas.Length"); i++) {
			DatasItem datasItem = new DatasItem();
			datasItem.setAppName(_ctx.stringValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].AppName"));
			datasItem.setBurstCount(_ctx.integerValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].BurstCount"));
			datasItem.setControlBehavior(_ctx.integerValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].ControlBehavior"));
			datasItem.setEnable(_ctx.booleanValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].Enable"));
			datasItem.setMaxQueueingTimeMs(_ctx.integerValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].MaxQueueingTimeMs"));
			datasItem.setMetricType(_ctx.integerValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].MetricType"));
			datasItem.setNamespace(_ctx.stringValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].Namespace"));
			datasItem.setParamIdx(_ctx.integerValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].ParamIdx"));
			datasItem.setResource(_ctx.stringValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].Resource"));
			datasItem.setRuleId(_ctx.longValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].RuleId"));
			datasItem.setStatDurationSec(_ctx.longValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].StatDurationSec"));
			datasItem.setThreshold(_ctx.floatValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].Threshold"));

			List<ParamFlowItemListItem> paramFlowItemList = new ArrayList<ParamFlowItemListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].ParamFlowItemList.Length"); j++) {
				ParamFlowItemListItem paramFlowItemListItem = new ParamFlowItemListItem();
				paramFlowItemListItem.setItemType(_ctx.stringValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].ParamFlowItemList["+ j +"].ItemType"));
				paramFlowItemListItem.setItemValue(_ctx.stringValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].ParamFlowItemList["+ j +"].ItemValue"));
				paramFlowItemListItem.setThreshold(_ctx.floatValue("ListHotParamRulesOfResourceResponse.Data.Datas["+ i +"].ParamFlowItemList["+ j +"].Threshold"));

				paramFlowItemList.add(paramFlowItemListItem);
			}
			datasItem.setParamFlowItemList(paramFlowItemList);

			datas.add(datasItem);
		}
		data.setDatas(datas);
		listHotParamRulesOfResourceResponse.setData(data);
	 
	 	return listHotParamRulesOfResourceResponse;
	}
}