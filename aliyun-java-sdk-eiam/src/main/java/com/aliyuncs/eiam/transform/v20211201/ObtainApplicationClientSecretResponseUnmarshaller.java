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

package com.aliyuncs.eiam.transform.v20211201;

import com.aliyuncs.eiam.model.v20211201.ObtainApplicationClientSecretResponse;
import com.aliyuncs.eiam.model.v20211201.ObtainApplicationClientSecretResponse.ApplicationClientSecret;
import com.aliyuncs.transform.UnmarshallerContext;


public class ObtainApplicationClientSecretResponseUnmarshaller {

	public static ObtainApplicationClientSecretResponse unmarshall(ObtainApplicationClientSecretResponse obtainApplicationClientSecretResponse, UnmarshallerContext _ctx) {
		
		obtainApplicationClientSecretResponse.setRequestId(_ctx.stringValue("ObtainApplicationClientSecretResponse.RequestId"));

		ApplicationClientSecret applicationClientSecret = new ApplicationClientSecret();
		applicationClientSecret.setInstanceId(_ctx.stringValue("ObtainApplicationClientSecretResponse.ApplicationClientSecret.InstanceId"));
		applicationClientSecret.setApplicationId(_ctx.stringValue("ObtainApplicationClientSecretResponse.ApplicationClientSecret.ApplicationId"));
		applicationClientSecret.setClientId(_ctx.stringValue("ObtainApplicationClientSecretResponse.ApplicationClientSecret.ClientId"));
		applicationClientSecret.setSecretId(_ctx.stringValue("ObtainApplicationClientSecretResponse.ApplicationClientSecret.SecretId"));
		applicationClientSecret.setClientSecret(_ctx.stringValue("ObtainApplicationClientSecretResponse.ApplicationClientSecret.ClientSecret"));
		applicationClientSecret.setStatus(_ctx.stringValue("ObtainApplicationClientSecretResponse.ApplicationClientSecret.Status"));
		applicationClientSecret.setLastUsedTime(_ctx.longValue("ObtainApplicationClientSecretResponse.ApplicationClientSecret.LastUsedTime"));
		obtainApplicationClientSecretResponse.setApplicationClientSecret(applicationClientSecret);
	 
	 	return obtainApplicationClientSecretResponse;
	}
}