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

import com.aliyuncs.eiam.model.v20211201.ListApplicationFederatedCredentialsResponse;
import com.aliyuncs.eiam.model.v20211201.ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredential;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationFederatedCredentialsResponseUnmarshaller {

	public static ListApplicationFederatedCredentialsResponse unmarshall(ListApplicationFederatedCredentialsResponse listApplicationFederatedCredentialsResponse, UnmarshallerContext _ctx) {
		
		listApplicationFederatedCredentialsResponse.setRequestId(_ctx.stringValue("ListApplicationFederatedCredentialsResponse.RequestId"));
		listApplicationFederatedCredentialsResponse.setTotalCount(_ctx.longValue("ListApplicationFederatedCredentialsResponse.TotalCount"));
		listApplicationFederatedCredentialsResponse.setNextToken(_ctx.stringValue("ListApplicationFederatedCredentialsResponse.NextToken"));
		listApplicationFederatedCredentialsResponse.setPreviousToken(_ctx.stringValue("ListApplicationFederatedCredentialsResponse.PreviousToken"));
		listApplicationFederatedCredentialsResponse.setMaxResults(_ctx.integerValue("ListApplicationFederatedCredentialsResponse.MaxResults"));

		List<ApplicationFederatedCredential> applicationFederatedCredentials = new ArrayList<ApplicationFederatedCredential>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials.Length"); i++) {
			ApplicationFederatedCredential applicationFederatedCredential = new ApplicationFederatedCredential();
			applicationFederatedCredential.setStatus(_ctx.stringValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials["+ i +"].Status"));
			applicationFederatedCredential.setDescription(_ctx.stringValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials["+ i +"].Description"));
			applicationFederatedCredential.setInstanceId(_ctx.stringValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials["+ i +"].InstanceId"));
			applicationFederatedCredential.setApplicationFederatedCredentialType(_ctx.stringValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials["+ i +"].ApplicationFederatedCredentialType"));
			applicationFederatedCredential.setCreateTime(_ctx.longValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials["+ i +"].CreateTime"));
			applicationFederatedCredential.setLastUsedTime(_ctx.longValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials["+ i +"].LastUsedTime"));
			applicationFederatedCredential.setUpdateTime(_ctx.longValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials["+ i +"].UpdateTime"));
			applicationFederatedCredential.setApplicationFederatedCredentialName(_ctx.stringValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials["+ i +"].ApplicationFederatedCredentialName"));
			applicationFederatedCredential.setApplicationId(_ctx.stringValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials["+ i +"].ApplicationId"));
			applicationFederatedCredential.setFederatedCredentialProviderId(_ctx.stringValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials["+ i +"].FederatedCredentialProviderId"));
			applicationFederatedCredential.setApplicationFederatedCredentialId(_ctx.stringValue("ListApplicationFederatedCredentialsResponse.ApplicationFederatedCredentials["+ i +"].ApplicationFederatedCredentialId"));

			applicationFederatedCredentials.add(applicationFederatedCredential);
		}
		listApplicationFederatedCredentialsResponse.setApplicationFederatedCredentials(applicationFederatedCredentials);
	 
	 	return listApplicationFederatedCredentialsResponse;
	}
}