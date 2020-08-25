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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlsddsconsoleurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricUrlsddsconsoleurlResponseUnmarshaller {

	public static QueryLinkefabricFabricUrlsddsconsoleurlResponse unmarshall(QueryLinkefabricFabricUrlsddsconsoleurlResponse queryLinkefabricFabricUrlsddsconsoleurlResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricUrlsddsconsoleurlResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricUrlsddsconsoleurlResponse.RequestId"));
		queryLinkefabricFabricUrlsddsconsoleurlResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricUrlsddsconsoleurlResponse.ResultCode"));
		queryLinkefabricFabricUrlsddsconsoleurlResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsddsconsoleurlResponse.ResultMessage"));
		queryLinkefabricFabricUrlsddsconsoleurlResponse.setData(_ctx.stringValue("QueryLinkefabricFabricUrlsddsconsoleurlResponse.Data"));
		queryLinkefabricFabricUrlsddsconsoleurlResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsddsconsoleurlResponse.Message"));
		queryLinkefabricFabricUrlsddsconsoleurlResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricUrlsddsconsoleurlResponse.ResponseStatusCode"));
		queryLinkefabricFabricUrlsddsconsoleurlResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricUrlsddsconsoleurlResponse.Success"));
	 
	 	return queryLinkefabricFabricUrlsddsconsoleurlResponse;
	}
}