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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlszdataconsoleurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricUrlszdataconsoleurlResponseUnmarshaller {

	public static QueryLinkefabricFabricUrlszdataconsoleurlResponse unmarshall(QueryLinkefabricFabricUrlszdataconsoleurlResponse queryLinkefabricFabricUrlszdataconsoleurlResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricUrlszdataconsoleurlResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricUrlszdataconsoleurlResponse.RequestId"));
		queryLinkefabricFabricUrlszdataconsoleurlResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricUrlszdataconsoleurlResponse.ResultCode"));
		queryLinkefabricFabricUrlszdataconsoleurlResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricUrlszdataconsoleurlResponse.ResultMessage"));
		queryLinkefabricFabricUrlszdataconsoleurlResponse.setData(_ctx.stringValue("QueryLinkefabricFabricUrlszdataconsoleurlResponse.Data"));
		queryLinkefabricFabricUrlszdataconsoleurlResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricUrlszdataconsoleurlResponse.Message"));
		queryLinkefabricFabricUrlszdataconsoleurlResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricUrlszdataconsoleurlResponse.ResponseStatusCode"));
		queryLinkefabricFabricUrlszdataconsoleurlResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricUrlszdataconsoleurlResponse.Success"));
	 
	 	return queryLinkefabricFabricUrlszdataconsoleurlResponse;
	}
}