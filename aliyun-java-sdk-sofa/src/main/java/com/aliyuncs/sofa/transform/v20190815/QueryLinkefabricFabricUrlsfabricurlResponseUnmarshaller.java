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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlsfabricurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricUrlsfabricurlResponseUnmarshaller {

	public static QueryLinkefabricFabricUrlsfabricurlResponse unmarshall(QueryLinkefabricFabricUrlsfabricurlResponse queryLinkefabricFabricUrlsfabricurlResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricUrlsfabricurlResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricUrlsfabricurlResponse.RequestId"));
		queryLinkefabricFabricUrlsfabricurlResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricUrlsfabricurlResponse.ResultCode"));
		queryLinkefabricFabricUrlsfabricurlResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsfabricurlResponse.ResultMessage"));
		queryLinkefabricFabricUrlsfabricurlResponse.setData(_ctx.stringValue("QueryLinkefabricFabricUrlsfabricurlResponse.Data"));
		queryLinkefabricFabricUrlsfabricurlResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsfabricurlResponse.Message"));
		queryLinkefabricFabricUrlsfabricurlResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricUrlsfabricurlResponse.ResponseStatusCode"));
		queryLinkefabricFabricUrlsfabricurlResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricUrlsfabricurlResponse.Success"));
	 
	 	return queryLinkefabricFabricUrlsfabricurlResponse;
	}
}