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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricExistdrmresourcetplResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricExistdrmresourcetplResponseUnmarshaller {

	public static QueryLinkefabricFabricExistdrmresourcetplResponse unmarshall(QueryLinkefabricFabricExistdrmresourcetplResponse queryLinkefabricFabricExistdrmresourcetplResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricExistdrmresourcetplResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricExistdrmresourcetplResponse.RequestId"));
		queryLinkefabricFabricExistdrmresourcetplResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricExistdrmresourcetplResponse.ResultCode"));
		queryLinkefabricFabricExistdrmresourcetplResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricExistdrmresourcetplResponse.ResultMessage"));
		queryLinkefabricFabricExistdrmresourcetplResponse.setData(_ctx.stringValue("QueryLinkefabricFabricExistdrmresourcetplResponse.Data"));
		queryLinkefabricFabricExistdrmresourcetplResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricExistdrmresourcetplResponse.Message"));
		queryLinkefabricFabricExistdrmresourcetplResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricExistdrmresourcetplResponse.ResponseStatusCode"));
		queryLinkefabricFabricExistdrmresourcetplResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricExistdrmresourcetplResponse.Success"));
	 
	 	return queryLinkefabricFabricExistdrmresourcetplResponse;
	}
}