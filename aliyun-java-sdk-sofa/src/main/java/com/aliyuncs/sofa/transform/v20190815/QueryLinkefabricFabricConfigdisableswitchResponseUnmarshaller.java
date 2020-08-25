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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricConfigdisableswitchResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricConfigdisableswitchResponseUnmarshaller {

	public static QueryLinkefabricFabricConfigdisableswitchResponse unmarshall(QueryLinkefabricFabricConfigdisableswitchResponse queryLinkefabricFabricConfigdisableswitchResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricConfigdisableswitchResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricConfigdisableswitchResponse.RequestId"));
		queryLinkefabricFabricConfigdisableswitchResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricConfigdisableswitchResponse.ResultCode"));
		queryLinkefabricFabricConfigdisableswitchResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricConfigdisableswitchResponse.ResultMessage"));
		queryLinkefabricFabricConfigdisableswitchResponse.setData(_ctx.stringValue("QueryLinkefabricFabricConfigdisableswitchResponse.Data"));
		queryLinkefabricFabricConfigdisableswitchResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricConfigdisableswitchResponse.Message"));
		queryLinkefabricFabricConfigdisableswitchResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricConfigdisableswitchResponse.ResponseStatusCode"));
		queryLinkefabricFabricConfigdisableswitchResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricConfigdisableswitchResponse.Success"));
	 
	 	return queryLinkefabricFabricConfigdisableswitchResponse;
	}
}