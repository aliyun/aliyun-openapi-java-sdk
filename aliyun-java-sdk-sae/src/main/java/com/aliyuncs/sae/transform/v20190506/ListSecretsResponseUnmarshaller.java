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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListSecretsResponse;
import com.aliyuncs.sae.model.v20190506.ListSecretsResponse.Data;
import com.aliyuncs.sae.model.v20190506.ListSecretsResponse.Data.Secret;
import com.aliyuncs.sae.model.v20190506.ListSecretsResponse.Data.Secret.RelateApp;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecretsResponseUnmarshaller {

	public static ListSecretsResponse unmarshall(ListSecretsResponse listSecretsResponse, UnmarshallerContext _ctx) {
		
		listSecretsResponse.setRequestId(_ctx.stringValue("ListSecretsResponse.RequestId"));
		listSecretsResponse.setMessage(_ctx.stringValue("ListSecretsResponse.Message"));
		listSecretsResponse.setTraceId(_ctx.stringValue("ListSecretsResponse.TraceId"));
		listSecretsResponse.setErrorCode(_ctx.stringValue("ListSecretsResponse.ErrorCode"));
		listSecretsResponse.setCode(_ctx.stringValue("ListSecretsResponse.Code"));
		listSecretsResponse.setSuccess(_ctx.booleanValue("ListSecretsResponse.Success"));

		Data data = new Data();

		List<Secret> secrets = new ArrayList<Secret>();
		for (int i = 0; i < _ctx.lengthValue("ListSecretsResponse.Data.Secrets.Length"); i++) {
			Secret secret = new Secret();
			secret.setNamespaceId(_ctx.stringValue("ListSecretsResponse.Data.Secrets["+ i +"].NamespaceId"));
			secret.setSecretId(_ctx.longValue("ListSecretsResponse.Data.Secrets["+ i +"].SecretId"));
			secret.setSecretName(_ctx.stringValue("ListSecretsResponse.Data.Secrets["+ i +"].SecretName"));
			secret.setSecretType(_ctx.stringValue("ListSecretsResponse.Data.Secrets["+ i +"].SecretType"));
			secret.setSecretData(_ctx.mapValue("ListSecretsResponse.Data.Secrets["+ i +"].SecretData"));
			secret.setCreateTime(_ctx.longValue("ListSecretsResponse.Data.Secrets["+ i +"].CreateTime"));
			secret.setUpdateTime(_ctx.longValue("ListSecretsResponse.Data.Secrets["+ i +"].UpdateTime"));

			List<RelateApp> relateApps = new ArrayList<RelateApp>();
			for (int j = 0; j < _ctx.lengthValue("ListSecretsResponse.Data.Secrets["+ i +"].RelateApps.Length"); j++) {
				RelateApp relateApp = new RelateApp();
				relateApp.setAppName(_ctx.stringValue("ListSecretsResponse.Data.Secrets["+ i +"].RelateApps["+ j +"].AppName"));
				relateApp.setAppId(_ctx.stringValue("ListSecretsResponse.Data.Secrets["+ i +"].RelateApps["+ j +"].AppId"));

				relateApps.add(relateApp);
			}
			secret.setRelateApps(relateApps);

			secrets.add(secret);
		}
		data.setSecrets(secrets);
		listSecretsResponse.setData(data);
	 
	 	return listSecretsResponse;
	}
}