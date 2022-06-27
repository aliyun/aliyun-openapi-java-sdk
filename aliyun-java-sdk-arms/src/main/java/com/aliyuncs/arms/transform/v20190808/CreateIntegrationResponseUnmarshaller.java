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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.CreateIntegrationResponse;
import com.aliyuncs.arms.model.v20190808.CreateIntegrationResponse.Integration;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateIntegrationResponseUnmarshaller {

	public static CreateIntegrationResponse unmarshall(CreateIntegrationResponse createIntegrationResponse, UnmarshallerContext _ctx) {
		
		createIntegrationResponse.setRequestId(_ctx.stringValue("CreateIntegrationResponse.RequestId"));

		Integration integration = new Integration();
		integration.setIntegrationId(_ctx.longValue("CreateIntegrationResponse.Integration.IntegrationId"));
		integration.setIntegrationName(_ctx.stringValue("CreateIntegrationResponse.Integration.IntegrationName"));
		integration.setIntegrationProductType(_ctx.stringValue("CreateIntegrationResponse.Integration.IntegrationProductType"));
		integration.setDescription(_ctx.stringValue("CreateIntegrationResponse.Integration.Description"));
		integration.setAutoRecover(_ctx.booleanValue("CreateIntegrationResponse.Integration.AutoRecover"));
		integration.setRecoverTime(_ctx.longValue("CreateIntegrationResponse.Integration.RecoverTime"));
		createIntegrationResponse.setIntegration(integration);
	 
	 	return createIntegrationResponse;
	}
}