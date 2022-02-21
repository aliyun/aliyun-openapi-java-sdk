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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetQueryOptimizeRuleListResponse;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeRuleListResponse.Data;
import com.aliyuncs.das.model.v20200116.GetQueryOptimizeRuleListResponse.Data.Rules;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueryOptimizeRuleListResponseUnmarshaller {

	public static GetQueryOptimizeRuleListResponse unmarshall(GetQueryOptimizeRuleListResponse getQueryOptimizeRuleListResponse, UnmarshallerContext _ctx) {
		
		getQueryOptimizeRuleListResponse.setRequestId(_ctx.stringValue("GetQueryOptimizeRuleListResponse.RequestId"));
		getQueryOptimizeRuleListResponse.setCode(_ctx.stringValue("GetQueryOptimizeRuleListResponse.Code"));
		getQueryOptimizeRuleListResponse.setMessage(_ctx.stringValue("GetQueryOptimizeRuleListResponse.Message"));
		getQueryOptimizeRuleListResponse.setSuccess(_ctx.stringValue("GetQueryOptimizeRuleListResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetQueryOptimizeRuleListResponse.Data.Total"));
		data.setPageNo(_ctx.integerValue("GetQueryOptimizeRuleListResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetQueryOptimizeRuleListResponse.Data.PageSize"));
		data.setExtra(_ctx.stringValue("GetQueryOptimizeRuleListResponse.Data.Extra"));

		List<Rules> list = new ArrayList<Rules>();
		for (int i = 0; i < _ctx.lengthValue("GetQueryOptimizeRuleListResponse.Data.List.Length"); i++) {
			Rules rules = new Rules();
			rules.setType(_ctx.stringValue("GetQueryOptimizeRuleListResponse.Data.List["+ i +"].Type"));
			rules.setName(_ctx.stringValue("GetQueryOptimizeRuleListResponse.Data.List["+ i +"].Name"));
			rules.setRuleId(_ctx.stringValue("GetQueryOptimizeRuleListResponse.Data.List["+ i +"].RuleId"));

			list.add(rules);
		}
		data.setList(list);
		getQueryOptimizeRuleListResponse.setData(data);
	 
	 	return getQueryOptimizeRuleListResponse;
	}
}