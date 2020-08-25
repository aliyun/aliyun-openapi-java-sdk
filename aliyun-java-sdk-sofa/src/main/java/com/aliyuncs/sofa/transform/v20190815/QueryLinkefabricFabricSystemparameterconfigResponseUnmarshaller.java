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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSystemparameterconfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricSystemparameterconfigResponseUnmarshaller {

	public static QueryLinkefabricFabricSystemparameterconfigResponse unmarshall(QueryLinkefabricFabricSystemparameterconfigResponse queryLinkefabricFabricSystemparameterconfigResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricSystemparameterconfigResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricSystemparameterconfigResponse.RequestId"));
		queryLinkefabricFabricSystemparameterconfigResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricSystemparameterconfigResponse.ResultCode"));
		queryLinkefabricFabricSystemparameterconfigResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricSystemparameterconfigResponse.ResultMessage"));
		queryLinkefabricFabricSystemparameterconfigResponse.setData(_ctx.stringValue("QueryLinkefabricFabricSystemparameterconfigResponse.Data"));
		queryLinkefabricFabricSystemparameterconfigResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricSystemparameterconfigResponse.Message"));
		queryLinkefabricFabricSystemparameterconfigResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricSystemparameterconfigResponse.ResponseStatusCode"));
		queryLinkefabricFabricSystemparameterconfigResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricSystemparameterconfigResponse.Success"));
	 
	 	return queryLinkefabricFabricSystemparameterconfigResponse;
	}
}