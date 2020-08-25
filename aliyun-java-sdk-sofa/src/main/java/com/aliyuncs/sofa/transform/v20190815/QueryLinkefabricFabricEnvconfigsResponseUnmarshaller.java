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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricEnvconfigsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricEnvconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricEnvconfigsResponse unmarshall(QueryLinkefabricFabricEnvconfigsResponse queryLinkefabricFabricEnvconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricEnvconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricEnvconfigsResponse.RequestId"));
		queryLinkefabricFabricEnvconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricEnvconfigsResponse.ResultCode"));
		queryLinkefabricFabricEnvconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricEnvconfigsResponse.ResultMessage"));
		queryLinkefabricFabricEnvconfigsResponse.setData(_ctx.booleanValue("QueryLinkefabricFabricEnvconfigsResponse.Data"));
		queryLinkefabricFabricEnvconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricEnvconfigsResponse.Message"));
		queryLinkefabricFabricEnvconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricEnvconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricEnvconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricEnvconfigsResponse.Success"));
	 
	 	return queryLinkefabricFabricEnvconfigsResponse;
	}
}