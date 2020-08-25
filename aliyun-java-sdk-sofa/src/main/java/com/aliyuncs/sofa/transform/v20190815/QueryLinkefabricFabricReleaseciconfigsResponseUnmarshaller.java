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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricReleaseciconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricReleaseciconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricReleaseciconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricReleaseciconfigsResponse unmarshall(QueryLinkefabricFabricReleaseciconfigsResponse queryLinkefabricFabricReleaseciconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricReleaseciconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricReleaseciconfigsResponse.RequestId"));
		queryLinkefabricFabricReleaseciconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricReleaseciconfigsResponse.ResultCode"));
		queryLinkefabricFabricReleaseciconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricReleaseciconfigsResponse.ResultMessage"));
		queryLinkefabricFabricReleaseciconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricReleaseciconfigsResponse.Message"));
		queryLinkefabricFabricReleaseciconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricReleaseciconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricReleaseciconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricReleaseciconfigsResponse.Success"));

		Data data = new Data();
		data.setAppConfigMap(_ctx.stringValue("QueryLinkefabricFabricReleaseciconfigsResponse.Data.AppConfigMap"));
		data.setReleaseId(_ctx.stringValue("QueryLinkefabricFabricReleaseciconfigsResponse.Data.ReleaseId"));

		List<String> appList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricReleaseciconfigsResponse.Data.AppList.Length"); i++) {
			appList.add(_ctx.stringValue("QueryLinkefabricFabricReleaseciconfigsResponse.Data.AppList["+ i +"]"));
		}
		data.setAppList(appList);
		queryLinkefabricFabricReleaseciconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricReleaseciconfigsResponse;
	}
}