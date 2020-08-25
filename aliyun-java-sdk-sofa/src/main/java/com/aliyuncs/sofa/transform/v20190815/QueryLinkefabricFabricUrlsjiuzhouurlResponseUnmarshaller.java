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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricUrlsjiuzhouurlResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricUrlsjiuzhouurlResponseUnmarshaller {

	public static QueryLinkefabricFabricUrlsjiuzhouurlResponse unmarshall(QueryLinkefabricFabricUrlsjiuzhouurlResponse queryLinkefabricFabricUrlsjiuzhouurlResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricUrlsjiuzhouurlResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricUrlsjiuzhouurlResponse.RequestId"));
		queryLinkefabricFabricUrlsjiuzhouurlResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricUrlsjiuzhouurlResponse.ResultCode"));
		queryLinkefabricFabricUrlsjiuzhouurlResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsjiuzhouurlResponse.ResultMessage"));
		queryLinkefabricFabricUrlsjiuzhouurlResponse.setData(_ctx.stringValue("QueryLinkefabricFabricUrlsjiuzhouurlResponse.Data"));
		queryLinkefabricFabricUrlsjiuzhouurlResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricUrlsjiuzhouurlResponse.Message"));
		queryLinkefabricFabricUrlsjiuzhouurlResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricUrlsjiuzhouurlResponse.ResponseStatusCode"));
		queryLinkefabricFabricUrlsjiuzhouurlResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricUrlsjiuzhouurlResponse.Success"));
	 
	 	return queryLinkefabricFabricUrlsjiuzhouurlResponse;
	}
}