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

import com.aliyuncs.ecs.model.v20140526.DisableActivationResponse;
import com.aliyuncs.ecs.model.v20140526.DisableActivationResponse.Activation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableActivationResponseUnmarshaller {

	public static DisableActivationResponse unmarshall(DisableActivationResponse disableActivationResponse, UnmarshallerContext _ctx) {
		
		disableActivationResponse.setRequestId(_ctx.stringValue("DisableActivationResponse.RequestId"));

		Activation activation = new Activation();
		activation.setCreationTime(_ctx.stringValue("DisableActivationResponse.Activation.CreationTime"));
		activation.setDeregisteredCount(_ctx.integerValue("DisableActivationResponse.Activation.DeregisteredCount"));
		activation.setInstanceCount(_ctx.integerValue("DisableActivationResponse.Activation.InstanceCount"));
		activation.setDescription(_ctx.stringValue("DisableActivationResponse.Activation.Description"));
		activation.setRegisteredCount(_ctx.integerValue("DisableActivationResponse.Activation.RegisteredCount"));
		activation.setInstanceName(_ctx.stringValue("DisableActivationResponse.Activation.InstanceName"));
		activation.setDisabled(_ctx.booleanValue("DisableActivationResponse.Activation.Disabled"));
		activation.setIpAddressRange(_ctx.stringValue("DisableActivationResponse.Activation.IpAddressRange"));
		activation.setTimeToLiveInHours(_ctx.longValue("DisableActivationResponse.Activation.TimeToLiveInHours"));
		activation.setActivationId(_ctx.stringValue("DisableActivationResponse.Activation.ActivationId"));
		disableActivationResponse.setActivation(activation);
	 
	 	return disableActivationResponse;
	}
}