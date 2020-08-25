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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlscloudboxurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricUrlscloudboxurlResponseUnmarshaller {

	public static QueryLinkefabricFabricUrlscloudboxurlResponse unmarshall(QueryLinkefabricFabricUrlscloudboxurlResponse queryLinkefabricFabricUrlscloudboxurlResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricUrlscloudboxurlResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricUrlscloudboxurlResponse.RequestId"));
		queryLinkefabricFabricUrlscloudboxurlResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricUrlscloudboxurlResponse.ResultCode"));
		queryLinkefabricFabricUrlscloudboxurlResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricUrlscloudboxurlResponse.ResultMessage"));
		queryLinkefabricFabricUrlscloudboxurlResponse.setData(_ctx.stringValue("QueryLinkefabricFabricUrlscloudboxurlResponse.Data"));
		queryLinkefabricFabricUrlscloudboxurlResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricUrlscloudboxurlResponse.Message"));
		queryLinkefabricFabricUrlscloudboxurlResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricUrlscloudboxurlResponse.ResponseStatusCode"));
		queryLinkefabricFabricUrlscloudboxurlResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricUrlscloudboxurlResponse.Success"));
	 
	 	return queryLinkefabricFabricUrlscloudboxurlResponse;
	}
}