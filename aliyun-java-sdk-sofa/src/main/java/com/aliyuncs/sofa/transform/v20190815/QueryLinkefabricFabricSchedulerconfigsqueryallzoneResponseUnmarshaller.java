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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponseUnmarshaller {

	public static QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse unmarshall(QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse queryLinkefabricFabricSchedulerconfigsqueryallzoneResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.RequestId"));
		queryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.ResultCode"));
		queryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.ResultMessage"));
		queryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.setData(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.Data"));
		queryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.Message"));
		queryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.ResponseStatusCode"));
		queryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricSchedulerconfigsqueryallzoneResponse.Success"));
	 
	 	return queryLinkefabricFabricSchedulerconfigsqueryallzoneResponse;
	}
}