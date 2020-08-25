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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSystemparameterisadminResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricSystemparameterisadminResponseUnmarshaller {

	public static QueryLinkefabricFabricSystemparameterisadminResponse unmarshall(QueryLinkefabricFabricSystemparameterisadminResponse queryLinkefabricFabricSystemparameterisadminResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricSystemparameterisadminResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricSystemparameterisadminResponse.RequestId"));
		queryLinkefabricFabricSystemparameterisadminResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricSystemparameterisadminResponse.ResultCode"));
		queryLinkefabricFabricSystemparameterisadminResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricSystemparameterisadminResponse.ResultMessage"));
		queryLinkefabricFabricSystemparameterisadminResponse.setData(_ctx.booleanValue("QueryLinkefabricFabricSystemparameterisadminResponse.Data"));
		queryLinkefabricFabricSystemparameterisadminResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricSystemparameterisadminResponse.Message"));
		queryLinkefabricFabricSystemparameterisadminResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricSystemparameterisadminResponse.ResponseStatusCode"));
		queryLinkefabricFabricSystemparameterisadminResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricSystemparameterisadminResponse.Success"));
	 
	 	return queryLinkefabricFabricSystemparameterisadminResponse;
	}
}