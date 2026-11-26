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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.GetApiKeyResponse;
import com.aliyuncs.gpdb.model.v20160503.GetApiKeyResponse.AuthServicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApiKeyResponseUnmarshaller {

	public static GetApiKeyResponse unmarshall(GetApiKeyResponse getApiKeyResponse, UnmarshallerContext _ctx) {
		
		getApiKeyResponse.setRequestId(_ctx.stringValue("GetApiKeyResponse.RequestId"));
		getApiKeyResponse.setKeyName(_ctx.stringValue("GetApiKeyResponse.KeyName"));
		getApiKeyResponse.setApiKey(_ctx.stringValue("GetApiKeyResponse.ApiKey"));
		getApiKeyResponse.setDescription(_ctx.stringValue("GetApiKeyResponse.Description"));
		getApiKeyResponse.setCreateTime(_ctx.stringValue("GetApiKeyResponse.CreateTime"));
		getApiKeyResponse.setKeyId(_ctx.stringValue("GetApiKeyResponse.KeyId"));
		getApiKeyResponse.setKeyPrefix(_ctx.stringValue("GetApiKeyResponse.KeyPrefix"));

		List<AuthServicesItem> authServices = new ArrayList<AuthServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetApiKeyResponse.AuthServices.Length"); i++) {
			AuthServicesItem authServicesItem = new AuthServicesItem();
			authServicesItem.setServiceType(_ctx.stringValue("GetApiKeyResponse.AuthServices["+ i +"].ServiceType"));
			authServicesItem.setServiceId(_ctx.stringValue("GetApiKeyResponse.AuthServices["+ i +"].ServiceId"));

			authServices.add(authServicesItem);
		}
		getApiKeyResponse.setAuthServices(authServices);
	 
	 	return getApiKeyResponse;
	}
}