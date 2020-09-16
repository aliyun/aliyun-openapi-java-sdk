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

import com.aliyuncs.ahas_openapi.model.v20190901.GetUserApplicationsResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.GetUserApplicationsResponse.AppNameAndIdPairsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserApplicationsResponseUnmarshaller {

	public static GetUserApplicationsResponse unmarshall(GetUserApplicationsResponse getUserApplicationsResponse, UnmarshallerContext _ctx) {
		
		getUserApplicationsResponse.setRequestId(_ctx.stringValue("GetUserApplicationsResponse.RequestId"));
		getUserApplicationsResponse.setMessage(_ctx.stringValue("GetUserApplicationsResponse.Message"));
		getUserApplicationsResponse.setHttpStatusCode(_ctx.integerValue("GetUserApplicationsResponse.HttpStatusCode"));
		getUserApplicationsResponse.setSuccess(_ctx.booleanValue("GetUserApplicationsResponse.Success"));
		getUserApplicationsResponse.setCode(_ctx.stringValue("GetUserApplicationsResponse.Code"));

		List<AppNameAndIdPairsItem> appNameAndIdPairs = new ArrayList<AppNameAndIdPairsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserApplicationsResponse.AppNameAndIdPairs.Length"); i++) {
			AppNameAndIdPairsItem appNameAndIdPairsItem = new AppNameAndIdPairsItem();
			appNameAndIdPairsItem.setAppId(_ctx.stringValue("GetUserApplicationsResponse.AppNameAndIdPairs["+ i +"].AppId"));
			appNameAndIdPairsItem.setAppName(_ctx.stringValue("GetUserApplicationsResponse.AppNameAndIdPairs["+ i +"].AppName"));
			appNameAndIdPairsItem.setAppType(_ctx.integerValue("GetUserApplicationsResponse.AppNameAndIdPairs["+ i +"].AppType"));
			appNameAndIdPairsItem.setScopeType(_ctx.integerValue("GetUserApplicationsResponse.AppNameAndIdPairs["+ i +"].ScopeType"));

			appNameAndIdPairs.add(appNameAndIdPairsItem);
		}
		getUserApplicationsResponse.setAppNameAndIdPairs(appNameAndIdPairs);
	 
	 	return getUserApplicationsResponse;
	}
}