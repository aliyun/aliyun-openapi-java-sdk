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

import com.aliyuncs.gpdb.model.v20160503.GetWorkspaceResponse;
import com.aliyuncs.gpdb.model.v20160503.GetWorkspaceResponse.ApiKeysItem;
import com.aliyuncs.gpdb.model.v20160503.GetWorkspaceResponse.ApiKeysItem.AuthServicesItem;
import com.aliyuncs.gpdb.model.v20160503.GetWorkspaceResponse.ServicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetWorkspaceResponseUnmarshaller {

	public static GetWorkspaceResponse unmarshall(GetWorkspaceResponse getWorkspaceResponse, UnmarshallerContext _ctx) {
		
		getWorkspaceResponse.setRequestId(_ctx.stringValue("GetWorkspaceResponse.RequestId"));
		getWorkspaceResponse.setCreateTime(_ctx.stringValue("GetWorkspaceResponse.CreateTime"));
		getWorkspaceResponse.setWorkspaceId(_ctx.stringValue("GetWorkspaceResponse.WorkspaceId"));
		getWorkspaceResponse.setWorkspaceName(_ctx.stringValue("GetWorkspaceResponse.WorkspaceName"));

		List<ServicesItem> services = new ArrayList<ServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkspaceResponse.Services.Length"); i++) {
			ServicesItem servicesItem = new ServicesItem();
			servicesItem.setStatus(_ctx.stringValue("GetWorkspaceResponse.Services["+ i +"].Status"));
			servicesItem.setCu(_ctx.stringValue("GetWorkspaceResponse.Services["+ i +"].Cu"));
			servicesItem.setServiceName(_ctx.stringValue("GetWorkspaceResponse.Services["+ i +"].ServiceName"));
			servicesItem.setServiceType(_ctx.stringValue("GetWorkspaceResponse.Services["+ i +"].ServiceType"));
			servicesItem.setCreateTime(_ctx.stringValue("GetWorkspaceResponse.Services["+ i +"].CreateTime"));
			servicesItem.setPayType(_ctx.stringValue("GetWorkspaceResponse.Services["+ i +"].PayType"));
			servicesItem.setExpireTime(_ctx.stringValue("GetWorkspaceResponse.Services["+ i +"].ExpireTime"));
			servicesItem.setServiceId(_ctx.stringValue("GetWorkspaceResponse.Services["+ i +"].ServiceId"));

			services.add(servicesItem);
		}
		getWorkspaceResponse.setServices(services);

		List<ApiKeysItem> apikeys = new ArrayList<ApiKeysItem>();
		for (int i = 0; i < _ctx.lengthValue("GetWorkspaceResponse.Apikeys.Length"); i++) {
			ApiKeysItem apiKeysItem = new ApiKeysItem();
			apiKeysItem.setKeyName(_ctx.stringValue("GetWorkspaceResponse.Apikeys["+ i +"].KeyName"));
			apiKeysItem.setDescription(_ctx.stringValue("GetWorkspaceResponse.Apikeys["+ i +"].Description"));
			apiKeysItem.setCreateTime(_ctx.stringValue("GetWorkspaceResponse.Apikeys["+ i +"].CreateTime"));
			apiKeysItem.setKeyId(_ctx.stringValue("GetWorkspaceResponse.Apikeys["+ i +"].KeyId"));
			apiKeysItem.setKeyPrefix(_ctx.stringValue("GetWorkspaceResponse.Apikeys["+ i +"].KeyPrefix"));

			List<AuthServicesItem> authServices = new ArrayList<AuthServicesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetWorkspaceResponse.Apikeys["+ i +"].AuthServices.Length"); j++) {
				AuthServicesItem authServicesItem = new AuthServicesItem();
				authServicesItem.setServiceType(_ctx.stringValue("GetWorkspaceResponse.Apikeys["+ i +"].AuthServices["+ j +"].ServiceType"));
				authServicesItem.setServiceId(_ctx.stringValue("GetWorkspaceResponse.Apikeys["+ i +"].AuthServices["+ j +"].ServiceId"));

				authServices.add(authServicesItem);
			}
			apiKeysItem.setAuthServices(authServices);

			apikeys.add(apiKeysItem);
		}
		getWorkspaceResponse.setApikeys(apikeys);
	 
	 	return getWorkspaceResponse;
	}
}