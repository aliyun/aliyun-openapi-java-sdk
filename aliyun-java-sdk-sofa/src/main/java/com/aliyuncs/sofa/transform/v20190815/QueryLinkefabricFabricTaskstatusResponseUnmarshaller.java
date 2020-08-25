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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricTaskstatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricTaskstatusResponseUnmarshaller {

	public static QueryLinkefabricFabricTaskstatusResponse unmarshall(QueryLinkefabricFabricTaskstatusResponse queryLinkefabricFabricTaskstatusResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricTaskstatusResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricTaskstatusResponse.RequestId"));
		queryLinkefabricFabricTaskstatusResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricTaskstatusResponse.ResultCode"));
		queryLinkefabricFabricTaskstatusResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricTaskstatusResponse.ResultMessage"));
		queryLinkefabricFabricTaskstatusResponse.setData(_ctx.stringValue("QueryLinkefabricFabricTaskstatusResponse.Data"));
		queryLinkefabricFabricTaskstatusResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricTaskstatusResponse.Message"));
		queryLinkefabricFabricTaskstatusResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricTaskstatusResponse.ResponseStatusCode"));
		queryLinkefabricFabricTaskstatusResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricTaskstatusResponse.Success"));
	 
	 	return queryLinkefabricFabricTaskstatusResponse;
	}
}