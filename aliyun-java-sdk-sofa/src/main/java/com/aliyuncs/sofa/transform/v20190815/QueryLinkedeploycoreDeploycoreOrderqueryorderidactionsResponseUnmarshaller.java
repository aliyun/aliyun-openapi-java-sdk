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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse unmarshall(QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse queryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.RequestId"));
		queryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.Message"));
		queryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.Success"));

		Data data = new Data();
		data.setEnvType(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.Data.EnvType"));

		List<String> actions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.Data.Actions.Length"); i++) {
			actions.add(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.Data.Actions["+ i +"]"));
		}
		data.setActions(actions);
		queryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreOrderqueryorderidactionsResponse;
	}
}