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

import com.aliyuncs.csb.model.v20171118.ImportCredentialsResponse;
import com.aliyuncs.csb.model.v20171118.ImportCredentialsResponse.Data;
import com.aliyuncs.csb.model.v20171118.ImportCredentialsResponse.Data.Credentials;
import com.aliyuncs.csb.model.v20171118.ImportCredentialsResponse.Data.Credentials.CurrentCredential;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportCredentialsResponseUnmarshaller {

	public static ImportCredentialsResponse unmarshall(ImportCredentialsResponse importCredentialsResponse, UnmarshallerContext _ctx) {
		
		importCredentialsResponse.setRequestId(_ctx.stringValue("ImportCredentialsResponse.RequestId"));
		importCredentialsResponse.setCode(_ctx.integerValue("ImportCredentialsResponse.Code"));
		importCredentialsResponse.setMessage(_ctx.stringValue("ImportCredentialsResponse.Message"));

		Data data = new Data();

		Credentials credentials = new Credentials();
		credentials.setId(_ctx.longValue("ImportCredentialsResponse.Data.Credentials.Id"));

		CurrentCredential currentCredential = new CurrentCredential();
		currentCredential.setSecretKey(_ctx.stringValue("ImportCredentialsResponse.Data.Credentials.CurrentCredential.SecretKey"));
		currentCredential.setAccessKey(_ctx.stringValue("ImportCredentialsResponse.Data.Credentials.CurrentCredential.AccessKey"));
		credentials.setCurrentCredential(currentCredential);
		data.setCredentials(credentials);
		importCredentialsResponse.setData(data);
	 
	 	return importCredentialsResponse;
	}
}