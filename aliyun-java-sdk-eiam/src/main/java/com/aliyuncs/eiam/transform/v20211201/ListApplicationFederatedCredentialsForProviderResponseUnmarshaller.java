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

import com.aliyuncs.eiam.model.v20211201.ListApplicationFederatedCredentialsForProviderResponse;
import com.aliyuncs.eiam.model.v20211201.ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredential;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApplicationFederatedCredentialsForProviderResponseUnmarshaller {

	public static ListApplicationFederatedCredentialsForProviderResponse unmarshall(ListApplicationFederatedCredentialsForProviderResponse listApplicationFederatedCredentialsForProviderResponse, UnmarshallerContext _ctx) {
		
		listApplicationFederatedCredentialsForProviderResponse.setRequestId(_ctx.stringValue("ListApplicationFederatedCredentialsForProviderResponse.RequestId"));
		listApplicationFederatedCredentialsForProviderResponse.setTotalCount(_ctx.integerValue("ListApplicationFederatedCredentialsForProviderResponse.TotalCount"));
		listApplicationFederatedCredentialsForProviderResponse.setNextToken(_ctx.stringValue("ListApplicationFederatedCredentialsForProviderResponse.NextToken"));
		listApplicationFederatedCredentialsForProviderResponse.setPreviousToken(_ctx.stringValue("ListApplicationFederatedCredentialsForProviderResponse.PreviousToken"));
		listApplicationFederatedCredentialsForProviderResponse.setMaxResults(_ctx.integerValue("ListApplicationFederatedCredentialsForProviderResponse.MaxResults"));

		List<ApplicationFederatedCredential> applicationFederatedCredentials = new ArrayList<ApplicationFederatedCredential>();
		for (int i = 0; i < _ctx.lengthValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials.Length"); i++) {
			ApplicationFederatedCredential applicationFederatedCredential = new ApplicationFederatedCredential();
			applicationFederatedCredential.setStatus(_ctx.stringValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials["+ i +"].Status"));
			applicationFederatedCredential.setDescription(_ctx.stringValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials["+ i +"].Description"));
			applicationFederatedCredential.setInstanceId(_ctx.stringValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials["+ i +"].InstanceId"));
			applicationFederatedCredential.setApplicationFederatedCredentialType(_ctx.stringValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials["+ i +"].ApplicationFederatedCredentialType"));
			applicationFederatedCredential.setCreateTime(_ctx.longValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials["+ i +"].CreateTime"));
			applicationFederatedCredential.setLastUsedTime(_ctx.longValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials["+ i +"].LastUsedTime"));
			applicationFederatedCredential.setUpdateTime(_ctx.longValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials["+ i +"].UpdateTime"));
			applicationFederatedCredential.setApplicationFederatedCredentialName(_ctx.stringValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials["+ i +"].ApplicationFederatedCredentialName"));
			applicationFederatedCredential.setApplicationId(_ctx.stringValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials["+ i +"].ApplicationId"));
			applicationFederatedCredential.setFederatedCredentialProviderId(_ctx.stringValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials["+ i +"].FederatedCredentialProviderId"));
			applicationFederatedCredential.setApplicationFederatedCredentialId(_ctx.stringValue("ListApplicationFederatedCredentialsForProviderResponse.ApplicationFederatedCredentials["+ i +"].ApplicationFederatedCredentialId"));

			applicationFederatedCredentials.add(applicationFederatedCredential);
		}
		listApplicationFederatedCredentialsForProviderResponse.setApplicationFederatedCredentials(applicationFederatedCredentials);
	 
	 	return listApplicationFederatedCredentialsForProviderResponse;
	}
}