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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryRmsRulesGroupsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsRulesGroupsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsRulesGroupsResponse.Response.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsRulesGroupsResponse.Response.Entity.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsRulesGroupsResponseUnmarshaller {

	public static QueryRmsRulesGroupsResponse unmarshall(QueryRmsRulesGroupsResponse queryRmsRulesGroupsResponse, UnmarshallerContext _ctx) {
		
		queryRmsRulesGroupsResponse.setRequestId(_ctx.stringValue("QueryRmsRulesGroupsResponse.RequestId"));
		queryRmsRulesGroupsResponse.setResultCode(_ctx.stringValue("QueryRmsRulesGroupsResponse.ResultCode"));
		queryRmsRulesGroupsResponse.setResultMessage(_ctx.stringValue("QueryRmsRulesGroupsResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("QueryRmsRulesGroupsResponse.Response.Layer"));

		Entity entity = new Entity();

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsRulesGroupsResponse.Response.Entity.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRuleGroupName(_ctx.stringValue("QueryRmsRulesGroupsResponse.Response.Entity.Data["+ i +"].RuleGroupName"));
			dataItem.setRuleType(_ctx.stringValue("QueryRmsRulesGroupsResponse.Response.Entity.Data["+ i +"].RuleType"));

			data.add(dataItem);
		}
		entity.setData(data);
		response.setEntity(entity);
		queryRmsRulesGroupsResponse.setResponse(response);
	 
	 	return queryRmsRulesGroupsResponse;
	}
}