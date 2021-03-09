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

	public static CreateCabInstanceResponse unmarshall(CreateCabInstanceResponse createCabInstanceResponse, UnmarshallerContext _ctx) {
		
		createCabInstanceResponse.setRequestId(_ctx.stringValue("CreateCabInstanceResponse.RequestId"));
		createCabInstanceResponse.setSuccess(_ctx.booleanValue("CreateCabInstanceResponse.Success"));
		createCabInstanceResponse.setCode(_ctx.stringValue("CreateCabInstanceResponse.Code"));
		createCabInstanceResponse.setMessage(_ctx.stringValue("CreateCabInstanceResponse.Message"));
		createCabInstanceResponse.setHttpStatusCode(_ctx.integerValue("CreateCabInstanceResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(_ctx.stringValue("CreateCabInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(_ctx.stringValue("CreateCabInstanceResponse.Instance.InstanceName"));
		instance.setInstanceDescription(_ctx.stringValue("CreateCabInstanceResponse.Instance.InstanceDescription"));
		instance.setMaxConcurrentConversation(_ctx.integerValue("CreateCabInstanceResponse.Instance.MaxConcurrentConversation"));
		instance.setOwner(_ctx.stringValue("CreateCabInstanceResponse.Instance.Owner"));
		instance.setCreationTime(_ctx.longValue("CreateCabInstanceResponse.Instance.CreationTime"));
		instance.setCallCenterInstanceId(_ctx.stringValue("CreateCabInstanceResponse.Instance.CallCenterInstanceId"));
		createCabInstanceResponse.setInstance(instance);
	 
	 	return createCabInstanceResponse;
	}
}