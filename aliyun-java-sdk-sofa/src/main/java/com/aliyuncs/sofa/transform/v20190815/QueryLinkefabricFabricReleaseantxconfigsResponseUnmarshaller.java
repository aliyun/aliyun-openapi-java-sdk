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

import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricReleaseantxconfigsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkefabricFabricReleaseantxconfigsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkefabricFabricReleaseantxconfigsResponseUnmarshaller {

	public static QueryLinkefabricFabricReleaseantxconfigsResponse unmarshall(QueryLinkefabricFabricReleaseantxconfigsResponse queryLinkefabricFabricReleaseantxconfigsResponse, UnmarshallerContext _ctx) {
		
		queryLinkefabricFabricReleaseantxconfigsResponse.setRequestId(_ctx.stringValue("QueryLinkefabricFabricReleaseantxconfigsResponse.RequestId"));
		queryLinkefabricFabricReleaseantxconfigsResponse.setResultCode(_ctx.stringValue("QueryLinkefabricFabricReleaseantxconfigsResponse.ResultCode"));
		queryLinkefabricFabricReleaseantxconfigsResponse.setResultMessage(_ctx.stringValue("QueryLinkefabricFabricReleaseantxconfigsResponse.ResultMessage"));
		queryLinkefabricFabricReleaseantxconfigsResponse.setMessage(_ctx.stringValue("QueryLinkefabricFabricReleaseantxconfigsResponse.Message"));
		queryLinkefabricFabricReleaseantxconfigsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkefabricFabricReleaseantxconfigsResponse.ResponseStatusCode"));
		queryLinkefabricFabricReleaseantxconfigsResponse.setSuccess(_ctx.booleanValue("QueryLinkefabricFabricReleaseantxconfigsResponse.Success"));

		Data data = new Data();
		data.setAppConfigMap(_ctx.stringValue("QueryLinkefabricFabricReleaseantxconfigsResponse.Data.AppConfigMap"));
		data.setReleaseId(_ctx.stringValue("QueryLinkefabricFabricReleaseantxconfigsResponse.Data.ReleaseId"));

		List<String> appList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkefabricFabricReleaseantxconfigsResponse.Data.AppList.Length"); i++) {
			appList.add(_ctx.stringValue("QueryLinkefabricFabricReleaseantxconfigsResponse.Data.AppList["+ i +"]"));
		}
		data.setAppList(appList);
		queryLinkefabricFabricReleaseantxconfigsResponse.setData(data);
	 
	 	return queryLinkefabricFabricReleaseantxconfigsResponse;
	}
}