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

import com.aliyuncs.ccc.model.v20170705.CreateCabInstanceResponse;
import com.aliyuncs.ccc.model.v20170705.CreateCabInstanceResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateCabInstanceResponseUnmarshaller {

	public static CreateCabInstanceResponse unmarshall(CreateCabInstanceResponse createCabInstanceResponse, UnmarshallerContext context) {
		
		createCabInstanceResponse.setRequestId(context.stringValue("CreateCabInstanceResponse.RequestId"));
		createCabInstanceResponse.setSuccess(context.booleanValue("CreateCabInstanceResponse.Success"));
		createCabInstanceResponse.setCode(context.stringValue("CreateCabInstanceResponse.Code"));
		createCabInstanceResponse.setMessage(context.stringValue("CreateCabInstanceResponse.Message"));
		createCabInstanceResponse.setHttpStatusCode(context.integerValue("CreateCabInstanceResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(context.stringValue("CreateCabInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(context.stringValue("CreateCabInstanceResponse.Instance.InstanceName"));
		instance.setInstanceDescription(context.stringValue("CreateCabInstanceResponse.Instance.InstanceDescription"));
		instance.setMaxConcurrentConversation(context.integerValue("CreateCabInstanceResponse.Instance.MaxConcurrentConversation"));
		instance.setOwner(context.stringValue("CreateCabInstanceResponse.Instance.Owner"));
		instance.setCreationTime(context.longValue("CreateCabInstanceResponse.Instance.CreationTime"));
		instance.setCallCenterInstanceId(context.stringValue("CreateCabInstanceResponse.Instance.CallCenterInstanceId"));
		createCabInstanceResponse.setInstance(instance);
	 
	 	return createCabInstanceResponse;
	}
}