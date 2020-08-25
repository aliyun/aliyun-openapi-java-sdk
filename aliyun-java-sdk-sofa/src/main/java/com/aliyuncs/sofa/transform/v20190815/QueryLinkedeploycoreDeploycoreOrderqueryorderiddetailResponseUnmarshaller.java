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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse unmarshall(QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse queryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.RequestId"));
		queryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Message"));
		queryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Success"));

		Data data = new Data();
		data.setData(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.Data"));
		data.setEnvName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.EnvName"));
		data.setEnvType(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.EnvType"));
		data.setGmtCreate(_ctx.longValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.GmtModified"));
		data.setId(_ctx.longValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.Id"));
		data.setName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.Name"));
		data.setOperator(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.Operator"));
		data.setOrderStatus(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.OrderStatus"));
		data.setOrderType(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.OrderType"));
		data.setSceneId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.SceneId"));
		data.setSourceApp(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.SourceApp"));
		data.setTenantName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.Data.TenantName"));
		queryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreOrderqueryorderiddetailResponse;
	}
}