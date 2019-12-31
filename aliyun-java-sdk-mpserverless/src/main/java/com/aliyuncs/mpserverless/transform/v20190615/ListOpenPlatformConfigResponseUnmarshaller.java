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

package com.aliyuncs.mpserverless.transform.v20190615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpserverless.model.v20190615.ListOpenPlatformConfigResponse;
import com.aliyuncs.mpserverless.model.v20190615.ListOpenPlatformConfigResponse.Secret;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOpenPlatformConfigResponseUnmarshaller {

	public static ListOpenPlatformConfigResponse unmarshall(ListOpenPlatformConfigResponse listOpenPlatformConfigResponse, UnmarshallerContext _ctx) {
		
		listOpenPlatformConfigResponse.setRequestId(_ctx.stringValue("ListOpenPlatformConfigResponse.RequestId"));
		listOpenPlatformConfigResponse.setHttpStatusCode(_ctx.stringValue("ListOpenPlatformConfigResponse.HttpStatusCode"));
		listOpenPlatformConfigResponse.setSuccess(_ctx.booleanValue("ListOpenPlatformConfigResponse.Success"));
		listOpenPlatformConfigResponse.setCode(_ctx.stringValue("ListOpenPlatformConfigResponse.Code"));
		listOpenPlatformConfigResponse.setMessage(_ctx.stringValue("ListOpenPlatformConfigResponse.Message"));

		List<Secret> secretList = new ArrayList<Secret>();
		for (int i = 0; i < _ctx.lengthValue("ListOpenPlatformConfigResponse.SecretList.Length"); i++) {
			Secret secret = new Secret();
			secret.setAppId(_ctx.stringValue("ListOpenPlatformConfigResponse.SecretList["+ i +"].AppId"));
			secret.setPrivateKey(_ctx.stringValue("ListOpenPlatformConfigResponse.SecretList["+ i +"].PrivateKey"));
			secret.setPublicKey(_ctx.stringValue("ListOpenPlatformConfigResponse.SecretList["+ i +"].PublicKey"));
			secret.setSpaceId(_ctx.stringValue("ListOpenPlatformConfigResponse.SecretList["+ i +"].SpaceId"));
			secret.setPlatform(_ctx.stringValue("ListOpenPlatformConfigResponse.SecretList["+ i +"].Platform"));
			secret.setAppSecret(_ctx.stringValue("ListOpenPlatformConfigResponse.SecretList["+ i +"].AppSecret"));

			secretList.add(secret);
		}
		listOpenPlatformConfigResponse.setSecretList(secretList);
	 
	 	return listOpenPlatformConfigResponse;
	}
}