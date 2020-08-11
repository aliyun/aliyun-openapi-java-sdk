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

import com.aliyuncs.ahas_openapi.model.v20190901.ListIsolationRulesOfResourceResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ListIsolationRulesOfResourceResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.ListIsolationRulesOfResourceResponse.Data.DatasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIsolationRulesOfResourceResponseUnmarshaller {

	public static ListIsolationRulesOfResourceResponse unmarshall(ListIsolationRulesOfResourceResponse listIsolationRulesOfResourceResponse, UnmarshallerContext _ctx) {
		
		listIsolationRulesOfResourceResponse.setRequestId(_ctx.stringValue("ListIsolationRulesOfResourceResponse.RequestId"));
		listIsolationRulesOfResourceResponse.setCode(_ctx.stringValue("ListIsolationRulesOfResourceResponse.Code"));
		listIsolationRulesOfResourceResponse.setMessage(_ctx.stringValue("ListIsolationRulesOfResourceResponse.Message"));
		listIsolationRulesOfResourceResponse.setSuccess(_ctx.booleanValue("ListIsolationRulesOfResourceResponse.Success"));

		Data data = new Data();
		data.setPageIndex(_ctx.integerValue("ListIsolationRulesOfResourceResponse.Data.PageIndex"));
		data.setPageSize(_ctx.integerValue("ListIsolationRulesOfResourceResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListIsolationRulesOfResourceResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("ListIsolationRulesOfResourceResponse.Data.TotalPage"));

		List<DatasItem> datas = new ArrayList<DatasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIsolationRulesOfResourceResponse.Data.Datas.Length"); i++) {
			DatasItem datasItem = new DatasItem();
			datasItem.setAppName(_ctx.stringValue("ListIsolationRulesOfResourceResponse.Data.Datas["+ i +"].AppName"));
			datasItem.setThreshold(_ctx.floatValue("ListIsolationRulesOfResourceResponse.Data.Datas["+ i +"].Threshold"));
			datasItem.setEnable(_ctx.booleanValue("ListIsolationRulesOfResourceResponse.Data.Datas["+ i +"].Enable"));
			datasItem.setLimitOrigin(_ctx.stringValue("ListIsolationRulesOfResourceResponse.Data.Datas["+ i +"].LimitOrigin"));
			datasItem.setNamespace(_ctx.stringValue("ListIsolationRulesOfResourceResponse.Data.Datas["+ i +"].Namespace"));
			datasItem.setRefResource(_ctx.stringValue("ListIsolationRulesOfResourceResponse.Data.Datas["+ i +"].RefResource"));
			datasItem.setRelationStrategy(_ctx.integerValue("ListIsolationRulesOfResourceResponse.Data.Datas["+ i +"].RelationStrategy"));
			datasItem.setResource(_ctx.stringValue("ListIsolationRulesOfResourceResponse.Data.Datas["+ i +"].Resource"));
			datasItem.setRuleId(_ctx.longValue("ListIsolationRulesOfResourceResponse.Data.Datas["+ i +"].RuleId"));

			datas.add(datasItem);
		}
		data.setDatas(datas);
		listIsolationRulesOfResourceResponse.setData(data);
	 
	 	return listIsolationRulesOfResourceResponse;
	}
}