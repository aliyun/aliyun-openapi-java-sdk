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

package com.aliyuncs.ecs.transform.v20140526;

import com.aliyuncs.ecs.model.v20140526.DeleteActivationResponse;
import com.aliyuncs.ecs.model.v20140526.DeleteActivationResponse.Activation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteActivationResponseUnmarshaller {

	public static DeleteActivationResponse unmarshall(DeleteActivationResponse deleteActivationResponse, UnmarshallerContext _ctx) {
		
		deleteActivationResponse.setRequestId(_ctx.stringValue("DeleteActivationResponse.RequestId"));

		Activation activation = new Activation();
		activation.setActivationId(_ctx.stringValue("DeleteActivationResponse.Activation.ActivationId"));
		activation.setInstanceName(_ctx.stringValue("DeleteActivationResponse.Activation.InstanceName"));
		activation.setDescription(_ctx.stringValue("DeleteActivationResponse.Activation.Description"));
		activation.setInstanceCount(_ctx.integerValue("DeleteActivationResponse.Activation.InstanceCount"));
		activation.setTimeToLiveInHours(_ctx.longValue("DeleteActivationResponse.Activation.TimeToLiveInHours"));
		activation.setIpAddressRange(_ctx.stringValue("DeleteActivationResponse.Activation.IpAddressRange"));
		activation.setRegisteredCount(_ctx.integerValue("DeleteActivationResponse.Activation.RegisteredCount"));
		activation.setDeregisteredCount(_ctx.integerValue("DeleteActivationResponse.Activation.DeregisteredCount"));
		activation.setCreationTime(_ctx.stringValue("DeleteActivationResponse.Activation.CreationTime"));
		deleteActivationResponse.setActivation(activation);
	 
	 	return deleteActivationResponse;
	}
}