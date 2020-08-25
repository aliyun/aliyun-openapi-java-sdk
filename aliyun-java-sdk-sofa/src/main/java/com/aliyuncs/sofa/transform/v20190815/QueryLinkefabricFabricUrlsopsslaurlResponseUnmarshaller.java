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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlsopsslaurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricUrlsopsslaurlResponseUnmarshaller {

	public static QueryLinkefabricFabricUrlsopsslaurlResponse unmarshall(QueryLinkefabricFabricUrlsopsslaurlResponse queryLinkefabricFabricUrlsopsslaurlResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricUrlsopsslaurlResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricUrlsopsslaurlResponse.RequestId"));
		queryLinkefabricFabricUrlsopsslaurlResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricUrlsopsslaurlResponse.ResultCode"));
		queryLinkefabricFabricUrlsopsslaurlResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsopsslaurlResponse.ResultMessage"));
		queryLinkefabricFabricUrlsopsslaurlResponse.setData(_ctx.stringValue("QueryLinkefabricFabricUrlsopsslaurlResponse.Data"));
		queryLinkefabricFabricUrlsopsslaurlResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsopsslaurlResponse.Message"));
		queryLinkefabricFabricUrlsopsslaurlResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricUrlsopsslaurlResponse.ResponseStatusCode"));
		queryLinkefabricFabricUrlsopsslaurlResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricUrlsopsslaurlResponse.Success"));
	 
	 	return queryLinkefabricFabricUrlsopsslaurlResponse;
	}
}