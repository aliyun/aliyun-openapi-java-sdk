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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListApiGatewayAppsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListApiGatewayAppsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApiGatewayAppsResponseUnmarshaller {

	public static ListApiGatewayAppsResponse unmarshall(ListApiGatewayAppsResponse listApiGatewayAppsResponse, UnmarshallerContext _ctx) {
		
		listApiGatewayAppsResponse.setRequestId(_ctx.stringValue("ListApiGatewayAppsResponse.RequestId"));

		List<Result> apiGatewayApps = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("ListApiGatewayAppsResponse.ApiGatewayApps.Length"); i++) {
			Result result = new Result();
			result.setId(_ctx.longValue("ListApiGatewayAppsResponse.ApiGatewayApps["+ i +"].Id"));
			result.setProjectId(_ctx.stringValue("ListApiGatewayAppsResponse.ApiGatewayApps["+ i +"].ProjectId"));
			result.setUserId(_ctx.stringValue("ListApiGatewayAppsResponse.ApiGatewayApps["+ i +"].UserId"));
			result.setStatus(_ctx.integerValue("ListApiGatewayAppsResponse.ApiGatewayApps["+ i +"].Status"));
			result.setGmtCreate(_ctx.longValue("ListApiGatewayAppsResponse.ApiGatewayApps["+ i +"].GmtCreate"));
			result.setGmtModified(_ctx.longValue("ListApiGatewayAppsResponse.ApiGatewayApps["+ i +"].GmtModified"));
			result.setGatewayAppKey(_ctx.stringValue("ListApiGatewayAppsResponse.ApiGatewayApps["+ i +"].GatewayAppKey"));
			result.setGatewayAppSecret(_ctx.stringValue("ListApiGatewayAppsResponse.ApiGatewayApps["+ i +"].GatewayAppSecret"));
			result.setGatewayAppId(_ctx.stringValue("ListApiGatewayAppsResponse.ApiGatewayApps["+ i +"].GatewayAppId"));

			apiGatewayApps.add(result);
		}
		listApiGatewayAppsResponse.setApiGatewayApps(apiGatewayApps);
	 
	 	return listApiGatewayAppsResponse;
	}
}