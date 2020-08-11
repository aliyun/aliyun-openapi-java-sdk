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

import com.aliyuncs.ahas_openapi.model.v20190901.ListDegradeRulesOfAppResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.ListDegradeRulesOfAppResponse.Data;
import com.aliyuncs.ahas_openapi.model.v20190901.ListDegradeRulesOfAppResponse.Data.DatasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDegradeRulesOfAppResponseUnmarshaller {

	public static ListDegradeRulesOfAppResponse unmarshall(ListDegradeRulesOfAppResponse listDegradeRulesOfAppResponse, UnmarshallerContext _ctx) {
		
		listDegradeRulesOfAppResponse.setRequestId(_ctx.stringValue("ListDegradeRulesOfAppResponse.RequestId"));
		listDegradeRulesOfAppResponse.setCode(_ctx.stringValue("ListDegradeRulesOfAppResponse.Code"));
		listDegradeRulesOfAppResponse.setMessage(_ctx.stringValue("ListDegradeRulesOfAppResponse.Message"));
		listDegradeRulesOfAppResponse.setSuccess(_ctx.booleanValue("ListDegradeRulesOfAppResponse.Success"));

		Data data = new Data();
		data.setPageIndex(_ctx.integerValue("ListDegradeRulesOfAppResponse.Data.PageIndex"));
		data.setPageSize(_ctx.integerValue("ListDegradeRulesOfAppResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListDegradeRulesOfAppResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("ListDegradeRulesOfAppResponse.Data.TotalPage"));

		List<DatasItem> datas = new ArrayList<DatasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDegradeRulesOfAppResponse.Data.Datas.Length"); i++) {
			DatasItem datasItem = new DatasItem();
			datasItem.setAppName(_ctx.stringValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].AppName"));
			datasItem.setEnable(_ctx.booleanValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].Enable"));
			datasItem.setHalfOpenBaseAmountPerStep(_ctx.integerValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].HalfOpenBaseAmountPerStep"));
			datasItem.setHalfOpenRecoveryStepNum(_ctx.integerValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].HalfOpenRecoveryStepNum"));
			datasItem.setMinRequestAmount(_ctx.integerValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].MinRequestAmount"));
			datasItem.setNamespace(_ctx.stringValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].Namespace"));
			datasItem.setRecoveryTimeoutMs(_ctx.integerValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].RecoveryTimeoutMs"));
			datasItem.setResource(_ctx.stringValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].Resource"));
			datasItem.setRuleId(_ctx.longValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].RuleId"));
			datasItem.setSlowRtMs(_ctx.integerValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].SlowRtMs"));
			datasItem.setStatDurationMs(_ctx.integerValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].StatDurationMs"));
			datasItem.setStrategy(_ctx.integerValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].Strategy"));
			datasItem.setThreshold(_ctx.floatValue("ListDegradeRulesOfAppResponse.Data.Datas["+ i +"].Threshold"));

			datas.add(datasItem);
		}
		data.setDatas(datas);
		listDegradeRulesOfAppResponse.setData(data);
	 
	 	return listDegradeRulesOfAppResponse;
	}
}