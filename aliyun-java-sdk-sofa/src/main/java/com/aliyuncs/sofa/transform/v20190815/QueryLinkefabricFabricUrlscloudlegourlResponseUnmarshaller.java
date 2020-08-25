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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlscloudlegourlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricUrlscloudlegourlResponseUnmarshaller {

	public static QueryLinkefabricFabricUrlscloudlegourlResponse unmarshall(QueryLinkefabricFabricUrlscloudlegourlResponse queryLinkefabricFabricUrlscloudlegourlResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricUrlscloudlegourlResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricUrlscloudlegourlResponse.RequestId"));
		queryLinkefabricFabricUrlscloudlegourlResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricUrlscloudlegourlResponse.ResultCode"));
		queryLinkefabricFabricUrlscloudlegourlResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricUrlscloudlegourlResponse.ResultMessage"));
		queryLinkefabricFabricUrlscloudlegourlResponse.setData(_ctx.stringValue("QueryLinkefabricFabricUrlscloudlegourlResponse.Data"));
		queryLinkefabricFabricUrlscloudlegourlResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricUrlscloudlegourlResponse.Message"));
		queryLinkefabricFabricUrlscloudlegourlResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricUrlscloudlegourlResponse.ResponseStatusCode"));
		queryLinkefabricFabricUrlscloudlegourlResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricUrlscloudlegourlResponse.Success"));
	 
	 	return queryLinkefabricFabricUrlscloudlegourlResponse;
	}
}