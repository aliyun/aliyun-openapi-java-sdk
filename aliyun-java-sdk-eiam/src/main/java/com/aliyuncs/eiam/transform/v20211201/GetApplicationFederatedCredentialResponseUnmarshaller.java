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

import com.aliyuncs.eiam.model.v20211201.GetApplicationFederatedCredentialResponse;
import com.aliyuncs.eiam.model.v20211201.GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential;
import com.aliyuncs.eiam.model.v20211201.GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.AttributeMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationFederatedCredentialResponseUnmarshaller {

	public static GetApplicationFederatedCredentialResponse unmarshall(GetApplicationFederatedCredentialResponse getApplicationFederatedCredentialResponse, UnmarshallerContext _ctx) {
		
		getApplicationFederatedCredentialResponse.setRequestId(_ctx.stringValue("GetApplicationFederatedCredentialResponse.RequestId"));

		ApplicationFederatedCredential applicationFederatedCredential = new ApplicationFederatedCredential();
		applicationFederatedCredential.setInstanceId(_ctx.stringValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.InstanceId"));
		applicationFederatedCredential.setApplicationFederatedCredentialId(_ctx.stringValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.ApplicationFederatedCredentialId"));
		applicationFederatedCredential.setApplicationId(_ctx.stringValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.ApplicationId"));
		applicationFederatedCredential.setFederatedCredentialProviderId(_ctx.stringValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.FederatedCredentialProviderId"));
		applicationFederatedCredential.setApplicationFederatedCredentialType(_ctx.stringValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.ApplicationFederatedCredentialType"));
		applicationFederatedCredential.setApplicationFederatedCredentialName(_ctx.stringValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.ApplicationFederatedCredentialName"));
		applicationFederatedCredential.setStatus(_ctx.stringValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.Status"));
		applicationFederatedCredential.setDescription(_ctx.stringValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.Description"));
		applicationFederatedCredential.setCreateTime(_ctx.longValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.CreateTime"));
		applicationFederatedCredential.setUpdateTime(_ctx.longValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.UpdateTime"));
		applicationFederatedCredential.setLastUsedTime(_ctx.longValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.LastUsedTime"));
		applicationFederatedCredential.setVerificationCondition(_ctx.stringValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.VerificationCondition"));

		List<AttributeMapping> attributeMappings = new ArrayList<AttributeMapping>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.AttributeMappings.Length"); i++) {
			AttributeMapping attributeMapping = new AttributeMapping();
			attributeMapping.setSourceValueExpression(_ctx.stringValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.AttributeMappings["+ i +"].SourceValueExpression"));
			attributeMapping.setTargetField(_ctx.stringValue("GetApplicationFederatedCredentialResponse.ApplicationFederatedCredential.AttributeMappings["+ i +"].TargetField"));

			attributeMappings.add(attributeMapping);
		}
		applicationFederatedCredential.setAttributeMappings(attributeMappings);
		getApplicationFederatedCredentialResponse.setApplicationFederatedCredential(applicationFederatedCredential);
	 
	 	return getApplicationFederatedCredentialResponse;
	}
}