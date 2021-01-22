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

import com.aliyuncs.ecs.model.v20140526.DeregisterManagedInstanceResponse;
import com.aliyuncs.ecs.model.v20140526.DeregisterManagedInstanceResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeregisterManagedInstanceResponseUnmarshaller {

	public static DeregisterManagedInstanceResponse unmarshall(DeregisterManagedInstanceResponse deregisterManagedInstanceResponse, UnmarshallerContext _ctx) {
		
		deregisterManagedInstanceResponse.setRequestId(_ctx.stringValue("DeregisterManagedInstanceResponse.RequestId"));

		Instance instance = new Instance();
		instance.setInstanceId(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.InstanceName"));
		instance.setActivationId(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.ActivationId"));
		instance.setHostname(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.Hostname"));
		instance.setMachineId(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.MachineId"));
		instance.setOsType(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.OsType"));
		instance.setOsVersion(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.OsVersion"));
		instance.setIntranetIp(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.IntranetIp"));
		instance.setInternetIp(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.InternetIp"));
		instance.setAgentVersion(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.AgentVersion"));
		instance.setRegistrationTime(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.RegistrationTime"));
		instance.setInvocationCount(_ctx.longValue("DeregisterManagedInstanceResponse.Instance.InvocationCount"));
		instance.setLastInvokedTime(_ctx.stringValue("DeregisterManagedInstanceResponse.Instance.LastInvokedTime"));
		deregisterManagedInstanceResponse.setInstance(instance);
	 
	 	return deregisterManagedInstanceResponse;
	}
}