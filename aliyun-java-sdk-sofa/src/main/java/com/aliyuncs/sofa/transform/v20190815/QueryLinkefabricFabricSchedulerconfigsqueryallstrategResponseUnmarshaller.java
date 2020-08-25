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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponseUnmarshaller {

	public static QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse unmarshall(QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse queryLinkefabricFabricSchedulerconfigsqueryallstrategResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.RequestId"));
		queryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.ResultCode"));
		queryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.ResultMessage"));
		queryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.setData(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.Data"));
		queryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.Message"));
		queryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.ResponseStatusCode"));
		queryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricSchedulerconfigsqueryallstrategResponse.Success"));
	 
	 	return queryLinkefabricFabricSchedulerconfigsqueryallstrategResponse;
	}
}