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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlsidburlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricUrlsidburlResponseUnmarshaller {

	public static QueryLinkefabricFabricUrlsidburlResponse unmarshall(QueryLinkefabricFabricUrlsidburlResponse queryLinkefabricFabricUrlsidburlResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricUrlsidburlResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricUrlsidburlResponse.RequestId"));
		queryLinkefabricFabricUrlsidburlResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricUrlsidburlResponse.ResultCode"));
		queryLinkefabricFabricUrlsidburlResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsidburlResponse.ResultMessage"));
		queryLinkefabricFabricUrlsidburlResponse.setData(_ctx.stringValue("QueryLinkefabricFabricUrlsidburlResponse.Data"));
		queryLinkefabricFabricUrlsidburlResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsidburlResponse.Message"));
		queryLinkefabricFabricUrlsidburlResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricUrlsidburlResponse.ResponseStatusCode"));
		queryLinkefabricFabricUrlsidburlResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricUrlsidburlResponse.Success"));
	 
	 	return queryLinkefabricFabricUrlsidburlResponse;
	}
}