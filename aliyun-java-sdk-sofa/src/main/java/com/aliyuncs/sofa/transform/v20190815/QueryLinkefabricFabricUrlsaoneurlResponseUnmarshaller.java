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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlsaoneurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricUrlsaoneurlResponseUnmarshaller {

	public static QueryLinkefabricFabricUrlsaoneurlResponse unmarshall(QueryLinkefabricFabricUrlsaoneurlResponse queryLinkefabricFabricUrlsaoneurlResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricUrlsaoneurlResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricUrlsaoneurlResponse.RequestId"));
		queryLinkefabricFabricUrlsaoneurlResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricUrlsaoneurlResponse.ResultCode"));
		queryLinkefabricFabricUrlsaoneurlResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsaoneurlResponse.ResultMessage"));
		queryLinkefabricFabricUrlsaoneurlResponse.setData(_ctx.stringValue("QueryLinkefabricFabricUrlsaoneurlResponse.Data"));
		queryLinkefabricFabricUrlsaoneurlResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsaoneurlResponse.Message"));
		queryLinkefabricFabricUrlsaoneurlResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricUrlsaoneurlResponse.ResponseStatusCode"));
		queryLinkefabricFabricUrlsaoneurlResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricUrlsaoneurlResponse.Success"));
	 
	 	return queryLinkefabricFabricUrlsaoneurlResponse;
	}
}