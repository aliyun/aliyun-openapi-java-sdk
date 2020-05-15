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
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyInstanceResponseUnmarshaller {

	public static ModifyInstanceResponse unmarshall(ModifyInstanceResponse modifyInstanceResponse, UnmarshallerContext _ctx) {
		
		modifyInstanceResponse.setRequestId(_ctx.stringValue("ModifyInstanceResponse.RequestId"));
		modifyInstanceResponse.setSuccess(_ctx.booleanValue("ModifyInstanceResponse.Success"));
		modifyInstanceResponse.setCode(_ctx.stringValue("ModifyInstanceResponse.Code"));
		modifyInstanceResponse.setMessage(_ctx.stringValue("ModifyInstanceResponse.Message"));
		modifyInstanceResponse.setHttpStatusCode(_ctx.integerValue("ModifyInstanceResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(_ctx.stringValue("ModifyInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(_ctx.stringValue("ModifyInstanceResponse.Instance.InstanceName"));
		instance.setInstanceDescription(_ctx.stringValue("ModifyInstanceResponse.Instance.InstanceDescription"));
		instance.setMaxConcurrentConversation(_ctx.integerValue("ModifyInstanceResponse.Instance.MaxConcurrentConversation"));
		instance.setOwner(_ctx.stringValue("ModifyInstanceResponse.Instance.Owner"));
		instance.setCreationTime(_ctx.longValue("ModifyInstanceResponse.Instance.CreationTime"));
		instance.setCallCenterInstanceId(_ctx.stringValue("ModifyInstanceResponse.Instance.CallCenterInstanceId"));
		modifyInstanceResponse.setInstance(instance);
	 
	 	return modifyInstanceResponse;
	}
}