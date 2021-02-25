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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeManagedInstancesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeManagedInstancesResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeManagedInstancesResponseUnmarshaller {

	public static DescribeManagedInstancesResponse unmarshall(DescribeManagedInstancesResponse describeManagedInstancesResponse, UnmarshallerContext _ctx) {
		
		describeManagedInstancesResponse.setRequestId(_ctx.stringValue("DescribeManagedInstancesResponse.RequestId"));
		describeManagedInstancesResponse.setTotalCount(_ctx.longValue("DescribeManagedInstancesResponse.TotalCount"));
		describeManagedInstancesResponse.setPageNumber(_ctx.longValue("DescribeManagedInstancesResponse.PageNumber"));
		describeManagedInstancesResponse.setPageSize(_ctx.longValue("DescribeManagedInstancesResponse.PageSize"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeManagedInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setActivationId(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].ActivationId"));
			instance.setHostname(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].Hostname"));
			instance.setMachineId(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].MachineId"));
			instance.setOsType(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].OsType"));
			instance.setOsVersion(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].OsVersion"));
			instance.setIntranetIp(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].IntranetIp"));
			instance.setInternetIp(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].InternetIp"));
			instance.setAgentVersion(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].AgentVersion"));
			instance.setRegistrationTime(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].RegistrationTime"));
			instance.setInvocationCount(_ctx.longValue("DescribeManagedInstancesResponse.Instances["+ i +"].InvocationCount"));
			instance.setLastInvokedTime(_ctx.stringValue("DescribeManagedInstancesResponse.Instances["+ i +"].LastInvokedTime"));
			instance.setConnected(_ctx.booleanValue("DescribeManagedInstancesResponse.Instances["+ i +"].Connected"));

			instances.add(instance);
		}
		describeManagedInstancesResponse.setInstances(instances);
	 
	 	return describeManagedInstancesResponse;
	}
}