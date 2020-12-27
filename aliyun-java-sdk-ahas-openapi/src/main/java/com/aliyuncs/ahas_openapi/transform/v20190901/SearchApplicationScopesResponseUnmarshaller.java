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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.SearchApplicationScopesResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.SearchApplicationScopesResponse.UserApplication;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchApplicationScopesResponseUnmarshaller {

	public static SearchApplicationScopesResponse unmarshall(SearchApplicationScopesResponse searchApplicationScopesResponse, UnmarshallerContext _ctx) {
		
		searchApplicationScopesResponse.setRequestId(_ctx.stringValue("SearchApplicationScopesResponse.RequestId"));
		searchApplicationScopesResponse.setMessage(_ctx.stringValue("SearchApplicationScopesResponse.Message"));
		searchApplicationScopesResponse.setHttpStatusCode(_ctx.integerValue("SearchApplicationScopesResponse.HttpStatusCode"));
		searchApplicationScopesResponse.setSuccess(_ctx.booleanValue("SearchApplicationScopesResponse.Success"));
		searchApplicationScopesResponse.setCode(_ctx.stringValue("SearchApplicationScopesResponse.Code"));

		List<UserApplication> content = new ArrayList<UserApplication>();
		for (int i = 0; i < _ctx.lengthValue("SearchApplicationScopesResponse.Content.Length"); i++) {
			UserApplication userApplication = new UserApplication();
			userApplication.setAppName(_ctx.stringValue("SearchApplicationScopesResponse.Content["+ i +"].AppName"));
			userApplication.setNamespace(_ctx.stringValue("SearchApplicationScopesResponse.Content["+ i +"].Namespace"));
			userApplication.setGroupName(_ctx.stringValue("SearchApplicationScopesResponse.Content["+ i +"].GroupName"));
			userApplication.setDeviceName(_ctx.stringValue("SearchApplicationScopesResponse.Content["+ i +"].DeviceName"));
			userApplication.setPrivateIp(_ctx.stringValue("SearchApplicationScopesResponse.Content["+ i +"].PrivateIp"));
			userApplication.setPublicIp(_ctx.stringValue("SearchApplicationScopesResponse.Content["+ i +"].PublicIp"));
			userApplication.setDeviceType(_ctx.integerValue("SearchApplicationScopesResponse.Content["+ i +"].DeviceType"));
			userApplication.setHostConfigurationId(_ctx.stringValue("SearchApplicationScopesResponse.Content["+ i +"].HostConfigurationId"));
			userApplication.setConfigurationId(_ctx.stringValue("SearchApplicationScopesResponse.Content["+ i +"].ConfigurationId"));
			userApplication.setUserId(_ctx.stringValue("SearchApplicationScopesResponse.Content["+ i +"].UserId"));
			userApplication.setClusterId(_ctx.stringValue("SearchApplicationScopesResponse.Content["+ i +"].ClusterId"));
			userApplication.setAppId(_ctx.longValue("SearchApplicationScopesResponse.Content["+ i +"].AppId"));
			userApplication.setStatus(_ctx.integerValue("SearchApplicationScopesResponse.Content["+ i +"].Status"));

			content.add(userApplication);
		}
		searchApplicationScopesResponse.setContent(content);
	 
	 	return searchApplicationScopesResponse;
	}
}