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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSoftwareconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricSoftwareconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricSoftwareconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricSoftwareconfigsResponse unmarshall(QueryLinkefabricFabricSoftwareconfigsResponse queryLinkefabricFabricSoftwareconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricSoftwareconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricSoftwareconfigsResponse.RequestId"));
		queryLinkefabricFabricSoftwareconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricSoftwareconfigsResponse.ResultCode"));
		queryLinkefabricFabricSoftwareconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricSoftwareconfigsResponse.ResultMessage"));
		queryLinkefabricFabricSoftwareconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricSoftwareconfigsResponse.Message"));
		queryLinkefabricFabricSoftwareconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricSoftwareconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricSoftwareconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricSoftwareconfigsResponse.Success"));

		Data data = new Data();
		data.setAppConfigMap(_ctx.stringValue("QueryLinkefabricFabricSoftwareconfigsResponse.Data.AppConfigMap"));
		data.setReleaseId(_ctx.stringValue("QueryLinkefabricFabricSoftwareconfigsResponse.Data.ReleaseId"));

		List<String> appList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricSoftwareconfigsResponse.Data.AppList.Length"); i++) {
			appList.add(_ctx.stringValue("QueryLinkefabricFabricSoftwareconfigsResponse.Data.AppList["+ i +"]"));
		}
		data.setAppList(appList);
		queryLinkefabricFabricSoftwareconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricSoftwareconfigsResponse;
	}
}