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

package com.aliyuncs.cds.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cds.model.v20170925.GetCredentialsResponse;
import com.aliyuncs.cds.model.v20170925.GetCredentialsResponse.Credential;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCredentialsResponseUnmarshaller {

	public static GetCredentialsResponse unmarshall(GetCredentialsResponse getCredentialsResponse, UnmarshallerContext context) {
		
		getCredentialsResponse.setRequestId(context.stringValue("GetCredentialsResponse.RequestId"));

		List<Credential> credentials = new ArrayList<Credential>();
		for (int i = 0; i < context.lengthValue("GetCredentialsResponse.Credentials.Length"); i++) {
			Credential credential = new Credential();
			credential.setCredentialId(context.stringValue("GetCredentialsResponse.Credentials["+ i +"].CredentialId"));
			credential.setCredentialType(context.stringValue("GetCredentialsResponse.Credentials["+ i +"].CredentialType"));

			credentials.add(credential);
		}
		getCredentialsResponse.setCredentials(credentials);
	 
	 	return getCredentialsResponse;
	}
}