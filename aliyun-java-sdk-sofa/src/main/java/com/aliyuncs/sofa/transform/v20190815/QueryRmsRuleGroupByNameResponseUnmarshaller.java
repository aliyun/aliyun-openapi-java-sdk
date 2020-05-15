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

import com.aliyuncs.sofa.model.v20190815.QueryRmsRuleGroupByNameResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsRuleGroupByNameResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsRuleGroupByNameResponse.Response.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsRuleGroupByNameResponse.Response.Entity.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsRuleGroupByNameResponseUnmarshaller {

	public static QueryRmsRuleGroupByNameResponse unmarshall(QueryRmsRuleGroupByNameResponse queryRmsRuleGroupByNameResponse, UnmarshallerContext _ctx) {
		
		queryRmsRuleGroupByNameResponse.setRequestId(_ctx.stringValue("QueryRmsRuleGroupByNameResponse.RequestId"));
		queryRmsRuleGroupByNameResponse.setResultCode(_ctx.stringValue("QueryRmsRuleGroupByNameResponse.ResultCode"));
		queryRmsRuleGroupByNameResponse.setResultMessage(_ctx.stringValue("QueryRmsRuleGroupByNameResponse.ResultMessage"));

		Response response = new Response();
		response.setLayer(_ctx.stringValue("QueryRmsRuleGroupByNameResponse.Response.Layer"));

		Entity entity = new Entity();

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsRuleGroupByNameResponse.Response.Entity.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMonitorItemType(_ctx.stringValue("QueryRmsRuleGroupByNameResponse.Response.Entity.Data["+ i +"].MonitorItemType"));
			dataItem.setMonitorOptionKey(_ctx.stringValue("QueryRmsRuleGroupByNameResponse.Response.Entity.Data["+ i +"].MonitorOptionKey"));
			dataItem.setMonitorPort(_ctx.longValue("QueryRmsRuleGroupByNameResponse.Response.Entity.Data["+ i +"].MonitorPort"));
			dataItem.setStatisticalMethod(_ctx.stringValue("QueryRmsRuleGroupByNameResponse.Response.Entity.Data["+ i +"].StatisticalMethod"));
			dataItem.setStatisticalPeriod(_ctx.longValue("QueryRmsRuleGroupByNameResponse.Response.Entity.Data["+ i +"].StatisticalPeriod"));
			dataItem.setTriggerCountThreshold(_ctx.stringValue("QueryRmsRuleGroupByNameResponse.Response.Entity.Data["+ i +"].TriggerCountThreshold"));
			dataItem.setTriggerOperator(_ctx.stringValue("QueryRmsRuleGroupByNameResponse.Response.Entity.Data["+ i +"].TriggerOperator"));
			dataItem.setTriggerValueThreshold(_ctx.longValue("QueryRmsRuleGroupByNameResponse.Response.Entity.Data["+ i +"].TriggerValueThreshold"));

			data.add(dataItem);
		}
		entity.setData(data);
		response.setEntity(entity);
		queryRmsRuleGroupByNameResponse.setResponse(response);
	 
	 	return queryRmsRuleGroupByNameResponse;
	}
}