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

import com.aliyuncs.ahas_openapi.model.v20190901.ListSystemRulesResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ListSystemRulesResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.ListSystemRulesResponse.Data.DatasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSystemRulesResponseUnmarshaller {

	public static ListSystemRulesResponse unmarshall(ListSystemRulesResponse listSystemRulesResponse, UnmarshallerContext _ctx) {
		
		listSystemRulesResponse.setRequestId(_ctx.stringValue("ListSystemRulesResponse.RequestId"));
		listSystemRulesResponse.setCode(_ctx.stringValue("ListSystemRulesResponse.Code"));
		listSystemRulesResponse.setMessage(_ctx.stringValue("ListSystemRulesResponse.Message"));
		listSystemRulesResponse.setSuccess(_ctx.booleanValue("ListSystemRulesResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListSystemRulesResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("ListSystemRulesResponse.Data.TotalPage"));
		data.setPageIndex(_ctx.integerValue("ListSystemRulesResponse.Data.PageIndex"));
		data.setPageSize(_ctx.integerValue("ListSystemRulesResponse.Data.PageSize"));

		List<DatasItem> datas = new ArrayList<DatasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSystemRulesResponse.Data.Datas.Length"); i++) {
			DatasItem datasItem = new DatasItem();
			datasItem.setAppName(_ctx.stringValue("ListSystemRulesResponse.Data.Datas["+ i +"].AppName"));
			datasItem.setMetricType(_ctx.integerValue("ListSystemRulesResponse.Data.Datas["+ i +"].MetricType"));
			datasItem.setThreshold(_ctx.floatValue("ListSystemRulesResponse.Data.Datas["+ i +"].Threshold"));
			datasItem.setEnable(_ctx.booleanValue("ListSystemRulesResponse.Data.Datas["+ i +"].Enable"));
			datasItem.setRuleId(_ctx.longValue("ListSystemRulesResponse.Data.Datas["+ i +"].RuleId"));
			datasItem.setNamespace(_ctx.stringValue("ListSystemRulesResponse.Data.Datas["+ i +"].Namespace"));

			datas.add(datasItem);
		}
		data.setDatas(datas);
		listSystemRulesResponse.setData(data);
	 
	 	return listSystemRulesResponse;
	}
}