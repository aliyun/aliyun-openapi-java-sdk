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

package com.aliyuncs.csb.transform.v20171118;

import com.aliyuncs.csb.model.v20171118.ReplaceCredentialResponse;
import com.aliyuncs.csb.model.v20171118.ReplaceCredentialResponse.Data;
import com.aliyuncs.csb.model.v20171118.ReplaceCredentialResponse.Data.Credentials;
import com.aliyuncs.csb.model.v20171118.ReplaceCredentialResponse.Data.Credentials.CurrentCredential;
import com.aliyuncs.csb.model.v20171118.ReplaceCredentialResponse.Data.Credentials.NewCredential;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReplaceCredentialResponseUnmarshaller {

	public static ReplaceCredentialResponse unmarshall(ReplaceCredentialResponse replaceCredentialResponse, UnmarshallerContext context) {
		
		replaceCredentialResponse.setRequestId(context.stringValue("ReplaceCredentialResponse.RequestId"));
		replaceCredentialResponse.setCode(context.integerValue("ReplaceCredentialResponse.Code"));
		replaceCredentialResponse.setMessage(context.stringValue("ReplaceCredentialResponse.Message"));

		Data data = new Data();

		Credentials credentials = new Credentials();
		credentials.setGmtCreate(context.longValue("ReplaceCredentialResponse.Data.Credentials.GmtCreate"));
		credentials.setId(context.longValue("ReplaceCredentialResponse.Data.Credentials.Id"));
		credentials.setName(context.stringValue("ReplaceCredentialResponse.Data.Credentials.Name"));
		credentials.setUserId(context.stringValue("ReplaceCredentialResponse.Data.Credentials.UserId"));

		CurrentCredential currentCredential = new CurrentCredential();
		currentCredential.setAccessKey(context.stringValue("ReplaceCredentialResponse.Data.Credentials.CurrentCredential.AccessKey"));
		currentCredential.setSecretKey(context.stringValue("ReplaceCredentialResponse.Data.Credentials.CurrentCredential.SecretKey"));
		credentials.setCurrentCredential(currentCredential);

		NewCredential newCredential = new NewCredential();
		newCredential.setAccessKey(context.stringValue("ReplaceCredentialResponse.Data.Credentials.NewCredential.AccessKey"));
		newCredential.setSecretKey(context.stringValue("ReplaceCredentialResponse.Data.Credentials.NewCredential.SecretKey"));
		credentials.setNewCredential(newCredential);
		data.setCredentials(credentials);
		replaceCredentialResponse.setData(data);
	 
	 	return replaceCredentialResponse;
	}
}