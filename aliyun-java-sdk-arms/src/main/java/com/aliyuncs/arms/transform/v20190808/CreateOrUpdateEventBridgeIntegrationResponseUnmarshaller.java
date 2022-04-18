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

import com.aliyuncs.arms.model.v20190808.CreateOrUpdateEventBridgeIntegrationResponse;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateEventBridgeIntegrationResponse.EventBridgeIntegration;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrUpdateEventBridgeIntegrationResponseUnmarshaller {

	public static CreateOrUpdateEventBridgeIntegrationResponse unmarshall(CreateOrUpdateEventBridgeIntegrationResponse createOrUpdateEventBridgeIntegrationResponse, UnmarshallerContext _ctx) {
		
		createOrUpdateEventBridgeIntegrationResponse.setRequestId(_ctx.stringValue("CreateOrUpdateEventBridgeIntegrationResponse.RequestId"));

		EventBridgeIntegration eventBridgeIntegration = new EventBridgeIntegration();
		eventBridgeIntegration.setId(_ctx.longValue("CreateOrUpdateEventBridgeIntegrationResponse.EventBridgeIntegration.Id"));
		eventBridgeIntegration.setName(_ctx.stringValue("CreateOrUpdateEventBridgeIntegrationResponse.EventBridgeIntegration.Name"));
		eventBridgeIntegration.setDescription(_ctx.stringValue("CreateOrUpdateEventBridgeIntegrationResponse.EventBridgeIntegration.Description"));
		eventBridgeIntegration.setEndpoint(_ctx.stringValue("CreateOrUpdateEventBridgeIntegrationResponse.EventBridgeIntegration.Endpoint"));
		eventBridgeIntegration.setAccessKey(_ctx.stringValue("CreateOrUpdateEventBridgeIntegrationResponse.EventBridgeIntegration.AccessKey"));
		eventBridgeIntegration.setAccessSecret(_ctx.stringValue("CreateOrUpdateEventBridgeIntegrationResponse.EventBridgeIntegration.AccessSecret"));
		eventBridgeIntegration.setEventBusName(_ctx.stringValue("CreateOrUpdateEventBridgeIntegrationResponse.EventBridgeIntegration.EventBusName"));
		eventBridgeIntegration.setSource(_ctx.stringValue("CreateOrUpdateEventBridgeIntegrationResponse.EventBridgeIntegration.Source"));
		eventBridgeIntegration.setEventBusRegionId(_ctx.stringValue("CreateOrUpdateEventBridgeIntegrationResponse.EventBridgeIntegration.EventBusRegionId"));
		createOrUpdateEventBridgeIntegrationResponse.setEventBridgeIntegration(eventBridgeIntegration);
	 
	 	return createOrUpdateEventBridgeIntegrationResponse;
	}
}