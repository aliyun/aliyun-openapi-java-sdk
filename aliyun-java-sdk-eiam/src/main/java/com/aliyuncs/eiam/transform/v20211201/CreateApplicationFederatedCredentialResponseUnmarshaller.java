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

import com.aliyuncs.eiam.model.v20211201.CreateApplicationFederatedCredentialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationFederatedCredentialResponseUnmarshaller {

	public static CreateApplicationFederatedCredentialResponse unmarshall(CreateApplicationFederatedCredentialResponse createApplicationFederatedCredentialResponse, UnmarshallerContext _ctx) {
		
		createApplicationFederatedCredentialResponse.setRequestId(_ctx.stringValue("CreateApplicationFederatedCredentialResponse.RequestId"));
		createApplicationFederatedCredentialResponse.setApplicationFederatedCredentialId(_ctx.stringValue("CreateApplicationFederatedCredentialResponse.ApplicationFederatedCredentialId"));
	 
	 	return createApplicationFederatedCredentialResponse;
	}
}