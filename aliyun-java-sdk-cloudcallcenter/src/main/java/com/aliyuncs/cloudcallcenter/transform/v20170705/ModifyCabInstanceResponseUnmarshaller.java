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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyCabInstanceResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyCabInstanceResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyCabInstanceResponseUnmarshaller {

	public static ModifyCabInstanceResponse unmarshall(ModifyCabInstanceResponse modifyCabInstanceResponse, UnmarshallerContext context) {
		
		modifyCabInstanceResponse.setRequestId(context.stringValue("ModifyCabInstanceResponse.RequestId"));
		modifyCabInstanceResponse.setSuccess(context.booleanValue("ModifyCabInstanceResponse.Success"));
		modifyCabInstanceResponse.setCode(context.stringValue("ModifyCabInstanceResponse.Code"));
		modifyCabInstanceResponse.setMessage(context.stringValue("ModifyCabInstanceResponse.Message"));
		modifyCabInstanceResponse.setHttpStatusCode(context.integerValue("ModifyCabInstanceResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(context.stringValue("ModifyCabInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(context.stringValue("ModifyCabInstanceResponse.Instance.InstanceName"));
		instance.setInstanceDescription(context.stringValue("ModifyCabInstanceResponse.Instance.InstanceDescription"));
		instance.setMaxConcurrentConversation(context.integerValue("ModifyCabInstanceResponse.Instance.MaxConcurrentConversation"));
		instance.setOwner(context.stringValue("ModifyCabInstanceResponse.Instance.Owner"));
		instance.setCreationTime(context.longValue("ModifyCabInstanceResponse.Instance.CreationTime"));
		instance.setCallCenterInstanceId(context.stringValue("ModifyCabInstanceResponse.Instance.CallCenterInstanceId"));
		modifyCabInstanceResponse.setInstance(instance);
	 
	 	return modifyCabInstanceResponse;
	}
}