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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreActionqueryactionidResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreActionqueryactionidResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreActionqueryactionidResponse unmarshall(QueryLinkedeploycoreDeploycoreActionqueryactionidResponse queryLinkedeploycoreDeploycoreActionqueryactionidResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreActionqueryactionidResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.RequestId"));
		queryLinkedeploycoreDeploycoreActionqueryactionidResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreActionqueryactionidResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreActionqueryactionidResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Message"));
		queryLinkedeploycoreDeploycoreActionqueryactionidResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreActionqueryactionidResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Success"));

		Data data = new Data();
		data.setActionLevel(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.ActionLevel"));
		data.setActionStatus(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.ActionStatus"));
		data.setActionType(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.ActionType"));
		data.setAppService(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.AppService"));
		data.setAppServiceId(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.AppServiceId"));
		data.setChildId(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.ChildId"));
		data.setConfigurationId(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.ConfigurationId"));
		data.setDetail(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.Detail"));
		data.setExecutionResult(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.ExecutionResult"));
		data.setExecutionResultId(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.ExecutionResultId"));
		data.setGmtCreate(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.GmtModified"));
		data.setId(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.Id"));
		data.setLog(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.Log"));
		data.setOperator(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.Operator"));
		data.setOrderId(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.OrderId"));
		data.setParentId(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.ParentId"));
		data.setStep(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.Step"));
		data.setTimeout(_ctx.longValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.Timeout"));

		List<String> subActions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.SubActions.Length"); i++) {
			subActions.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreActionqueryactionidResponse.Data.SubActions["+ i +"]"));
		}
		data.setSubActions(subActions);
		queryLinkedeploycoreDeploycoreActionqueryactionidResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreActionqueryactionidResponse;
	}
}