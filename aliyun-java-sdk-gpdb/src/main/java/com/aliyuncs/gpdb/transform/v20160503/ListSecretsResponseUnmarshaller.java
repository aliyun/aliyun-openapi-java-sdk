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

import com.aliyuncs.gpdb.model.v20160503.ListSecretsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListSecretsResponse.SecretsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecretsResponseUnmarshaller {

	public static ListSecretsResponse unmarshall(ListSecretsResponse listSecretsResponse, UnmarshallerContext _ctx) {
		
		listSecretsResponse.setRequestId(_ctx.stringValue("ListSecretsResponse.RequestId"));
		listSecretsResponse.setMessage(_ctx.stringValue("ListSecretsResponse.Message"));
		listSecretsResponse.setStatus(_ctx.stringValue("ListSecretsResponse.Status"));
		listSecretsResponse.setCount(_ctx.longValue("ListSecretsResponse.Count"));

		List<SecretsItem> secrets = new ArrayList<SecretsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSecretsResponse.Secrets.Length"); i++) {
			SecretsItem secretsItem = new SecretsItem();
			secretsItem.setAccountId(_ctx.stringValue("ListSecretsResponse.Secrets["+ i +"].AccountId"));
			secretsItem.setRegionId(_ctx.stringValue("ListSecretsResponse.Secrets["+ i +"].RegionId"));
			secretsItem.setDBInstanceId(_ctx.stringValue("ListSecretsResponse.Secrets["+ i +"].DBInstanceId"));
			secretsItem.setSecretName(_ctx.stringValue("ListSecretsResponse.Secrets["+ i +"].SecretName"));
			secretsItem.setSecretArn(_ctx.stringValue("ListSecretsResponse.Secrets["+ i +"].SecretArn"));
			secretsItem.setDescription(_ctx.stringValue("ListSecretsResponse.Secrets["+ i +"].Description"));
			secretsItem.setUsername(_ctx.stringValue("ListSecretsResponse.Secrets["+ i +"].Username"));

			secrets.add(secretsItem);
		}
		listSecretsResponse.setSecrets(secrets);
	 
	 	return listSecretsResponse;
	}
}