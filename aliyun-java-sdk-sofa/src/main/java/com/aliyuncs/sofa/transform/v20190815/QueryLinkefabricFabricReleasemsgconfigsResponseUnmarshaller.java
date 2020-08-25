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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricReleasemsgconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricReleasemsgconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricReleasemsgconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricReleasemsgconfigsResponse unmarshall(QueryLinkefabricFabricReleasemsgconfigsResponse queryLinkefabricFabricReleasemsgconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricReleasemsgconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricReleasemsgconfigsResponse.RequestId"));
		queryLinkefabricFabricReleasemsgconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricReleasemsgconfigsResponse.ResultCode"));
		queryLinkefabricFabricReleasemsgconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricReleasemsgconfigsResponse.ResultMessage"));
		queryLinkefabricFabricReleasemsgconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricReleasemsgconfigsResponse.Message"));
		queryLinkefabricFabricReleasemsgconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricReleasemsgconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricReleasemsgconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricReleasemsgconfigsResponse.Success"));

		Data data = new Data();
		data.setAppConfigMap(_ctx.stringValue("QueryLinkefabricFabricReleasemsgconfigsResponse.Data.AppConfigMap"));
		data.setReleaseId(_ctx.stringValue("QueryLinkefabricFabricReleasemsgconfigsResponse.Data.ReleaseId"));

		List<String> appList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricReleasemsgconfigsResponse.Data.AppList.Length"); i++) {
			appList.add(_ctx.stringValue("QueryLinkefabricFabricReleasemsgconfigsResponse.Data.AppList["+ i +"]"));
		}
		data.setAppList(appList);
		queryLinkefabricFabricReleasemsgconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricReleasemsgconfigsResponse;
	}
}