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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponseUnmarshaller {

	public static QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse unmarshall(QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse queryLinkefabricFabricSystemparameterqueryconfigbycacheResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.RequestId"));
		queryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.ResultCode"));
		queryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.ResultMessage"));
		queryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.setData(_ctx.stringValue("QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.Data"));
		queryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.Message"));
		queryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.ResponseStatusCode"));
		queryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricSystemparameterqueryconfigbycacheResponse.Success"));
	 
	 	return queryLinkefabricFabricSystemparameterqueryconfigbycacheResponse;
	}
}