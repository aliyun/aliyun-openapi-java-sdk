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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlszopsurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricUrlszopsurlResponseUnmarshaller {

	public static QueryLinkefabricFabricUrlszopsurlResponse unmarshall(QueryLinkefabricFabricUrlszopsurlResponse queryLinkefabricFabricUrlszopsurlResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricUrlszopsurlResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricUrlszopsurlResponse.RequestId"));
		queryLinkefabricFabricUrlszopsurlResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricUrlszopsurlResponse.ResultCode"));
		queryLinkefabricFabricUrlszopsurlResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricUrlszopsurlResponse.ResultMessage"));
		queryLinkefabricFabricUrlszopsurlResponse.setData(_ctx.stringValue("QueryLinkefabricFabricUrlszopsurlResponse.Data"));
		queryLinkefabricFabricUrlszopsurlResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricUrlszopsurlResponse.Message"));
		queryLinkefabricFabricUrlszopsurlResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricUrlszopsurlResponse.ResponseStatusCode"));
		queryLinkefabricFabricUrlszopsurlResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricUrlszopsurlResponse.Success"));
	 
	 	return queryLinkefabricFabricUrlszopsurlResponse;
	}
}