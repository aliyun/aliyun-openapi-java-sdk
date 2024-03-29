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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.CreateInstanceResponse;
import com.aliyuncs.outboundbot.model.v20191226.CreateInstanceResponse.Instance;
import com.aliyuncs.outboundbot.model.v20191226.CreateInstanceResponse.Instance.NluProfile;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceResponseUnmarshaller {

	public static CreateInstanceResponse unmarshall(CreateInstanceResponse createInstanceResponse, UnmarshallerContext _ctx) {
		
		createInstanceResponse.setRequestId(_ctx.stringValue("CreateInstanceResponse.RequestId"));
		createInstanceResponse.setHttpStatusCode(_ctx.integerValue("CreateInstanceResponse.HttpStatusCode"));
		createInstanceResponse.setCode(_ctx.stringValue("CreateInstanceResponse.Code"));
		createInstanceResponse.setMessage(_ctx.stringValue("CreateInstanceResponse.Message"));
		createInstanceResponse.setSuccess(_ctx.booleanValue("CreateInstanceResponse.Success"));

		Instance instance = new Instance();
		instance.setCreationTime(_ctx.longValue("CreateInstanceResponse.Instance.CreationTime"));
		instance.setCallCenterInstanceId(_ctx.stringValue("CreateInstanceResponse.Instance.CallCenterInstanceId"));
		instance.setOwner(_ctx.stringValue("CreateInstanceResponse.Instance.Owner"));
		instance.setNluServiceType(_ctx.stringValue("CreateInstanceResponse.Instance.NluServiceType"));
		instance.setInstanceId(_ctx.stringValue("CreateInstanceResponse.Instance.InstanceId"));
		instance.setCreatorId(_ctx.longValue("CreateInstanceResponse.Instance.CreatorId"));
		instance.setOwnerName(_ctx.stringValue("CreateInstanceResponse.Instance.OwnerName"));
		instance.setInstanceDescription(_ctx.stringValue("CreateInstanceResponse.Instance.InstanceDescription"));
		instance.setInstanceName(_ctx.stringValue("CreateInstanceResponse.Instance.InstanceName"));
		instance.setCreatorName(_ctx.stringValue("CreateInstanceResponse.Instance.CreatorName"));
		instance.setResourceGroupId(_ctx.stringValue("CreateInstanceResponse.Instance.ResourceGroupId"));
		instance.setMaxConcurrentConversation(_ctx.integerValue("CreateInstanceResponse.Instance.MaxConcurrentConversation"));

		NluProfile nluProfile = new NluProfile();
		nluProfile.setAccessKey(_ctx.stringValue("CreateInstanceResponse.Instance.NluProfile.AccessKey"));
		nluProfile.setSecretKey(_ctx.stringValue("CreateInstanceResponse.Instance.NluProfile.SecretKey"));
		nluProfile.setEndpoint(_ctx.stringValue("CreateInstanceResponse.Instance.NluProfile.Endpoint"));
		instance.setNluProfile(nluProfile);
		createInstanceResponse.setInstance(instance);
	 
	 	return createInstanceResponse;
	}
}