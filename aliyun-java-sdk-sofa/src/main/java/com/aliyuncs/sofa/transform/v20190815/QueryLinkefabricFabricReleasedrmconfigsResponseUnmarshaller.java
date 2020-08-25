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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricReleasedrmconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricReleasedrmconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricReleasedrmconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricReleasedrmconfigsResponse unmarshall(QueryLinkefabricFabricReleasedrmconfigsResponse queryLinkefabricFabricReleasedrmconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricReleasedrmconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricReleasedrmconfigsResponse.RequestId"));
		queryLinkefabricFabricReleasedrmconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricReleasedrmconfigsResponse.ResultCode"));
		queryLinkefabricFabricReleasedrmconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricReleasedrmconfigsResponse.ResultMessage"));
		queryLinkefabricFabricReleasedrmconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricReleasedrmconfigsResponse.Message"));
		queryLinkefabricFabricReleasedrmconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricReleasedrmconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricReleasedrmconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricReleasedrmconfigsResponse.Success"));

		Data data = new Data();
		data.setAppConfigMap(_ctx.stringValue("QueryLinkefabricFabricReleasedrmconfigsResponse.Data.AppConfigMap"));
		data.setReleaseId(_ctx.stringValue("QueryLinkefabricFabricReleasedrmconfigsResponse.Data.ReleaseId"));

		List<String> appList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricReleasedrmconfigsResponse.Data.AppList.Length"); i++) {
			appList.add(_ctx.stringValue("QueryLinkefabricFabricReleasedrmconfigsResponse.Data.AppList["+ i +"]"));
		}
		data.setAppList(appList);
		queryLinkefabricFabricReleasedrmconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricReleasedrmconfigsResponse;
	}
}