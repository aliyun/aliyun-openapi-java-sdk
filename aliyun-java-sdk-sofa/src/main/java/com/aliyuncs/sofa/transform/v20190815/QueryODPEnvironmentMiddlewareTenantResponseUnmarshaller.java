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

import com.aliyuncs.sofa.model.v20190815.QueryODPEnvironmentMiddlewareTenantResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPEnvironmentMiddlewareTenantResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPEnvironmentMiddlewareTenantResponseUnmarshaller {

	public static QueryODPEnvironmentMiddlewareTenantResponse unmarshall(QueryODPEnvironmentMiddlewareTenantResponse queryODPEnvironmentMiddlewareTenantResponse, UnmarshallerContext _ctx) {
		
		queryODPEnvironmentMiddlewareTenantResponse.setRequestId(_ctx.stringValue("QueryODPEnvironmentMiddlewareTenantResponse.RequestId"));
		queryODPEnvironmentMiddlewareTenantResponse.setResultCode(_ctx.stringValue("QueryODPEnvironmentMiddlewareTenantResponse.ResultCode"));
		queryODPEnvironmentMiddlewareTenantResponse.setResultMessage(_ctx.stringValue("QueryODPEnvironmentMiddlewareTenantResponse.ResultMessage"));

		Data data = new Data();
		data.setMiddleware(_ctx.booleanValue("QueryODPEnvironmentMiddlewareTenantResponse.Data.Middleware"));

		List<String> tenantList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPEnvironmentMiddlewareTenantResponse.Data.TenantList.Length"); i++) {
			tenantList.add(_ctx.stringValue("QueryODPEnvironmentMiddlewareTenantResponse.Data.TenantList["+ i +"]"));
		}
		data.setTenantList(tenantList);
		queryODPEnvironmentMiddlewareTenantResponse.setData(data);
	 
	 	return queryODPEnvironmentMiddlewareTenantResponse;
	}
}