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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListCircuitBreakerRulesResponse;
import com.aliyuncs.mse.model.v20190531.ListCircuitBreakerRulesResponse.Data;
import com.aliyuncs.mse.model.v20190531.ListCircuitBreakerRulesResponse.Data.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCircuitBreakerRulesResponseUnmarshaller {

	public static ListCircuitBreakerRulesResponse unmarshall(ListCircuitBreakerRulesResponse listCircuitBreakerRulesResponse, UnmarshallerContext _ctx) {
		
		listCircuitBreakerRulesResponse.setRequestId(_ctx.stringValue("ListCircuitBreakerRulesResponse.RequestId"));
		listCircuitBreakerRulesResponse.setCode(_ctx.integerValue("ListCircuitBreakerRulesResponse.Code"));
		listCircuitBreakerRulesResponse.setMessage(_ctx.stringValue("ListCircuitBreakerRulesResponse.Message"));
		listCircuitBreakerRulesResponse.setSuccess(_ctx.booleanValue("ListCircuitBreakerRulesResponse.Success"));
		listCircuitBreakerRulesResponse.setHttpStatusCode(_ctx.integerValue("ListCircuitBreakerRulesResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListCircuitBreakerRulesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListCircuitBreakerRulesResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("ListCircuitBreakerRulesResponse.Data.TotalSize"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCircuitBreakerRulesResponse.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setNamespace(_ctx.stringValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].Namespace"));
			resultItem.setRuleId(_ctx.longValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].RuleId"));
			resultItem.setAppName(_ctx.stringValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].AppName"));
			resultItem.setResource(_ctx.stringValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].Resource"));
			resultItem.setStrategy(_ctx.integerValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].Strategy"));
			resultItem.setThreshold(_ctx.floatValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].Threshold"));
			resultItem.setEnable(_ctx.booleanValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].Enable"));
			resultItem.setRetryTimeoutMs(_ctx.integerValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].RetryTimeoutMs"));
			resultItem.setStatIntervalMs(_ctx.integerValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].StatIntervalMs"));
			resultItem.setAppId(_ctx.stringValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].AppId"));
			resultItem.setRegionId(_ctx.stringValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].RegionId"));
			resultItem.setFallbackObject(_ctx.stringValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].FallbackObject"));
			resultItem.setMaxAllowedRtMs(_ctx.integerValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].MaxAllowedRtMs"));
			resultItem.setMinRequestAmount(_ctx.integerValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].MinRequestAmount"));
			resultItem.setHalfOpenBaseAmountPerStep(_ctx.integerValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].HalfOpenBaseAmountPerStep"));
			resultItem.setHalfOpenRecoveryStepNum(_ctx.integerValue("ListCircuitBreakerRulesResponse.Data.Result["+ i +"].HalfOpenRecoveryStepNum"));

			result.add(resultItem);
		}
		data.setResult(result);
		listCircuitBreakerRulesResponse.setData(data);
	 
	 	return listCircuitBreakerRulesResponse;
	}
}