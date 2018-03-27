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

import com.aliyuncs.csb.model.v20171118.RenewCredentialsResponse;
import com.aliyuncs.csb.model.v20171118.RenewCredentialsResponse.Data;
import com.aliyuncs.csb.model.v20171118.RenewCredentialsResponse.Data.Credentials;
import com.aliyuncs.csb.model.v20171118.RenewCredentialsResponse.Data.Credentials.CurrentCredential;
import com.aliyuncs.csb.model.v20171118.RenewCredentialsResponse.Data.Credentials.NewCredential;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewCredentialsResponseUnmarshaller {

	public static RenewCredentialsResponse unmarshall(RenewCredentialsResponse renewCredentialsResponse, UnmarshallerContext context) {
		
		renewCredentialsResponse.setRequestId(context.stringValue("RenewCredentialsResponse.RequestId"));
		renewCredentialsResponse.setCode(context.integerValue("RenewCredentialsResponse.Code"));
		renewCredentialsResponse.setMessage(context.stringValue("RenewCredentialsResponse.Message"));

		Data data = new Data();

		Credentials credentials = new Credentials();
		credentials.setGmtCreate(context.longValue("RenewCredentialsResponse.Data.Credentials.GmtCreate"));
		credentials.setId(context.longValue("RenewCredentialsResponse.Data.Credentials.Id"));
		credentials.setName(context.stringValue("RenewCredentialsResponse.Data.Credentials.Name"));
		credentials.setUserId(context.stringValue("RenewCredentialsResponse.Data.Credentials.UserId"));

		CurrentCredential currentCredential = new CurrentCredential();
		currentCredential.setAccessKey(context.stringValue("RenewCredentialsResponse.Data.Credentials.CurrentCredential.AccessKey"));
		currentCredential.setSecretKey(context.stringValue("RenewCredentialsResponse.Data.Credentials.CurrentCredential.SecretKey"));
		credentials.setCurrentCredential(currentCredential);

		NewCredential newCredential = new NewCredential();
		newCredential.setAccessKey(context.stringValue("RenewCredentialsResponse.Data.Credentials.NewCredential.AccessKey"));
		newCredential.setSecretKey(context.stringValue("RenewCredentialsResponse.Data.Credentials.NewCredential.SecretKey"));
		credentials.setNewCredential(newCredential);
		data.setCredentials(credentials);
		renewCredentialsResponse.setData(data);
	 
	 	return renewCredentialsResponse;
	}
}