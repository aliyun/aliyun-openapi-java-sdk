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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetCabInstanceResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetCabInstanceResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCabInstanceResponseUnmarshaller {

	public static GetCabInstanceResponse unmarshall(GetCabInstanceResponse getCabInstanceResponse, UnmarshallerContext context) {
		
		getCabInstanceResponse.setRequestId(context.stringValue("GetCabInstanceResponse.RequestId"));
		getCabInstanceResponse.setSuccess(context.booleanValue("GetCabInstanceResponse.Success"));
		getCabInstanceResponse.setCode(context.stringValue("GetCabInstanceResponse.Code"));
		getCabInstanceResponse.setMessage(context.stringValue("GetCabInstanceResponse.Message"));
		getCabInstanceResponse.setHttpStatusCode(context.integerValue("GetCabInstanceResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(context.stringValue("GetCabInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(context.stringValue("GetCabInstanceResponse.Instance.InstanceName"));
		instance.setInstanceDescription(context.stringValue("GetCabInstanceResponse.Instance.InstanceDescription"));
		instance.setMaxConcurrentConversation(context.integerValue("GetCabInstanceResponse.Instance.MaxConcurrentConversation"));
		instance.setOwner(context.stringValue("GetCabInstanceResponse.Instance.Owner"));
		instance.setCreationTime(context.longValue("GetCabInstanceResponse.Instance.CreationTime"));
		instance.setCallCenterInstanceId(context.stringValue("GetCabInstanceResponse.Instance.CallCenterInstanceId"));
		getCabInstanceResponse.setInstance(instance);
	 
	 	return getCabInstanceResponse;
	}
}