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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricZdalconfigsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricZdalconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricZdalconfigsResponse unmarshall(QueryLinkefabricFabricZdalconfigsResponse queryLinkefabricFabricZdalconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricZdalconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricZdalconfigsResponse.RequestId"));
		queryLinkefabricFabricZdalconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricZdalconfigsResponse.ResultCode"));
		queryLinkefabricFabricZdalconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricZdalconfigsResponse.ResultMessage"));
		queryLinkefabricFabricZdalconfigsResponse.setData(_ctx.stringValue("QueryLinkefabricFabricZdalconfigsResponse.Data"));
		queryLinkefabricFabricZdalconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricZdalconfigsResponse.Message"));
		queryLinkefabricFabricZdalconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricZdalconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricZdalconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricZdalconfigsResponse.Success"));
	 
	 	return queryLinkefabricFabricZdalconfigsResponse;
	}
}