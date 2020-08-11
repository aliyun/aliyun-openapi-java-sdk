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

import com.aliyuncs.ahas_openapi.model.v20190901.ListDegradeRulesOfResourceResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ListDegradeRulesOfResourceResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.ListDegradeRulesOfResourceResponse.Data.DatasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDegradeRulesOfResourceResponseUnmarshaller {

	public static ListDegradeRulesOfResourceResponse unmarshall(ListDegradeRulesOfResourceResponse listDegradeRulesOfResourceResponse, UnmarshallerContext _ctx) {
		
		listDegradeRulesOfResourceResponse.setRequestId(_ctx.stringValue("ListDegradeRulesOfResourceResponse.RequestId"));
		listDegradeRulesOfResourceResponse.setCode(_ctx.stringValue("ListDegradeRulesOfResourceResponse.Code"));
		listDegradeRulesOfResourceResponse.setMessage(_ctx.stringValue("ListDegradeRulesOfResourceResponse.Message"));
		listDegradeRulesOfResourceResponse.setSuccess(_ctx.booleanValue("ListDegradeRulesOfResourceResponse.Success"));

		Data data = new Data();
		data.setPageIndex(_ctx.integerValue("ListDegradeRulesOfResourceResponse.Data.PageIndex"));
		data.setPageSize(_ctx.integerValue("ListDegradeRulesOfResourceResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListDegradeRulesOfResourceResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("ListDegradeRulesOfResourceResponse.Data.TotalPage"));

		List<DatasItem> datas = new ArrayList<DatasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDegradeRulesOfResourceResponse.Data.Datas.Length"); i++) {
			DatasItem datasItem = new DatasItem();
			datasItem.setAppName(_ctx.stringValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].AppName"));
			datasItem.setEnable(_ctx.booleanValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].Enable"));
			datasItem.setHalfOpenBaseAmountPerStep(_ctx.integerValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].HalfOpenBaseAmountPerStep"));
			datasItem.setHalfOpenRecoveryStepNum(_ctx.integerValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].HalfOpenRecoveryStepNum"));
			datasItem.setMinRequestAmount(_ctx.integerValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].MinRequestAmount"));
			datasItem.setNamespace(_ctx.stringValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].Namespace"));
			datasItem.setRecoveryTimeoutMs(_ctx.integerValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].RecoveryTimeoutMs"));
			datasItem.setResource(_ctx.stringValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].Resource"));
			datasItem.setRuleId(_ctx.longValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].RuleId"));
			datasItem.setSlowRtMs(_ctx.integerValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].SlowRtMs"));
			datasItem.setStatDurationMs(_ctx.integerValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].StatDurationMs"));
			datasItem.setStrategy(_ctx.integerValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].Strategy"));
			datasItem.setThreshold(_ctx.floatValue("ListDegradeRulesOfResourceResponse.Data.Datas["+ i +"].Threshold"));

			datas.add(datasItem);
		}
		data.setDatas(datas);
		listDegradeRulesOfResourceResponse.setData(data);
	 
	 	return listDegradeRulesOfResourceResponse;
	}
}