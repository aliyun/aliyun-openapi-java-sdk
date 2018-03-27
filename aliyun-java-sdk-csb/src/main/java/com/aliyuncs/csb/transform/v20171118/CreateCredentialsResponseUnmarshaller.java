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

import com.aliyuncs.csb.model.v20171118.CreateCredentialsResponse;
import com.aliyuncs.csb.model.v20171118.CreateCredentialsResponse.Data;
import com.aliyuncs.csb.model.v20171118.CreateCredentialsResponse.Data.Credentials;
import com.aliyuncs.csb.model.v20171118.CreateCredentialsResponse.Data.Credentials.CurrentCredential;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCredentialsResponseUnmarshaller {

	public static CreateCredentialsResponse unmarshall(CreateCredentialsResponse createCredentialsResponse, UnmarshallerContext context) {
		
		createCredentialsResponse.setRequestId(context.stringValue("CreateCredentialsResponse.RequestId"));
		createCredentialsResponse.setCode(context.integerValue("CreateCredentialsResponse.Code"));
		createCredentialsResponse.setMessage(context.stringValue("CreateCredentialsResponse.Message"));

		Data data = new Data();

		Credentials credentials = new Credentials();
		credentials.setId(context.longValue("CreateCredentialsResponse.Data.Credentials.Id"));

		CurrentCredential currentCredential = new CurrentCredential();
		currentCredential.setSecretKey(context.stringValue("CreateCredentialsResponse.Data.Credentials.CurrentCredential.SecretKey"));
		currentCredential.setAccessKey(context.stringValue("CreateCredentialsResponse.Data.Credentials.CurrentCredential.AccessKey"));
		credentials.setCurrentCredential(currentCredential);
		data.setCredentials(credentials);
		createCredentialsResponse.setData(data);
	 
	 	return createCredentialsResponse;
	}
}