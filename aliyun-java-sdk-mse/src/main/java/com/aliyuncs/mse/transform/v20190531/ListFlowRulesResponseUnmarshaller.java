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

import com.aliyuncs.mse.model.v20190531.ListFlowRulesResponse;
import com.aliyuncs.mse.model.v20190531.ListFlowRulesResponse.Data;
import com.aliyuncs.mse.model.v20190531.ListFlowRulesResponse.Data.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowRulesResponseUnmarshaller {

	public static ListFlowRulesResponse unmarshall(ListFlowRulesResponse listFlowRulesResponse, UnmarshallerContext _ctx) {
		
		listFlowRulesResponse.setRequestId(_ctx.stringValue("ListFlowRulesResponse.RequestId"));
		listFlowRulesResponse.setCode(_ctx.integerValue("ListFlowRulesResponse.Code"));
		listFlowRulesResponse.setMessage(_ctx.stringValue("ListFlowRulesResponse.Message"));
		listFlowRulesResponse.setSuccess(_ctx.booleanValue("ListFlowRulesResponse.Success"));
		listFlowRulesResponse.setHttpStatusCode(_ctx.integerValue("ListFlowRulesResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListFlowRulesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListFlowRulesResponse.Data.PageSize"));
		data.setTotalSize(_ctx.integerValue("ListFlowRulesResponse.Data.TotalSize"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowRulesResponse.Data.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setNamespace(_ctx.stringValue("ListFlowRulesResponse.Data.Result["+ i +"].Namespace"));
			resultItem.setRuleId(_ctx.longValue("ListFlowRulesResponse.Data.Result["+ i +"].RuleId"));
			resultItem.setAppName(_ctx.stringValue("ListFlowRulesResponse.Data.Result["+ i +"].AppName"));
			resultItem.setResource(_ctx.stringValue("ListFlowRulesResponse.Data.Result["+ i +"].Resource"));
			resultItem.setControlBehavior(_ctx.integerValue("ListFlowRulesResponse.Data.Result["+ i +"].ControlBehavior"));
			resultItem.setMaxQueueingTimeMs(_ctx.integerValue("ListFlowRulesResponse.Data.Result["+ i +"].MaxQueueingTimeMs"));
			resultItem.setThreshold(_ctx.floatValue("ListFlowRulesResponse.Data.Result["+ i +"].Threshold"));
			resultItem.setEnable(_ctx.booleanValue("ListFlowRulesResponse.Data.Result["+ i +"].Enable"));
			resultItem.setAppId(_ctx.stringValue("ListFlowRulesResponse.Data.Result["+ i +"].AppId"));
			resultItem.setRegionId(_ctx.stringValue("ListFlowRulesResponse.Data.Result["+ i +"].RegionId"));
			resultItem.setFallbackObject(_ctx.stringValue("ListFlowRulesResponse.Data.Result["+ i +"].FallbackObject"));
			resultItem.setMetricType(_ctx.integerValue("ListFlowRulesResponse.Data.Result["+ i +"].MetricType"));
			resultItem.setTrafficTags(_ctx.mapValue("ListFlowRulesResponse.Data.Result["+ i +"].TrafficTags"));

			result.add(resultItem);
		}
		data.setResult(result);
		listFlowRulesResponse.setData(data);
	 
	 	return listFlowRulesResponse;
	}
}