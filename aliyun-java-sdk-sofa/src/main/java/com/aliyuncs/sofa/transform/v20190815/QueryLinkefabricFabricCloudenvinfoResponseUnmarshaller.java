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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCloudenvinfoResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricCloudenvinfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricCloudenvinfoResponseUnmarshaller {

	public static QueryLinkefabricFabricCloudenvinfoResponse unmarshall(QueryLinkefabricFabricCloudenvinfoResponse queryLinkefabricFabricCloudenvinfoResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricCloudenvinfoResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricCloudenvinfoResponse.RequestId"));
		queryLinkefabricFabricCloudenvinfoResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricCloudenvinfoResponse.ResultCode"));
		queryLinkefabricFabricCloudenvinfoResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricCloudenvinfoResponse.ResultMessage"));
		queryLinkefabricFabricCloudenvinfoResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricCloudenvinfoResponse.Message"));
		queryLinkefabricFabricCloudenvinfoResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricCloudenvinfoResponse.ResponseStatusCode"));
		queryLinkefabricFabricCloudenvinfoResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricCloudenvinfoResponse.Success"));

		Data data = new Data();
		data.setLdc(_ctx.booleanValue("QueryLinkefabricFabricCloudenvinfoResponse.Data.Ldc"));
		data.setShareOpenAPI(_ctx.booleanValue("QueryLinkefabricFabricCloudenvinfoResponse.Data.ShareOpenAPI"));
		queryLinkefabricFabricCloudenvinfoResponse.setData(data);
	 
	 	return queryLinkefabricFabricCloudenvinfoResponse;
	}
}