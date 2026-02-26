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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListApplicationClientSecretsResponse;
import com.aliyuncs.eiam.model.v20211201.ListApplicationClientSecretsResponse.ApplicationClientSecret;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationClientSecretsResponseUnmarshaller {

	public static ListApplicationClientSecretsResponse unmarshall(ListApplicationClientSecretsResponse listApplicationClientSecretsResponse, UnmarshallerContext _ctx) {
		
		listApplicationClientSecretsResponse.setRequestId(_ctx.stringValue("ListApplicationClientSecretsResponse.RequestId"));
		listApplicationClientSecretsResponse.setTotalCount(_ctx.longValue("ListApplicationClientSecretsResponse.TotalCount"));

		List<ApplicationClientSecret> applicationClientSecrets = new ArrayList<ApplicationClientSecret>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationClientSecretsResponse.ApplicationClientSecrets.Length"); i++) {
			ApplicationClientSecret applicationClientSecret = new ApplicationClientSecret();
			applicationClientSecret.setInstanceId(_ctx.stringValue("ListApplicationClientSecretsResponse.ApplicationClientSecrets["+ i +"].InstanceId"));
			applicationClientSecret.setApplicationId(_ctx.stringValue("ListApplicationClientSecretsResponse.ApplicationClientSecrets["+ i +"].ApplicationId"));
			applicationClientSecret.setClientId(_ctx.stringValue("ListApplicationClientSecretsResponse.ApplicationClientSecrets["+ i +"].ClientId"));
			applicationClientSecret.setSecretId(_ctx.stringValue("ListApplicationClientSecretsResponse.ApplicationClientSecrets["+ i +"].SecretId"));
			applicationClientSecret.setClientSecret(_ctx.stringValue("ListApplicationClientSecretsResponse.ApplicationClientSecrets["+ i +"].ClientSecret"));
			applicationClientSecret.setStatus(_ctx.stringValue("ListApplicationClientSecretsResponse.ApplicationClientSecrets["+ i +"].Status"));
			applicationClientSecret.setLastUsedTime(_ctx.longValue("ListApplicationClientSecretsResponse.ApplicationClientSecrets["+ i +"].LastUsedTime"));
			applicationClientSecret.setExpirationTime(_ctx.longValue("ListApplicationClientSecretsResponse.ApplicationClientSecrets["+ i +"].ExpirationTime"));

			applicationClientSecrets.add(applicationClientSecret);
		}
		listApplicationClientSecretsResponse.setApplicationClientSecrets(applicationClientSecrets);
	 
	 	return listApplicationClientSecretsResponse;
	}
}