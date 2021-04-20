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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.ModifyCabInstanceResponse;
import com.aliyuncs.ccc.model.v20170705.ModifyCabInstanceResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyCabInstanceResponseUnmarshaller {

	public static ModifyCabInstanceResponse unmarshall(ModifyCabInstanceResponse modifyCabInstanceResponse, UnmarshallerContext _ctx) {
		
		modifyCabInstanceResponse.setRequestId(_ctx.stringValue("ModifyCabInstanceResponse.RequestId"));
		modifyCabInstanceResponse.setSuccess(_ctx.booleanValue("ModifyCabInstanceResponse.Success"));
		modifyCabInstanceResponse.setCode(_ctx.stringValue("ModifyCabInstanceResponse.Code"));
		modifyCabInstanceResponse.setMessage(_ctx.stringValue("ModifyCabInstanceResponse.Message"));
		modifyCabInstanceResponse.setHttpStatusCode(_ctx.integerValue("ModifyCabInstanceResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(_ctx.stringValue("ModifyCabInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(_ctx.stringValue("ModifyCabInstanceResponse.Instance.InstanceName"));
		instance.setInstanceDescription(_ctx.stringValue("ModifyCabInstanceResponse.Instance.InstanceDescription"));
		instance.setMaxConcurrentConversation(_ctx.integerValue("ModifyCabInstanceResponse.Instance.MaxConcurrentConversation"));
		instance.setOwner(_ctx.stringValue("ModifyCabInstanceResponse.Instance.Owner"));
		instance.setCreationTime(_ctx.longValue("ModifyCabInstanceResponse.Instance.CreationTime"));
		instance.setCallCenterInstanceId(_ctx.stringValue("ModifyCabInstanceResponse.Instance.CallCenterInstanceId"));
		modifyCabInstanceResponse.setInstance(instance);
	 
	 	return modifyCabInstanceResponse;
	}
}