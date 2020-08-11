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

import com.aliyuncs.ahas_openapi.model.v20190901.ListIsolationRulesOfAppResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ListIsolationRulesOfAppResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.ListIsolationRulesOfAppResponse.Data.DatasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIsolationRulesOfAppResponseUnmarshaller {

	public static ListIsolationRulesOfAppResponse unmarshall(ListIsolationRulesOfAppResponse listIsolationRulesOfAppResponse, UnmarshallerContext _ctx) {
		
		listIsolationRulesOfAppResponse.setRequestId(_ctx.stringValue("ListIsolationRulesOfAppResponse.RequestId"));
		listIsolationRulesOfAppResponse.setCode(_ctx.stringValue("ListIsolationRulesOfAppResponse.Code"));
		listIsolationRulesOfAppResponse.setMessage(_ctx.stringValue("ListIsolationRulesOfAppResponse.Message"));
		listIsolationRulesOfAppResponse.setSuccess(_ctx.booleanValue("ListIsolationRulesOfAppResponse.Success"));

		Data data = new Data();
		data.setPageIndex(_ctx.integerValue("ListIsolationRulesOfAppResponse.Data.PageIndex"));
		data.setPageSize(_ctx.integerValue("ListIsolationRulesOfAppResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListIsolationRulesOfAppResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("ListIsolationRulesOfAppResponse.Data.TotalPage"));

		List<DatasItem> datas = new ArrayList<DatasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIsolationRulesOfAppResponse.Data.Datas.Length"); i++) {
			DatasItem datasItem = new DatasItem();
			datasItem.setAppName(_ctx.stringValue("ListIsolationRulesOfAppResponse.Data.Datas["+ i +"].AppName"));
			datasItem.setThreshold(_ctx.floatValue("ListIsolationRulesOfAppResponse.Data.Datas["+ i +"].Threshold"));
			datasItem.setEnable(_ctx.booleanValue("ListIsolationRulesOfAppResponse.Data.Datas["+ i +"].Enable"));
			datasItem.setLimitOrigin(_ctx.stringValue("ListIsolationRulesOfAppResponse.Data.Datas["+ i +"].LimitOrigin"));
			datasItem.setNamespace(_ctx.stringValue("ListIsolationRulesOfAppResponse.Data.Datas["+ i +"].Namespace"));
			datasItem.setRefResource(_ctx.stringValue("ListIsolationRulesOfAppResponse.Data.Datas["+ i +"].RefResource"));
			datasItem.setRelationStrategy(_ctx.integerValue("ListIsolationRulesOfAppResponse.Data.Datas["+ i +"].RelationStrategy"));
			datasItem.setResource(_ctx.stringValue("ListIsolationRulesOfAppResponse.Data.Datas["+ i +"].Resource"));
			datasItem.setRuleId(_ctx.longValue("ListIsolationRulesOfAppResponse.Data.Datas["+ i +"].RuleId"));

			datas.add(datasItem);
		}
		data.setDatas(datas);
		listIsolationRulesOfAppResponse.setData(data);
	 
	 	return listIsolationRulesOfAppResponse;
	}
}