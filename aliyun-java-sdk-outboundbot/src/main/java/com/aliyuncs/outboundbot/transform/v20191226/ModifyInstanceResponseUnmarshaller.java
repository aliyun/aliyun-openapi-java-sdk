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

import com.aliyuncs.outboundbot.model.v20191226.ModifyInstanceResponse;
import com.aliyuncs.outboundbot.model.v20191226.ModifyInstanceResponse.Instance;
import com.aliyuncs.outboundbot.model.v20191226.ModifyInstanceResponse.Instance.NluProfile;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyInstanceResponseUnmarshaller {

	public static ModifyInstanceResponse unmarshall(ModifyInstanceResponse modifyInstanceResponse, UnmarshallerContext _ctx) {
		
		modifyInstanceResponse.setRequestId(_ctx.stringValue("ModifyInstanceResponse.RequestId"));
		modifyInstanceResponse.setHttpStatusCode(_ctx.integerValue("ModifyInstanceResponse.HttpStatusCode"));
		modifyInstanceResponse.setCode(_ctx.stringValue("ModifyInstanceResponse.Code"));
		modifyInstanceResponse.setMessage(_ctx.stringValue("ModifyInstanceResponse.Message"));
		modifyInstanceResponse.setSuccess(_ctx.booleanValue("ModifyInstanceResponse.Success"));

		Instance instance = new Instance();
		instance.setCreationTime(_ctx.longValue("ModifyInstanceResponse.Instance.CreationTime"));
		instance.setOwner(_ctx.stringValue("ModifyInstanceResponse.Instance.Owner"));
		instance.setCallCenterInstanceId(_ctx.stringValue("ModifyInstanceResponse.Instance.CallCenterInstanceId"));
		instance.setNluServiceType(_ctx.stringValue("ModifyInstanceResponse.Instance.NluServiceType"));
		instance.setInstanceName(_ctx.stringValue("ModifyInstanceResponse.Instance.InstanceName"));
		instance.setCreatorName(_ctx.stringValue("ModifyInstanceResponse.Instance.CreatorName"));
		instance.setMaxConcurrentConversation(_ctx.integerValue("ModifyInstanceResponse.Instance.MaxConcurrentConversation"));
		instance.setOwnerName(_ctx.stringValue("ModifyInstanceResponse.Instance.OwnerName"));
		instance.setCreatorId(_ctx.longValue("ModifyInstanceResponse.Instance.CreatorId"));
		instance.setInstanceId(_ctx.stringValue("ModifyInstanceResponse.Instance.InstanceId"));
		instance.setInstanceDescription(_ctx.stringValue("ModifyInstanceResponse.Instance.InstanceDescription"));

		NluProfile nluProfile = new NluProfile();
		nluProfile.setAccessKey(_ctx.stringValue("ModifyInstanceResponse.Instance.NluProfile.AccessKey"));
		nluProfile.setSecretKey(_ctx.stringValue("ModifyInstanceResponse.Instance.NluProfile.SecretKey"));
		nluProfile.setEndpoint(_ctx.stringValue("ModifyInstanceResponse.Instance.NluProfile.Endpoint"));
		instance.setNluProfile(nluProfile);
		modifyInstanceResponse.setInstance(instance);
	 
	 	return modifyInstanceResponse;
	}
}