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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSchedulerconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSchedulerconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricSchedulerconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricSchedulerconfigsResponse unmarshall(QueryLinkefabricFabricSchedulerconfigsResponse queryLinkefabricFabricSchedulerconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricSchedulerconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsResponse.RequestId"));
		queryLinkefabricFabricSchedulerconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsResponse.ResultCode"));
		queryLinkefabricFabricSchedulerconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsResponse.ResultMessage"));
		queryLinkefabricFabricSchedulerconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsResponse.Message"));
		queryLinkefabricFabricSchedulerconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricSchedulerconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricSchedulerconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricSchedulerconfigsResponse.Success"));

		Data data = new Data();
		data.setAppConfigMap(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsResponse.Data.AppConfigMap"));
		data.setReleaseId(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsResponse.Data.ReleaseId"));

		List<String> appList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricSchedulerconfigsResponse.Data.AppList.Length"); i++) {
			appList.add(_ctx.stringValue("QueryLinkefabricFabricSchedulerconfigsResponse.Data.AppList["+ i +"]"));
		}
		data.setAppList(appList);
		queryLinkefabricFabricSchedulerconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricSchedulerconfigsResponse;
	}
}